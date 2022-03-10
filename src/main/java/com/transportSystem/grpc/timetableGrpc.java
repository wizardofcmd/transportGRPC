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
    comments = "Source: timetables.proto")
public final class timetableGrpc {

  private timetableGrpc() {}

  public static final String SERVICE_NAME = "timetable";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.transportSystem.grpc.TimetableProto.trainRide,
      com.transportSystem.grpc.TimetableProto.trainTimetables> getGetTimetablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTimetables",
      requestType = com.transportSystem.grpc.TimetableProto.trainRide.class,
      responseType = com.transportSystem.grpc.TimetableProto.trainTimetables.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.transportSystem.grpc.TimetableProto.trainRide,
      com.transportSystem.grpc.TimetableProto.trainTimetables> getGetTimetablesMethod() {
    io.grpc.MethodDescriptor<com.transportSystem.grpc.TimetableProto.trainRide, com.transportSystem.grpc.TimetableProto.trainTimetables> getGetTimetablesMethod;
    if ((getGetTimetablesMethod = timetableGrpc.getGetTimetablesMethod) == null) {
      synchronized (timetableGrpc.class) {
        if ((getGetTimetablesMethod = timetableGrpc.getGetTimetablesMethod) == null) {
          timetableGrpc.getGetTimetablesMethod = getGetTimetablesMethod = 
              io.grpc.MethodDescriptor.<com.transportSystem.grpc.TimetableProto.trainRide, com.transportSystem.grpc.TimetableProto.trainTimetables>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "timetable", "getTimetables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.transportSystem.grpc.TimetableProto.trainRide.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.transportSystem.grpc.TimetableProto.trainTimetables.getDefaultInstance()))
                  .setSchemaDescriptor(new timetableMethodDescriptorSupplier("getTimetables"))
                  .build();
          }
        }
     }
     return getGetTimetablesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static timetableStub newStub(io.grpc.Channel channel) {
    return new timetableStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static timetableBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new timetableBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static timetableFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new timetableFutureStub(channel);
  }

  /**
   */
  public static abstract class timetableImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.transportSystem.grpc.TimetableProto.trainRide> getTimetables(
        io.grpc.stub.StreamObserver<com.transportSystem.grpc.TimetableProto.trainTimetables> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetTimetablesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTimetablesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.transportSystem.grpc.TimetableProto.trainRide,
                com.transportSystem.grpc.TimetableProto.trainTimetables>(
                  this, METHODID_GET_TIMETABLES)))
          .build();
    }
  }

  /**
   */
  public static final class timetableStub extends io.grpc.stub.AbstractStub<timetableStub> {
    private timetableStub(io.grpc.Channel channel) {
      super(channel);
    }

    private timetableStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected timetableStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new timetableStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.transportSystem.grpc.TimetableProto.trainRide> getTimetables(
        io.grpc.stub.StreamObserver<com.transportSystem.grpc.TimetableProto.trainTimetables> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetTimetablesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class timetableBlockingStub extends io.grpc.stub.AbstractStub<timetableBlockingStub> {
    private timetableBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private timetableBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected timetableBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new timetableBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class timetableFutureStub extends io.grpc.stub.AbstractStub<timetableFutureStub> {
    private timetableFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private timetableFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected timetableFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new timetableFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_TIMETABLES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final timetableImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(timetableImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TIMETABLES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getTimetables(
              (io.grpc.stub.StreamObserver<com.transportSystem.grpc.TimetableProto.trainTimetables>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class timetableBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    timetableBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.transportSystem.grpc.TimetableProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("timetable");
    }
  }

  private static final class timetableFileDescriptorSupplier
      extends timetableBaseDescriptorSupplier {
    timetableFileDescriptorSupplier() {}
  }

  private static final class timetableMethodDescriptorSupplier
      extends timetableBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    timetableMethodDescriptorSupplier(String methodName) {
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
      synchronized (timetableGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new timetableFileDescriptorSupplier())
              .addMethod(getGetTimetablesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
