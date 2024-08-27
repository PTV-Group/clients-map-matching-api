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
import com.ptvgroup.developer.client.mapmatch.model.EmissionStandard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes a vehicle category with more specific vehicle characteristics.
 */
@ApiModel(description = "Describes a vehicle category with more specific vehicle characteristics.")
@JsonPropertyOrder({
  Vehicle.JSON_PROPERTY_VEHICLE_CATEGORY,
  Vehicle.JSON_PROPERTY_TIME_RESTRICTIONS,
  Vehicle.JSON_PROPERTY_FUEL_TYPES,
  Vehicle.JSON_PROPERTY_EMISSION_STANDARDS,
  Vehicle.JSON_PROPERTY_VEHICLE_ATTRIBUTES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T15:03:45.817708491Z[Etc/UTC]")
public class Vehicle {
  public static final String JSON_PROPERTY_VEHICLE_CATEGORY = "vehicleCategory";
  private String vehicleCategory;

  public static final String JSON_PROPERTY_TIME_RESTRICTIONS = "timeRestrictions";
  private List<String> timeRestrictions = null;

  public static final String JSON_PROPERTY_FUEL_TYPES = "fuelTypes";
  private List<String> fuelTypes = null;

  public static final String JSON_PROPERTY_EMISSION_STANDARDS = "emissionStandards";
  private List<EmissionStandard> emissionStandards = null;

  public static final String JSON_PROPERTY_VEHICLE_ATTRIBUTES = "vehicleAttributes";
  private Map<String, Object> vehicleAttributes = null;

  public Vehicle() { 
  }

  public Vehicle vehicleCategory(String vehicleCategory) {
    this.vehicleCategory = vehicleCategory;
    return this;
  }

   /**
   * The type of the vehicle.
   * @return vehicleCategory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "TRUCK", required = true, value = "The type of the vehicle.")
  @JsonProperty(JSON_PROPERTY_VEHICLE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVehicleCategory() {
    return vehicleCategory;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVehicleCategory(String vehicleCategory) {
    this.vehicleCategory = vehicleCategory;
  }


  public Vehicle timeRestrictions(List<String> timeRestrictions) {
    this.timeRestrictions = timeRestrictions;
    return this;
  }

  public Vehicle addTimeRestrictionsItem(String timeRestrictionsItem) {
    if (this.timeRestrictions == null) {
      this.timeRestrictions = new ArrayList<>();
    }
    this.timeRestrictions.add(timeRestrictionsItem);
    return this;
  }

   /**
   * Get timeRestrictions
   * @return timeRestrictions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTimeRestrictions() {
    return timeRestrictions;
  }


  @JsonProperty(JSON_PROPERTY_TIME_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeRestrictions(List<String> timeRestrictions) {
    this.timeRestrictions = timeRestrictions;
  }


  public Vehicle fuelTypes(List<String> fuelTypes) {
    this.fuelTypes = fuelTypes;
    return this;
  }

  public Vehicle addFuelTypesItem(String fuelTypesItem) {
    if (this.fuelTypes == null) {
      this.fuelTypes = new ArrayList<>();
    }
    this.fuelTypes.add(fuelTypesItem);
    return this;
  }

   /**
   * List of all fuel types that describe this vehicle.  Available values are: \&quot;CNG_GASOLINE\&quot;, \&quot;COMPRESSED_NATURAL_GAS\&quot;, \&quot;DIESEL\&quot;, \&quot;ETHANOL\&quot;, \&quot;GASOLINE\&quot;, \&quot;LIQUEFIED_PETROLEUM_GAS\&quot;, \&quot;LIQUEFIED_NATURAL_GAS\&quot;, \&quot;LPG_GASOLINE\&quot;, \&quot;NONE\&quot;.   This list can be extended at any time, clients should handle unknown values properly.
   * @return fuelTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all fuel types that describe this vehicle.  Available values are: \"CNG_GASOLINE\", \"COMPRESSED_NATURAL_GAS\", \"DIESEL\", \"ETHANOL\", \"GASOLINE\", \"LIQUEFIED_PETROLEUM_GAS\", \"LIQUEFIED_NATURAL_GAS\", \"LPG_GASOLINE\", \"NONE\".   This list can be extended at any time, clients should handle unknown values properly.")
  @JsonProperty(JSON_PROPERTY_FUEL_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFuelTypes() {
    return fuelTypes;
  }


  @JsonProperty(JSON_PROPERTY_FUEL_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFuelTypes(List<String> fuelTypes) {
    this.fuelTypes = fuelTypes;
  }


  public Vehicle emissionStandards(List<EmissionStandard> emissionStandards) {
    this.emissionStandards = emissionStandards;
    return this;
  }

  public Vehicle addEmissionStandardsItem(EmissionStandard emissionStandardsItem) {
    if (this.emissionStandards == null) {
      this.emissionStandards = new ArrayList<>();
    }
    this.emissionStandards.add(emissionStandardsItem);
    return this;
  }

   /**
   * Get emissionStandards
   * @return emissionStandards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMISSION_STANDARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EmissionStandard> getEmissionStandards() {
    return emissionStandards;
  }


  @JsonProperty(JSON_PROPERTY_EMISSION_STANDARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmissionStandards(List<EmissionStandard> emissionStandards) {
    this.emissionStandards = emissionStandards;
  }


  public Vehicle vehicleAttributes(Map<String, Object> vehicleAttributes) {
    this.vehicleAttributes = vehicleAttributes;
    return this;
  }

  public Vehicle putVehicleAttributesItem(String key, Object vehicleAttributesItem) {
    if (this.vehicleAttributes == null) {
      this.vehicleAttributes = new HashMap<>();
    }
    this.vehicleAttributes.put(key, vehicleAttributesItem);
    return this;
  }

   /**
   * Additional attributes that describe this vehicle. For example: min_total_weight, max_total_weight
   * @return vehicleAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"max_total_weight\":\"3500\"}", value = "Additional attributes that describe this vehicle. For example: min_total_weight, max_total_weight")
  @JsonProperty(JSON_PROPERTY_VEHICLE_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getVehicleAttributes() {
    return vehicleAttributes;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLE_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setVehicleAttributes(Map<String, Object> vehicleAttributes) {
    this.vehicleAttributes = vehicleAttributes;
  }


  /**
   * Return true if this Vehicle object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.vehicleCategory, vehicle.vehicleCategory) &&
        Objects.equals(this.timeRestrictions, vehicle.timeRestrictions) &&
        Objects.equals(this.fuelTypes, vehicle.fuelTypes) &&
        Objects.equals(this.emissionStandards, vehicle.emissionStandards) &&
        Objects.equals(this.vehicleAttributes, vehicle.vehicleAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleCategory, timeRestrictions, fuelTypes, emissionStandards, vehicleAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    sb.append("    vehicleCategory: ").append(toIndentedString(vehicleCategory)).append("\n");
    sb.append("    timeRestrictions: ").append(toIndentedString(timeRestrictions)).append("\n");
    sb.append("    fuelTypes: ").append(toIndentedString(fuelTypes)).append("\n");
    sb.append("    emissionStandards: ").append(toIndentedString(emissionStandards)).append("\n");
    sb.append("    vehicleAttributes: ").append(toIndentedString(vehicleAttributes)).append("\n");
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

