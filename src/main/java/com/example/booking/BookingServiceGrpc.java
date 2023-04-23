package com.example.booking;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: BookingService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookingServiceGrpc {

  private BookingServiceGrpc() {}

  public static final String SERVICE_NAME = "BookingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.booking.BookingRequest,
      com.example.booking.BookingResponse> getMakeBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakeBooking",
      requestType = com.example.booking.BookingRequest.class,
      responseType = com.example.booking.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.booking.BookingRequest,
      com.example.booking.BookingResponse> getMakeBookingMethod() {
    io.grpc.MethodDescriptor<com.example.booking.BookingRequest, com.example.booking.BookingResponse> getMakeBookingMethod;
    if ((getMakeBookingMethod = BookingServiceGrpc.getMakeBookingMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getMakeBookingMethod = BookingServiceGrpc.getMakeBookingMethod) == null) {
          BookingServiceGrpc.getMakeBookingMethod = getMakeBookingMethod =
              io.grpc.MethodDescriptor.<com.example.booking.BookingRequest, com.example.booking.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MakeBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.booking.BookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.booking.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("MakeBooking"))
              .build();
        }
      }
    }
    return getMakeBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.booking.GetBookingsRequest,
      com.example.booking.GetBookingsResponse> getGetBookingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBookings",
      requestType = com.example.booking.GetBookingsRequest.class,
      responseType = com.example.booking.GetBookingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.booking.GetBookingsRequest,
      com.example.booking.GetBookingsResponse> getGetBookingsMethod() {
    io.grpc.MethodDescriptor<com.example.booking.GetBookingsRequest, com.example.booking.GetBookingsResponse> getGetBookingsMethod;
    if ((getGetBookingsMethod = BookingServiceGrpc.getGetBookingsMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetBookingsMethod = BookingServiceGrpc.getGetBookingsMethod) == null) {
          BookingServiceGrpc.getGetBookingsMethod = getGetBookingsMethod =
              io.grpc.MethodDescriptor.<com.example.booking.GetBookingsRequest, com.example.booking.GetBookingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBookings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.booking.GetBookingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.booking.GetBookingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("GetBookings"))
              .build();
        }
      }
    }
    return getGetBookingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.booking.GetRoomsRequest,
      com.example.booking.GetRoomsResponse> getGetRoomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRooms",
      requestType = com.example.booking.GetRoomsRequest.class,
      responseType = com.example.booking.GetRoomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.booking.GetRoomsRequest,
      com.example.booking.GetRoomsResponse> getGetRoomsMethod() {
    io.grpc.MethodDescriptor<com.example.booking.GetRoomsRequest, com.example.booking.GetRoomsResponse> getGetRoomsMethod;
    if ((getGetRoomsMethod = BookingServiceGrpc.getGetRoomsMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetRoomsMethod = BookingServiceGrpc.getGetRoomsMethod) == null) {
          BookingServiceGrpc.getGetRoomsMethod = getGetRoomsMethod =
              io.grpc.MethodDescriptor.<com.example.booking.GetRoomsRequest, com.example.booking.GetRoomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRooms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.booking.GetRoomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.booking.GetRoomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("GetRooms"))
              .build();
        }
      }
    }
    return getGetRoomsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceStub>() {
        @java.lang.Override
        public BookingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceStub(channel, callOptions);
        }
      };
    return BookingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceBlockingStub>() {
        @java.lang.Override
        public BookingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceBlockingStub(channel, callOptions);
        }
      };
    return BookingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceFutureStub>() {
        @java.lang.Override
        public BookingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceFutureStub(channel, callOptions);
        }
      };
    return BookingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void makeBooking(com.example.booking.BookingRequest request,
        io.grpc.stub.StreamObserver<com.example.booking.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMakeBookingMethod(), responseObserver);
    }

    /**
     */
    default void getBookings(com.example.booking.GetBookingsRequest request,
        io.grpc.stub.StreamObserver<com.example.booking.GetBookingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBookingsMethod(), responseObserver);
    }

    /**
     */
    default void getRooms(com.example.booking.GetRoomsRequest request,
        io.grpc.stub.StreamObserver<com.example.booking.GetRoomsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoomsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BookingService.
   */
  public static abstract class BookingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookingService.
   */
  public static final class BookingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookingServiceStub> {
    private BookingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceStub(channel, callOptions);
    }

    /**
     */
    public void makeBooking(com.example.booking.BookingRequest request,
        io.grpc.stub.StreamObserver<com.example.booking.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMakeBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBookings(com.example.booking.GetBookingsRequest request,
        io.grpc.stub.StreamObserver<com.example.booking.GetBookingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBookingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRooms(com.example.booking.GetRoomsRequest request,
        io.grpc.stub.StreamObserver<com.example.booking.GetRoomsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoomsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BookingService.
   */
  public static final class BookingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookingServiceBlockingStub> {
    private BookingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.booking.BookingResponse makeBooking(com.example.booking.BookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMakeBookingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.booking.GetBookingsResponse getBookings(com.example.booking.GetBookingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBookingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.booking.GetRoomsResponse getRooms(com.example.booking.GetRoomsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoomsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookingService.
   */
  public static final class BookingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookingServiceFutureStub> {
    private BookingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.booking.BookingResponse> makeBooking(
        com.example.booking.BookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMakeBookingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.booking.GetBookingsResponse> getBookings(
        com.example.booking.GetBookingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBookingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.booking.GetRoomsResponse> getRooms(
        com.example.booking.GetRoomsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoomsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MAKE_BOOKING = 0;
  private static final int METHODID_GET_BOOKINGS = 1;
  private static final int METHODID_GET_ROOMS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MAKE_BOOKING:
          serviceImpl.makeBooking((com.example.booking.BookingRequest) request,
              (io.grpc.stub.StreamObserver<com.example.booking.BookingResponse>) responseObserver);
          break;
        case METHODID_GET_BOOKINGS:
          serviceImpl.getBookings((com.example.booking.GetBookingsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.booking.GetBookingsResponse>) responseObserver);
          break;
        case METHODID_GET_ROOMS:
          serviceImpl.getRooms((com.example.booking.GetRoomsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.booking.GetRoomsResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMakeBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.booking.BookingRequest,
              com.example.booking.BookingResponse>(
                service, METHODID_MAKE_BOOKING)))
        .addMethod(
          getGetBookingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.booking.GetBookingsRequest,
              com.example.booking.GetBookingsResponse>(
                service, METHODID_GET_BOOKINGS)))
        .addMethod(
          getGetRoomsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.booking.GetRoomsRequest,
              com.example.booking.GetRoomsResponse>(
                service, METHODID_GET_ROOMS)))
        .build();
  }

  private static abstract class BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.booking.BookingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookingService");
    }
  }

  private static final class BookingServiceFileDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier {
    BookingServiceFileDescriptorSupplier() {}
  }

  private static final class BookingServiceMethodDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingServiceFileDescriptorSupplier())
              .addMethod(getMakeBookingMethod())
              .addMethod(getGetBookingsMethod())
              .addMethod(getGetRoomsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
