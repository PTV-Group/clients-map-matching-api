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
import com.ptvgroup.developer.client.mapmatch.model.Vehicle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes the low emission zone properties of a segment.
 */
@ApiModel(description = "Describes the low emission zone properties of a segment.")
@JsonPropertyOrder({
  LowEmissionZoneDescriptors.JSON_PROPERTY_NAME,
  LowEmissionZoneDescriptors.JSON_PROPERTY_APPROVALS,
  LowEmissionZoneDescriptors.JSON_PROPERTY_VEHICLE_CATEGORIES,
  LowEmissionZoneDescriptors.JSON_PROPERTY_FUEL_TYPES,
  LowEmissionZoneDescriptors.JSON_PROPERTY_VEHICLES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T15:03:45.817708491Z[Etc/UTC]")
public class LowEmissionZoneDescriptors {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_APPROVALS = "approvals";
  private List<String> approvals = null;

  public static final String JSON_PROPERTY_VEHICLE_CATEGORIES = "vehicleCategories";
  private List<String> vehicleCategories = null;

  public static final String JSON_PROPERTY_FUEL_TYPES = "fuelTypes";
  private List<String> fuelTypes = null;

  public static final String JSON_PROPERTY_VEHICLES = "vehicles";
  private List<Vehicle> vehicles = null;

  public LowEmissionZoneDescriptors() { 
  }

  public LowEmissionZoneDescriptors name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the low emission zone.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Firenze Ecozona", value = "Name of the low emission zone.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public LowEmissionZoneDescriptors approvals(List<String> approvals) {
    this.approvals = approvals;
    return this;
  }

  public LowEmissionZoneDescriptors addApprovalsItem(String approvalsItem) {
    if (this.approvals == null) {
      this.approvals = new ArrayList<>();
    }
    this.approvals.add(approvalsItem);
    return this;
  }

   /**
   * List of all badges that are approved to enter the low emission zone. In difference to the Routing API it contains also badges for Mexico.   Available values are: \&quot;NONE\&quot;, \&quot;AT_EURO_1\&quot;, \&quot;AT_EURO_2\&quot;, \&quot;AT_EURO_3\&quot;, \&quot;AT_EURO_4\&quot;, \&quot;AT_EURO_5\&quot;, \&quot;AT_EURO_6\&quot;, \&quot;DE_GREEN\&quot;, \&quot;DE_YELLOW\&quot;, \&quot;DE_RED\&quot;, \&quot;DK_AUTHORIZED\&quot;, \&quot;ES_CAT_B\&quot;, \&quot;ES_CAT_C\&quot;, \&quot;ES_CAT_ECO\&quot;, \&quot;ES_CAT_ZERO\&quot;, \&quot;FR_CRITAIR_0\&quot;, \&quot;FR_CRITAIR_1\&quot;, \&quot;FR_CRITAIR_2\&quot;, \&quot;FR_CRITAIR_3\&quot;, \&quot;FR_CRITAIR_4\&quot;, \&quot;FR_CRITAIR_5\&quot;, \&quot;MX_HOLOGRAMA_0\&quot;, \&quot;MX_HOLOGRAMA_00\&quot;, \&quot;MX_HOLOGRAMA_1\&quot;, \&quot;MX_HOLOGRAMA_2\&quot;, \&quot;MX_HOLOGRAMA_EXEMPT\&quot;, \&quot;MX_HOLOGRAMA_FOREIGN\&quot;.   This list can be extended at any time, clients should handle unknown values properly.
   * @return approvals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all badges that are approved to enter the low emission zone. In difference to the Routing API it contains also badges for Mexico.   Available values are: \"NONE\", \"AT_EURO_1\", \"AT_EURO_2\", \"AT_EURO_3\", \"AT_EURO_4\", \"AT_EURO_5\", \"AT_EURO_6\", \"DE_GREEN\", \"DE_YELLOW\", \"DE_RED\", \"DK_AUTHORIZED\", \"ES_CAT_B\", \"ES_CAT_C\", \"ES_CAT_ECO\", \"ES_CAT_ZERO\", \"FR_CRITAIR_0\", \"FR_CRITAIR_1\", \"FR_CRITAIR_2\", \"FR_CRITAIR_3\", \"FR_CRITAIR_4\", \"FR_CRITAIR_5\", \"MX_HOLOGRAMA_0\", \"MX_HOLOGRAMA_00\", \"MX_HOLOGRAMA_1\", \"MX_HOLOGRAMA_2\", \"MX_HOLOGRAMA_EXEMPT\", \"MX_HOLOGRAMA_FOREIGN\".   This list can be extended at any time, clients should handle unknown values properly.")
  @JsonProperty(JSON_PROPERTY_APPROVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getApprovals() {
    return approvals;
  }


  @JsonProperty(JSON_PROPERTY_APPROVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovals(List<String> approvals) {
    this.approvals = approvals;
  }


  public LowEmissionZoneDescriptors vehicleCategories(List<String> vehicleCategories) {
    this.vehicleCategories = vehicleCategories;
    return this;
  }

  public LowEmissionZoneDescriptors addVehicleCategoriesItem(String vehicleCategoriesItem) {
    if (this.vehicleCategories == null) {
      this.vehicleCategories = new ArrayList<>();
    }
    this.vehicleCategories.add(vehicleCategoriesItem);
    return this;
  }

   /**
   * List of all possible vehicle categories that are restricted to enter the low emission zone.   Available values are:  \&quot;ALL_VEHICLES\&quot;, \&quot;BUS\&quot;, \&quot;CAR\&quot;, \&quot;CARPOOL\&quot;, \&quot;DELIVERY_TRUCK\&quot;, \&quot;MOTORCYCLE\&quot;, \&quot;TAXI\&quot;, \&quot;THROUGH_TRAFFIC\&quot;, \&quot;TRUCK\&quot;, \&quot;PEDESTRIAN\&quot;, \&quot;EMERGENCY_VEHICLE\&quot;.   This list can be extended at any time, clients should handle unknown values properly.
   * @return vehicleCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all possible vehicle categories that are restricted to enter the low emission zone.   Available values are:  \"ALL_VEHICLES\", \"BUS\", \"CAR\", \"CARPOOL\", \"DELIVERY_TRUCK\", \"MOTORCYCLE\", \"TAXI\", \"THROUGH_TRAFFIC\", \"TRUCK\", \"PEDESTRIAN\", \"EMERGENCY_VEHICLE\".   This list can be extended at any time, clients should handle unknown values properly.")
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


  public LowEmissionZoneDescriptors fuelTypes(List<String> fuelTypes) {
    this.fuelTypes = fuelTypes;
    return this;
  }

  public LowEmissionZoneDescriptors addFuelTypesItem(String fuelTypesItem) {
    if (this.fuelTypes == null) {
      this.fuelTypes = new ArrayList<>();
    }
    this.fuelTypes.add(fuelTypesItem);
    return this;
  }

   /**
   * List of all possible fuel types that are restricted to enter the low emission zone.   Available values are: \&quot;CNG_GASOLINE\&quot;, \&quot;COMPRESSED_NATURAL_GAS\&quot;, \&quot;DIESEL\&quot;, \&quot;ETHANOL\&quot;, \&quot;GASOLINE\&quot;, \&quot;LIQUEFIED_PETROLEUM_GAS\&quot;, \&quot;LIQUEFIED_NATURAL_GAS\&quot;, \&quot;LPG_GASOLINE\&quot;, \&quot;NONE\&quot;.   This list can be extended at any time, clients should handle unknown values properly.
   * @return fuelTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all possible fuel types that are restricted to enter the low emission zone.   Available values are: \"CNG_GASOLINE\", \"COMPRESSED_NATURAL_GAS\", \"DIESEL\", \"ETHANOL\", \"GASOLINE\", \"LIQUEFIED_PETROLEUM_GAS\", \"LIQUEFIED_NATURAL_GAS\", \"LPG_GASOLINE\", \"NONE\".   This list can be extended at any time, clients should handle unknown values properly.")
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


  public LowEmissionZoneDescriptors vehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public LowEmissionZoneDescriptors addVehiclesItem(Vehicle vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * List of more specific characteristics of the listed vehicle categories.
   * @return vehicles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of more specific characteristics of the listed vehicle categories.")
  @JsonProperty(JSON_PROPERTY_VEHICLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Vehicle> getVehicles() {
    return vehicles;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }


  /**
   * Return true if this LowEmissionZoneDescriptors object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LowEmissionZoneDescriptors lowEmissionZoneDescriptors = (LowEmissionZoneDescriptors) o;
    return Objects.equals(this.name, lowEmissionZoneDescriptors.name) &&
        Objects.equals(this.approvals, lowEmissionZoneDescriptors.approvals) &&
        Objects.equals(this.vehicleCategories, lowEmissionZoneDescriptors.vehicleCategories) &&
        Objects.equals(this.fuelTypes, lowEmissionZoneDescriptors.fuelTypes) &&
        Objects.equals(this.vehicles, lowEmissionZoneDescriptors.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, approvals, vehicleCategories, fuelTypes, vehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LowEmissionZoneDescriptors {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    approvals: ").append(toIndentedString(approvals)).append("\n");
    sb.append("    vehicleCategories: ").append(toIndentedString(vehicleCategories)).append("\n");
    sb.append("    fuelTypes: ").append(toIndentedString(fuelTypes)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
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

