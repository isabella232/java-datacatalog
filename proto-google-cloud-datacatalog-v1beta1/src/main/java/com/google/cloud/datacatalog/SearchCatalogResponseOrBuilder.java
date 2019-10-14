/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog;

public interface SearchCatalogResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.SearchCatalogResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Search results.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SearchCatalogResult results = 1;</code>
   */
  java.util.List<com.google.cloud.datacatalog.SearchCatalogResult> getResultsList();
  /**
   *
   *
   * <pre>
   * Search results.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SearchCatalogResult results = 1;</code>
   */
  com.google.cloud.datacatalog.SearchCatalogResult getResults(int index);
  /**
   *
   *
   * <pre>
   * Search results.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SearchCatalogResult results = 1;</code>
   */
  int getResultsCount();
  /**
   *
   *
   * <pre>
   * Search results.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SearchCatalogResult results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.SearchCatalogResultOrBuilder>
      getResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Search results.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.SearchCatalogResult results = 1;</code>
   */
  com.google.cloud.datacatalog.SearchCatalogResultOrBuilder getResultsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The token that can be used to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The token that can be used to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
