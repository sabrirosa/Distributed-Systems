package com.example.Gui;

import com.example.Clients.ServiceClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelReservationPanel extends JPanel {

    private ServiceClient client;

    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel pickupLocationLabel;
    private JTextField pickupLocationField;
    private JLabel dropoffLocationLabel;
    private JTextField dropoffLocationField;
    private JLabel pickupDateTimeLabel;
    private JTextField pickupDateTimeField;
    private JLabel creditCardNumberLabel;
    private JTextField creditCardNumberField;
    private JLabel expiryDateLabel;
    private JTextField expiryDateField;
    private JLabel amountLabel;
    private JTextField amountField;
    private JLabel cvvLabel;
    private JTextField cvvField;

    private JButton bookAndPayButton;

    public HotelReservationPanel(ServiceClient client) {
        this.client = client;
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(11, 2, 10, 10));

        nameLabel = new JLabel("Customer Name:");
        add(nameLabel);
        nameField = new JTextField();
        add(nameField);

        pickupLocationLabel = new JLabel("Pickup Location:");
        add(pickupLocationLabel);
        pickupLocationField = new JTextField();
        add(pickupLocationField);

        dropoffLocationLabel = new JLabel("Dropoff Location:");
        add(dropoffLocationLabel);
        dropoffLocationField = new JTextField();
        add(dropoffLocationField);

        pickupDateTimeLabel = new JLabel("Pickup Date and Time (yyyy-mm-dd HH:MM):");
        add(pickupDateTimeLabel);
        pickupDateTimeField = new JTextField();
        add(pickupDateTimeField);

        creditCardNumberLabel = new JLabel("Credit Card Number:");
        add(creditCardNumberLabel);
        creditCardNumberField = new JTextField();
        add(creditCardNumberField);

        expiryDateLabel = new JLabel("Expiry Date (yyyy-mm):");
        add(expiryDateLabel);
        expiryDateField = new JTextField();
        add(expiryDateField);

        cvvLabel = new JLabel("CVV:");
        add(cvvLabel);
        cvvField = new JTextField();
        add(cvvField);

        amountLabel = new JLabel("Amount:");
        add(amountLabel);
        amountField = new JTextField();
        add(amountField);

        bookAndPayButton = new JButton("Book and Pay");
        bookAndPayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String customerName = nameField.getText();
                String pickupLocation = pickupLocationField.getText();
                String dropoffLocation = dropoffLocationField.getText();
                String pickupDateTime = pickupDateTimeField.getText();
                String creditCardNumber = creditCardNumberField.getText();
                String expiryDate = expiryDateField.getText();
                String cvv = cvvField.getText();
                double amount = Double.parseDouble(amountField.getText());
                client.bookAndPay(customerName, pickupLocation, dropoffLocation, pickupDateTime, creditCardNumber, expiryDate, cvv, amount);
            }
        });
        add(bookAndPayButton);
    }

}

