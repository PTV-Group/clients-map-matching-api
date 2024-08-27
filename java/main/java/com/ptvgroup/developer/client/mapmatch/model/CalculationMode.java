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
 * Enumeration to define the calculation behavior of the matching, i.e. if the focus of calculation is on performance, quality or both.    * &#x60;PERFORMANCE&#x60; - The matching focuses on performance. This means to take into account a higher number of failed matches and in the case of track matching that the matched track may be split into several paths.    * &#x60;STANDARD&#x60; - The matching chooses a standard trade-off between quality and performance.    * &#x60;QUALITY&#x60; - The matching focuses on high solution quality. This means that as many as possible of the input positions are matched and taken into account. Though the processing time of the request can be high.
 */
public enum CalculationMode {
  
  PERFORMANCE("PERFORMANCE"),
  
  STANDARD("STANDARD"),
  
  QUALITY("QUALITY");

  private String value;

  CalculationMode(String value) {
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
  public static CalculationMode fromValue(String value) {
    for (CalculationMode b : CalculationMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

