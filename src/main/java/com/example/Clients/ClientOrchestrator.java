package com.example.Clients;
import com.example.booking.*;
import com.example.payment.*;
import com.example.payment.PaymentResponse;
import com.example.payment.PaymentServiceGrpc;
import com.example.reports.EmailRequest;
import com.example.reports.EmailResponse;
import com.example.reports.ReportServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClientOrchestrator {

    private static final Logger logger = Logger.getLogger(ClientOrchestrator.class.getName());


    private ManagedChannel bookingChannel;

    private ManagedChannel paymentChannel;
    private ManagedChannel reportChannel;

    private BookingServiceGrpc.BookingServiceBlockingStub bookingStub;

    private PaymentServiceGrpc.PaymentServiceBlockingStub paymentStub;
    private ReportServiceGrpc.ReportServiceBlockingStub reportStub;


    public ClientOrchestrator(String bookingHost, int bookingPort, String paymentHost, int paymentPort, String reportHost, int reportPort) {
try {
    bookingChannel = ManagedChannelBuilder.forAddress(bookingHost, bookingPort)

            .usePlaintext()

            .build();
    bookingStub = BookingServiceGrpc.newBlockingStub(bookingChannel);
}catch (Exception e){
logger.log(Level.WARNING,e.getMessage());
}


try {

    paymentChannel = ManagedChannelBuilder.forAddress(paymentHost, paymentPort)

            .usePlaintext()

            .build();
    paymentStub = PaymentServiceGrpc.newBlockingStub(paymentChannel);
}
        catch (Exception e){
            logger.log(Level.WARNING,e.getMessage());

    }


try {
    reportChannel = ManagedChannelBuilder.forAddress(reportHost, reportPort)

            .usePlaintext()

            .build();
    reportStub = ReportServiceGrpc.newBlockingStub(reportChannel);

}catch (Exception e){
    logger.log(Level.WARNING,e.getMessage());

}



    }


    public void shutdown() throws InterruptedException {

        bookingChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);

        paymentChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);

        reportChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);


    }

    /**
     * Booking method
     **/
    public BookingResponse booking(String customerName, String age, String email,
                          String phone, String startDate, String endDate, String roomNumber) {
        try {

            BookingRequest bookingRequest = BookingRequest.newBuilder()

                    .setCustomerName(customerName)
                    .setEmail(email)
                    .setAge(age)
                    .setPhone(phone)
                    .setStartDate(startDate)
                    .setEndDate(endDate)
                    .setRoomNumber(roomNumber)
                    .build();

            BookingResponse bookingResponse = bookingStub.makeBooking(bookingRequest);
            logger.info("Booking ID: " + bookingResponse.getBookingId());


            return bookingResponse;

        } catch (StatusRuntimeException e) {

            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());

            return BookingResponse.newBuilder().setConfirmation("FAILED").build();

        }
    }

    /**
     * payment method
     **/
    public String pay(String customerName, int bookingId, String cvv,
                      String cardNumber, String expiry, Double amount,String roomNumber,String email) {
        try {

            PaymentRequest paymentRequest = PaymentRequest.newBuilder()

                    .setExpiryDate(expiry)

                    .setAmount(amount)
                    .setBookingId(bookingId)
                    .setCardNumber(cardNumber)
                    .setCustomerName(customerName)
                    .setCvv(cvv)
                    .build();

            PaymentResponse paymentResponse = paymentStub.makePayment(paymentRequest);
            logger.info("Payment Successful: " + paymentResponse.getSuccess());
            if (paymentResponse.getSuccess()){
                String message="Hello "+customerName+ "\n" +
                        "Thank you for choosing our hotel for your stay in Dublin. \n"  +
                        "Your payment of € " +amount+ " has been received and \n" +
                        "your booking of the room "+roomNumber+ " has been confirmed \n" +
                        "Looking forward to welcoming you in the hotel!";
                this.sendEmail(email,"YOUR BOOKING AND PAYMENT CONFIRMATION AT HOTEL DUBLIN",message);
            }

            return paymentResponse.getMessage();

        } catch (StatusRuntimeException e) {

            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());

            return "Failed: "+e.getMessage();

        }
    }

    void sendEmail(String email,String subject,String message){
        try {
            EmailRequest emailRequest=EmailRequest.newBuilder().setEmail(email)
                            .setSubject(subject)
                                    .setMessage(message).build();
           EmailResponse emailResponse=reportStub.sendEmail(emailRequest);
           logger.info(emailResponse.getMessage());
        }catch (Exception e){
            logger.log(Level.WARNING,e.getMessage());
        }

    }

    public List<Booking> getBookings() {
        logger.info("get booking");
        GetBookingsRequest request = GetBookingsRequest.newBuilder().build();
        GetBookingsResponse response = bookingStub.getBookings(request);
        logger.info("returned data: " + response.getBookingsList().toString());
        return response.getBookingsList();
    }

}





