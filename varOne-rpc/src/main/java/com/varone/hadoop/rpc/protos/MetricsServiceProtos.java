// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metricsService.proto

package com.varone.hadoop.rpc.protos;

public final class MetricsServiceProtos {
  private MetricsServiceProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf service {@code MetricsService}
   */
  public static abstract class MetricsService
      implements com.google.protobuf.Service {
    protected MetricsService() {}

    public interface Interface {
      /**
       * <code>rpc getMetrics(.MetricsRequestProto) returns (.MetricsResponseProto);</code>
       */
      public abstract void getMetrics(
          com.google.protobuf.RpcController controller,
          com.varone.hadoop.rpc.protos.MetricsProtos.MetricsRequestProto request,
          com.google.protobuf.RpcCallback<com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new MetricsService() {
        @java.lang.Override
        public  void getMetrics(
            com.google.protobuf.RpcController controller,
            com.varone.hadoop.rpc.protos.MetricsProtos.MetricsRequestProto request,
            com.google.protobuf.RpcCallback<com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto> done) {
          impl.getMetrics(controller, request, done);
        }

      };
    }

    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.getMetrics(controller, (com.varone.hadoop.rpc.protos.MetricsProtos.MetricsRequestProto)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return com.varone.hadoop.rpc.protos.MetricsProtos.MetricsRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc getMetrics(.MetricsRequestProto) returns (.MetricsResponseProto);</code>
     */
    public abstract void getMetrics(
        com.google.protobuf.RpcController controller,
        com.varone.hadoop.rpc.protos.MetricsProtos.MetricsRequestProto request,
        com.google.protobuf.RpcCallback<com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return com.varone.hadoop.rpc.protos.MetricsServiceProtos.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.getMetrics(controller, (com.varone.hadoop.rpc.protos.MetricsProtos.MetricsRequestProto)request,
            com.google.protobuf.RpcUtil.<com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return com.varone.hadoop.rpc.protos.MetricsProtos.MetricsRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends com.varone.hadoop.rpc.protos.MetricsServiceProtos.MetricsService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void getMetrics(
          com.google.protobuf.RpcController controller,
          com.varone.hadoop.rpc.protos.MetricsProtos.MetricsRequestProto request,
          com.google.protobuf.RpcCallback<com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto.class,
            com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto getMetrics(
          com.google.protobuf.RpcController controller,
          com.varone.hadoop.rpc.protos.MetricsProtos.MetricsRequestProto request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto getMetrics(
          com.google.protobuf.RpcController controller,
          com.varone.hadoop.rpc.protos.MetricsProtos.MetricsRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          com.varone.hadoop.rpc.protos.MetricsProtos.MetricsResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:MetricsService)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024metricsService.proto\032\rmetrics.proto2K\n" +
      "\016MetricsService\0229\n\ngetMetrics\022\024.MetricsR" +
      "equestProto\032\025.MetricsResponseProtoB:\n\034co" +
      "m.varone.hadoop.rpc.protosB\024MetricsServi" +
      "ceProtos\210\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.varone.hadoop.rpc.protos.MetricsProtos.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
