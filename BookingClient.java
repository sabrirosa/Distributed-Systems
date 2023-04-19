import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class BookingClient {
private final ManagedChannel channel;
private final BookingServiceGrpc.BookingServiceBlockingStub blockingStub;

public BookingClient(String host, int port) {
channel = ManagedChannelBuilder.forAddress(host, port)
.usePlaintext()
.build();
blockingStub = BookingServiceGrpc.newBlockingStub(channel);
}

public void shutdown() throws InterruptedException {
channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
}

public void makeBooking(String customerName, String pickupLocation, String dropoffLocation, LocalDateTime pickupDateTime) {
BookingRequest request = BookingRequest.newBuilder()
.setCustomerName(customerName)
.setPickupLocation(pickupLocation)
.setDropoffLocation(dropoffLocation)
.setPickupDateTime(Timestamp.newBuilder()
.setSeconds(pickupDateTime.toEpochSecond(ZoneOffset.UTC))
.setNanos(pickupDateTime.getNano())
.build())
.build();
try {
BookingResponse response = blockingStub.makeBooking(request);
System.out.println("Booking confirmation number: " + response.getConfirmationNumber());
} catch (StatusRuntimeException e) {
System.err.println("RPC failed: " + e.getStatus());
}
}

public static void main(String[] args) throws Exception {
BookingClient client = new BookingClient("localhost", 50051);
try {
String customerName = "John Doe";
String pickupLocation = "123 Main St";
String dropoffLocation = "456 Elm St";
LocalDateTime pickupDateTime = LocalDateTime.of(2023, 4, 20, 9, 0);
client.makeBooking(customerName, pickupLocation, dropoffLocation, pickupDateTime);
} finally {
client.shutdown();
}
}
}