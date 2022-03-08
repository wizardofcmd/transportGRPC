package com.transportSystem.grpc;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ticket.proto")
public final class ticketsGrpc {

  private ticketsGrpc() {}

  public static final String SERVICE_NAME = "tickets";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.transportSystem.grpc.purchaseInfo,
      com.transportSystem.grpc.ticketDetails> getBuyTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "buyTicket",
      requestType = com.transportSystem.grpc.purchaseInfo.class,
      responseType = com.transportSystem.grpc.ticketDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.transportSystem.grpc.purchaseInfo,
      com.transportSystem.grpc.ticketDetails> getBuyTicketMethod() {
    io.grpc.MethodDescriptor<com.transportSystem.grpc.purchaseInfo, com.transportSystem.grpc.ticketDetails> getBuyTicketMethod;
    if ((getBuyTicketMethod = ticketsGrpc.getBuyTicketMethod) == null) {
      synchronized (ticketsGrpc.class) {
        if ((getBuyTicketMethod = ticketsGrpc.getBuyTicketMethod) == null) {
          ticketsGrpc.getBuyTicketMethod = getBuyTicketMethod = 
              io.grpc.MethodDescriptor.<com.transportSystem.grpc.purchaseInfo, com.transportSystem.grpc.ticketDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tickets", "buyTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.transportSystem.grpc.purchaseInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.transportSystem.grpc.ticketDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new ticketsMethodDescriptorSupplier("buyTicket"))
                  .build();
          }
        }
     }
     return getBuyTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.transportSystem.grpc.trainRoute,
      com.transportSystem.grpc.ticketsAvailable> getCheckAvailableTicketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkAvailableTickets",
      requestType = com.transportSystem.grpc.trainRoute.class,
      responseType = com.transportSystem.grpc.ticketsAvailable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.transportSystem.grpc.trainRoute,
      com.transportSystem.grpc.ticketsAvailable> getCheckAvailableTicketsMethod() {
    io.grpc.MethodDescriptor<com.transportSystem.grpc.trainRoute, com.transportSystem.grpc.ticketsAvailable> getCheckAvailableTicketsMethod;
    if ((getCheckAvailableTicketsMethod = ticketsGrpc.getCheckAvailableTicketsMethod) == null) {
      synchronized (ticketsGrpc.class) {
        if ((getCheckAvailableTicketsMethod = ticketsGrpc.getCheckAvailableTicketsMethod) == null) {
          ticketsGrpc.getCheckAvailableTicketsMethod = getCheckAvailableTicketsMethod = 
              io.grpc.MethodDescriptor.<com.transportSystem.grpc.trainRoute, com.transportSystem.grpc.ticketsAvailable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "tickets", "checkAvailableTickets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.transportSystem.grpc.trainRoute.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.transportSystem.grpc.ticketsAvailable.getDefaultInstance()))
                  .setSchemaDescriptor(new ticketsMethodDescriptorSupplier("checkAvailableTickets"))
                  .build();
          }
        }
     }
     return getCheckAvailableTicketsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ticketsStub newStub(io.grpc.Channel channel) {
    return new ticketsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ticketsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ticketsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ticketsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ticketsFutureStub(channel);
  }

  /**
   */
  public static abstract class ticketsImplBase implements io.grpc.BindableService {

    /**
     */
    public void buyTicket(com.transportSystem.grpc.purchaseInfo request,
        io.grpc.stub.StreamObserver<com.transportSystem.grpc.ticketDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getBuyTicketMethod(), responseObserver);
    }

    /**
     */
    public void checkAvailableTickets(com.transportSystem.grpc.trainRoute request,
        io.grpc.stub.StreamObserver<com.transportSystem.grpc.ticketsAvailable> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckAvailableTicketsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBuyTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.transportSystem.grpc.purchaseInfo,
                com.transportSystem.grpc.ticketDetails>(
                  this, METHODID_BUY_TICKET)))
          .addMethod(
            getCheckAvailableTicketsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.transportSystem.grpc.trainRoute,
                com.transportSystem.grpc.ticketsAvailable>(
                  this, METHODID_CHECK_AVAILABLE_TICKETS)))
          .build();
    }
  }

  /**
   */
  public static final class ticketsStub extends io.grpc.stub.AbstractStub<ticketsStub> {
    private ticketsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ticketsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ticketsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ticketsStub(channel, callOptions);
    }

    /**
     */
    public void buyTicket(com.transportSystem.grpc.purchaseInfo request,
        io.grpc.stub.StreamObserver<com.transportSystem.grpc.ticketDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuyTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkAvailableTickets(com.transportSystem.grpc.trainRoute request,
        io.grpc.stub.StreamObserver<com.transportSystem.grpc.ticketsAvailable> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCheckAvailableTicketsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ticketsBlockingStub extends io.grpc.stub.AbstractStub<ticketsBlockingStub> {
    private ticketsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ticketsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ticketsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ticketsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.transportSystem.grpc.ticketDetails buyTicket(com.transportSystem.grpc.purchaseInfo request) {
      return blockingUnaryCall(
          getChannel(), getBuyTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.transportSystem.grpc.ticketsAvailable> checkAvailableTickets(
        com.transportSystem.grpc.trainRoute request) {
      return blockingServerStreamingCall(
          getChannel(), getCheckAvailableTicketsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ticketsFutureStub extends io.grpc.stub.AbstractStub<ticketsFutureStub> {
    private ticketsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ticketsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ticketsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ticketsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.transportSystem.grpc.ticketDetails> buyTicket(
        com.transportSystem.grpc.purchaseInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getBuyTicketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BUY_TICKET = 0;
  private static final int METHODID_CHECK_AVAILABLE_TICKETS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ticketsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ticketsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BUY_TICKET:
          serviceImpl.buyTicket((com.transportSystem.grpc.purchaseInfo) request,
              (io.grpc.stub.StreamObserver<com.transportSystem.grpc.ticketDetails>) responseObserver);
          break;
        case METHODID_CHECK_AVAILABLE_TICKETS:
          serviceImpl.checkAvailableTickets((com.transportSystem.grpc.trainRoute) request,
              (io.grpc.stub.StreamObserver<com.transportSystem.grpc.ticketsAvailable>) responseObserver);
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

  private static abstract class ticketsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ticketsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.transportSystem.grpc.TicketProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("tickets");
    }
  }

  private static final class ticketsFileDescriptorSupplier
      extends ticketsBaseDescriptorSupplier {
    ticketsFileDescriptorSupplier() {}
  }

  private static final class ticketsMethodDescriptorSupplier
      extends ticketsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ticketsMethodDescriptorSupplier(String methodName) {
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
      synchronized (ticketsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ticketsFileDescriptorSupplier())
              .addMethod(getBuyTicketMethod())
              .addMethod(getCheckAvailableTicketsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
