// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/device_attributes.proto

package org.tensorflow.framework;

public interface DeviceAttributesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.DeviceAttributes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string device_type = 2;</code>
   *
   * <pre>
   * String representation of device_type.
   * </pre>
   */
  java.lang.String getDeviceType();
  /**
   * <code>optional string device_type = 2;</code>
   *
   * <pre>
   * String representation of device_type.
   * </pre>
   */
  com.google.protobuf.ByteString
      getDeviceTypeBytes();

  /**
   * <code>optional int64 memory_limit = 4;</code>
   *
   * <pre>
   * Memory capacity of device in bytes.
   * </pre>
   */
  long getMemoryLimit();

  /**
   * <code>optional .tensorflow.BusAdjacency bus_adjacency = 5;</code>
   */
  int getBusAdjacencyValue();
  /**
   * <code>optional .tensorflow.BusAdjacency bus_adjacency = 5;</code>
   */
  org.tensorflow.framework.BusAdjacency getBusAdjacency();

  /**
   * <code>optional fixed64 incarnation = 6;</code>
   *
   * <pre>
   * A device is assigned a global unique number each time it is
   * initialized. "incarnation" should never be 0.
   * </pre>
   */
  long getIncarnation();

  /**
   * <code>optional string physical_device_desc = 7;</code>
   *
   * <pre>
   * String representation of the physical device that this device maps to.
   * </pre>
   */
  java.lang.String getPhysicalDeviceDesc();
  /**
   * <code>optional string physical_device_desc = 7;</code>
   *
   * <pre>
   * String representation of the physical device that this device maps to.
   * </pre>
   */
  com.google.protobuf.ByteString
      getPhysicalDeviceDescBytes();
}
