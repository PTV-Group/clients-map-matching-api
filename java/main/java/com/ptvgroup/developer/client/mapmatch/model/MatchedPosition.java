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
import com.ptvgroup.developer.client.mapmatch.model.SegmentAttributes;
import com.ptvgroup.developer.client.mapmatch.model.SegmentLocationDescriptors;
import com.ptvgroup.developer.client.mapmatch.model.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents the successful match of a position on the map including the matched segment and the deviation to the input position. For unsuccessful matches an empty object is returned.
 */
@ApiModel(description = "Represents the successful match of a position on the map including the matched segment and the deviation to the input position. For unsuccessful matches an empty object is returned.")
@JsonPropertyOrder({
  MatchedPosition.JSON_PROPERTY_LATITUDE,
  MatchedPosition.JSON_PROPERTY_LONGITUDE,
  MatchedPosition.JSON_PROPERTY_SEGMENT_GEOMETRY,
  MatchedPosition.JSON_PROPERTY_MATCH_DISTANCE,
  MatchedPosition.JSON_PROPERTY_ANGLE_DIFFERENCE,
  MatchedPosition.JSON_PROPERTY_SEGMENT_LOCATION_DESCRIPTORS,
  MatchedPosition.JSON_PROPERTY_SEGMENT_ATTRIBUTES,
  MatchedPosition.JSON_PROPERTY_WARNINGS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T14:39:28.947834Z[Etc/UTC]")
public class MatchedPosition {
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

  public static final String JSON_PROPERTY_SEGMENT_LOCATION_DESCRIPTORS = "segmentLocationDescriptors";
  private SegmentLocationDescriptors segmentLocationDescriptors;

  public static final String JSON_PROPERTY_SEGMENT_ATTRIBUTES = "segmentAttributes";
  private SegmentAttributes segmentAttributes;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<Warning> warnings = null;

  public MatchedPosition() { 
  }

  public MatchedPosition latitude(Double latitude) {
    this.latitude = JsonNullable.<Double>of(latitude);
    return this;
  }

   /**
   * The latitude value in degrees (WGS84/EPSG:4326) from south to north. This refers to the coordinates on the segment to which the input position matches.
   * minimum: -90
   * maximum: 90
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The latitude value in degrees (WGS84/EPSG:4326) from south to north. This refers to the coordinates on the segment to which the input position matches.")
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


  public MatchedPosition longitude(Double longitude) {
    this.longitude = JsonNullable.<Double>of(longitude);
    return this;
  }

   /**
   * The longitude value in degrees (WGS84/EPSG:4326) from west to east. This refers to the coordinates on the segment to which the input position matches.
   * minimum: -180
   * maximum: 180
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The longitude value in degrees (WGS84/EPSG:4326) from west to east. This refers to the coordinates on the segment to which the input position matches.")
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


  public MatchedPosition segmentGeometry(String segmentGeometry) {
    this.segmentGeometry = JsonNullable.<String>of(segmentGeometry);
    return this;
  }

   /**
   * The geometry of the matched segment as a GeoJSON representation. Coordinates are always present in WGS84 (EPSG:4326).
   * @return segmentGeometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The geometry of the matched segment as a GeoJSON representation. Coordinates are always present in WGS84 (EPSG:4326).")
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


  public MatchedPosition matchDistance(Integer matchDistance) {
    this.matchDistance = JsonNullable.<Integer>of(matchDistance);
    return this;
  }

   /**
   * The straight-line distance (Euclidean distance) [m] from the input position to the matching segment.
   * minimum: 0
   * @return matchDistance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The straight-line distance (Euclidean distance) [m] from the input position to the matching segment.")
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


  public MatchedPosition angleDifference(Double angleDifference) {
    this.angleDifference = JsonNullable.<Double>of(angleDifference);
    return this;
  }

   /**
   * The difference in degrees \\[°\\] between the angle of the travel direction and the angle of the matching segment. This value is always smaller than the straight angle.
   * minimum: 0
   * maximum: 180
   * @return angleDifference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The difference in degrees \\[°\\] between the angle of the travel direction and the angle of the matching segment. This value is always smaller than the straight angle.")
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


  public MatchedPosition segmentLocationDescriptors(SegmentLocationDescriptors segmentLocationDescriptors) {
    this.segmentLocationDescriptors = segmentLocationDescriptors;
    return this;
  }

   /**
   * Get segmentLocationDescriptors
   * @return segmentLocationDescriptors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEGMENT_LOCATION_DESCRIPTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SegmentLocationDescriptors getSegmentLocationDescriptors() {
    return segmentLocationDescriptors;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_LOCATION_DESCRIPTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentLocationDescriptors(SegmentLocationDescriptors segmentLocationDescriptors) {
    this.segmentLocationDescriptors = segmentLocationDescriptors;
  }


  public MatchedPosition segmentAttributes(SegmentAttributes segmentAttributes) {
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


  public MatchedPosition warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public MatchedPosition addWarningsItem(Warning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * A list of warnings concerning the validity of the result.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of warnings concerning the validity of the result.")
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
   * Return true if this MatchedPosition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchedPosition matchedPosition = (MatchedPosition) o;
    return equalsNullable(this.latitude, matchedPosition.latitude) &&
        equalsNullable(this.longitude, matchedPosition.longitude) &&
        equalsNullable(this.segmentGeometry, matchedPosition.segmentGeometry) &&
        equalsNullable(this.matchDistance, matchedPosition.matchDistance) &&
        equalsNullable(this.angleDifference, matchedPosition.angleDifference) &&
        Objects.equals(this.segmentLocationDescriptors, matchedPosition.segmentLocationDescriptors) &&
        Objects.equals(this.segmentAttributes, matchedPosition.segmentAttributes) &&
        Objects.equals(this.warnings, matchedPosition.warnings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(latitude), hashCodeNullable(longitude), hashCodeNullable(segmentGeometry), hashCodeNullable(matchDistance), hashCodeNullable(angleDifference), segmentLocationDescriptors, segmentAttributes, warnings);
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
    sb.append("class MatchedPosition {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    segmentGeometry: ").append(toIndentedString(segmentGeometry)).append("\n");
    sb.append("    matchDistance: ").append(toIndentedString(matchDistance)).append("\n");
    sb.append("    angleDifference: ").append(toIndentedString(angleDifference)).append("\n");
    sb.append("    segmentLocationDescriptors: ").append(toIndentedString(segmentLocationDescriptors)).append("\n");
    sb.append("    segmentAttributes: ").append(toIndentedString(segmentAttributes)).append("\n");
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

}

