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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes the toll properties of a road segment.
 */
@ApiModel(description = "Describes the toll properties of a road segment.")
@JsonPropertyOrder({
  Toll.JSON_PROPERTY_VEHICLE_CATEGORIES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T15:03:45.817708491Z[Etc/UTC]")
public class Toll {
  public static final String JSON_PROPERTY_VEHICLE_CATEGORIES = "vehicleCategories";
  private List<String> vehicleCategories = null;

  public Toll() { 
  }

  public Toll vehicleCategories(List<String> vehicleCategories) {
    this.vehicleCategories = vehicleCategories;
    return this;
  }

  public Toll addVehicleCategoriesItem(String vehicleCategoriesItem) {
    if (this.vehicleCategories == null) {
      this.vehicleCategories = new ArrayList<>();
    }
    this.vehicleCategories.add(vehicleCategoriesItem);
    return this;
  }

   /**
   * List of all vehicle types for which a toll is due on a road section.   Available values are:  \&quot;ALL_VEHICLES\&quot;, \&quot;BUS\&quot;, \&quot;CAR\&quot;, \&quot;CARPOOL\&quot;, \&quot;DELIVERY_TRUCK\&quot;, \&quot;MOTORCYCLE\&quot;, \&quot;TAXI\&quot;, \&quot;THROUGH_TRAFFIC\&quot;, \&quot;TRUCK\&quot;, \&quot;PEDESTRIAN\&quot;, \&quot;EMERGENCY_VEHICLE\&quot;.   This list can be extended at any time, clients should handle unknown values properly.
   * @return vehicleCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all vehicle types for which a toll is due on a road section.   Available values are:  \"ALL_VEHICLES\", \"BUS\", \"CAR\", \"CARPOOL\", \"DELIVERY_TRUCK\", \"MOTORCYCLE\", \"TAXI\", \"THROUGH_TRAFFIC\", \"TRUCK\", \"PEDESTRIAN\", \"EMERGENCY_VEHICLE\".   This list can be extended at any time, clients should handle unknown values properly.")
  @JsonProperty(JSON_PROPERTY_VEHICLE_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVehicleCategories() {
    return vehicleCategories;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLE_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVehicleCategories(List<String> vehicleCategories) {
    this.vehicleCategories = vehicleCategories;
  }


  /**
   * Return true if this Toll object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Toll toll = (Toll) o;
    return Objects.equals(this.vehicleCategories, toll.vehicleCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Toll {\n");
    sb.append("    vehicleCategories: ").append(toIndentedString(vehicleCategories)).append("\n");
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

