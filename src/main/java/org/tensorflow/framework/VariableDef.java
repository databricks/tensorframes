// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/variable.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.VariableDef}
 *
 * <pre>
 * Protocol buffer representing a Variable.
 * </pre>
 */
public  final class VariableDef extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:tensorflow.VariableDef)
    VariableDefOrBuilder {
  // Use VariableDef.newBuilder() to construct.
  private VariableDef(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private VariableDef() {
    variableName_ = "";
    initializerName_ = "";
    snapshotName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private VariableDef(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            variableName_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            initializerName_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            snapshotName_ = s;
            break;
          }
          case 34: {
            org.tensorflow.framework.SaveSliceInfoDef.Builder subBuilder = null;
            if (saveSliceInfoDef_ != null) {
              subBuilder = saveSliceInfoDef_.toBuilder();
            }
            saveSliceInfoDef_ = input.readMessage(org.tensorflow.framework.SaveSliceInfoDef.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(saveSliceInfoDef_);
              saveSliceInfoDef_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_VariableDef_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_VariableDef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.VariableDef.class, org.tensorflow.framework.VariableDef.Builder.class);
  }

  public static final int VARIABLE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object variableName_;
  /**
   * <code>optional string variable_name = 1;</code>
   *
   * <pre>
   * Name of the variable tensor.
   * </pre>
   */
  public java.lang.String getVariableName() {
    java.lang.Object ref = variableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      variableName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string variable_name = 1;</code>
   *
   * <pre>
   * Name of the variable tensor.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getVariableNameBytes() {
    java.lang.Object ref = variableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      variableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INITIALIZER_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object initializerName_;
  /**
   * <code>optional string initializer_name = 2;</code>
   *
   * <pre>
   * Name of the initializer op.
   * </pre>
   */
  public java.lang.String getInitializerName() {
    java.lang.Object ref = initializerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      initializerName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string initializer_name = 2;</code>
   *
   * <pre>
   * Name of the initializer op.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getInitializerNameBytes() {
    java.lang.Object ref = initializerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      initializerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SNAPSHOT_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object snapshotName_;
  /**
   * <code>optional string snapshot_name = 3;</code>
   *
   * <pre>
   * Name of the snapshot tensor.
   * </pre>
   */
  public java.lang.String getSnapshotName() {
    java.lang.Object ref = snapshotName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshotName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string snapshot_name = 3;</code>
   *
   * <pre>
   * Name of the snapshot tensor.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getSnapshotNameBytes() {
    java.lang.Object ref = snapshotName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      snapshotName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SAVE_SLICE_INFO_DEF_FIELD_NUMBER = 4;
  private org.tensorflow.framework.SaveSliceInfoDef saveSliceInfoDef_;
  /**
   * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
   *
   * <pre>
   * Support for saving variables as slices of a larger variable.
   * </pre>
   */
  public boolean hasSaveSliceInfoDef() {
    return saveSliceInfoDef_ != null;
  }
  /**
   * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
   *
   * <pre>
   * Support for saving variables as slices of a larger variable.
   * </pre>
   */
  public org.tensorflow.framework.SaveSliceInfoDef getSaveSliceInfoDef() {
    return saveSliceInfoDef_ == null ? org.tensorflow.framework.SaveSliceInfoDef.getDefaultInstance() : saveSliceInfoDef_;
  }
  /**
   * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
   *
   * <pre>
   * Support for saving variables as slices of a larger variable.
   * </pre>
   */
  public org.tensorflow.framework.SaveSliceInfoDefOrBuilder getSaveSliceInfoDefOrBuilder() {
    return getSaveSliceInfoDef();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getVariableNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, variableName_);
    }
    if (!getInitializerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, initializerName_);
    }
    if (!getSnapshotNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, snapshotName_);
    }
    if (saveSliceInfoDef_ != null) {
      output.writeMessage(4, getSaveSliceInfoDef());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVariableNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, variableName_);
    }
    if (!getInitializerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, initializerName_);
    }
    if (!getSnapshotNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, snapshotName_);
    }
    if (saveSliceInfoDef_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getSaveSliceInfoDef());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static org.tensorflow.framework.VariableDef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.VariableDef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.VariableDef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.VariableDef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.VariableDef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.tensorflow.framework.VariableDef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.tensorflow.framework.VariableDef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.tensorflow.framework.VariableDef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.tensorflow.framework.VariableDef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.tensorflow.framework.VariableDef parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.framework.VariableDef prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.VariableDef}
   *
   * <pre>
   * Protocol buffer representing a Variable.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.VariableDef)
      org.tensorflow.framework.VariableDefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_VariableDef_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_VariableDef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.VariableDef.class, org.tensorflow.framework.VariableDef.Builder.class);
    }

    // Construct using org.tensorflow.framework.VariableDef.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      variableName_ = "";

      initializerName_ = "";

      snapshotName_ = "";

      if (saveSliceInfoDefBuilder_ == null) {
        saveSliceInfoDef_ = null;
      } else {
        saveSliceInfoDef_ = null;
        saveSliceInfoDefBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.VariableProtos.internal_static_tensorflow_VariableDef_descriptor;
    }

    public org.tensorflow.framework.VariableDef getDefaultInstanceForType() {
      return org.tensorflow.framework.VariableDef.getDefaultInstance();
    }

    public org.tensorflow.framework.VariableDef build() {
      org.tensorflow.framework.VariableDef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.framework.VariableDef buildPartial() {
      org.tensorflow.framework.VariableDef result = new org.tensorflow.framework.VariableDef(this);
      result.variableName_ = variableName_;
      result.initializerName_ = initializerName_;
      result.snapshotName_ = snapshotName_;
      if (saveSliceInfoDefBuilder_ == null) {
        result.saveSliceInfoDef_ = saveSliceInfoDef_;
      } else {
        result.saveSliceInfoDef_ = saveSliceInfoDefBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.framework.VariableDef) {
        return mergeFrom((org.tensorflow.framework.VariableDef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.VariableDef other) {
      if (other == org.tensorflow.framework.VariableDef.getDefaultInstance()) return this;
      if (!other.getVariableName().isEmpty()) {
        variableName_ = other.variableName_;
        onChanged();
      }
      if (!other.getInitializerName().isEmpty()) {
        initializerName_ = other.initializerName_;
        onChanged();
      }
      if (!other.getSnapshotName().isEmpty()) {
        snapshotName_ = other.snapshotName_;
        onChanged();
      }
      if (other.hasSaveSliceInfoDef()) {
        mergeSaveSliceInfoDef(other.getSaveSliceInfoDef());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.framework.VariableDef parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.VariableDef) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object variableName_ = "";
    /**
     * <code>optional string variable_name = 1;</code>
     *
     * <pre>
     * Name of the variable tensor.
     * </pre>
     */
    public java.lang.String getVariableName() {
      java.lang.Object ref = variableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        variableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string variable_name = 1;</code>
     *
     * <pre>
     * Name of the variable tensor.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getVariableNameBytes() {
      java.lang.Object ref = variableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        variableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string variable_name = 1;</code>
     *
     * <pre>
     * Name of the variable tensor.
     * </pre>
     */
    public Builder setVariableName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      variableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string variable_name = 1;</code>
     *
     * <pre>
     * Name of the variable tensor.
     * </pre>
     */
    public Builder clearVariableName() {
      
      variableName_ = getDefaultInstance().getVariableName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string variable_name = 1;</code>
     *
     * <pre>
     * Name of the variable tensor.
     * </pre>
     */
    public Builder setVariableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      variableName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object initializerName_ = "";
    /**
     * <code>optional string initializer_name = 2;</code>
     *
     * <pre>
     * Name of the initializer op.
     * </pre>
     */
    public java.lang.String getInitializerName() {
      java.lang.Object ref = initializerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        initializerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string initializer_name = 2;</code>
     *
     * <pre>
     * Name of the initializer op.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getInitializerNameBytes() {
      java.lang.Object ref = initializerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        initializerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string initializer_name = 2;</code>
     *
     * <pre>
     * Name of the initializer op.
     * </pre>
     */
    public Builder setInitializerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      initializerName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string initializer_name = 2;</code>
     *
     * <pre>
     * Name of the initializer op.
     * </pre>
     */
    public Builder clearInitializerName() {
      
      initializerName_ = getDefaultInstance().getInitializerName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string initializer_name = 2;</code>
     *
     * <pre>
     * Name of the initializer op.
     * </pre>
     */
    public Builder setInitializerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      initializerName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object snapshotName_ = "";
    /**
     * <code>optional string snapshot_name = 3;</code>
     *
     * <pre>
     * Name of the snapshot tensor.
     * </pre>
     */
    public java.lang.String getSnapshotName() {
      java.lang.Object ref = snapshotName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshotName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string snapshot_name = 3;</code>
     *
     * <pre>
     * Name of the snapshot tensor.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getSnapshotNameBytes() {
      java.lang.Object ref = snapshotName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        snapshotName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string snapshot_name = 3;</code>
     *
     * <pre>
     * Name of the snapshot tensor.
     * </pre>
     */
    public Builder setSnapshotName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      snapshotName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string snapshot_name = 3;</code>
     *
     * <pre>
     * Name of the snapshot tensor.
     * </pre>
     */
    public Builder clearSnapshotName() {
      
      snapshotName_ = getDefaultInstance().getSnapshotName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string snapshot_name = 3;</code>
     *
     * <pre>
     * Name of the snapshot tensor.
     * </pre>
     */
    public Builder setSnapshotNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      snapshotName_ = value;
      onChanged();
      return this;
    }

    private org.tensorflow.framework.SaveSliceInfoDef saveSliceInfoDef_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        org.tensorflow.framework.SaveSliceInfoDef, org.tensorflow.framework.SaveSliceInfoDef.Builder, org.tensorflow.framework.SaveSliceInfoDefOrBuilder> saveSliceInfoDefBuilder_;
    /**
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     *
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     */
    public boolean hasSaveSliceInfoDef() {
      return saveSliceInfoDefBuilder_ != null || saveSliceInfoDef_ != null;
    }
    /**
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     *
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     */
    public org.tensorflow.framework.SaveSliceInfoDef getSaveSliceInfoDef() {
      if (saveSliceInfoDefBuilder_ == null) {
        return saveSliceInfoDef_ == null ? org.tensorflow.framework.SaveSliceInfoDef.getDefaultInstance() : saveSliceInfoDef_;
      } else {
        return saveSliceInfoDefBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     *
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     */
    public Builder setSaveSliceInfoDef(org.tensorflow.framework.SaveSliceInfoDef value) {
      if (saveSliceInfoDefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        saveSliceInfoDef_ = value;
        onChanged();
      } else {
        saveSliceInfoDefBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     *
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     */
    public Builder setSaveSliceInfoDef(
        org.tensorflow.framework.SaveSliceInfoDef.Builder builderForValue) {
      if (saveSliceInfoDefBuilder_ == null) {
        saveSliceInfoDef_ = builderForValue.build();
        onChanged();
      } else {
        saveSliceInfoDefBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     *
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     */
    public Builder mergeSaveSliceInfoDef(org.tensorflow.framework.SaveSliceInfoDef value) {
      if (saveSliceInfoDefBuilder_ == null) {
        if (saveSliceInfoDef_ != null) {
          saveSliceInfoDef_ =
            org.tensorflow.framework.SaveSliceInfoDef.newBuilder(saveSliceInfoDef_).mergeFrom(value).buildPartial();
        } else {
          saveSliceInfoDef_ = value;
        }
        onChanged();
      } else {
        saveSliceInfoDefBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     *
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     */
    public Builder clearSaveSliceInfoDef() {
      if (saveSliceInfoDefBuilder_ == null) {
        saveSliceInfoDef_ = null;
        onChanged();
      } else {
        saveSliceInfoDef_ = null;
        saveSliceInfoDefBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     *
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     */
    public org.tensorflow.framework.SaveSliceInfoDef.Builder getSaveSliceInfoDefBuilder() {
      
      onChanged();
      return getSaveSliceInfoDefFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     *
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     */
    public org.tensorflow.framework.SaveSliceInfoDefOrBuilder getSaveSliceInfoDefOrBuilder() {
      if (saveSliceInfoDefBuilder_ != null) {
        return saveSliceInfoDefBuilder_.getMessageOrBuilder();
      } else {
        return saveSliceInfoDef_ == null ?
            org.tensorflow.framework.SaveSliceInfoDef.getDefaultInstance() : saveSliceInfoDef_;
      }
    }
    /**
     * <code>optional .tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
     *
     * <pre>
     * Support for saving variables as slices of a larger variable.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.tensorflow.framework.SaveSliceInfoDef, org.tensorflow.framework.SaveSliceInfoDef.Builder, org.tensorflow.framework.SaveSliceInfoDefOrBuilder> 
        getSaveSliceInfoDefFieldBuilder() {
      if (saveSliceInfoDefBuilder_ == null) {
        saveSliceInfoDefBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.tensorflow.framework.SaveSliceInfoDef, org.tensorflow.framework.SaveSliceInfoDef.Builder, org.tensorflow.framework.SaveSliceInfoDefOrBuilder>(
                getSaveSliceInfoDef(),
                getParentForChildren(),
                isClean());
        saveSliceInfoDef_ = null;
      }
      return saveSliceInfoDefBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.VariableDef)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.VariableDef)
  private static final org.tensorflow.framework.VariableDef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.VariableDef();
  }

  public static org.tensorflow.framework.VariableDef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VariableDef>
      PARSER = new com.google.protobuf.AbstractParser<VariableDef>() {
    public VariableDef parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new VariableDef(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<VariableDef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VariableDef> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.framework.VariableDef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

