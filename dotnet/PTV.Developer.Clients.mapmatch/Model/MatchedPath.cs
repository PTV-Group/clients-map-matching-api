/*
 * Map Matching
 *
 * With the Map Matching service you can assign GPS positions to road segments on a digital map.
 *
 * The version of the OpenAPI document: 1.3
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
    /// Detailed information about a continuous part of a matched track.
    /// </summary>
    [DataContract(Name = "MatchedPath")]
    public partial class MatchedPath : IEquatable<MatchedPath>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MatchedPath" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MatchedPath() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MatchedPath" /> class.
        /// </summary>
        /// <param name="distance">The distance [m] of the complete matched path. (required).</param>
        /// <param name="startTrackPositionIndex">The index in the list of trackPositions of the start position of this path. It is available only if the list of trackPositions is requested by MatchedTrackResults.TRACK_POSITIONS..</param>
        /// <param name="endTrackPositionIndex">The index in the list of trackPositions of the end position of this path. It is available only if the list of trackPositions is requested by MatchedTrackResults.TRACK_POSITIONS..</param>
        /// <param name="routeId">The ID of the route for this path. It is available only if it is requested by MatchedTrackResults.ROUTE_ID. This route ID can be used as an input paramater in a calculateRoute request at the Routing API..</param>
        public MatchedPath(int distance = default(int), int startTrackPositionIndex = default(int), int endTrackPositionIndex = default(int), Guid routeId = default(Guid))
        {
            this.Distance = distance;
            this.StartTrackPositionIndex = startTrackPositionIndex;
            this.EndTrackPositionIndex = endTrackPositionIndex;
            this.RouteId = routeId;
        }

        /// <summary>
        /// The distance [m] of the complete matched path.
        /// </summary>
        /// <value>The distance [m] of the complete matched path.</value>
        [DataMember(Name = "distance", IsRequired = true, EmitDefaultValue = false)]
        public int Distance { get; set; }

        /// <summary>
        /// The index in the list of trackPositions of the start position of this path. It is available only if the list of trackPositions is requested by MatchedTrackResults.TRACK_POSITIONS.
        /// </summary>
        /// <value>The index in the list of trackPositions of the start position of this path. It is available only if the list of trackPositions is requested by MatchedTrackResults.TRACK_POSITIONS.</value>
        [DataMember(Name = "startTrackPositionIndex", EmitDefaultValue = false)]
        public int StartTrackPositionIndex { get; set; }

        /// <summary>
        /// The index in the list of trackPositions of the end position of this path. It is available only if the list of trackPositions is requested by MatchedTrackResults.TRACK_POSITIONS.
        /// </summary>
        /// <value>The index in the list of trackPositions of the end position of this path. It is available only if the list of trackPositions is requested by MatchedTrackResults.TRACK_POSITIONS.</value>
        [DataMember(Name = "endTrackPositionIndex", EmitDefaultValue = false)]
        public int EndTrackPositionIndex { get; set; }

        /// <summary>
        /// The ID of the route for this path. It is available only if it is requested by MatchedTrackResults.ROUTE_ID. This route ID can be used as an input paramater in a calculateRoute request at the Routing API.
        /// </summary>
        /// <value>The ID of the route for this path. It is available only if it is requested by MatchedTrackResults.ROUTE_ID. This route ID can be used as an input paramater in a calculateRoute request at the Routing API.</value>
        [DataMember(Name = "routeId", EmitDefaultValue = false)]
        public Guid RouteId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MatchedPath {\n");
            sb.Append("  Distance: ").Append(Distance).Append("\n");
            sb.Append("  StartTrackPositionIndex: ").Append(StartTrackPositionIndex).Append("\n");
            sb.Append("  EndTrackPositionIndex: ").Append(EndTrackPositionIndex).Append("\n");
            sb.Append("  RouteId: ").Append(RouteId).Append("\n");
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
            return this.Equals(input as MatchedPath);
        }

        /// <summary>
        /// Returns true if MatchedPath instances are equal
        /// </summary>
        /// <param name="input">Instance of MatchedPath to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MatchedPath input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Distance == input.Distance ||
                    this.Distance.Equals(input.Distance)
                ) && 
                (
                    this.StartTrackPositionIndex == input.StartTrackPositionIndex ||
                    this.StartTrackPositionIndex.Equals(input.StartTrackPositionIndex)
                ) && 
                (
                    this.EndTrackPositionIndex == input.EndTrackPositionIndex ||
                    this.EndTrackPositionIndex.Equals(input.EndTrackPositionIndex)
                ) && 
                (
                    this.RouteId == input.RouteId ||
                    (this.RouteId != null &&
                    this.RouteId.Equals(input.RouteId))
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
                hashCode = (hashCode * 59) + this.Distance.GetHashCode();
                hashCode = (hashCode * 59) + this.StartTrackPositionIndex.GetHashCode();
                hashCode = (hashCode * 59) + this.EndTrackPositionIndex.GetHashCode();
                if (this.RouteId != null)
                {
                    hashCode = (hashCode * 59) + this.RouteId.GetHashCode();
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
            // Distance (int) minimum
            if (this.Distance < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Distance, must be a value greater than or equal to 0.", new [] { "Distance" });
            }

            // StartTrackPositionIndex (int) minimum
            if (this.StartTrackPositionIndex < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for StartTrackPositionIndex, must be a value greater than or equal to 0.", new [] { "StartTrackPositionIndex" });
            }

            // EndTrackPositionIndex (int) minimum
            if (this.EndTrackPositionIndex < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for EndTrackPositionIndex, must be a value greater than or equal to 0.", new [] { "EndTrackPositionIndex" });
            }

            yield break;
        }
    }

}
