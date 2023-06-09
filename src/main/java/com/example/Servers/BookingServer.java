package com.example.Servers;

import com.example.booking.BookingRequest;
import com.example.booking.BookingResponse;
import com.example.booking.BookingServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Random;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookingServer {
    private static final Logger log = Logger.getLogger(BookingServer.class.getName());

    private Server server;

public void start() throws IOException {
int port = 50051;
server = ServerBuilder.forPort(port)
.addService(new BookingServiceImpl())
.build()
.start();
log.info("Server started, listening on "+port);
Runtime.getRuntime().addShutdownHook(new Thread() {
@Override
public void run() {
    log.log(Level.WARNING,"*** shutting down gRPC server since JVM is shutting down");
BookingServer.this.stop();
    log.log(Level.WARNING,"*** server shut down");
}
});
}

private void stop() {
if (server != null) {
server.shutdown();
}
}

public void blockUntilShutdown() throws InterruptedException {
if (server != null) {
server.awaitTermination();
}
}

private static class BookingServiceImpl extends BookingServiceGrpc.BookingServiceImplBase {
@Override
public void makeBooking(BookingRequest request, StreamObserver<BookingResponse> responseObserver) {
    log.info("processing Booking request for: " + request.getCustomerName());

    // Generate a random integer for bookingId
    Random rand = new Random();
    int bookingId = rand.nextInt(1000);

    // Create a new BookingResponse object
    BookingResponse response = BookingResponse.newBuilder()
            .setBookingId(String.valueOf(bookingId))
            .setConfirmation("Booking successful")
            .build();

    // Push the booking request onto the stack
    Stack<BookingRequest> bookingRequests = new Stack<>();
    bookingRequests.push(request);

    // Send the response to the client
responseObserver.onNext(response);
responseObserver.onCompleted();
}
}
}