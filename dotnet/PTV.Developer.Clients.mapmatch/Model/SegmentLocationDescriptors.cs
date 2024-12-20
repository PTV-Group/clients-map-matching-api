/*
 * Map Matching
 *
 * With the Map Matching service you can assign GPS positions to road segments on a digital map.
 *
 * The version of the OpenAPI document: 1.7
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.mapmatch.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.mapmatch.Model
{
    /// <summary>
    /// Describes the location of a segment. Not all descriptors are available for all segments.
    /// </summary>
    [DataContract(Name = "SegmentLocationDescriptors")]
    public partial class SegmentLocationDescriptors : IEquatable<SegmentLocationDescriptors>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SegmentLocationDescriptors" /> class.
        /// </summary>
        /// <param name="countryName">The country in which the segment is located..</param>
        /// <param name="city">The city to which the segment belongs..</param>
        /// <param name="postalCode">The postal code of the city to which the segment belongs to..</param>
        /// <param name="street">The name or number of the road to which the segment belongs. The string may consist of several number entries divided by \&quot;/\&quot;..</param>
        public SegmentLocationDescriptors(string countryName = default(string), string city = default(string), string postalCode = default(string), string street = default(string))
        {
            this.CountryName = countryName;
            this.City = city;
            this.PostalCode = postalCode;
            this.Street = street;
        }

        /// <summary>
        /// The country in which the segment is located.
        /// </summary>
        /// <value>The country in which the segment is located.</value>
        [DataMember(Name = "countryName", EmitDefaultValue = true)]
        public string CountryName { get; set; }

        /// <summary>
        /// The city to which the segment belongs.
        /// </summary>
        /// <value>The city to which the segment belongs.</value>
        [DataMember(Name = "city", EmitDefaultValue = true)]
        public string City { get; set; }

        /// <summary>
        /// The postal code of the city to which the segment belongs to.
        /// </summary>
        /// <value>The postal code of the city to which the segment belongs to.</value>
        [DataMember(Name = "postalCode", EmitDefaultValue = true)]
        public string PostalCode { get; set; }

        /// <summary>
        /// The name or number of the road to which the segment belongs. The string may consist of several number entries divided by \&quot;/\&quot;.
        /// </summary>
        /// <value>The name or number of the road to which the segment belongs. The string may consist of several number entries divided by \&quot;/\&quot;.</value>
        [DataMember(Name = "street", EmitDefaultValue = true)]
        public string Street { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SegmentLocationDescriptors {\n");
            sb.Append("  CountryName: ").Append(CountryName).Append("\n");
            sb.Append("  City: ").Append(City).Append("\n");
            sb.Append("  PostalCode: ").Append(PostalCode).Append("\n");
            sb.Append("  Street: ").Append(Street).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as SegmentLocationDescriptors);
        }

        /// <summary>
        /// Returns true if SegmentLocationDescriptors instances are equal
        /// </summary>
        /// <param name="input">Instance of SegmentLocationDescriptors to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SegmentLocationDescriptors input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.CountryName == input.CountryName ||
                    (this.CountryName != null &&
                    this.CountryName.Equals(input.CountryName))
                ) && 
                (
                    this.City == input.City ||
                    (this.City != null &&
                    this.City.Equals(input.City))
                ) && 
                (
                    this.PostalCode == input.PostalCode ||
                    (this.PostalCode != null &&
                    this.PostalCode.Equals(input.PostalCode))
                ) && 
                (
                    this.Street == input.Street ||
                    (this.Street != null &&
                    this.Street.Equals(input.Street))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.CountryName != null)
                {
                    hashCode = (hashCode * 59) + this.CountryName.GetHashCode();
                }
                if (this.City != null)
                {
                    hashCode = (hashCode * 59) + this.City.GetHashCode();
                }
                if (this.PostalCode != null)
                {
                    hashCode = (hashCode * 59) + this.PostalCode.GetHashCode();
                }
                if (this.Street != null)
                {
                    hashCode = (hashCode * 59) + this.Street.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
