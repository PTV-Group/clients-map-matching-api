/*
 * Map Matching
 * With the Map Matching service you can assign GPS positions to road segments on a digital map.
 *
 * The version of the OpenAPI document: 1.6
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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Select properties for the MatchedTrack.    * &#x60;PATHS&#x60; - The MatchedTrack will contain the paths.    * &#x60;GEOMETRY&#x60; - The MatchedTrack will contain the geometry.    * &#x60;TRACK_POSITIONS&#x60; - The MatchedTrack will contain the track positions.    * &#x60;ROUTE_ID&#x60; - The MatchedTrack will contain the route ID for each path. PATHS will automatically be included.    * &#x60;SEGMENT_ATTRIBUTES&#x60; - The MatchedTrack will contain segment attributes for the track positions.  TRACK_POSITIONS will automatically be included.
 */
public enum MatchedTrackResultType {
  
  PATHS("PATHS"),
  
  GEOMETRY("GEOMETRY"),
  
  TRACK_POSITIONS("TRACK_POSITIONS"),
  
  ROUTE_ID("ROUTE_ID"),
  
  SEGMENT_ATTRIBUTES("SEGMENT_ATTRIBUTES");

  private String value;

  MatchedTrackResultType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MatchedTrackResultType fromValue(String value) {
    for (MatchedTrackResultType b : MatchedTrackResultType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

