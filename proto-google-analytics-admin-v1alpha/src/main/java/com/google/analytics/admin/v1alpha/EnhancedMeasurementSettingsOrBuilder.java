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
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

public interface EnhancedMeasurementSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.EnhancedMeasurementSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of this Data Stream.
   * Format:
   * properties/{property_id}/webDataStreams/{stream_id}/enhancedMeasurementSettings
   * Example: "properties/1000/webDataStreams/2000/enhancedMeasurementSettings"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this Data Stream.
   * Format:
   * properties/{property_id}/webDataStreams/{stream_id}/enhancedMeasurementSettings
   * Example: "properties/1000/webDataStreams/2000/enhancedMeasurementSettings"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Indicates whether Enhanced Measurement Settings will be used to
   * automatically measure interactions and content on this web stream.
   * Changing this value does not affect the settings themselves, but determines
   * whether they are respected.
   * </pre>
   *
   * <code>bool stream_enabled = 2;</code>
   *
   * @return The streamEnabled.
   */
  boolean getStreamEnabled();

  /**
   *
   *
   * <pre>
   * Output only. If enabled, capture a page view event each time a page loads or the
   * website changes the browser history state.
   * </pre>
   *
   * <code>bool page_views_enabled = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The pageViewsEnabled.
   */
  boolean getPageViewsEnabled();

  /**
   *
   *
   * <pre>
   * If enabled, capture scroll events each time a visitor gets to the bottom of
   * a page.
   * </pre>
   *
   * <code>bool scrolls_enabled = 4;</code>
   *
   * @return The scrollsEnabled.
   */
  boolean getScrollsEnabled();

  /**
   *
   *
   * <pre>
   * If enabled, capture an outbound click event each time a visitor clicks a
   * link that leads them away from your domain.
   * </pre>
   *
   * <code>bool outbound_clicks_enabled = 5;</code>
   *
   * @return The outboundClicksEnabled.
   */
  boolean getOutboundClicksEnabled();

  /**
   *
   *
   * <pre>
   * Capture events when your visitors view content on your site that has
   * structured data (eg, articles, blog posts, product details screens, etc.).
   * </pre>
   *
   * <code>bool content_views_enabled = 6;</code>
   *
   * @return The contentViewsEnabled.
   */
  boolean getContentViewsEnabled();

  /**
   *
   *
   * <pre>
   * If enabled, capture a view search results event each time a visitor
   * performs a search on your site (based on a query parameter).
   * </pre>
   *
   * <code>bool site_search_enabled = 7;</code>
   *
   * @return The siteSearchEnabled.
   */
  boolean getSiteSearchEnabled();

  /**
   *
   *
   * <pre>
   * If enabled, capture a view search results event each time a visitor
   * interacts with a form on your site.
   * </pre>
   *
   * <code>bool form_interactions_enabled = 8;</code>
   *
   * @return The formInteractionsEnabled.
   */
  boolean getFormInteractionsEnabled();

  /**
   *
   *
   * <pre>
   * If enabled, capture video play, progress, and complete events as visitors
   * view embedded videos on your site.
   * </pre>
   *
   * <code>bool video_engagement_enabled = 9;</code>
   *
   * @return The videoEngagementEnabled.
   */
  boolean getVideoEngagementEnabled();

  /**
   *
   *
   * <pre>
   * If enabled, capture a file download event each time a link is clicked with
   * a common document, compressed file, application, video, or audio extension.
   * </pre>
   *
   * <code>bool file_downloads_enabled = 10;</code>
   *
   * @return The fileDownloadsEnabled.
   */
  boolean getFileDownloadsEnabled();

  /**
   *
   *
   * <pre>
   * If enabled, capture a click event each time a visitor clicks a link or
   * element that has data attributes beginning with "data-ga".
   * </pre>
   *
   * <code>bool data_tagged_element_clicks_enabled = 11;</code>
   *
   * @return The dataTaggedElementClicksEnabled.
   */
  boolean getDataTaggedElementClicksEnabled();

  /**
   *
   *
   * <pre>
   * If enabled, capture a page view event each time a page loads.
   * </pre>
   *
   * <code>bool page_loads_enabled = 12;</code>
   *
   * @return The pageLoadsEnabled.
   */
  boolean getPageLoadsEnabled();

  /**
   *
   *
   * <pre>
   * If enabled, capture a page view event each time the website changes the
   * browser history state.
   * </pre>
   *
   * <code>bool page_changes_enabled = 13;</code>
   *
   * @return The pageChangesEnabled.
   */
  boolean getPageChangesEnabled();

  /**
   *
   *
   * <pre>
   * Capture events when your visitors view content on your site that has
   * articles or blog posts.
   * </pre>
   *
   * <code>bool articles_and_blogs_enabled = 14;</code>
   *
   * @return The articlesAndBlogsEnabled.
   */
  boolean getArticlesAndBlogsEnabled();

  /**
   *
   *
   * <pre>
   * Capture events when your visitors view content on your site that has
   * product details screens, etc.
   * </pre>
   *
   * <code>bool products_and_ecommerce_enabled = 15;</code>
   *
   * @return The productsAndEcommerceEnabled.
   */
  boolean getProductsAndEcommerceEnabled();

  /**
   *
   *
   * <pre>
   * Required. URL query parameters to interpret as site search parameters.
   * Max length is 1024 characters. Must not be empty.
   * </pre>
   *
   * <code>string search_query_parameter = 16 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The searchQueryParameter.
   */
  java.lang.String getSearchQueryParameter();
  /**
   *
   *
   * <pre>
   * Required. URL query parameters to interpret as site search parameters.
   * Max length is 1024 characters. Must not be empty.
   * </pre>
   *
   * <code>string search_query_parameter = 16 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for searchQueryParameter.
   */
  com.google.protobuf.ByteString getSearchQueryParameterBytes();

  /**
   *
   *
   * <pre>
   * Additional URL query parameters.
   * Max length is 1024 characters.
   * </pre>
   *
   * <code>string url_query_parameter = 17;</code>
   *
   * @return The urlQueryParameter.
   */
  java.lang.String getUrlQueryParameter();
  /**
   *
   *
   * <pre>
   * Additional URL query parameters.
   * Max length is 1024 characters.
   * </pre>
   *
   * <code>string url_query_parameter = 17;</code>
   *
   * @return The bytes for urlQueryParameter.
   */
  com.google.protobuf.ByteString getUrlQueryParameterBytes();

  /**
   *
   *
   * <pre>
   * Domains to exclude from measurement. Max length is 1024 characters.
   * </pre>
   *
   * <code>string excluded_domains = 18;</code>
   *
   * @return The excludedDomains.
   */
  java.lang.String getExcludedDomains();
  /**
   *
   *
   * <pre>
   * Domains to exclude from measurement. Max length is 1024 characters.
   * </pre>
   *
   * <code>string excluded_domains = 18;</code>
   *
   * @return The bytes for excludedDomains.
   */
  com.google.protobuf.ByteString getExcludedDomainsBytes();
}
