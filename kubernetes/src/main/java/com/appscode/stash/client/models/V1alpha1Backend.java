/*
 * Stash
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.7.0
 * Contact: hello@appscode.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.appscode.stash.client.models;

import java.util.Objects;
import com.appscode.stash.client.models.V1alpha1AzureSpec;
import com.appscode.stash.client.models.V1alpha1B2Spec;
import com.appscode.stash.client.models.V1alpha1GCSSpec;
import com.appscode.stash.client.models.V1alpha1LocalSpec;
import com.appscode.stash.client.models.V1alpha1S3Spec;
import com.appscode.stash.client.models.V1alpha1SwiftSpec;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1Backend
 */

public class V1alpha1Backend {
  @SerializedName("azure")
  private V1alpha1AzureSpec azure = null;

  @SerializedName("b2")
  private V1alpha1B2Spec b2 = null;

  @SerializedName("gcs")
  private V1alpha1GCSSpec gcs = null;

  @SerializedName("local")
  private V1alpha1LocalSpec local = null;

  @SerializedName("s3")
  private V1alpha1S3Spec s3 = null;

  @SerializedName("storageSecretName")
  private String storageSecretName = null;

  @SerializedName("swift")
  private V1alpha1SwiftSpec swift = null;

  public V1alpha1Backend azure(V1alpha1AzureSpec azure) {
    this.azure = azure;
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @ApiModelProperty(value = "")
  public V1alpha1AzureSpec getAzure() {
    return azure;
  }

  public void setAzure(V1alpha1AzureSpec azure) {
    this.azure = azure;
  }

  public V1alpha1Backend b2(V1alpha1B2Spec b2) {
    this.b2 = b2;
    return this;
  }

   /**
   * Get b2
   * @return b2
  **/
  @ApiModelProperty(value = "")
  public V1alpha1B2Spec getB2() {
    return b2;
  }

  public void setB2(V1alpha1B2Spec b2) {
    this.b2 = b2;
  }

  public V1alpha1Backend gcs(V1alpha1GCSSpec gcs) {
    this.gcs = gcs;
    return this;
  }

   /**
   * Get gcs
   * @return gcs
  **/
  @ApiModelProperty(value = "")
  public V1alpha1GCSSpec getGcs() {
    return gcs;
  }

  public void setGcs(V1alpha1GCSSpec gcs) {
    this.gcs = gcs;
  }

  public V1alpha1Backend local(V1alpha1LocalSpec local) {
    this.local = local;
    return this;
  }

   /**
   * Get local
   * @return local
  **/
  @ApiModelProperty(value = "")
  public V1alpha1LocalSpec getLocal() {
    return local;
  }

  public void setLocal(V1alpha1LocalSpec local) {
    this.local = local;
  }

  public V1alpha1Backend s3(V1alpha1S3Spec s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @ApiModelProperty(value = "")
  public V1alpha1S3Spec getS3() {
    return s3;
  }

  public void setS3(V1alpha1S3Spec s3) {
    this.s3 = s3;
  }

  public V1alpha1Backend storageSecretName(String storageSecretName) {
    this.storageSecretName = storageSecretName;
    return this;
  }

   /**
   * Get storageSecretName
   * @return storageSecretName
  **/
  @ApiModelProperty(value = "")
  public String getStorageSecretName() {
    return storageSecretName;
  }

  public void setStorageSecretName(String storageSecretName) {
    this.storageSecretName = storageSecretName;
  }

  public V1alpha1Backend swift(V1alpha1SwiftSpec swift) {
    this.swift = swift;
    return this;
  }

   /**
   * Get swift
   * @return swift
  **/
  @ApiModelProperty(value = "")
  public V1alpha1SwiftSpec getSwift() {
    return swift;
  }

  public void setSwift(V1alpha1SwiftSpec swift) {
    this.swift = swift;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Backend v1alpha1Backend = (V1alpha1Backend) o;
    return Objects.equals(this.azure, v1alpha1Backend.azure) &&
        Objects.equals(this.b2, v1alpha1Backend.b2) &&
        Objects.equals(this.gcs, v1alpha1Backend.gcs) &&
        Objects.equals(this.local, v1alpha1Backend.local) &&
        Objects.equals(this.s3, v1alpha1Backend.s3) &&
        Objects.equals(this.storageSecretName, v1alpha1Backend.storageSecretName) &&
        Objects.equals(this.swift, v1alpha1Backend.swift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azure, b2, gcs, local, s3, storageSecretName, swift);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Backend {\n");
    
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
    sb.append("    b2: ").append(toIndentedString(b2)).append("\n");
    sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    storageSecretName: ").append(toIndentedString(storageSecretName)).append("\n");
    sb.append("    swift: ").append(toIndentedString(swift)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

