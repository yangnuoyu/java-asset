/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1beta1/assets.proto

package com.google.cloud.asset.v1beta1;

public final class AssetProto {
  private AssetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1beta1_TemporalAsset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1beta1_TemporalAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1beta1_TimeWindow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1beta1_TimeWindow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1beta1_Asset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1beta1_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1beta1_Resource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1beta1_Resource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/asset/v1beta1/assets.prot"
          + "o\022\032google.cloud.asset.v1beta1\032\034google/ap"
          + "i/annotations.proto\032\031google/api/resource"
          + ".proto\032\032google/iam/v1/policy.proto\032\031goog"
          + "le/protobuf/any.proto\032\034google/protobuf/s"
          + "truct.proto\032\037google/protobuf/timestamp.p"
          + "roto\"\212\001\n\rTemporalAsset\0226\n\006window\030\001 \001(\0132&"
          + ".google.cloud.asset.v1beta1.TimeWindow\022\017"
          + "\n\007deleted\030\002 \001(\010\0220\n\005asset\030\003 \001(\0132!.google."
          + "cloud.asset.v1beta1.Asset\"j\n\nTimeWindow\022"
          + ".\n\nstart_time\030\001 \001(\0132\032.google.protobuf.Ti"
          + "mestamp\022,\n\010end_time\030\002 \001(\0132\032.google.proto"
          + "buf.Timestamp\"\265\001\n\005Asset\022\014\n\004name\030\001 \001(\t\022\022\n"
          + "\nasset_type\030\002 \001(\t\0226\n\010resource\030\003 \001(\0132$.go"
          + "ogle.cloud.asset.v1beta1.Resource\022)\n\niam"
          + "_policy\030\004 \001(\0132\025.google.iam.v1.Policy:\'\352A"
          + "$\n\037cloudasset.googleapis.com/Asset\022\001*\"\240\001"
          + "\n\010Resource\022\017\n\007version\030\001 \001(\t\022\036\n\026discovery"
          + "_document_uri\030\002 \001(\t\022\026\n\016discovery_name\030\003 "
          + "\001(\t\022\024\n\014resource_url\030\004 \001(\t\022\016\n\006parent\030\005 \001("
          + "\t\022%\n\004data\030\006 \001(\0132\027.google.protobuf.Struct"
          + "B\254\001\n\036com.google.cloud.asset.v1beta1B\nAss"
          + "etProtoP\001Z?google.golang.org/genproto/go"
          + "ogleapis/cloud/asset/v1beta1;asset\370\001\001\252\002\032"
          + "Google.Cloud.Asset.V1Beta1\312\002\032Google\\Clou"
          + "d\\Asset\\V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_asset_v1beta1_TemporalAsset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_asset_v1beta1_TemporalAsset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1beta1_TemporalAsset_descriptor,
            new java.lang.String[] {
              "Window", "Deleted", "Asset",
            });
    internal_static_google_cloud_asset_v1beta1_TimeWindow_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_asset_v1beta1_TimeWindow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1beta1_TimeWindow_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime",
            });
    internal_static_google_cloud_asset_v1beta1_Asset_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_asset_v1beta1_Asset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1beta1_Asset_descriptor,
            new java.lang.String[] {
              "Name", "AssetType", "Resource", "IamPolicy",
            });
    internal_static_google_cloud_asset_v1beta1_Resource_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_asset_v1beta1_Resource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1beta1_Resource_descriptor,
            new java.lang.String[] {
              "Version", "DiscoveryDocumentUri", "DiscoveryName", "ResourceUrl", "Parent", "Data",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
