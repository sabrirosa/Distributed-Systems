package com.example.Clients;

public class Session {
    private int bookingId;
    private String name;
    private String email;
    private String roomNumber;

    public Session() {
    }

    public Session(int bookingId, String name, String email, String roomNumber) {
        this.bookingId = bookingId;
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
