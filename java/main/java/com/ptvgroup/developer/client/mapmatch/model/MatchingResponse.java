/*
 * Map Matching
 * With the Map Matching service you can assign GPS positions to road segments on a digital map.
 *
 * The version of the OpenAPI document: 1.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.mapmatch.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.mapmatch.model.ErrorResponse;
import com.ptvgroup.developer.client.mapmatch.model.MatchedTrack;
import com.ptvgroup.developer.client.mapmatch.model.MatchingStatus;
import com.ptvgroup.developer.client.mapmatch.model.Warning;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.mapmatch.ApiClient;
/**
 * Contains the results of a matching calculation. If the &#39;status&#39; is &#39;RUNNING&#39;, the matching calculation is still running and no further properties are set. If the &#39;status&#39; is &#39;SUCCEEDED&#39;, the matching result is present as property &#39;matchedTrack&#39;. If the &#39;status&#39; is &#39;FAILED&#39;, the failure result is present as property &#39;error&#39;.
 */
@JsonPropertyOrder({
  MatchingResponse.JSON_PROPERTY_STATUS,
  MatchingResponse.JSON_PROPERTY_MATCHED_TRACK,
  MatchingResponse.JSON_PROPERTY_ERROR,
  MatchingResponse.JSON_PROPERTY_WARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T08:43:50.512271014Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class MatchingResponse {
  public static final String JSON_PROPERTY_STATUS = "status";
  private MatchingStatus status;

  public static final String JSON_PROPERTY_MATCHED_TRACK = "matchedTrack";
  private MatchedTrack matchedTrack;

  public static final String JSON_PROPERTY_ERROR = "error";
  private ErrorResponse error;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<Warning> warnings;

  public MatchingResponse() { 
  }

  public MatchingResponse status(MatchingStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MatchingStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(MatchingStatus status) {
    this.status = status;
  }


  public MatchingResponse matchedTrack(MatchedTrack matchedTrack) {
    this.matchedTrack = matchedTrack;
    return this;
  }

  /**
   * Get matchedTrack
   * @return matchedTrack
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCHED_TRACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MatchedTrack getMatchedTrack() {
    return matchedTrack;
  }


  @JsonProperty(JSON_PROPERTY_MATCHED_TRACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchedTrack(MatchedTrack matchedTrack) {
    this.matchedTrack = matchedTrack;
  }


  public MatchingResponse error(ErrorResponse error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ErrorResponse getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(ErrorResponse error) {
    this.error = error;
  }


  public MatchingResponse warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public MatchingResponse addWarningsItem(Warning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * A list of warnings concerning the validity of the result.
   * @return warnings
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Warning> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(List<Warning> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this MatchingResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchingResponse matchingResponse = (MatchingResponse) o;
    return Objects.equals(this.status, matchingResponse.status) &&
        Objects.equals(this.matchedTrack, matchingResponse.matchedTrack) &&
        Objects.equals(this.error, matchingResponse.error) &&
        Objects.equals(this.warnings, matchingResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, matchedTrack, error, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchingResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    matchedTrack: ").append(toIndentedString(matchedTrack)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `matchedTrack` to the URL query string
    if (getMatchedTrack() != null) {
      joiner.add(getMatchedTrack().toUrlQueryString(prefix + "matchedTrack" + suffix));
    }

    // add `error` to the URL query string
    if (getError() != null) {
      joiner.add(getError().toUrlQueryString(prefix + "error" + suffix));
    }

    // add `warnings` to the URL query string
    if (getWarnings() != null) {
      for (int i = 0; i < getWarnings().size(); i++) {
        if (getWarnings().get(i) != null) {
          joiner.add(getWarnings().get(i).toUrlQueryString(String.format("%swarnings%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

