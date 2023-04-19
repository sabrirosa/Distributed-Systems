import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class BookingServer {
private Server server;

public static void main(String[] args) throws IOException, InterruptedException {
final BookingServer server = new BookingServer();
server.start();
server.blockUntilShutdown();
}

private void start() throws IOException {
int port = 50051;
server = ServerBuilder.forPort(port)
.addService(new BookingServiceImpl())
.build()
.start();
System.out.println("Server started, listening on " + port);
Runtime.getRuntime().addShutdownHook(new Thread() {
@Override
public void run() {
System.err.println("*** shutting down gRPC server since JVM is shutting down");
BookingServer.this.stop();
System.err.println("*** server shut down");
}
});
}

private void stop() {
if (server != null) {
server.shutdown();
}
}

private void blockUntilShutdown() throws InterruptedException {
if (server != null) {
server.awaitTermination();
}
}

private static class BookingServiceImpl extends BookingServiceGrpc.BookingServiceImplBase {
@Override
public void makeBooking(BookingRequest request, StreamObserver<BookingResponse> responseObserver) {
// logic to make booking
String bookingId = "123";
String confirmation = "Booking successful";

BookingResponse response = BookingResponse.newBuilder()
.setBookingId(bookingId)
.setConfirmation(confirmation)
.build();

responseObserver.onNext(response);
responseObserver.onCompleted();
}
}
}