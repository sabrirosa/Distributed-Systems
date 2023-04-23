package com.example.Servers;

import com.example.payment.PaymentProto;
import com.example.payment.PaymentRequest;
import com.example.payment.PaymentResponse;
import com.example.payment.PaymentServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

public class PaymentServer {
private static final Logger logger = Logger.getLogger(PaymentServer.class.getName());

private Server server;

public void start() throws IOException {
/* The port on which the server should run */
int port = 50052;
server = ServerBuilder.forPort(port)
.addService(new PaymentServiceImpl())
.build()
.start();
logger.info("PaymentServer started, listening on " + port);
Runtime.getRuntime().addShutdownHook(new Thread(() -> {
// Use stderr here since the logger may have been reset by its JVM shutdown hook.
System.err.println("*** shutting down PaymentServer since JVM is shutting down");
PaymentServer.this.stop();
System.err.println("*** PaymentServer shut down");
}));
}

private void stop() {
if (server != null) {
server.shutdown();
}
}

/**
* Await termination on the main thread since the grpc library uses daemon threads.
*/
public void blockUntilShutdown() throws InterruptedException {
if (server != null) {
server.awaitTermination();
}
}

/**
* Main launches the server from the command line.
*/

static class PaymentServiceImpl extends PaymentServiceGrpc.PaymentServiceImplBase {
@Override
public void makePayment(PaymentRequest request, StreamObserver<PaymentResponse> responseObserver) {
boolean success;
    logger.info("Received payment from card number: "+request.getCardNumber());
    String message = "";
if (request.getAmount() > 50) {
success = true;
message = "Payment successful.";
} else {
success = false;
message = "Payment failed: "+request.getAmount()+" is not enough for the room";
}
PaymentResponse response = PaymentResponse.newBuilder()
.setSuccess(success)
.setMessage(message)
.build();
responseObserver.onNext(response);
responseObserver.onCompleted();
}
}
}