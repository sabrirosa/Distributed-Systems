// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking.proto

package com.examples.booking;

public interface ReservationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maths.ReservationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 guestId = 1;</code>
   * @return The guestId.
   */
  int getGuestId();

  /**
   * <code>string paymentConfirmation = 2;</code>
   * @return The paymentConfirmation.
   */
  java.lang.String getPaymentConfirmation();
  /**
   * <code>string paymentConfirmation = 2;</code>
   * @return The bytes for paymentConfirmation.
   */
  com.google.protobuf.ByteString
      getPaymentConfirmationBytes();

  /**
   * <code>string startDate = 3;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <code>string startDate = 3;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <code>string endDate = 4;</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <code>string endDate = 4;</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();
}
