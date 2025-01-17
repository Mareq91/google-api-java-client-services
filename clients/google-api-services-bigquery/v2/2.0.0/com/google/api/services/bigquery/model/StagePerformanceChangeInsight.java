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

package com.google.api.services.bigquery.model;

/**
 * Performance insights compared to the previous executions for a specific stage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StagePerformanceChangeInsight extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Input data change insight of the query stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InputDataChange inputDataChange;

  /**
   * Output only. The stage id that the insight mapped to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long stageId;

  /**
   * Output only. Input data change insight of the query stage.
   * @return value or {@code null} for none
   */
  public InputDataChange getInputDataChange() {
    return inputDataChange;
  }

  /**
   * Output only. Input data change insight of the query stage.
   * @param inputDataChange inputDataChange or {@code null} for none
   */
  public StagePerformanceChangeInsight setInputDataChange(InputDataChange inputDataChange) {
    this.inputDataChange = inputDataChange;
    return this;
  }

  /**
   * Output only. The stage id that the insight mapped to.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStageId() {
    return stageId;
  }

  /**
   * Output only. The stage id that the insight mapped to.
   * @param stageId stageId or {@code null} for none
   */
  public StagePerformanceChangeInsight setStageId(java.lang.Long stageId) {
    this.stageId = stageId;
    return this;
  }

  @Override
  public StagePerformanceChangeInsight set(String fieldName, Object value) {
    return (StagePerformanceChangeInsight) super.set(fieldName, value);
  }

  @Override
  public StagePerformanceChangeInsight clone() {
    return (StagePerformanceChangeInsight) super.clone();
  }

}
