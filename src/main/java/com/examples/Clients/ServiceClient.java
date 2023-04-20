package com.example.Clients;
import com.example.booking.*;
import com.example.payment.*;
import com.example.payment.PaymentResponse;
import com.example.payment.PaymentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServiceClient {

    private static final Logger logger = Logger.getLogger(ServiceClient.class.getName());


    private final ManagedChannel bookingChannel;

    private final ManagedChannel paymentChannel;

    private final BookingServiceGrpc.BookingServiceBlockingStub bookingStub;

    private final PaymentServiceGrpc.PaymentServiceBlockingStub paymentStub;


    public ServiceClient(String bookingHost, int bookingPort, String paymentHost, int paymentPort) {

        bookingChannel = ManagedChannelBuilder.forAddress(bookingHost, bookingPort)

                .usePlaintext()

                .build();

        bookingStub = BookingServiceGrpc.newBlockingStub(bookingChannel);


        paymentChannel = ManagedChannelBuilder.forAddress(paymentHost, paymentPort)

                .usePlaintext()

                .build();

        paymentStub = PaymentServiceGrpc.newBlockingStub(paymentChannel);

    }


    public void shutdown() throws InterruptedException {

        bookingChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);

        paymentChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);

    }


    public boolean bookAndPay(String customerName, String pickupLocation, String dropoffLocation, String pickupDateTime,

                              String cardNumber, String cardExpiryDate, String cvv, double amount) {

        try {

            BookingRequest bookingRequest = BookingRequest.newBuilder()

                    .setCustomerName(customerName)

                    .setPickupLocation(pickupLocation)

                    .setDropoffLocation(dropoffLocation)

                    .setPickupDateTime(pickupDateTime)

                    .build();

            BookingResponse bookingResponse = bookingStub.makeBooking(bookingRequest);
logger.info("Booking ID: " + bookingResponse.getBookingId());


            PaymentRequest paymentRequest = PaymentRequest.newBuilder()

                    .setCreditCardNumber(cardNumber)

                    .setExpiryDate(cardExpiryDate)

                    .setAmount(amount)

                    .build();

            PaymentResponse paymentResponse = paymentStub.makePayment(paymentRequest);
logger.info("Payment Successful: " + paymentResponse.getSuccess());


            return true;

        } catch (StatusRuntimeException e) {

            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());

            return false;

        }

    }
    public List<Booking> getBookings() {
        logger.info("get booking");
        GetBookingsRequest request= GetBookingsRequest.newBuilder().build();
        GetBookingsResponse response=bookingStub.getBookings(request);
        logger.info("returned data: "+response.getBookingsList().toString());
        return response.getBookingsList();
    }

    //this is a test method
    public static void main(String[] args) throws Exception {
        ServiceClient client = new ServiceClient("localhost", 50051,"localhost",50052);
        try {
            String customerName = "John Doe";
            String pickupLocation = "123 Main St";
            String dropoffLocation = "456 Elm St";
            LocalDateTime pickupDateTime = LocalDateTime.of(2023, 4, 20, 9, 0);
            String creditCardNumber = "123 456 789";
            String expiryDate = "2025 05 01";
            float amount =200;
            String cvv ="098";
            client.bookAndPay(customerName, pickupLocation, dropoffLocation, String.valueOf(pickupDateTime),creditCardNumber,expiryDate,cvv,amount);
        } finally {
            client.shutdown();
        }
    }

}






