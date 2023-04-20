package com.examples.booking;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: booking.proto")
public final class BookingGrpc {

  private BookingGrpc() {}

  public static final String SERVICE_NAME = "maths.Booking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.examples.booking.PersonalData,
      com.examples.booking.RegisterResponse> getCreateGuestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createGuest",
      requestType = com.examples.booking.PersonalData.class,
      responseType = com.examples.booking.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.examples.booking.PersonalData,
      com.examples.booking.RegisterResponse> getCreateGuestMethod() {
    io.grpc.MethodDescriptor<com.examples.booking.PersonalData, com.examples.booking.RegisterResponse> getCreateGuestMethod;
    if ((getCreateGuestMethod = BookingGrpc.getCreateGuestMethod) == null) {
      synchronized (BookingGrpc.class) {
        if ((getCreateGuestMethod = BookingGrpc.getCreateGuestMethod) == null) {
          BookingGrpc.getCreateGuestMethod = getCreateGuestMethod = 
              io.grpc.MethodDescriptor.<com.examples.booking.PersonalData, com.examples.booking.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "maths.Booking", "createGuest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examples.booking.PersonalData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examples.booking.RegisterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingMethodDescriptorSupplier("createGuest"))
                  .build();
          }
        }
     }
     return getCreateGuestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.examples.booking.ReservationRequest,
      com.examples.booking.ReservationResponse> getBookReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookReservation",
      requestType = com.examples.booking.ReservationRequest.class,
      responseType = com.examples.booking.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.examples.booking.ReservationRequest,
      com.examples.booking.ReservationResponse> getBookReservationMethod() {
    io.grpc.MethodDescriptor<com.examples.booking.ReservationRequest, com.examples.booking.ReservationResponse> getBookReservationMethod;
    if ((getBookReservationMethod = BookingGrpc.getBookReservationMethod) == null) {
      synchronized (BookingGrpc.class) {
        if ((getBookReservationMethod = BookingGrpc.getBookReservationMethod) == null) {
          BookingGrpc.getBookReservationMethod = getBookReservationMethod = 
              io.grpc.MethodDescriptor.<com.examples.booking.ReservationRequest, com.examples.booking.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "maths.Booking", "bookReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examples.booking.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examples.booking.ReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingMethodDescriptorSupplier("bookReservation"))
                  .build();
          }
        }
     }
     return getBookReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.examples.booking.PaymentRequest,
      com.examples.booking.PaymentResponse> getMakePaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "makePayment",
      requestType = com.examples.booking.PaymentRequest.class,
      responseType = com.examples.booking.PaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.examples.booking.PaymentRequest,
      com.examples.booking.PaymentResponse> getMakePaymentMethod() {
    io.grpc.MethodDescriptor<com.examples.booking.PaymentRequest, com.examples.booking.PaymentResponse> getMakePaymentMethod;
    if ((getMakePaymentMethod = BookingGrpc.getMakePaymentMethod) == null) {
      synchronized (BookingGrpc.class) {
        if ((getMakePaymentMethod = BookingGrpc.getMakePaymentMethod) == null) {
          BookingGrpc.getMakePaymentMethod = getMakePaymentMethod = 
              io.grpc.MethodDescriptor.<com.examples.booking.PaymentRequest, com.examples.booking.PaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "maths.Booking", "makePayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examples.booking.PaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.examples.booking.PaymentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingMethodDescriptorSupplier("makePayment"))
                  .build();
          }
        }
     }
     return getMakePaymentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingStub newStub(io.grpc.Channel channel) {
    return new BookingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookingFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class BookingImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.examples.booking.PersonalData> createGuest(
        io.grpc.stub.StreamObserver<com.examples.booking.RegisterResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCreateGuestMethod(), responseObserver);
    }

    /**
     */
    public void bookReservation(com.examples.booking.ReservationRequest request,
        io.grpc.stub.StreamObserver<com.examples.booking.ReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookReservationMethod(), responseObserver);
    }

    /**
     */
    public void makePayment(com.examples.booking.PaymentRequest request,
        io.grpc.stub.StreamObserver<com.examples.booking.PaymentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMakePaymentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateGuestMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.examples.booking.PersonalData,
                com.examples.booking.RegisterResponse>(
                  this, METHODID_CREATE_GUEST)))
          .addMethod(
            getBookReservationMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.examples.booking.ReservationRequest,
                com.examples.booking.ReservationResponse>(
                  this, METHODID_BOOK_RESERVATION)))
          .addMethod(
            getMakePaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.examples.booking.PaymentRequest,
                com.examples.booking.PaymentResponse>(
                  this, METHODID_MAKE_PAYMENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class BookingStub extends io.grpc.stub.AbstractStub<BookingStub> {
    private BookingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.examples.booking.PersonalData> createGuest(
        io.grpc.stub.StreamObserver<com.examples.booking.RegisterResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCreateGuestMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void bookReservation(com.examples.booking.ReservationRequest request,
        io.grpc.stub.StreamObserver<com.examples.booking.ReservationResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getBookReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void makePayment(com.examples.booking.PaymentRequest request,
        io.grpc.stub.StreamObserver<com.examples.booking.PaymentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakePaymentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class BookingBlockingStub extends io.grpc.stub.AbstractStub<BookingBlockingStub> {
    private BookingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.examples.booking.ReservationResponse> bookReservation(
        com.examples.booking.ReservationRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getBookReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.examples.booking.PaymentResponse makePayment(com.examples.booking.PaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getMakePaymentMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class BookingFutureStub extends io.grpc.stub.AbstractStub<BookingFutureStub> {
    private BookingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.examples.booking.PaymentResponse> makePayment(
        com.examples.booking.PaymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMakePaymentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOK_RESERVATION = 0;
  private static final int METHODID_MAKE_PAYMENT = 1;
  private static final int METHODID_CREATE_GUEST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOOK_RESERVATION:
          serviceImpl.bookReservation((com.examples.booking.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.examples.booking.ReservationResponse>) responseObserver);
          break;
        case METHODID_MAKE_PAYMENT:
          serviceImpl.makePayment((com.examples.booking.PaymentRequest) request,
              (io.grpc.stub.StreamObserver<com.examples.booking.PaymentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_GUEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createGuest(
              (io.grpc.stub.StreamObserver<com.examples.booking.RegisterResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.examples.booking.BookingServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Booking");
    }
  }

  private static final class BookingFileDescriptorSupplier
      extends BookingBaseDescriptorSupplier {
    BookingFileDescriptorSupplier() {}
  }

  private static final class BookingMethodDescriptorSupplier
      extends BookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookingMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingFileDescriptorSupplier())
              .addMethod(getCreateGuestMethod())
              .addMethod(getBookReservationMethod())
              .addMethod(getMakePaymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
