// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p2beta1/asset_service.proto

package com.google.cloud.asset.v1p2beta1;

public interface ExportAssetsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p2beta1.ExportAssetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time the snapshot was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 1;</code>
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Time the snapshot was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 1;</code>
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Time the snapshot was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output configuration indicating where the results were output to.
   * All results are in JSON format.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.OutputConfig output_config = 2;</code>
   */
  boolean hasOutputConfig();
  /**
   *
   *
   * <pre>
   * Output configuration indicating where the results were output to.
   * All results are in JSON format.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.OutputConfig output_config = 2;</code>
   */
  com.google.cloud.asset.v1p2beta1.OutputConfig getOutputConfig();
  /**
   *
   *
   * <pre>
   * Output configuration indicating where the results were output to.
   * All results are in JSON format.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.OutputConfig output_config = 2;</code>
   */
  com.google.cloud.asset.v1p2beta1.OutputConfigOrBuilder getOutputConfigOrBuilder();
}