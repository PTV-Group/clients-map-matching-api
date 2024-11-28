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
import com.ptvgroup.developer.client.mapmatch.model.MatchedPath;
import com.ptvgroup.developer.client.mapmatch.model.MatchedTrackPosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.mapmatch.ApiClient;
/**
 * Contains the result of the matched track.
 */
@JsonPropertyOrder({
  MatchedTrack.JSON_PROPERTY_ID,
  MatchedTrack.JSON_PROPERTY_DISTANCE,
  MatchedTrack.JSON_PROPERTY_PATHS,
  MatchedTrack.JSON_PROPERTY_GEOMETRY,
  MatchedTrack.JSON_PROPERTY_TRACK_POSITIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T08:43:50.512271014Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class MatchedTrack {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Integer distance;

  public static final String JSON_PROPERTY_PATHS = "paths";
  private List<MatchedPath> paths;

  public static final String JSON_PROPERTY_GEOMETRY = "geometry";
  private String geometry;

  public static final String JSON_PROPERTY_TRACK_POSITIONS = "trackPositions";
  private List<MatchedTrackPosition> trackPositions;

  public MatchedTrack() { 
  }

  public MatchedTrack id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the MatchedTrack.
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public MatchedTrack distance(Integer distance) {
    this.distance = distance;
    return this;
  }

  /**
   * The distance [m] of the complete track. It is the sum of distances of all path distances.
   * minimum: 0
   * @return distance
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getDistance() {
    return distance;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDistance(Integer distance) {
    this.distance = distance;
  }


  public MatchedTrack paths(List<MatchedPath> paths) {
    this.paths = paths;
    return this;
  }

  public MatchedTrack addPathsItem(MatchedPath pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<>();
    }
    this.paths.add(pathsItem);
    return this;
  }

  /**
   * Get paths
   * @return paths
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MatchedPath> getPaths() {
    return paths;
  }


  @JsonProperty(JSON_PROPERTY_PATHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaths(List<MatchedPath> paths) {
    this.paths = paths;
  }


  public MatchedTrack geometry(String geometry) {
    this.geometry = geometry;
    return this;
  }

  /**
   * The geometry of the paths (collection of polylines) as a GeoJSON representation. Coordinates are always present in WGS84 (EPSG:4326).
   * @return geometry
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEOMETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGeometry() {
    return geometry;
  }


  @JsonProperty(JSON_PROPERTY_GEOMETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeometry(String geometry) {
    this.geometry = geometry;
  }


  public MatchedTrack trackPositions(List<MatchedTrackPosition> trackPositions) {
    this.trackPositions = trackPositions;
    return this;
  }

  public MatchedTrack addTrackPositionsItem(MatchedTrackPosition trackPositionsItem) {
    if (this.trackPositions == null) {
      this.trackPositions = new ArrayList<>();
    }
    this.trackPositions.add(trackPositionsItem);
    return this;
  }

  /**
   * Get trackPositions
   * @return trackPositions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACK_POSITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MatchedTrackPosition> getTrackPositions() {
    return trackPositions;
  }


  @JsonProperty(JSON_PROPERTY_TRACK_POSITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackPositions(List<MatchedTrackPosition> trackPositions) {
    this.trackPositions = trackPositions;
  }


  /**
   * Return true if this MatchedTrack object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchedTrack matchedTrack = (MatchedTrack) o;
    return Objects.equals(this.id, matchedTrack.id) &&
        Objects.equals(this.distance, matchedTrack.distance) &&
        Objects.equals(this.paths, matchedTrack.paths) &&
        Objects.equals(this.geometry, matchedTrack.geometry) &&
        Objects.equals(this.trackPositions, matchedTrack.trackPositions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, distance, paths, geometry, trackPositions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchedTrack {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    trackPositions: ").append(toIndentedString(trackPositions)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `distance` to the URL query string
    if (getDistance() != null) {
      joiner.add(String.format("%sdistance%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDistance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `paths` to the URL query string
    if (getPaths() != null) {
      for (int i = 0; i < getPaths().size(); i++) {
        if (getPaths().get(i) != null) {
          joiner.add(getPaths().get(i).toUrlQueryString(String.format("%spaths%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `geometry` to the URL query string
    if (getGeometry() != null) {
      joiner.add(String.format("%sgeometry%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getGeometry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trackPositions` to the URL query string
    if (getTrackPositions() != null) {
      for (int i = 0; i < getTrackPositions().size(); i++) {
        if (getTrackPositions().get(i) != null) {
          joiner.add(getTrackPositions().get(i).toUrlQueryString(String.format("%strackPositions%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

