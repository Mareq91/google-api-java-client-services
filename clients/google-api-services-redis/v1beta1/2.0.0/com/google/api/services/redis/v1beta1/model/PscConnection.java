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

package com.google.api.services.redis.v1beta1.model;

/**
 * Details of consumer resources in a PSC connection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Memorystore for Redis API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PscConnection extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The IP allocated on the consumer network for the PSC forwarding rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * Output only. The URI of the consumer side forwarding rule. Example:
   * projects/{projectNumOrId}/regions/us-east1/forwardingRules/{resourceId}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String forwardingRule;

  /**
   * The consumer network where the IP address resides, in the form of
   * projects/{project_id}/global/networks/{network_id}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * The consumer project_id where the forwarding rule is created from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Output only. The PSC connection id of the forwarding rule connected to the service attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pscConnectionId;

  /**
   * Output only. The IP allocated on the consumer network for the PSC forwarding rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * Output only. The IP allocated on the consumer network for the PSC forwarding rule.
   * @param address address or {@code null} for none
   */
  public PscConnection setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * Output only. The URI of the consumer side forwarding rule. Example:
   * projects/{projectNumOrId}/regions/us-east1/forwardingRules/{resourceId}.
   * @return value or {@code null} for none
   */
  public java.lang.String getForwardingRule() {
    return forwardingRule;
  }

  /**
   * Output only. The URI of the consumer side forwarding rule. Example:
   * projects/{projectNumOrId}/regions/us-east1/forwardingRules/{resourceId}.
   * @param forwardingRule forwardingRule or {@code null} for none
   */
  public PscConnection setForwardingRule(java.lang.String forwardingRule) {
    this.forwardingRule = forwardingRule;
    return this;
  }

  /**
   * The consumer network where the IP address resides, in the form of
   * projects/{project_id}/global/networks/{network_id}.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The consumer network where the IP address resides, in the form of
   * projects/{project_id}/global/networks/{network_id}.
   * @param network network or {@code null} for none
   */
  public PscConnection setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * The consumer project_id where the forwarding rule is created from.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * The consumer project_id where the forwarding rule is created from.
   * @param projectId projectId or {@code null} for none
   */
  public PscConnection setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Output only. The PSC connection id of the forwarding rule connected to the service attachment.
   * @return value or {@code null} for none
   */
  public java.lang.String getPscConnectionId() {
    return pscConnectionId;
  }

  /**
   * Output only. The PSC connection id of the forwarding rule connected to the service attachment.
   * @param pscConnectionId pscConnectionId or {@code null} for none
   */
  public PscConnection setPscConnectionId(java.lang.String pscConnectionId) {
    this.pscConnectionId = pscConnectionId;
    return this;
  }

  @Override
  public PscConnection set(String fieldName, Object value) {
    return (PscConnection) super.set(fieldName, value);
  }

  @Override
  public PscConnection clone() {
    return (PscConnection) super.clone();
  }

}