package com.example.Gui;

import com.example.Clients.ServiceClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BookingGui extends JFrame {

    private ServiceClient client;

    private JTextField nameField, pickupField, dropoffField, dateTimeField, cardNumberField, expiryField, cvvField, amountField;

    public BookingGui() {
        super("Booking and Payment System");

        // Set up the GUI components
        JLabel nameLabel = new JLabel("Name:");
        JLabel pickupLabel = new JLabel("Pickup Location:");
        JLabel dropoffLabel = new JLabel("Dropoff Location:");
        JLabel dateTimeLabel = new JLabel("Pickup Date and Time (YYYY-MM-DD HH:MM):");
        JLabel cardNumberLabel = new JLabel("Credit Card Number:");
        JLabel expiryLabel = new JLabel("Expiry Date (YYYY MM):");
        JLabel cvvLabel = new JLabel("CVV:");
        JLabel amountLabel = new JLabel("Amount:");

        nameField = new JTextField(20);
        pickupField = new JTextField(20);
        dropoffField = new JTextField(20);
        dateTimeField = new JTextField(20);
        cardNumberField = new JTextField(20);
        expiryField = new JTextField(20);
        cvvField = new JTextField(20);
        amountField = new JTextField(20);

        JButton bookAndPayButton = new JButton("Book and Pay");
        bookAndPayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookAndPay();
            }
        });

        // Add the components to the content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(9, 2));
        contentPane.add(nameLabel);
        contentPane.add(nameField);
        contentPane.add(pickupLabel);
        contentPane.add(pickupField);
        contentPane.add(dropoffLabel);
        contentPane.add(dropoffField);
        contentPane.add(dateTimeLabel);
        contentPane.add(dateTimeField);
        contentPane.add(cardNumberLabel);
        contentPane.add(cardNumberField);
        contentPane.add(expiryLabel);
        contentPane.add(expiryField);
        contentPane.add(cvvLabel);
        contentPane.add(cvvField);
        contentPane.add(amountLabel);
        contentPane.add(amountField);
        contentPane.add(bookAndPayButton);

        // Create the ServiceClient object
        client = new ServiceClient("localhost", 50051, "localhost", 50052);

        // Set up the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    private void bookAndPay() {
        String customerName = nameField.getText();
        String pickupLocation = pickupField.getText();
        String dropoffLocation = dropoffField.getText();
        String pickupDateTime = dateTimeField.getText();
        String cardNumber = cardNumberField.getText();
        String expiryDate = expiryField.getText();
        String cvv = cvvField.getText();
        double amount = Double.parseDouble(amountField.getText());

        boolean success = client.bookAndPay(customerName, pickupLocation, dropoffLocation, pickupDateTime, cardNumber, expiryDate, cvv, amount);

        if (success) {
            JOptionPane.showMessageDialog(this, "Booking and payment successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Booking and payment failed.");
        }
    }

    public void showUi(String[] args) throws Exception {
        ServiceClient client = new ServiceClient("localhost", 50051, "localhost", 50052);

        // Launch GUI
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hotel Reservation System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // Create the panel and add it to the frame
            JPanel panel = new HotelReservationPanel(client);
            frame.getContentPane().add(panel, BorderLayout.CENTER);

            // Add a panel for displaying bookings
            JPanel bookingsPanel = new JPanel(new BorderLayout());
            JLabel bookingsLabel = new JLabel("Bookings:");
            JTextArea bookingsTextArea = new JTextArea();
            bookingsPanel.add(bookingsLabel, BorderLayout.NORTH);
            bookingsPanel.add(new JScrollPane(bookingsTextArea), BorderLayout.CENTER);
            frame.getContentPane().add(bookingsPanel, BorderLayout.EAST);

            // Display the frame
            frame.pack();
            frame.setLocationRelativeTo(null); // Center the frame on screen
            frame.setVisible(true);

            // Display bookings in the bookings panel
            client.getBookings().forEach(booking -> {
                bookingsTextArea.append(booking.toString() + "\n");
            });
        });

        // Wait for GUI to close before shutting down the client
        while (true) {
            if (System.console() != null) {
                System.console().printf("Press ENTER to exit\n");
            } else {
                System.out.println("Press ENTER to exit");
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            if (line != null && line.trim().isEmpty()) {
                break;
            }
        }

        client.shutdown();
    }

}
