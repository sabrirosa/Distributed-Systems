package com.example.Clients;

import com.example.payment.PaymentRequest;
import com.example.payment.PaymentResponse;
import com.example.payment.PaymentServiceGrpc;
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
        .setCreditCardNumber(cardNumber)
.setExpiryDate(expiryDate)
.setAmount(amount)
.build();
PaymentResponse response;
try {
response = blockingStub.makePayment(request);
System.out.println("Server Response: "+response.getMessage());
} catch (StatusRuntimeException e) {
logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
return false;
}
return response.getSuccess();
}

    public static void main(String[] args) throws Exception {
        PaymentClient client = new PaymentClient("localhost", 50052);
        try {
            String customerName = "John Doe";
            String creditCardNumber = "123 456 789";
            String expiryDate = "2025 05 01";
            float amount =200;
            String cvv ="098";
            client.makePayment(customerName, creditCardNumber,expiryDate,cvv,amount);
        } finally {
            client.shutdown();
        }
    }
}
