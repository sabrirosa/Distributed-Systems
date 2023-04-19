package com.example.payment;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PaymentClient {
private static final Logger logger = Logger.getLogger(PaymentClient.class.getName());

private final ManagedChannel channel;
private final PaymentServiceGrpc.PaymentServiceBlockingStub blockingStub;

public PaymentClient(String host, int port) {
channel = ManagedChannelBuilder.forAddress(host, port)
.usePlaintext()
.build();
blockingStub = PaymentServiceGrpc.newBlockingStub(channel);
}

public void shutdown() throws InterruptedException {
channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
}

public boolean makePayment(String customerName, String cardNumber, String expiryDate, String cvv, float amount) {
PaymentRequest request = PaymentRequest.newBuilder()
.setCustomerName(customerName)
.setCardNumber(cardNumber)
.setExpiryDate(expiryDate)
.setCvv(cvv)
.setAmount(amount)
.build();
PaymentResponse response;
try {
response = blockingStub.makePayment(request);
} catch (StatusRuntimeException e) {
logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
return false;
}
return response.getStatus();
}
}