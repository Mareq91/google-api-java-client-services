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

package com.google.api.services.vmmigration.v1.model;

/**
 * ComputeEngineDisksTargetDetails is a collection of created Persistent Disks details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ComputeEngineDisksTargetDetails extends com.google.api.client.json.GenericJson {

  /**
   * The details of each created Persistent Disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PersistentDisk> disks;

  /**
   * The details of each created Persistent Disk.
   * @return value or {@code null} for none
   */
  public java.util.List<PersistentDisk> getDisks() {
    return disks;
  }

  /**
   * The details of each created Persistent Disk.
   * @param disks disks or {@code null} for none
   */
  public ComputeEngineDisksTargetDetails setDisks(java.util.List<PersistentDisk> disks) {
    this.disks = disks;
    return this;
  }

  @Override
  public ComputeEngineDisksTargetDetails set(String fieldName, Object value) {
    return (ComputeEngineDisksTargetDetails) super.set(fieldName, value);
  }

  @Override
  public ComputeEngineDisksTargetDetails clone() {
    return (ComputeEngineDisksTargetDetails) super.clone();
  }

}