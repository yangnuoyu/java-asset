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
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

public final class AssetProto {
  private AssetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_TemporalAsset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_TemporalAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_TimeWindow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_TimeWindow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_Asset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_Resource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_Resource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_ResourceSearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_ResourceSearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_ResourceSearchResult_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_ResourceSearchResult_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_Permissions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_Permissions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/cloud/asset/v1/assets.proto\022\025go"
          + "ogle.cloud.asset.v1\032\034google/api/annotati"
          + "ons.proto\032\031google/api/resource.proto\032)go"
          + "ogle/cloud/orgpolicy/v1/orgpolicy.proto\032"
          + "\032google/iam/v1/policy.proto\032:google/iden"
          + "tity/accesscontextmanager/v1/access_leve"
          + "l.proto\032;google/identity/accesscontextma"
          + "nager/v1/access_policy.proto\032?google/ide"
          + "ntity/accesscontextmanager/v1/service_pe"
          + "rimeter.proto\032\031google/protobuf/any.proto"
          + "\032\034google/protobuf/struct.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\200\001\n\rTemporalAsse"
          + "t\0221\n\006window\030\001 \001(\0132!.google.cloud.asset.v"
          + "1.TimeWindow\022\017\n\007deleted\030\002 \001(\010\022+\n\005asset\030\003"
          + " \001(\0132\034.google.cloud.asset.v1.Asset\"j\n\nTi"
          + "meWindow\022.\n\nstart_time\030\001 \001(\0132\032.google.pr"
          + "otobuf.Timestamp\022,\n\010end_time\030\002 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp\"\211\004\n\005Asset\022\014\n\004name"
          + "\030\001 \001(\t\022\022\n\nasset_type\030\002 \001(\t\0221\n\010resource\030\003"
          + " \001(\0132\037.google.cloud.asset.v1.Resource\022)\n"
          + "\niam_policy\030\004 \001(\0132\025.google.iam.v1.Policy"
          + "\0225\n\norg_policy\030\006 \003(\0132!.google.cloud.orgp"
          + "olicy.v1.Policy\022N\n\raccess_policy\030\007 \001(\01325"
          + ".google.identity.accesscontextmanager.v1"
          + ".AccessPolicyH\000\022L\n\014access_level\030\010 \001(\01324."
          + "google.identity.accesscontextmanager.v1."
          + "AccessLevelH\000\022V\n\021service_perimeter\030\t \001(\013"
          + "29.google.identity.accesscontextmanager."
          + "v1.ServicePerimeterH\000\022\021\n\tancestors\030\n \003(\t"
          + ":\'\352A$\n\037cloudasset.googleapis.com/Asset\022\001"
          + "*B\027\n\025access_context_policy\"\262\001\n\010Resource\022"
          + "\017\n\007version\030\001 \001(\t\022\036\n\026discovery_document_u"
          + "ri\030\002 \001(\t\022\026\n\016discovery_name\030\003 \001(\t\022\024\n\014reso"
          + "urce_url\030\004 \001(\t\022\016\n\006parent\030\005 \001(\t\022%\n\004data\030\006"
          + " \001(\0132\027.google.protobuf.Struct\022\020\n\010locatio"
          + "n\030\010 \001(\t\"\314\002\n\024ResourceSearchResult\022\014\n\004name"
          + "\030\001 \001(\t\022\022\n\nasset_type\030\002 \001(\t\022\017\n\007project\030\003 "
          + "\001(\t\022\024\n\014display_name\030\004 \001(\t\022\023\n\013description"
          + "\030\005 \001(\t\022\020\n\010location\030\006 \001(\t\022G\n\006labels\030\007 \003(\013"
          + "27.google.cloud.asset.v1.ResourceSearchR"
          + "esult.LabelsEntry\022\024\n\014network_tags\030\010 \003(\t\022"
          + "6\n\025additional_attributes\030\t \001(\0132\027.google."
          + "protobuf.Struct\032-\n\013LabelsEntry\022\013\n\003key\030\001 "
          + "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\324\003\n\025IamPolicySear"
          + "chResult\022\020\n\010resource\030\001 \001(\t\022\017\n\007project\030\002 "
          + "\001(\t\022%\n\006policy\030\003 \001(\0132\025.google.iam.v1.Poli"
          + "cy\022M\n\013explanation\030\004 \001(\01328.google.cloud.a"
          + "sset.v1.IamPolicySearchResult.Explanatio"
          + "n\032\241\002\n\013Explanation\022m\n\023matched_permissions"
          + "\030\001 \003(\0132P.google.cloud.asset.v1.IamPolicy"
          + "SearchResult.Explanation.MatchedPermissi"
          + "onsEntry\032\"\n\013Permissions\022\023\n\013permissions\030\001"
          + " \003(\t\032\177\n\027MatchedPermissionsEntry\022\013\n\003key\030\001"
          + " \001(\t\022S\n\005value\030\002 \001(\0132D.google.cloud.asset"
          + ".v1.IamPolicySearchResult.Explanation.Pe"
          + "rmissions:\0028\001B\230\001\n\031com.google.cloud.asset"
          + ".v1B\nAssetProtoP\001Z:google.golang.org/gen"
          + "proto/googleapis/cloud/asset/v1;asset\370\001\001"
          + "\252\002\025Google.Cloud.Asset.V1\312\002\025Google\\Cloud\\"
          + "Asset\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.orgpolicy.v1.OrgPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.identity.accesscontextmanager.v1.AccessLevelProto.getDescriptor(),
              com.google.identity.accesscontextmanager.v1.PolicyProto.getDescriptor(),
              com.google.identity.accesscontextmanager.v1.ServicePerimeterProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_asset_v1_TemporalAsset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_asset_v1_TemporalAsset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_TemporalAsset_descriptor,
            new java.lang.String[] {
              "Window", "Deleted", "Asset",
            });
    internal_static_google_cloud_asset_v1_TimeWindow_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_asset_v1_TimeWindow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_TimeWindow_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime",
            });
    internal_static_google_cloud_asset_v1_Asset_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_asset_v1_Asset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_Asset_descriptor,
            new java.lang.String[] {
              "Name",
              "AssetType",
              "Resource",
              "IamPolicy",
              "OrgPolicy",
              "AccessPolicy",
              "AccessLevel",
              "ServicePerimeter",
              "Ancestors",
              "AccessContextPolicy",
            });
    internal_static_google_cloud_asset_v1_Resource_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_asset_v1_Resource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_Resource_descriptor,
            new java.lang.String[] {
              "Version",
              "DiscoveryDocumentUri",
              "DiscoveryName",
              "ResourceUrl",
              "Parent",
              "Data",
              "Location",
            });
    internal_static_google_cloud_asset_v1_ResourceSearchResult_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_asset_v1_ResourceSearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_ResourceSearchResult_descriptor,
            new java.lang.String[] {
              "Name",
              "AssetType",
              "Project",
              "DisplayName",
              "Description",
              "Location",
              "Labels",
              "NetworkTags",
              "AdditionalAttributes",
            });
    internal_static_google_cloud_asset_v1_ResourceSearchResult_LabelsEntry_descriptor =
        internal_static_google_cloud_asset_v1_ResourceSearchResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_asset_v1_ResourceSearchResult_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_ResourceSearchResult_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicySearchResult_descriptor,
            new java.lang.String[] {
              "Resource", "Project", "Policy", "Explanation",
            });
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_descriptor =
        internal_static_google_cloud_asset_v1_IamPolicySearchResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_descriptor,
            new java.lang.String[] {
              "MatchedPermissions",
            });
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_Permissions_descriptor =
        internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_Permissions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_Permissions_descriptor,
            new java.lang.String[] {
              "Permissions",
            });
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_descriptor =
        internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.orgpolicy.v1.OrgPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.AccessLevelProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.PolicyProto.getDescriptor();
    com.google.identity.accesscontextmanager.v1.ServicePerimeterProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
