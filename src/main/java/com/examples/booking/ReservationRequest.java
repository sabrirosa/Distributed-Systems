// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking.proto

package com.examples.booking;

/**
 * Protobuf type {@code maths.ReservationRequest}
 */
public final class ReservationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maths.ReservationRequest)
    ReservationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReservationRequest.newBuilder() to construct.
  private ReservationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReservationRequest() {
    paymentConfirmation_ = "";
    startDate_ = "";
    endDate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReservationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.examples.booking.BookingServiceImpl.internal_static_maths_ReservationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.examples.booking.BookingServiceImpl.internal_static_maths_ReservationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.examples.booking.ReservationRequest.class, com.examples.booking.ReservationRequest.Builder.class);
  }

  public static final int GUESTID_FIELD_NUMBER = 1;
  private int guestId_ = 0;
  /**
   * <code>int32 guestId = 1;</code>
   * @return The guestId.
   */
  @java.lang.Override
  public int getGuestId() {
    return guestId_;
  }

  public static final int PAYMENTCONFIRMATION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object paymentConfirmation_ = "";
  /**
   * <code>string paymentConfirmation = 2;</code>
   * @return The paymentConfirmation.
   */
  @java.lang.Override
  public java.lang.String getPaymentConfirmation() {
    java.lang.Object ref = paymentConfirmation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      paymentConfirmation_ = s;
      return s;
    }
  }
  /**
   * <code>string paymentConfirmation = 2;</code>
   * @return The bytes for paymentConfirmation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPaymentConfirmationBytes() {
    java.lang.Object ref = paymentConfirmation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      paymentConfirmation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTDATE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object startDate_ = "";
  /**
   * <code>string startDate = 3;</code>
   * @return The startDate.
   */
  @java.lang.Override
  public java.lang.String getStartDate() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startDate_ = s;
      return s;
    }
  }
  /**
   * <code>string startDate = 3;</code>
   * @return The bytes for startDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartDateBytes() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDDATE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object endDate_ = "";
  /**
   * <code>string endDate = 4;</code>
   * @return The endDate.
   */
  @java.lang.Override
  public java.lang.String getEndDate() {
    java.lang.Object ref = endDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endDate_ = s;
      return s;
    }
  }
  /**
   * <code>string endDate = 4;</code>
   * @return The bytes for endDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndDateBytes() {
    java.lang.Object ref = endDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (guestId_ != 0) {
      output.writeInt32(1, guestId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(paymentConfirmation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, paymentConfirmation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startDate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, startDate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endDate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, endDate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (guestId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, guestId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(paymentConfirmation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, paymentConfirmation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startDate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, startDate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endDate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, endDate_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.examples.booking.ReservationRequest)) {
      return super.equals(obj);
    }
    com.examples.booking.ReservationRequest other = (com.examples.booking.ReservationRequest) obj;

    if (getGuestId()
        != other.getGuestId()) return false;
    if (!getPaymentConfirmation()
        .equals(other.getPaymentConfirmation())) return false;
    if (!getStartDate()
        .equals(other.getStartDate())) return false;
    if (!getEndDate()
        .equals(other.getEndDate())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GUESTID_FIELD_NUMBER;
    hash = (53 * hash) + getGuestId();
    hash = (37 * hash) + PAYMENTCONFIRMATION_FIELD_NUMBER;
    hash = (53 * hash) + getPaymentConfirmation().hashCode();
    hash = (37 * hash) + STARTDATE_FIELD_NUMBER;
    hash = (53 * hash) + getStartDate().hashCode();
    hash = (37 * hash) + ENDDATE_FIELD_NUMBER;
    hash = (53 * hash) + getEndDate().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.examples.booking.ReservationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.examples.booking.ReservationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.examples.booking.ReservationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.examples.booking.ReservationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.examples.booking.ReservationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.examples.booking.ReservationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.examples.booking.ReservationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.examples.booking.ReservationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.examples.booking.ReservationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.examples.booking.ReservationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.examples.booking.ReservationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.examples.booking.ReservationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.examples.booking.ReservationRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code maths.ReservationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maths.ReservationRequest)
      com.examples.booking.ReservationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.examples.booking.BookingServiceImpl.internal_static_maths_ReservationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.examples.booking.BookingServiceImpl.internal_static_maths_ReservationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.examples.booking.ReservationRequest.class, com.examples.booking.ReservationRequest.Builder.class);
    }

    // Construct using com.examples.booking.ReservationRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      guestId_ = 0;
      paymentConfirmation_ = "";
      startDate_ = "";
      endDate_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.examples.booking.BookingServiceImpl.internal_static_maths_ReservationRequest_descriptor;
    }

    @java.lang.Override
    public com.examples.booking.ReservationRequest getDefaultInstanceForType() {
      return com.examples.booking.ReservationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.examples.booking.ReservationRequest build() {
      com.examples.booking.ReservationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.examples.booking.ReservationRequest buildPartial() {
      com.examples.booking.ReservationRequest result = new com.examples.booking.ReservationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.examples.booking.ReservationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.guestId_ = guestId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.paymentConfirmation_ = paymentConfirmation_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.startDate_ = startDate_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.endDate_ = endDate_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.examples.booking.ReservationRequest) {
        return mergeFrom((com.examples.booking.ReservationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.examples.booking.ReservationRequest other) {
      if (other == com.examples.booking.ReservationRequest.getDefaultInstance()) return this;
      if (other.getGuestId() != 0) {
        setGuestId(other.getGuestId());
      }
      if (!other.getPaymentConfirmation().isEmpty()) {
        paymentConfirmation_ = other.paymentConfirmation_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getStartDate().isEmpty()) {
        startDate_ = other.startDate_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getEndDate().isEmpty()) {
        endDate_ = other.endDate_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              guestId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              paymentConfirmation_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              startDate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              endDate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int guestId_ ;
    /**
     * <code>int32 guestId = 1;</code>
     * @return The guestId.
     */
    @java.lang.Override
    public int getGuestId() {
      return guestId_;
    }
    /**
     * <code>int32 guestId = 1;</code>
     * @param value The guestId to set.
     * @return This builder for chaining.
     */
    public Builder setGuestId(int value) {

      guestId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 guestId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGuestId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      guestId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object paymentConfirmation_ = "";
    /**
     * <code>string paymentConfirmation = 2;</code>
     * @return The paymentConfirmation.
     */
    public java.lang.String getPaymentConfirmation() {
      java.lang.Object ref = paymentConfirmation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        paymentConfirmation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string paymentConfirmation = 2;</code>
     * @return The bytes for paymentConfirmation.
     */
    public com.google.protobuf.ByteString
        getPaymentConfirmationBytes() {
      java.lang.Object ref = paymentConfirmation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        paymentConfirmation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string paymentConfirmation = 2;</code>
     * @param value The paymentConfirmation to set.
     * @return This builder for chaining.
     */
    public Builder setPaymentConfirmation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      paymentConfirmation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string paymentConfirmation = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPaymentConfirmation() {
      paymentConfirmation_ = getDefaultInstance().getPaymentConfirmation();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string paymentConfirmation = 2;</code>
     * @param value The bytes for paymentConfirmation to set.
     * @return This builder for chaining.
     */
    public Builder setPaymentConfirmationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      paymentConfirmation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object startDate_ = "";
    /**
     * <code>string startDate = 3;</code>
     * @return The startDate.
     */
    public java.lang.String getStartDate() {
      java.lang.Object ref = startDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string startDate = 3;</code>
     * @return The bytes for startDate.
     */
    public com.google.protobuf.ByteString
        getStartDateBytes() {
      java.lang.Object ref = startDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string startDate = 3;</code>
     * @param value The startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      startDate_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string startDate = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartDate() {
      startDate_ = getDefaultInstance().getStartDate();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string startDate = 3;</code>
     * @param value The bytes for startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      startDate_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object endDate_ = "";
    /**
     * <code>string endDate = 4;</code>
     * @return The endDate.
     */
    public java.lang.String getEndDate() {
      java.lang.Object ref = endDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string endDate = 4;</code>
     * @return The bytes for endDate.
     */
    public com.google.protobuf.ByteString
        getEndDateBytes() {
      java.lang.Object ref = endDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string endDate = 4;</code>
     * @param value The endDate to set.
     * @return This builder for chaining.
     */
    public Builder setEndDate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      endDate_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string endDate = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndDate() {
      endDate_ = getDefaultInstance().getEndDate();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string endDate = 4;</code>
     * @param value The bytes for endDate to set.
     * @return This builder for chaining.
     */
    public Builder setEndDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      endDate_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:maths.ReservationRequest)
  }

  // @@protoc_insertion_point(class_scope:maths.ReservationRequest)
  private static final com.examples.booking.ReservationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.examples.booking.ReservationRequest();
  }

  public static com.examples.booking.ReservationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReservationRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReservationRequest>() {
    @java.lang.Override
    public ReservationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ReservationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReservationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.examples.booking.ReservationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

