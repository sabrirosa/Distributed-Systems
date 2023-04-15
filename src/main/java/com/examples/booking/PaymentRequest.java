// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking.proto

package com.examples.booking;

/**
 * Protobuf type {@code maths.PaymentRequest}
 */
public final class PaymentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maths.PaymentRequest)
    PaymentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaymentRequest.newBuilder() to construct.
  private PaymentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaymentRequest() {
    paymentMethod_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PaymentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.examples.booking.BookingServiceImpl.internal_static_maths_PaymentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.examples.booking.BookingServiceImpl.internal_static_maths_PaymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.examples.booking.PaymentRequest.class, com.examples.booking.PaymentRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code maths.PaymentRequest.Method}
   */
  public enum Method
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MOBILE_MONEY = 0;</code>
     */
    MOBILE_MONEY(0),
    /**
     * <code>CARD = 1;</code>
     */
    CARD(1),
    /**
     * <code>RTS = 2;</code>
     */
    RTS(2),
    /**
     * <code>PAYPAL = 3;</code>
     */
    PAYPAL(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MOBILE_MONEY = 0;</code>
     */
    public static final int MOBILE_MONEY_VALUE = 0;
    /**
     * <code>CARD = 1;</code>
     */
    public static final int CARD_VALUE = 1;
    /**
     * <code>RTS = 2;</code>
     */
    public static final int RTS_VALUE = 2;
    /**
     * <code>PAYPAL = 3;</code>
     */
    public static final int PAYPAL_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Method valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Method forNumber(int value) {
      switch (value) {
        case 0: return MOBILE_MONEY;
        case 1: return CARD;
        case 2: return RTS;
        case 3: return PAYPAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Method>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Method> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Method>() {
            public Method findValueByNumber(int number) {
              return Method.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.examples.booking.PaymentRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final Method[] VALUES = values();

    public static Method valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Method(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:maths.PaymentRequest.Method)
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

  public static final int RESERVATIONID_FIELD_NUMBER = 3;
  private int reservationId_ = 0;
  /**
   * <code>int32 reservationId = 3;</code>
   * @return The reservationId.
   */
  @java.lang.Override
  public int getReservationId() {
    return reservationId_;
  }

  public static final int PAYMENTMETHOD_FIELD_NUMBER = 4;
  private int paymentMethod_ = 0;
  /**
   * <code>.maths.PaymentRequest.Method paymentMethod = 4;</code>
   * @return The enum numeric value on the wire for paymentMethod.
   */
  @java.lang.Override public int getPaymentMethodValue() {
    return paymentMethod_;
  }
  /**
   * <code>.maths.PaymentRequest.Method paymentMethod = 4;</code>
   * @return The paymentMethod.
   */
  @java.lang.Override public com.examples.booking.PaymentRequest.Method getPaymentMethod() {
    com.examples.booking.PaymentRequest.Method result = com.examples.booking.PaymentRequest.Method.forNumber(paymentMethod_);
    return result == null ? com.examples.booking.PaymentRequest.Method.UNRECOGNIZED : result;
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
    if (reservationId_ != 0) {
      output.writeInt32(3, reservationId_);
    }
    if (paymentMethod_ != com.examples.booking.PaymentRequest.Method.MOBILE_MONEY.getNumber()) {
      output.writeEnum(4, paymentMethod_);
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
    if (reservationId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, reservationId_);
    }
    if (paymentMethod_ != com.examples.booking.PaymentRequest.Method.MOBILE_MONEY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, paymentMethod_);
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
    if (!(obj instanceof com.examples.booking.PaymentRequest)) {
      return super.equals(obj);
    }
    com.examples.booking.PaymentRequest other = (com.examples.booking.PaymentRequest) obj;

    if (getGuestId()
        != other.getGuestId()) return false;
    if (getReservationId()
        != other.getReservationId()) return false;
    if (paymentMethod_ != other.paymentMethod_) return false;
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
    hash = (37 * hash) + RESERVATIONID_FIELD_NUMBER;
    hash = (53 * hash) + getReservationId();
    hash = (37 * hash) + PAYMENTMETHOD_FIELD_NUMBER;
    hash = (53 * hash) + paymentMethod_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.examples.booking.PaymentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.examples.booking.PaymentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.examples.booking.PaymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.examples.booking.PaymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.examples.booking.PaymentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.examples.booking.PaymentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.examples.booking.PaymentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.examples.booking.PaymentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.examples.booking.PaymentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.examples.booking.PaymentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.examples.booking.PaymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.examples.booking.PaymentRequest parseFrom(
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
  public static Builder newBuilder(com.examples.booking.PaymentRequest prototype) {
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
   * Protobuf type {@code maths.PaymentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maths.PaymentRequest)
      com.examples.booking.PaymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.examples.booking.BookingServiceImpl.internal_static_maths_PaymentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.examples.booking.BookingServiceImpl.internal_static_maths_PaymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.examples.booking.PaymentRequest.class, com.examples.booking.PaymentRequest.Builder.class);
    }

    // Construct using com.examples.booking.PaymentRequest.newBuilder()
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
      reservationId_ = 0;
      paymentMethod_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.examples.booking.BookingServiceImpl.internal_static_maths_PaymentRequest_descriptor;
    }

    @java.lang.Override
    public com.examples.booking.PaymentRequest getDefaultInstanceForType() {
      return com.examples.booking.PaymentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.examples.booking.PaymentRequest build() {
      com.examples.booking.PaymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.examples.booking.PaymentRequest buildPartial() {
      com.examples.booking.PaymentRequest result = new com.examples.booking.PaymentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.examples.booking.PaymentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.guestId_ = guestId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reservationId_ = reservationId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.paymentMethod_ = paymentMethod_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.examples.booking.PaymentRequest) {
        return mergeFrom((com.examples.booking.PaymentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.examples.booking.PaymentRequest other) {
      if (other == com.examples.booking.PaymentRequest.getDefaultInstance()) return this;
      if (other.getGuestId() != 0) {
        setGuestId(other.getGuestId());
      }
      if (other.getReservationId() != 0) {
        setReservationId(other.getReservationId());
      }
      if (other.paymentMethod_ != 0) {
        setPaymentMethodValue(other.getPaymentMethodValue());
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
            case 24: {
              reservationId_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
            case 32: {
              paymentMethod_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
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

    private int reservationId_ ;
    /**
     * <code>int32 reservationId = 3;</code>
     * @return The reservationId.
     */
    @java.lang.Override
    public int getReservationId() {
      return reservationId_;
    }
    /**
     * <code>int32 reservationId = 3;</code>
     * @param value The reservationId to set.
     * @return This builder for chaining.
     */
    public Builder setReservationId(int value) {

      reservationId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 reservationId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReservationId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reservationId_ = 0;
      onChanged();
      return this;
    }

    private int paymentMethod_ = 0;
    /**
     * <code>.maths.PaymentRequest.Method paymentMethod = 4;</code>
     * @return The enum numeric value on the wire for paymentMethod.
     */
    @java.lang.Override public int getPaymentMethodValue() {
      return paymentMethod_;
    }
    /**
     * <code>.maths.PaymentRequest.Method paymentMethod = 4;</code>
     * @param value The enum numeric value on the wire for paymentMethod to set.
     * @return This builder for chaining.
     */
    public Builder setPaymentMethodValue(int value) {
      paymentMethod_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.maths.PaymentRequest.Method paymentMethod = 4;</code>
     * @return The paymentMethod.
     */
    @java.lang.Override
    public com.examples.booking.PaymentRequest.Method getPaymentMethod() {
      com.examples.booking.PaymentRequest.Method result = com.examples.booking.PaymentRequest.Method.forNumber(paymentMethod_);
      return result == null ? com.examples.booking.PaymentRequest.Method.UNRECOGNIZED : result;
    }
    /**
     * <code>.maths.PaymentRequest.Method paymentMethod = 4;</code>
     * @param value The paymentMethod to set.
     * @return This builder for chaining.
     */
    public Builder setPaymentMethod(com.examples.booking.PaymentRequest.Method value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      paymentMethod_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.maths.PaymentRequest.Method paymentMethod = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPaymentMethod() {
      bitField0_ = (bitField0_ & ~0x00000004);
      paymentMethod_ = 0;
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


    // @@protoc_insertion_point(builder_scope:maths.PaymentRequest)
  }

  // @@protoc_insertion_point(class_scope:maths.PaymentRequest)
  private static final com.examples.booking.PaymentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.examples.booking.PaymentRequest();
  }

  public static com.examples.booking.PaymentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaymentRequest>
      PARSER = new com.google.protobuf.AbstractParser<PaymentRequest>() {
    @java.lang.Override
    public PaymentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PaymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaymentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.examples.booking.PaymentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

