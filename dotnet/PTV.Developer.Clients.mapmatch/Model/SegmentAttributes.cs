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
    /// Describes the attributes of a segment. Not all attributes are available for all segments.
    /// </summary>
    [DataContract(Name = "SegmentAttributes")]
    public partial class SegmentAttributes : IEquatable<SegmentAttributes>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SegmentAttributes" /> class.
        /// </summary>
        /// <param name="bridge">Indicates that the segment is part of a bridge..</param>
        /// <param name="tunnel">Indicates that the segment is part of a tunnel..</param>
        /// <param name="ramp">Indicates that the segment is part of a ramp..</param>
        /// <param name="frontage">Indicates that the segment is part of a frontage road..</param>
        /// <param name="paved">Indicates that the segment is part of a road with a solid surface (made of concrete, asphalt, cobblestone etc.)..</param>
        /// <param name="requiresFourWheelDrive">Indicates that the segment is part of a road which is only suitable for vehicles with four-wheel drive..</param>
        /// <param name="privatelyManaged">Indicates that the segment is part of a road which is privately held or maintained..</param>
        /// <param name="publicAccess">Indicates that the segment is part of a road which is publicly accessible..</param>
        /// <param name="parkingLot">Indicates that the segment is part of a parking lot..</param>
        /// <param name="priorityRoad">Indicates that the segment is part of a road where all traffic has priority over the traffic on the incoming roads..</param>
        /// <param name="builtUpArea">Indicates that the segment is part of a road inside the built up area of a city..</param>
        /// <param name="speedLimit">The legal speed limit on the road to which this segment belongs [km/h]. Speed limits sometimes depend on the driving direction. If there is no direction specified by the heading parameter of the request then the smaller speed value of the two possible directions is provided..</param>
        public SegmentAttributes(bool? bridge = default(bool?), bool? tunnel = default(bool?), bool? ramp = default(bool?), bool? frontage = default(bool?), bool? paved = default(bool?), bool? requiresFourWheelDrive = default(bool?), bool? privatelyManaged = default(bool?), bool? publicAccess = default(bool?), bool? parkingLot = default(bool?), bool? priorityRoad = default(bool?), bool? builtUpArea = default(bool?), int? speedLimit = default(int?))
        {
            this.Bridge = bridge;
            this.Tunnel = tunnel;
            this.Ramp = ramp;
            this.Frontage = frontage;
            this.Paved = paved;
            this.RequiresFourWheelDrive = requiresFourWheelDrive;
            this.PrivatelyManaged = privatelyManaged;
            this.PublicAccess = publicAccess;
            this.ParkingLot = parkingLot;
            this.PriorityRoad = priorityRoad;
            this.BuiltUpArea = builtUpArea;
            this.SpeedLimit = speedLimit;
        }

        /// <summary>
        /// Indicates that the segment is part of a bridge.
        /// </summary>
        /// <value>Indicates that the segment is part of a bridge.</value>
        [DataMember(Name = "bridge", EmitDefaultValue = true)]
        public bool? Bridge { get; set; }

        /// <summary>
        /// Indicates that the segment is part of a tunnel.
        /// </summary>
        /// <value>Indicates that the segment is part of a tunnel.</value>
        [DataMember(Name = "tunnel", EmitDefaultValue = true)]
        public bool? Tunnel { get; set; }

        /// <summary>
        /// Indicates that the segment is part of a ramp.
        /// </summary>
        /// <value>Indicates that the segment is part of a ramp.</value>
        [DataMember(Name = "ramp", EmitDefaultValue = true)]
        public bool? Ramp { get; set; }

        /// <summary>
        /// Indicates that the segment is part of a frontage road.
        /// </summary>
        /// <value>Indicates that the segment is part of a frontage road.</value>
        [DataMember(Name = "frontage", EmitDefaultValue = true)]
        public bool? Frontage { get; set; }

        /// <summary>
        /// Indicates that the segment is part of a road with a solid surface (made of concrete, asphalt, cobblestone etc.).
        /// </summary>
        /// <value>Indicates that the segment is part of a road with a solid surface (made of concrete, asphalt, cobblestone etc.).</value>
        [DataMember(Name = "paved", EmitDefaultValue = true)]
        public bool? Paved { get; set; }

        /// <summary>
        /// Indicates that the segment is part of a road which is only suitable for vehicles with four-wheel drive.
        /// </summary>
        /// <value>Indicates that the segment is part of a road which is only suitable for vehicles with four-wheel drive.</value>
        [DataMember(Name = "requiresFourWheelDrive", EmitDefaultValue = true)]
        public bool? RequiresFourWheelDrive { get; set; }

        /// <summary>
        /// Indicates that the segment is part of a road which is privately held or maintained.
        /// </summary>
        /// <value>Indicates that the segment is part of a road which is privately held or maintained.</value>
        [DataMember(Name = "privatelyManaged", EmitDefaultValue = true)]
        public bool? PrivatelyManaged { get; set; }

        /// <summary>
        /// Indicates that the segment is part of a road which is publicly accessible.
        /// </summary>
        /// <value>Indicates that the segment is part of a road which is publicly accessible.</value>
        [DataMember(Name = "publicAccess", EmitDefaultValue = true)]
        public bool? PublicAccess { get; set; }

        /// <summary>
        /// Indicates that the segment is part of a parking lot.
        /// </summary>
        /// <value>Indicates that the segment is part of a parking lot.</value>
        [DataMember(Name = "parkingLot", EmitDefaultValue = true)]
        public bool? ParkingLot { get; set; }

        /// <summary>
        /// Indicates that the segment is part of a road where all traffic has priority over the traffic on the incoming roads.
        /// </summary>
        /// <value>Indicates that the segment is part of a road where all traffic has priority over the traffic on the incoming roads.</value>
        [DataMember(Name = "priorityRoad", EmitDefaultValue = true)]
        public bool? PriorityRoad { get; set; }

        /// <summary>
        /// Indicates that the segment is part of a road inside the built up area of a city.
        /// </summary>
        /// <value>Indicates that the segment is part of a road inside the built up area of a city.</value>
        [DataMember(Name = "builtUpArea", EmitDefaultValue = true)]
        public bool? BuiltUpArea { get; set; }

        /// <summary>
        /// The legal speed limit on the road to which this segment belongs [km/h]. Speed limits sometimes depend on the driving direction. If there is no direction specified by the heading parameter of the request then the smaller speed value of the two possible directions is provided.
        /// </summary>
        /// <value>The legal speed limit on the road to which this segment belongs [km/h]. Speed limits sometimes depend on the driving direction. If there is no direction specified by the heading parameter of the request then the smaller speed value of the two possible directions is provided.</value>
        [DataMember(Name = "speedLimit", EmitDefaultValue = true)]
        public int? SpeedLimit { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SegmentAttributes {\n");
            sb.Append("  Bridge: ").Append(Bridge).Append("\n");
            sb.Append("  Tunnel: ").Append(Tunnel).Append("\n");
            sb.Append("  Ramp: ").Append(Ramp).Append("\n");
            sb.Append("  Frontage: ").Append(Frontage).Append("\n");
            sb.Append("  Paved: ").Append(Paved).Append("\n");
            sb.Append("  RequiresFourWheelDrive: ").Append(RequiresFourWheelDrive).Append("\n");
            sb.Append("  PrivatelyManaged: ").Append(PrivatelyManaged).Append("\n");
            sb.Append("  PublicAccess: ").Append(PublicAccess).Append("\n");
            sb.Append("  ParkingLot: ").Append(ParkingLot).Append("\n");
            sb.Append("  PriorityRoad: ").Append(PriorityRoad).Append("\n");
            sb.Append("  BuiltUpArea: ").Append(BuiltUpArea).Append("\n");
            sb.Append("  SpeedLimit: ").Append(SpeedLimit).Append("\n");
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
            return this.Equals(input as SegmentAttributes);
        }

        /// <summary>
        /// Returns true if SegmentAttributes instances are equal
        /// </summary>
        /// <param name="input">Instance of SegmentAttributes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SegmentAttributes input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Bridge == input.Bridge ||
                    (this.Bridge != null &&
                    this.Bridge.Equals(input.Bridge))
                ) && 
                (
                    this.Tunnel == input.Tunnel ||
                    (this.Tunnel != null &&
                    this.Tunnel.Equals(input.Tunnel))
                ) && 
                (
                    this.Ramp == input.Ramp ||
                    (this.Ramp != null &&
                    this.Ramp.Equals(input.Ramp))
                ) && 
                (
                    this.Frontage == input.Frontage ||
                    (this.Frontage != null &&
                    this.Frontage.Equals(input.Frontage))
                ) && 
                (
                    this.Paved == input.Paved ||
                    (this.Paved != null &&
                    this.Paved.Equals(input.Paved))
                ) && 
                (
                    this.RequiresFourWheelDrive == input.RequiresFourWheelDrive ||
                    (this.RequiresFourWheelDrive != null &&
                    this.RequiresFourWheelDrive.Equals(input.RequiresFourWheelDrive))
                ) && 
                (
                    this.PrivatelyManaged == input.PrivatelyManaged ||
                    (this.PrivatelyManaged != null &&
                    this.PrivatelyManaged.Equals(input.PrivatelyManaged))
                ) && 
                (
                    this.PublicAccess == input.PublicAccess ||
                    (this.PublicAccess != null &&
                    this.PublicAccess.Equals(input.PublicAccess))
                ) && 
                (
                    this.ParkingLot == input.ParkingLot ||
                    (this.ParkingLot != null &&
                    this.ParkingLot.Equals(input.ParkingLot))
                ) && 
                (
                    this.PriorityRoad == input.PriorityRoad ||
                    (this.PriorityRoad != null &&
                    this.PriorityRoad.Equals(input.PriorityRoad))
                ) && 
                (
                    this.BuiltUpArea == input.BuiltUpArea ||
                    (this.BuiltUpArea != null &&
                    this.BuiltUpArea.Equals(input.BuiltUpArea))
                ) && 
                (
                    this.SpeedLimit == input.SpeedLimit ||
                    (this.SpeedLimit != null &&
                    this.SpeedLimit.Equals(input.SpeedLimit))
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
                if (this.Bridge != null)
                {
                    hashCode = (hashCode * 59) + this.Bridge.GetHashCode();
                }
                if (this.Tunnel != null)
                {
                    hashCode = (hashCode * 59) + this.Tunnel.GetHashCode();
                }
                if (this.Ramp != null)
                {
                    hashCode = (hashCode * 59) + this.Ramp.GetHashCode();
                }
                if (this.Frontage != null)
                {
                    hashCode = (hashCode * 59) + this.Frontage.GetHashCode();
                }
                if (this.Paved != null)
                {
                    hashCode = (hashCode * 59) + this.Paved.GetHashCode();
                }
                if (this.RequiresFourWheelDrive != null)
                {
                    hashCode = (hashCode * 59) + this.RequiresFourWheelDrive.GetHashCode();
                }
                if (this.PrivatelyManaged != null)
                {
                    hashCode = (hashCode * 59) + this.PrivatelyManaged.GetHashCode();
                }
                if (this.PublicAccess != null)
                {
                    hashCode = (hashCode * 59) + this.PublicAccess.GetHashCode();
                }
                if (this.ParkingLot != null)
                {
                    hashCode = (hashCode * 59) + this.ParkingLot.GetHashCode();
                }
                if (this.PriorityRoad != null)
                {
                    hashCode = (hashCode * 59) + this.PriorityRoad.GetHashCode();
                }
                if (this.BuiltUpArea != null)
                {
                    hashCode = (hashCode * 59) + this.BuiltUpArea.GetHashCode();
                }
                if (this.SpeedLimit != null)
                {
                    hashCode = (hashCode * 59) + this.SpeedLimit.GetHashCode();
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
