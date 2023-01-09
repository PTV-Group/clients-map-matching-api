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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes a position which belongs to a track with additional track related attributes.
 */
@ApiModel(description = "Describes a position which belongs to a track with additional track related attributes.")
@JsonPropertyOrder({
  TrackPosition.JSON_PROPERTY_LATITUDE,
  TrackPosition.JSON_PROPERTY_LONGITUDE,
  TrackPosition.JSON_PROPERTY_HEADING,
  TrackPosition.JSON_PROPERTY_DISTANCE_FROM_PREVIOUS_POSITION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T14:39:28.947834Z[Etc/UTC]")
public class TrackPosition {
  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public static final String JSON_PROPERTY_HEADING = "heading";
  private JsonNullable<Double> heading = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DISTANCE_FROM_PREVIOUS_POSITION = "distanceFromPreviousPosition";
  private JsonNullable<Double> distanceFromPreviousPosition = JsonNullable.<Double>undefined();

  public TrackPosition() { 
  }

  public TrackPosition latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude value in degrees (WGS84/EPSG:4326) from south to north of the position to be matched.
   * minimum: -90
   * maximum: 90
   * @return latitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "49.480301", required = true, value = "The latitude value in degrees (WGS84/EPSG:4326) from south to north of the position to be matched.")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public TrackPosition longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude value in degrees (WGS84/EPSG:4326) from west to east of the position to be matched.
   * minimum: -180
   * maximum: 180
   * @return longitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6.110667", required = true, value = "The longitude value in degrees (WGS84/EPSG:4326) from west to east of the position to be matched.")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public TrackPosition heading(Double heading) {
    this.heading = JsonNullable.<Double>of(heading);
    return this;
  }

   /**
   * The direction of travel defined by a clockwise angle with respect to north in degrees \\\\[°\\\\], e.g., 0° is north, 90° is east, 180° is south, and 270° is west.
   * minimum: 0
   * maximum: 360
   * @return heading
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45", value = "The direction of travel defined by a clockwise angle with respect to north in degrees \\\\[°\\\\], e.g., 0° is north, 90° is east, 180° is south, and 270° is west.")
  @JsonIgnore

  public Double getHeading() {
        return heading.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HEADING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getHeading_JsonNullable() {
    return heading;
  }
  
  @JsonProperty(JSON_PROPERTY_HEADING)
  public void setHeading_JsonNullable(JsonNullable<Double> heading) {
    this.heading = heading;
  }

  public void setHeading(Double heading) {
    this.heading = JsonNullable.<Double>of(heading);
  }


  public TrackPosition distanceFromPreviousPosition(Double distanceFromPreviousPosition) {
    this.distanceFromPreviousPosition = JsonNullable.<Double>of(distanceFromPreviousPosition);
    return this;
  }

   /**
   * The travel distance [m] from the previous position to this position. This value can be provided to improve the quality of the track matching.
   * minimum: 0
   * @return distanceFromPreviousPosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The travel distance [m] from the previous position to this position. This value can be provided to improve the quality of the track matching.")
  @JsonIgnore

  public Double getDistanceFromPreviousPosition() {
        return distanceFromPreviousPosition.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISTANCE_FROM_PREVIOUS_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getDistanceFromPreviousPosition_JsonNullable() {
    return distanceFromPreviousPosition;
  }
  
  @JsonProperty(JSON_PROPERTY_DISTANCE_FROM_PREVIOUS_POSITION)
  public void setDistanceFromPreviousPosition_JsonNullable(JsonNullable<Double> distanceFromPreviousPosition) {
    this.distanceFromPreviousPosition = distanceFromPreviousPosition;
  }

  public void setDistanceFromPreviousPosition(Double distanceFromPreviousPosition) {
    this.distanceFromPreviousPosition = JsonNullable.<Double>of(distanceFromPreviousPosition);
  }


  /**
   * Return true if this TrackPosition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackPosition trackPosition = (TrackPosition) o;
    return Objects.equals(this.latitude, trackPosition.latitude) &&
        Objects.equals(this.longitude, trackPosition.longitude) &&
        equalsNullable(this.heading, trackPosition.heading) &&
        equalsNullable(this.distanceFromPreviousPosition, trackPosition.distanceFromPreviousPosition);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, hashCodeNullable(heading), hashCodeNullable(distanceFromPreviousPosition));
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
    sb.append("class TrackPosition {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    distanceFromPreviousPosition: ").append(toIndentedString(distanceFromPreviousPosition)).append("\n");
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

