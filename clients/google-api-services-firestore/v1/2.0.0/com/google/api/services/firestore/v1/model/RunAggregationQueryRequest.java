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

package com.google.api.services.firestore.v1.model;

/**
 * The request for Firestore.RunAggregationQuery.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RunAggregationQueryRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Explain options for the query. If set, additional query statistics will be returned.
   * If not, only query results will be returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExplainOptions explainOptions;

  /**
   * Starts a new transaction as part of the query, defaulting to read-only. The new transaction ID
   * will be returned as the first response in the stream.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TransactionOptions newTransaction;

  /**
   * Executes the query at the given timestamp. This must be a microsecond precision timestamp
   * within the past one hour, or if Point-in-Time Recovery is enabled, can additionally be a whole
   * minute timestamp within the past 7 days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readTime;

  /**
   * An aggregation query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StructuredAggregationQuery structuredAggregationQuery;

  /**
   * Run the aggregation within an already active transaction. The value here is the opaque
   * transaction ID to execute the query in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transaction;

  /**
   * Optional. Explain options for the query. If set, additional query statistics will be returned.
   * If not, only query results will be returned.
   * @return value or {@code null} for none
   */
  public ExplainOptions getExplainOptions() {
    return explainOptions;
  }

  /**
   * Optional. Explain options for the query. If set, additional query statistics will be returned.
   * If not, only query results will be returned.
   * @param explainOptions explainOptions or {@code null} for none
   */
  public RunAggregationQueryRequest setExplainOptions(ExplainOptions explainOptions) {
    this.explainOptions = explainOptions;
    return this;
  }

  /**
   * Starts a new transaction as part of the query, defaulting to read-only. The new transaction ID
   * will be returned as the first response in the stream.
   * @return value or {@code null} for none
   */
  public TransactionOptions getNewTransaction() {
    return newTransaction;
  }

  /**
   * Starts a new transaction as part of the query, defaulting to read-only. The new transaction ID
   * will be returned as the first response in the stream.
   * @param newTransaction newTransaction or {@code null} for none
   */
  public RunAggregationQueryRequest setNewTransaction(TransactionOptions newTransaction) {
    this.newTransaction = newTransaction;
    return this;
  }

  /**
   * Executes the query at the given timestamp. This must be a microsecond precision timestamp
   * within the past one hour, or if Point-in-Time Recovery is enabled, can additionally be a whole
   * minute timestamp within the past 7 days.
   * @return value or {@code null} for none
   */
  public String getReadTime() {
    return readTime;
  }

  /**
   * Executes the query at the given timestamp. This must be a microsecond precision timestamp
   * within the past one hour, or if Point-in-Time Recovery is enabled, can additionally be a whole
   * minute timestamp within the past 7 days.
   * @param readTime readTime or {@code null} for none
   */
  public RunAggregationQueryRequest setReadTime(String readTime) {
    this.readTime = readTime;
    return this;
  }

  /**
   * An aggregation query.
   * @return value or {@code null} for none
   */
  public StructuredAggregationQuery getStructuredAggregationQuery() {
    return structuredAggregationQuery;
  }

  /**
   * An aggregation query.
   * @param structuredAggregationQuery structuredAggregationQuery or {@code null} for none
   */
  public RunAggregationQueryRequest setStructuredAggregationQuery(StructuredAggregationQuery structuredAggregationQuery) {
    this.structuredAggregationQuery = structuredAggregationQuery;
    return this;
  }

  /**
   * Run the aggregation within an already active transaction. The value here is the opaque
   * transaction ID to execute the query in.
   * @see #decodeTransaction()
   * @return value or {@code null} for none
   */
  public java.lang.String getTransaction() {
    return transaction;
  }

  /**
   * Run the aggregation within an already active transaction. The value here is the opaque
   * transaction ID to execute the query in.
   * @see #getTransaction()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeTransaction() {
    return com.google.api.client.util.Base64.decodeBase64(transaction);
  }

  /**
   * Run the aggregation within an already active transaction. The value here is the opaque
   * transaction ID to execute the query in.
   * @see #encodeTransaction()
   * @param transaction transaction or {@code null} for none
   */
  public RunAggregationQueryRequest setTransaction(java.lang.String transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Run the aggregation within an already active transaction. The value here is the opaque
   * transaction ID to execute the query in.
   * @see #setTransaction()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public RunAggregationQueryRequest encodeTransaction(byte[] transaction) {
    this.transaction = com.google.api.client.util.Base64.encodeBase64URLSafeString(transaction);
    return this;
  }

  @Override
  public RunAggregationQueryRequest set(String fieldName, Object value) {
    return (RunAggregationQueryRequest) super.set(fieldName, value);
  }

  @Override
  public RunAggregationQueryRequest clone() {
    return (RunAggregationQueryRequest) super.clone();
  }

}
