// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BookingService.proto

package com.example.booking;

public interface GetBookingsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetBookingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Booking bookings = 1;</code>
   */
  java.util.List<com.example.booking.Booking> 
      getBookingsList();
  /**
   * <code>repeated .Booking bookings = 1;</code>
   */
  com.example.booking.Booking getBookings(int index);
  /**
   * <code>repeated .Booking bookings = 1;</code>
   */
  int getBookingsCount();
  /**
   * <code>repeated .Booking bookings = 1;</code>
   */
  java.util.List<? extends com.example.booking.BookingOrBuilder> 
      getBookingsOrBuilderList();
  /**
   * <code>repeated .Booking bookings = 1;</code>
   */
  com.example.booking.BookingOrBuilder getBookingsOrBuilder(
      int index);
}