package com.example.service;
import com.example.booking.BookingRequest;
import com.example.booking.BookingResponse;
import com.example.booking.BookingServiceGrpc;
import com.example.payment.PaymentRequest;
import com.example.payment.PaymentResponse;
import com.example.payment.PaymentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
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

            BookingResponse bookingResponse = bookingStub.bookRide(bookingRequest);
logger.info("Booking ID: " + bookingResponse.getBookingId());


            PaymentRequest paymentRequest = PaymentRequest.newBuilder()

                    .setCardNumber(cardNumber)

                    .setCardExpiryDate(cardExpiryDate)

                    .setCvv(cvv)

                    .setAmount(amount)

                    .setBookingId(bookingResponse.getBookingId())

                    .build();

            PaymentResponse paymentResponse = paymentStub.makePayment(paymentRequest);
logger.info("Payment ID: " + paymentResponse.getPaymentId());


            return true;

        } catch (StatusRuntimeException e) {

            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());

            return false;

        }

    }

}




