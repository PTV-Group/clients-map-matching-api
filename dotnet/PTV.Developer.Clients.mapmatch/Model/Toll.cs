/*
 * Map Matching
 *
 * With the Map Matching service you can assign GPS positions to road segments on a digital map.
 *
 * The version of the OpenAPI document: 1.6
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
    /// Describes the toll properties of a road segment.
    /// </summary>
    [DataContract(Name = "Toll")]
    public partial class Toll : IEquatable<Toll>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Toll" /> class.
        /// </summary>
        /// <param name="vehicleCategories">List of all vehicle types for which a toll is due on a road section.   Available values are:  \&quot;ALL_VEHICLES\&quot;, \&quot;BUS\&quot;, \&quot;CAR\&quot;, \&quot;CARPOOL\&quot;, \&quot;DELIVERY_TRUCK\&quot;, \&quot;MOTORCYCLE\&quot;, \&quot;TAXI\&quot;, \&quot;THROUGH_TRAFFIC\&quot;, \&quot;TRUCK\&quot;, \&quot;PEDESTRIAN\&quot;, \&quot;EMERGENCY_VEHICLE\&quot;.   This list can be extended at any time, clients should handle unknown values properly..</param>
        public Toll(List<string> vehicleCategories = default(List<string>))
        {
            this.VehicleCategories = vehicleCategories;
        }

        /// <summary>
        /// List of all vehicle types for which a toll is due on a road section.   Available values are:  \&quot;ALL_VEHICLES\&quot;, \&quot;BUS\&quot;, \&quot;CAR\&quot;, \&quot;CARPOOL\&quot;, \&quot;DELIVERY_TRUCK\&quot;, \&quot;MOTORCYCLE\&quot;, \&quot;TAXI\&quot;, \&quot;THROUGH_TRAFFIC\&quot;, \&quot;TRUCK\&quot;, \&quot;PEDESTRIAN\&quot;, \&quot;EMERGENCY_VEHICLE\&quot;.   This list can be extended at any time, clients should handle unknown values properly.
        /// </summary>
        /// <value>List of all vehicle types for which a toll is due on a road section.   Available values are:  \&quot;ALL_VEHICLES\&quot;, \&quot;BUS\&quot;, \&quot;CAR\&quot;, \&quot;CARPOOL\&quot;, \&quot;DELIVERY_TRUCK\&quot;, \&quot;MOTORCYCLE\&quot;, \&quot;TAXI\&quot;, \&quot;THROUGH_TRAFFIC\&quot;, \&quot;TRUCK\&quot;, \&quot;PEDESTRIAN\&quot;, \&quot;EMERGENCY_VEHICLE\&quot;.   This list can be extended at any time, clients should handle unknown values properly.</value>
        [DataMember(Name = "vehicleCategories", EmitDefaultValue = false)]
        public List<string> VehicleCategories { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Toll {\n");
            sb.Append("  VehicleCategories: ").Append(VehicleCategories).Append("\n");
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
            return this.Equals(input as Toll);
        }

        /// <summary>
        /// Returns true if Toll instances are equal
        /// </summary>
        /// <param name="input">Instance of Toll to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Toll input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.VehicleCategories == input.VehicleCategories ||
                    this.VehicleCategories != null &&
                    input.VehicleCategories != null &&
                    this.VehicleCategories.SequenceEqual(input.VehicleCategories)
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
                if (this.VehicleCategories != null)
                {
                    hashCode = (hashCode * 59) + this.VehicleCategories.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
