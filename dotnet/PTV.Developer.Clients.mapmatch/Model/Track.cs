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
    /// Contains positions to be matched as a track on a map.
    /// </summary>
    [DataContract(Name = "Track")]
    public partial class Track : IEquatable<Track>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Track" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Track() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Track" /> class.
        /// </summary>
        /// <param name="positions">positions (required).</param>
        public Track(List<TrackPosition> positions = default(List<TrackPosition>))
        {
            // to ensure "positions" is required (not null)
            if (positions == null)
            {
                throw new ArgumentNullException("positions is a required property for Track and cannot be null");
            }
            this.Positions = positions;
        }

        /// <summary>
        /// Gets or Sets Positions
        /// </summary>
        [DataMember(Name = "positions", IsRequired = true, EmitDefaultValue = true)]
        public List<TrackPosition> Positions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Track {\n");
            sb.Append("  Positions: ").Append(Positions).Append("\n");
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
            return this.Equals(input as Track);
        }

        /// <summary>
        /// Returns true if Track instances are equal
        /// </summary>
        /// <param name="input">Instance of Track to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Track input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Positions == input.Positions ||
                    this.Positions != null &&
                    input.Positions != null &&
                    this.Positions.SequenceEqual(input.Positions)
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
                if (this.Positions != null)
                {
                    hashCode = (hashCode * 59) + this.Positions.GetHashCode();
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
