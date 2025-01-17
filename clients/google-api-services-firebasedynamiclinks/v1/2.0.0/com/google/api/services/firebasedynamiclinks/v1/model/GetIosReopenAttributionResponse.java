/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.firebasedynamiclinks.v1.model;

/**
 * Response for iSDK to get reopen attribution for app universal link open deeplinking. This
 * endpoint is meant for only iOS requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Dynamic Links API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetIosReopenAttributionResponse extends com.google.api.client.json.GenericJson {

  /**
   * The deep-link attributed the app universal link open. For both regular FDL links and invite FDL
   * links.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deepLink;

  /**
   * Optional invitation ID, for only invite typed requested FDL links.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String invitationId;

  /**
   * FDL input value of the "&imv=" parameter, minimum app version to be returned to Google Firebase
   * SDK running on iOS-9.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iosMinAppVersion;

  /**
   * The entire FDL, expanded from a short link. It is the same as the requested_link, if it is
   * long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resolvedLink;

  /**
   * Scion campaign value to be propagated by iSDK to Scion at app-reopen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String utmCampaign;

  /**
   * Scion content value to be propagated by iSDK to Scion at app-reopen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String utmContent;

  /**
   * Scion medium value to be propagated by iSDK to Scion at app-reopen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String utmMedium;

  /**
   * Scion source value to be propagated by iSDK to Scion at app-reopen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String utmSource;

  /**
   * Scion term value to be propagated by iSDK to Scion at app-reopen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String utmTerm;

  /**
   * The deep-link attributed the app universal link open. For both regular FDL links and invite FDL
   * links.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeepLink() {
    return deepLink;
  }

  /**
   * The deep-link attributed the app universal link open. For both regular FDL links and invite FDL
   * links.
   * @param deepLink deepLink or {@code null} for none
   */
  public GetIosReopenAttributionResponse setDeepLink(java.lang.String deepLink) {
    this.deepLink = deepLink;
    return this;
  }

  /**
   * Optional invitation ID, for only invite typed requested FDL links.
   * @return value or {@code null} for none
   */
  public java.lang.String getInvitationId() {
    return invitationId;
  }

  /**
   * Optional invitation ID, for only invite typed requested FDL links.
   * @param invitationId invitationId or {@code null} for none
   */
  public GetIosReopenAttributionResponse setInvitationId(java.lang.String invitationId) {
    this.invitationId = invitationId;
    return this;
  }

  /**
   * FDL input value of the "&imv=" parameter, minimum app version to be returned to Google Firebase
   * SDK running on iOS-9.
   * @return value or {@code null} for none
   */
  public java.lang.String getIosMinAppVersion() {
    return iosMinAppVersion;
  }

  /**
   * FDL input value of the "&imv=" parameter, minimum app version to be returned to Google Firebase
   * SDK running on iOS-9.
   * @param iosMinAppVersion iosMinAppVersion or {@code null} for none
   */
  public GetIosReopenAttributionResponse setIosMinAppVersion(java.lang.String iosMinAppVersion) {
    this.iosMinAppVersion = iosMinAppVersion;
    return this;
  }

  /**
   * The entire FDL, expanded from a short link. It is the same as the requested_link, if it is
   * long.
   * @return value or {@code null} for none
   */
  public java.lang.String getResolvedLink() {
    return resolvedLink;
  }

  /**
   * The entire FDL, expanded from a short link. It is the same as the requested_link, if it is
   * long.
   * @param resolvedLink resolvedLink or {@code null} for none
   */
  public GetIosReopenAttributionResponse setResolvedLink(java.lang.String resolvedLink) {
    this.resolvedLink = resolvedLink;
    return this;
  }

  /**
   * Scion campaign value to be propagated by iSDK to Scion at app-reopen.
   * @return value or {@code null} for none
   */
  public java.lang.String getUtmCampaign() {
    return utmCampaign;
  }

  /**
   * Scion campaign value to be propagated by iSDK to Scion at app-reopen.
   * @param utmCampaign utmCampaign or {@code null} for none
   */
  public GetIosReopenAttributionResponse setUtmCampaign(java.lang.String utmCampaign) {
    this.utmCampaign = utmCampaign;
    return this;
  }

  /**
   * Scion content value to be propagated by iSDK to Scion at app-reopen.
   * @return value or {@code null} for none
   */
  public java.lang.String getUtmContent() {
    return utmContent;
  }

  /**
   * Scion content value to be propagated by iSDK to Scion at app-reopen.
   * @param utmContent utmContent or {@code null} for none
   */
  public GetIosReopenAttributionResponse setUtmContent(java.lang.String utmContent) {
    this.utmContent = utmContent;
    return this;
  }

  /**
   * Scion medium value to be propagated by iSDK to Scion at app-reopen.
   * @return value or {@code null} for none
   */
  public java.lang.String getUtmMedium() {
    return utmMedium;
  }

  /**
   * Scion medium value to be propagated by iSDK to Scion at app-reopen.
   * @param utmMedium utmMedium or {@code null} for none
   */
  public GetIosReopenAttributionResponse setUtmMedium(java.lang.String utmMedium) {
    this.utmMedium = utmMedium;
    return this;
  }

  /**
   * Scion source value to be propagated by iSDK to Scion at app-reopen.
   * @return value or {@code null} for none
   */
  public java.lang.String getUtmSource() {
    return utmSource;
  }

  /**
   * Scion source value to be propagated by iSDK to Scion at app-reopen.
   * @param utmSource utmSource or {@code null} for none
   */
  public GetIosReopenAttributionResponse setUtmSource(java.lang.String utmSource) {
    this.utmSource = utmSource;
    return this;
  }

  /**
   * Scion term value to be propagated by iSDK to Scion at app-reopen.
   * @return value or {@code null} for none
   */
  public java.lang.String getUtmTerm() {
    return utmTerm;
  }

  /**
   * Scion term value to be propagated by iSDK to Scion at app-reopen.
   * @param utmTerm utmTerm or {@code null} for none
   */
  public GetIosReopenAttributionResponse setUtmTerm(java.lang.String utmTerm) {
    this.utmTerm = utmTerm;
    return this;
  }

  @Override
  public GetIosReopenAttributionResponse set(String fieldName, Object value) {
    return (GetIosReopenAttributionResponse) super.set(fieldName, value);
  }

  @Override
  public GetIosReopenAttributionResponse clone() {
    return (GetIosReopenAttributionResponse) super.clone();
  }

}
