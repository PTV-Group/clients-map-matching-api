/*
 * Map Matching
 * With the Map Matching service you can assign GPS positions to road segments on a digital map.
 *
 * The version of the OpenAPI document: 1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.mapmatch.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.mapmatch.model.MatchType;
import com.ptvgroup.developer.client.mapmatch.model.SegmentAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Detailed information about a position on a track matched on a map.
 */
@ApiModel(description = "Detailed information about a position on a track matched on a map.")
@JsonPropertyOrder({
  MatchedTrackPosition.JSON_PROPERTY_MATCH_TYPE,
  MatchedTrackPosition.JSON_PROPERTY_DISTANCE_FROM_PREVIOUS_MATCH,
  MatchedTrackPosition.JSON_PROPERTY_LATITUDE,
  MatchedTrackPosition.JSON_PROPERTY_LONGITUDE,
  MatchedTrackPosition.JSON_PROPERTY_SEGMENT_GEOMETRY,
  MatchedTrackPosition.JSON_PROPERTY_MATCH_DISTANCE,
  MatchedTrackPosition.JSON_PROPERTY_ANGLE_DIFFERENCE,
  MatchedTrackPosition.JSON_PROPERTY_SEGMENT_ATTRIBUTES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T14:39:28.947834Z[Etc/UTC]")
public class MatchedTrackPosition {
  public static final String JSON_PROPERTY_MATCH_TYPE = "matchType";
  private MatchType matchType;

  public static final String JSON_PROPERTY_DISTANCE_FROM_PREVIOUS_MATCH = "distanceFromPreviousMatch";
  private JsonNullable<Integer> distanceFromPreviousMatch = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private JsonNullable<Double> latitude = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private JsonNullable<Double> longitude = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SEGMENT_GEOMETRY = "segmentGeometry";
  private JsonNullable<String> segmentGeometry = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MATCH_DISTANCE = "matchDistance";
  private JsonNullable<Integer> matchDistance = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ANGLE_DIFFERENCE = "angleDifference";
  private JsonNullable<Double> angleDifference = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SEGMENT_ATTRIBUTES = "segmentAttributes";
  private SegmentAttributes segmentAttributes;

  public MatchedTrackPosition() { 
  }

  public MatchedTrackPosition matchType(MatchType matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MatchType getMatchType() {
    return matchType;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMatchType(MatchType matchType) {
    this.matchType = matchType;
  }


  public MatchedTrackPosition distanceFromPreviousMatch(Integer distanceFromPreviousMatch) {
    this.distanceFromPreviousMatch = JsonNullable.<Integer>of(distanceFromPreviousMatch);
    return this;
  }

   /**
   * The travel distance [m] from the previous position. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.
   * minimum: 0
   * @return distanceFromPreviousMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The travel distance [m] from the previous position. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.")
  @JsonIgnore

  public Integer getDistanceFromPreviousMatch() {
        return distanceFromPreviousMatch.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISTANCE_FROM_PREVIOUS_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getDistanceFromPreviousMatch_JsonNullable() {
    return distanceFromPreviousMatch;
  }
  
  @JsonProperty(JSON_PROPERTY_DISTANCE_FROM_PREVIOUS_MATCH)
  public void setDistanceFromPreviousMatch_JsonNullable(JsonNullable<Integer> distanceFromPreviousMatch) {
    this.distanceFromPreviousMatch = distanceFromPreviousMatch;
  }

  public void setDistanceFromPreviousMatch(Integer distanceFromPreviousMatch) {
    this.distanceFromPreviousMatch = JsonNullable.<Integer>of(distanceFromPreviousMatch);
  }


  public MatchedTrackPosition latitude(Double latitude) {
    this.latitude = JsonNullable.<Double>of(latitude);
    return this;
  }

   /**
   * The latitude value in degrees (WGS84/EPSG:4326) from south to north. This refers to the coordinates on the segment to which the input position matches. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.
   * minimum: -90
   * maximum: 90
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The latitude value in degrees (WGS84/EPSG:4326) from south to north. This refers to the coordinates on the segment to which the input position matches. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.")
  @JsonIgnore

  public Double getLatitude() {
        return latitude.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getLatitude_JsonNullable() {
    return latitude;
  }
  
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  public void setLatitude_JsonNullable(JsonNullable<Double> latitude) {
    this.latitude = latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = JsonNullable.<Double>of(latitude);
  }


  public MatchedTrackPosition longitude(Double longitude) {
    this.longitude = JsonNullable.<Double>of(longitude);
    return this;
  }

   /**
   * The longitude value in degrees (WGS84/EPSG:4326) from west to east. This refers to the coordinates on the segment to which the input position matches. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.
   * minimum: -180
   * maximum: 180
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The longitude value in degrees (WGS84/EPSG:4326) from west to east. This refers to the coordinates on the segment to which the input position matches. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.")
  @JsonIgnore

  public Double getLongitude() {
        return longitude.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getLongitude_JsonNullable() {
    return longitude;
  }
  
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  public void setLongitude_JsonNullable(JsonNullable<Double> longitude) {
    this.longitude = longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = JsonNullable.<Double>of(longitude);
  }


  public MatchedTrackPosition segmentGeometry(String segmentGeometry) {
    this.segmentGeometry = JsonNullable.<String>of(segmentGeometry);
    return this;
  }

   /**
   * The geometry of the matched segment as a GeoJSON representation. Coordinates are always present in WGS84 (EPSG:4326). It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.
   * @return segmentGeometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The geometry of the matched segment as a GeoJSON representation. Coordinates are always present in WGS84 (EPSG:4326). It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.")
  @JsonIgnore

  public String getSegmentGeometry() {
        return segmentGeometry.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEGMENT_GEOMETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSegmentGeometry_JsonNullable() {
    return segmentGeometry;
  }
  
  @JsonProperty(JSON_PROPERTY_SEGMENT_GEOMETRY)
  public void setSegmentGeometry_JsonNullable(JsonNullable<String> segmentGeometry) {
    this.segmentGeometry = segmentGeometry;
  }

  public void setSegmentGeometry(String segmentGeometry) {
    this.segmentGeometry = JsonNullable.<String>of(segmentGeometry);
  }


  public MatchedTrackPosition matchDistance(Integer matchDistance) {
    this.matchDistance = JsonNullable.<Integer>of(matchDistance);
    return this;
  }

   /**
   * The straight-line distance (Euclidean distance) [m] from the input position to the matching segment. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.
   * minimum: 0
   * @return matchDistance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The straight-line distance (Euclidean distance) [m] from the input position to the matching segment. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.")
  @JsonIgnore

  public Integer getMatchDistance() {
        return matchDistance.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MATCH_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMatchDistance_JsonNullable() {
    return matchDistance;
  }
  
  @JsonProperty(JSON_PROPERTY_MATCH_DISTANCE)
  public void setMatchDistance_JsonNullable(JsonNullable<Integer> matchDistance) {
    this.matchDistance = matchDistance;
  }

  public void setMatchDistance(Integer matchDistance) {
    this.matchDistance = JsonNullable.<Integer>of(matchDistance);
  }


  public MatchedTrackPosition angleDifference(Double angleDifference) {
    this.angleDifference = JsonNullable.<Double>of(angleDifference);
    return this;
  }

   /**
   * The difference in degrees \\[°\\] between the angle of the heading of the input position and the angle of the matching segment. This difference is always smaller than the straight angle.  It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.
   * minimum: 0
   * maximum: 180
   * @return angleDifference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The difference in degrees \\[°\\] between the angle of the heading of the input position and the angle of the matching segment. This difference is always smaller than the straight angle.  It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.")
  @JsonIgnore

  public Double getAngleDifference() {
        return angleDifference.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANGLE_DIFFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getAngleDifference_JsonNullable() {
    return angleDifference;
  }
  
  @JsonProperty(JSON_PROPERTY_ANGLE_DIFFERENCE)
  public void setAngleDifference_JsonNullable(JsonNullable<Double> angleDifference) {
    this.angleDifference = angleDifference;
  }

  public void setAngleDifference(Double angleDifference) {
    this.angleDifference = JsonNullable.<Double>of(angleDifference);
  }


  public MatchedTrackPosition segmentAttributes(SegmentAttributes segmentAttributes) {
    this.segmentAttributes = segmentAttributes;
    return this;
  }

   /**
   * Get segmentAttributes
   * @return segmentAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEGMENT_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SegmentAttributes getSegmentAttributes() {
    return segmentAttributes;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentAttributes(SegmentAttributes segmentAttributes) {
    this.segmentAttributes = segmentAttributes;
  }


  /**
   * Return true if this MatchedTrackPosition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchedTrackPosition matchedTrackPosition = (MatchedTrackPosition) o;
    return Objects.equals(this.matchType, matchedTrackPosition.matchType) &&
        equalsNullable(this.distanceFromPreviousMatch, matchedTrackPosition.distanceFromPreviousMatch) &&
        equalsNullable(this.latitude, matchedTrackPosition.latitude) &&
        equalsNullable(this.longitude, matchedTrackPosition.longitude) &&
        equalsNullable(this.segmentGeometry, matchedTrackPosition.segmentGeometry) &&
        equalsNullable(this.matchDistance, matchedTrackPosition.matchDistance) &&
        equalsNullable(this.angleDifference, matchedTrackPosition.angleDifference) &&
        Objects.equals(this.segmentAttributes, matchedTrackPosition.segmentAttributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchType, hashCodeNullable(distanceFromPreviousMatch), hashCodeNullable(latitude), hashCodeNullable(longitude), hashCodeNullable(segmentGeometry), hashCodeNullable(matchDistance), hashCodeNullable(angleDifference), segmentAttributes);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchedTrackPosition {\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    distanceFromPreviousMatch: ").append(toIndentedString(distanceFromPreviousMatch)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    segmentGeometry: ").append(toIndentedString(segmentGeometry)).append("\n");
    sb.append("    matchDistance: ").append(toIndentedString(matchDistance)).append("\n");
    sb.append("    angleDifference: ").append(toIndentedString(angleDifference)).append("\n");
    sb.append("    segmentAttributes: ").append(toIndentedString(segmentAttributes)).append("\n");
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

}

