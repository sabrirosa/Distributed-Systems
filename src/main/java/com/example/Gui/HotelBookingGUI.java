package com.example.Gui;

import com.example.Clients.ClientOrchestrator;
import com.example.Clients.Session;
import com.example.booking.BookingResponse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelBookingGUI extends JFrame implements ActionListener {
    private final JButton checkAvailabilityBtn;
    private final JButton bookNowBtn;
    private final JButton payBtn;
    private JPanel contentPanel, availabilityPanel, bookNowPanel, payPanel;
    private JTable availabilityTable;
    private JScrollPane availabilityScrollPane;
    private JLabel emailLabel, nameLabel, ageLabel, mobileLabel, startDateLabel, endDateLabel, amountLabel, cardNumberLabel, expiryLabel, cvvLabel,roomLabel;
    private JTextField emailField, nameField, ageField, mobileField, startDateField, endDateField, amountField, cardNumberField, expiryField, cvvField,roomField;
    private JButton submitBookingBtn, submitPaymentBtn;

    public HotelBookingGUI() {
        setTitle("Hotel Booking System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create welcome panel with buttons
        JPanel welcomePanel = new JPanel();
        welcomePanel.setLayout(new GridLayout(1, 3));
        checkAvailabilityBtn = new JButton("Check Availability");
        bookNowBtn = new JButton("Book Now");
        payBtn = new JButton("Pay");
        checkAvailabilityBtn.addActionListener(this);
        bookNowBtn.addActionListener(this);
        payBtn.addActionListener(this);
        welcomePanel.add(checkAvailabilityBtn);
        welcomePanel.add(bookNowBtn);
        welcomePanel.add(payBtn);
        add(welcomePanel, BorderLayout.NORTH);

        // Create content panel to show different content based on button clicks
        contentPanel = new JPanel(new CardLayout());
        availabilityPanel = new JPanel();
        bookNowPanel = new JPanel();
        payPanel = new JPanel();

        // Create availability panel with table
        String[] columnNames = {"Room Number", "Room Name", "Availability", "Amount"};
        Object[][] data = {
                {101, "Standard Room", "Available", 100},
                {102, "Standard Room", "Booked", 100},
                {201, "Deluxe Room", "Available", 200},
                {202, "Deluxe Room", "Available", 200},
                {301, "Suite", "Booked", 300},
                {302, "Suite", "Available", 300},
        };
        availabilityTable = new JTable(data, columnNames);
        availabilityScrollPane = new JScrollPane(availabilityTable);
        availabilityPanel.add(availabilityScrollPane);
        contentPanel.add(availabilityPanel, "availability");

        // Create book now panel with form
        bookNowPanel.setLayout(new GridLayout(7, 2));
        emailLabel = new JLabel("Email:");
        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        mobileLabel = new JLabel("Mobile:");
        startDateLabel = new JLabel("Start Date:");
        endDateLabel = new JLabel("End Date:");
        roomLabel = new JLabel("Room Number:");
        emailField = new JTextField();
        roomField = new JTextField();
        nameField = new JTextField();
        ageField = new JTextField();
        mobileField = new JTextField();
        startDateField = new JTextField();
        endDateField = new JTextField();
        submitBookingBtn = new JButton("Book");
        submitBookingBtn.addActionListener(this);
        bookNowPanel.add(emailLabel);
        bookNowPanel.add(emailField);
        bookNowPanel.add(roomLabel);
        bookNowPanel.add(roomField);
        bookNowPanel.add(nameLabel);
        bookNowPanel.add(nameField);
        bookNowPanel.add(ageLabel);
        bookNowPanel.add(ageField);
        bookNowPanel.add(mobileLabel);
        bookNowPanel.add(mobileField);
        bookNowPanel.add(startDateLabel);
        bookNowPanel.add(startDateField);
        bookNowPanel.add(endDateLabel);
        bookNowPanel.add(endDateField);
        bookNowPanel.add(submitBookingBtn);

        // Add book now panel to content panel
        contentPanel.add(bookNowPanel, "bookNow");

// Create pay panel with form
        payPanel.setLayout(new GridLayout(5, 2));
        payPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        amountLabel = new JLabel("Amount:");
        cardNumberLabel = new JLabel("Card Number:");
        expiryLabel = new JLabel("Expiry Date:");
        cvvLabel = new JLabel("CVV:");
        amountField = new JTextField();
        cardNumberField = new JTextField();
        expiryField = new JTextField();
        cvvField = new JTextField();
        submitPaymentBtn = new JButton("Pay");
        submitPaymentBtn.addActionListener(this);

// Set fixed width for labels and fields
        int labelWidth = 100;
        int fieldWidth = 200;
        amountLabel.setPreferredSize(new Dimension(labelWidth, 0));
        cardNumberLabel.setPreferredSize(new Dimension(labelWidth, 0));
        expiryLabel.setPreferredSize(new Dimension(labelWidth, 0));
        cvvLabel.setPreferredSize(new Dimension(labelWidth, 0));
        amountField.setPreferredSize(new Dimension(fieldWidth, 0));
        cardNumberField.setPreferredSize(new Dimension(fieldWidth, 0));
        expiryField.setPreferredSize(new Dimension(fieldWidth, 0));
        cvvField.setPreferredSize(new Dimension(fieldWidth, 0));

        payPanel.add(amountLabel);
        payPanel.add(amountField);
        payPanel.add(cardNumberLabel);
        payPanel.add(cardNumberField);
        payPanel.add(expiryLabel);
        payPanel.add(expiryField);
        payPanel.add(cvvLabel);
        payPanel.add(cvvField);
        payPanel.add(new JLabel()); // Empty label for spacing
        payPanel.add(submitPaymentBtn);

        contentPanel.add(payPanel, "pay");
        add(contentPanel, BorderLayout.CENTER);

// Add content panel to frame
        add(contentPanel, BorderLayout.CENTER);

// Show the frame
        setVisible(true);
    }

    public void showUi() {
        new HotelBookingGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Session session = new Session();
        ClientOrchestrator client = new ClientOrchestrator("localhost", 50051, "localhost", 50052, "localhost", 50053);
        CardLayout cardLayout = (CardLayout) contentPanel.getLayout();
        if (e.getSource() == checkAvailabilityBtn) {
            cardLayout.show(contentPanel, "availability");
        } else if (e.getSource() == bookNowBtn) {
            cardLayout.show(contentPanel, "bookNow");
        } else if (e.getSource() == payBtn) {
            cardLayout.show(contentPanel, "pay");
        } else if (e.getSource() == submitBookingBtn) {
            BookingResponse response= client.booking(nameField.getText(),ageField.getText(),emailField.getText(),mobileField.getText(),startDateField.getText(),endDateField.getText(),"");
            session.setBookingId(Integer.parseInt(response.getBookingId()));
            JOptionPane.showMessageDialog(this, response.getConfirmation());
        } else if (e.getSource() == submitPaymentBtn) {
            String response= client.pay(nameField.getText(),session.getBookingId(),cvvField.getText(),cardNumberField.getText(),expiryField.getText(),Double.parseDouble(amountField.getText()),roomField.getText(),emailField.getText());
            JOptionPane.showMessageDialog(this, response);        }
    }

}

