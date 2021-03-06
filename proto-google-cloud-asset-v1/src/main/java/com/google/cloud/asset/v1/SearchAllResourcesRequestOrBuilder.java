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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface SearchAllResourcesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.SearchAllResourcesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A scope can be a project, a folder or an organization. The search
   * is limited to the resources within the `scope`.
   * The allowed values are:
   * * projects/{PROJECT_ID}
   * * projects/{PROJECT_NUMBER}
   * * folders/{FOLDER_NUMBER}
   * * organizations/{ORGANIZATION_NUMBER}
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   *
   *
   * <pre>
   * Required. A scope can be a project, a folder or an organization. The search
   * is limited to the resources within the `scope`.
   * The allowed values are:
   * * projects/{PROJECT_ID}
   * * projects/{PROJECT_NUMBER}
   * * folders/{FOLDER_NUMBER}
   * * organizations/{ORGANIZATION_NUMBER}
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The query statement. An empty query can be specified to search
   * all the resources of certain `asset_types` within the given `scope`.
   * Examples:
   * * `name : "Important"` to find Cloud resources whose name contains
   *   "Important" as a word.
   * * `displayName : "Impor*"` to find Cloud resources whose display name
   *   contains "Impor" as a word prefix.
   * * `description : "*por*"` to find Cloud resources whose description
   *   contains "por" as a substring.
   * * `location : "us-west*"` to find Cloud resources whose location is
   *   prefixed with "us-west".
   * * `labels : "prod"` to find Cloud resources whose labels contain "prod" as
   *   a key or value.
   * * `labels.env : "prod"` to find Cloud resources which have a label "env"
   *   and its value is "prod".
   * * `labels.env : *` to find Cloud resources which have a label "env".
   * * `"Important"` to find Cloud resources which contain "Important" as a word
   *   in any of the searchable fields.
   * * `"Impor*"` to find Cloud resources which contain "Impor" as a word prefix
   *   in any of the searchable fields.
   * * `"*por*"` to find Cloud resources which contain "por" as a substring in
   *   any of the searchable fields.
   * * `("Important" AND location : ("us-west1" OR "global"))` to find Cloud
   *   resources which contain "Important" as a word in any of the searchable
   *   fields and are also located in the "us-west1" region or the "global"
   *   location.
   * See [how to construct a
   * query](https://cloud.google.com/asset-inventory/docs/searching-resources#how_to_construct_a_query)
   * for more details.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Optional. The query statement. An empty query can be specified to search
   * all the resources of certain `asset_types` within the given `scope`.
   * Examples:
   * * `name : "Important"` to find Cloud resources whose name contains
   *   "Important" as a word.
   * * `displayName : "Impor*"` to find Cloud resources whose display name
   *   contains "Impor" as a word prefix.
   * * `description : "*por*"` to find Cloud resources whose description
   *   contains "por" as a substring.
   * * `location : "us-west*"` to find Cloud resources whose location is
   *   prefixed with "us-west".
   * * `labels : "prod"` to find Cloud resources whose labels contain "prod" as
   *   a key or value.
   * * `labels.env : "prod"` to find Cloud resources which have a label "env"
   *   and its value is "prod".
   * * `labels.env : *` to find Cloud resources which have a label "env".
   * * `"Important"` to find Cloud resources which contain "Important" as a word
   *   in any of the searchable fields.
   * * `"Impor*"` to find Cloud resources which contain "Impor" as a word prefix
   *   in any of the searchable fields.
   * * `"*por*"` to find Cloud resources which contain "por" as a substring in
   *   any of the searchable fields.
   * * `("Important" AND location : ("us-west1" OR "global"))` to find Cloud
   *   resources which contain "Important" as a word in any of the searchable
   *   fields and are also located in the "us-west1" region or the "global"
   *   location.
   * See [how to construct a
   * query](https://cloud.google.com/asset-inventory/docs/searching-resources#how_to_construct_a_query)
   * for more details.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Optional. A list of asset types that this request searches for. If empty,
   * it will search all the [searchable asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
   * </pre>
   *
   * <code>repeated string asset_types = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the assetTypes.
   */
  java.util.List<java.lang.String> getAssetTypesList();
  /**
   *
   *
   * <pre>
   * Optional. A list of asset types that this request searches for. If empty,
   * it will search all the [searchable asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
   * </pre>
   *
   * <code>repeated string asset_types = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of assetTypes.
   */
  int getAssetTypesCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of asset types that this request searches for. If empty,
   * it will search all the [searchable asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
   * </pre>
   *
   * <code>repeated string asset_types = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The assetTypes at the given index.
   */
  java.lang.String getAssetTypes(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of asset types that this request searches for. If empty,
   * it will search all the [searchable asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
   * </pre>
   *
   * <code>repeated string asset_types = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the assetTypes at the given index.
   */
  com.google.protobuf.ByteString getAssetTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The page size for search result pagination. Page size is capped
   * at 500 even if a larger value is given. If set to zero, server will pick an
   * appropriate default. Returned results may be fewer than requested. When
   * this happens, there could be more results as long as `next_page_token` is
   * returned.
   * </pre>
   *
   * <code>int32 page_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the
   * preceding call to this method. `page_token` must be the value of
   * `next_page_token` from the previous response. The values of all other
   * method parameters, must be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the
   * preceding call to this method. `page_token` must be the value of
   * `next_page_token` from the previous response. The values of all other
   * method parameters, must be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. A comma separated list of fields specifying the sorting order of
   * the results. The default order is ascending. Add " DESC" after the field
   * name to indicate descending order. Redundant space characters are ignored.
   * Example: "location DESC, name". See [supported resource metadata
   * fields](https://cloud.google.com/asset-inventory/docs/searching-resources#query_on_resource_metadata_fields)
   * for more details.
   * </pre>
   *
   * <code>string order_by = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. A comma separated list of fields specifying the sorting order of
   * the results. The default order is ascending. Add " DESC" after the field
   * name to indicate descending order. Redundant space characters are ignored.
   * Example: "location DESC, name". See [supported resource metadata
   * fields](https://cloud.google.com/asset-inventory/docs/searching-resources#query_on_resource_metadata_fields)
   * for more details.
   * </pre>
   *
   * <code>string order_by = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
