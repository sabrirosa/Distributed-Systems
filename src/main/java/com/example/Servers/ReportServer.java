package com.example.Servers;

import com.example.reports.EmailRequest;
import com.example.reports.EmailResponse;
import com.example.reports.ReportServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportServer {
    private static final Logger log = Logger.getLogger(ReportServer.class.getName());

    int port=50053;
    Server server;


    public void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new ReportServiceImpl())
                .build()
                .start();
        log.info("Reporting Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            log.info("Shutting down Reporting server...");
            ReportServer.this.stop();
            log.info("Reporting server shut down.");
        }));
    }

    public void stop() {
        server.shutdown();
    }
    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private static class ReportServiceImpl extends ReportServiceGrpc.ReportServiceImplBase {
        private static final String SMTP_HOST = "smtp.gmail.com";
        private static final int SMTP_PORT = 587;
        private static final String EMAIL = "hotelreservations03@gmail.com";
        private static final String PASSWORD = "bevtativtwphodgz";

        @Override
        public void sendEmail(EmailRequest request, StreamObserver<EmailResponse> responseObserver){
            // Set the Gmail SMTP server properties
            Properties props = new Properties();
            props.put("mail.smtp.host", SMTP_HOST);
            props.put("mail.smtp.port", SMTP_PORT);
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            // Create a new Session object
            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(EMAIL, PASSWORD);
                }
            });

            try {
                // Create a new Message object
                Message message = new MimeMessage(session);

                // Set the sender and recipient addresses
                message.setFrom(new InternetAddress(EMAIL));
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(request.getEmail()));

                // Set the email subject and message body
                message.setSubject(request.getSubject());
                message.setText(request.getMessage());

                // Send the email
                Transport.send(message);
                responseObserver.onNext(EmailResponse.newBuilder().setSuccess(true).setMessage("Email sent successfully.").build());
                log.info("Email sent successfully.");

            } catch (MessagingException e) {
                e.printStackTrace();
                log.log(Level.WARNING,e.getMessage());
                responseObserver.onNext(EmailResponse.newBuilder().setSuccess(false).setMessage(e.getMessage()).build());
            } finally {
                responseObserver.onCompleted();
            }

        }
    }
}
