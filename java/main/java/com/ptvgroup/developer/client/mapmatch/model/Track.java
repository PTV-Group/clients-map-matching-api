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
import com.ptvgroup.developer.client.mapmatch.model.TrackPosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.mapmatch.ApiClient;
/**
 * Contains positions to be matched as a track on a map.
 */
@JsonPropertyOrder({
  Track.JSON_PROPERTY_POSITIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T08:43:50.512271014Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Track {
  public static final String JSON_PROPERTY_POSITIONS = "positions";
  private List<TrackPosition> positions;

  public Track() { 
  }

  public Track positions(List<TrackPosition> positions) {
    this.positions = positions;
    return this;
  }

  public Track addPositionsItem(TrackPosition positionsItem) {
    if (this.positions == null) {
      this.positions = new ArrayList<>();
    }
    this.positions.add(positionsItem);
    return this;
  }

  /**
   * Get positions
   * @return positions
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POSITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TrackPosition> getPositions() {
    return positions;
  }


  @JsonProperty(JSON_PROPERTY_POSITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPositions(List<TrackPosition> positions) {
    this.positions = positions;
  }


  /**
   * Return true if this Track object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Track track = (Track) o;
    return Objects.equals(this.positions, track.positions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Track {\n");
    sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
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

    // add `positions` to the URL query string
    if (getPositions() != null) {
      for (int i = 0; i < getPositions().size(); i++) {
        if (getPositions().get(i) != null) {
          joiner.add(getPositions().get(i).toUrlQueryString(String.format("%spositions%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

