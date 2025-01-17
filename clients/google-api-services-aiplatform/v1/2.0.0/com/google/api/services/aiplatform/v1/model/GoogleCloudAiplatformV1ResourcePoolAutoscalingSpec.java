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

package com.google.api.services.aiplatform.v1.model;

/**
 * The min/max number of replicas allowed if enabling autoscaling
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1ResourcePoolAutoscalingSpec extends com.google.api.client.json.GenericJson {

  /**
   * Optional. max replicas in the node pool, must be ≥ replica_count and > min_replica_count or
   * will throw error
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxReplicaCount;

  /**
   * Optional. min replicas in the node pool, must be ≤ replica_count and < max_replica_count or
   * will throw error
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minReplicaCount;

  /**
   * Optional. max replicas in the node pool, must be ≥ replica_count and > min_replica_count or
   * will throw error
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxReplicaCount() {
    return maxReplicaCount;
  }

  /**
   * Optional. max replicas in the node pool, must be ≥ replica_count and > min_replica_count or
   * will throw error
   * @param maxReplicaCount maxReplicaCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1ResourcePoolAutoscalingSpec setMaxReplicaCount(java.lang.Long maxReplicaCount) {
    this.maxReplicaCount = maxReplicaCount;
    return this;
  }

  /**
   * Optional. min replicas in the node pool, must be ≤ replica_count and < max_replica_count or
   * will throw error
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinReplicaCount() {
    return minReplicaCount;
  }

  /**
   * Optional. min replicas in the node pool, must be ≤ replica_count and < max_replica_count or
   * will throw error
   * @param minReplicaCount minReplicaCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1ResourcePoolAutoscalingSpec setMinReplicaCount(java.lang.Long minReplicaCount) {
    this.minReplicaCount = minReplicaCount;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1ResourcePoolAutoscalingSpec set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1ResourcePoolAutoscalingSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1ResourcePoolAutoscalingSpec clone() {
    return (GoogleCloudAiplatformV1ResourcePoolAutoscalingSpec) super.clone();
  }

}
