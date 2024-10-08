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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes the location of a segment. Not all descriptors are available for all segments.
 */
@ApiModel(description = "Describes the location of a segment. Not all descriptors are available for all segments.")
@JsonPropertyOrder({
  SegmentLocationDescriptors.JSON_PROPERTY_COUNTRY_NAME,
  SegmentLocationDescriptors.JSON_PROPERTY_CITY,
  SegmentLocationDescriptors.JSON_PROPERTY_POSTAL_CODE,
  SegmentLocationDescriptors.JSON_PROPERTY_STREET
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T15:03:45.817708491Z[Etc/UTC]")
public class SegmentLocationDescriptors {
  public static final String JSON_PROPERTY_COUNTRY_NAME = "countryName";
  private JsonNullable<String> countryName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CITY = "city";
  private JsonNullable<String> city = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private JsonNullable<String> postalCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STREET = "street";
  private JsonNullable<String> street = JsonNullable.<String>undefined();

  public SegmentLocationDescriptors() { 
  }

  public SegmentLocationDescriptors countryName(String countryName) {
    this.countryName = JsonNullable.<String>of(countryName);
    return this;
  }

   /**
   * The country in which the segment is located.
   * @return countryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country in which the segment is located.")
  @JsonIgnore

  public String getCountryName() {
        return countryName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCountryName_JsonNullable() {
    return countryName;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
  public void setCountryName_JsonNullable(JsonNullable<String> countryName) {
    this.countryName = countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = JsonNullable.<String>of(countryName);
  }


  public SegmentLocationDescriptors city(String city) {
    this.city = JsonNullable.<String>of(city);
    return this;
  }

   /**
   * The city to which the segment belongs.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city to which the segment belongs.")
  @JsonIgnore

  public String getCity() {
        return city.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCity_JsonNullable() {
    return city;
  }
  
  @JsonProperty(JSON_PROPERTY_CITY)
  public void setCity_JsonNullable(JsonNullable<String> city) {
    this.city = city;
  }

  public void setCity(String city) {
    this.city = JsonNullable.<String>of(city);
  }


  public SegmentLocationDescriptors postalCode(String postalCode) {
    this.postalCode = JsonNullable.<String>of(postalCode);
    return this;
  }

   /**
   * The postal code of the city to which the segment belongs to.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code of the city to which the segment belongs to.")
  @JsonIgnore

  public String getPostalCode() {
        return postalCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPostalCode_JsonNullable() {
    return postalCode;
  }
  
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  public void setPostalCode_JsonNullable(JsonNullable<String> postalCode) {
    this.postalCode = postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = JsonNullable.<String>of(postalCode);
  }


  public SegmentLocationDescriptors street(String street) {
    this.street = JsonNullable.<String>of(street);
    return this;
  }

   /**
   * The name or number of the road to which the segment belongs. The string may consist of several number entries divided by \&quot;/\&quot;.
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name or number of the road to which the segment belongs. The string may consist of several number entries divided by \"/\".")
  @JsonIgnore

  public String getStreet() {
        return street.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStreet_JsonNullable() {
    return street;
  }
  
  @JsonProperty(JSON_PROPERTY_STREET)
  public void setStreet_JsonNullable(JsonNullable<String> street) {
    this.street = street;
  }

  public void setStreet(String street) {
    this.street = JsonNullable.<String>of(street);
  }


  /**
   * Return true if this SegmentLocationDescriptors object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentLocationDescriptors segmentLocationDescriptors = (SegmentLocationDescriptors) o;
    return equalsNullable(this.countryName, segmentLocationDescriptors.countryName) &&
        equalsNullable(this.city, segmentLocationDescriptors.city) &&
        equalsNullable(this.postalCode, segmentLocationDescriptors.postalCode) &&
        equalsNullable(this.street, segmentLocationDescriptors.street);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(countryName), hashCodeNullable(city), hashCodeNullable(postalCode), hashCodeNullable(street));
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
    sb.append("class SegmentLocationDescriptors {\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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

