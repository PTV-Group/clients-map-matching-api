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
    /// Detailed information about a position on a track matched on a map.
    /// </summary>
    [DataContract(Name = "MatchedTrackPosition")]
    public partial class MatchedTrackPosition : IEquatable<MatchedTrackPosition>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets MatchType
        /// </summary>
        [DataMember(Name = "matchType", IsRequired = true, EmitDefaultValue = false)]
        public MatchType MatchType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="MatchedTrackPosition" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MatchedTrackPosition() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MatchedTrackPosition" /> class.
        /// </summary>
        /// <param name="matchType">matchType (required).</param>
        /// <param name="distanceFromPreviousMatch">The travel distance [m] from the previous position. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL..</param>
        /// <param name="latitude">The latitude value in degrees (WGS84/EPSG:4326) from south to north. This refers to the coordinates on the segment to which the input position matches. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL..</param>
        /// <param name="longitude">The longitude value in degrees (WGS84/EPSG:4326) from west to east. This refers to the coordinates on the segment to which the input position matches. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL..</param>
        /// <param name="segmentGeometry">The geometry of the matched segment as a GeoJSON representation. Coordinates are always present in WGS84 (EPSG:4326). It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL..</param>
        /// <param name="matchDistance">The straight-line distance (Euclidean distance) [m] from the input position to the matching segment. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL..</param>
        /// <param name="angleDifference">The difference in degrees \\[°\\] between the angle of the heading of the input position and the angle of the matching segment. This difference is always smaller than the straight angle.  It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL..</param>
        /// <param name="segmentAttributes">segmentAttributes.</param>
        public MatchedTrackPosition(MatchType matchType = default(MatchType), int? distanceFromPreviousMatch = default(int?), double? latitude = default(double?), double? longitude = default(double?), string segmentGeometry = default(string), int? matchDistance = default(int?), double? angleDifference = default(double?), SegmentAttributes segmentAttributes = default(SegmentAttributes))
        {
            this.MatchType = matchType;
            this.DistanceFromPreviousMatch = distanceFromPreviousMatch;
            this.Latitude = latitude;
            this.Longitude = longitude;
            this.SegmentGeometry = segmentGeometry;
            this.MatchDistance = matchDistance;
            this.AngleDifference = angleDifference;
            this.SegmentAttributes = segmentAttributes;
        }

        /// <summary>
        /// The travel distance [m] from the previous position. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.
        /// </summary>
        /// <value>The travel distance [m] from the previous position. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.</value>
        [DataMember(Name = "distanceFromPreviousMatch", EmitDefaultValue = true)]
        public int? DistanceFromPreviousMatch { get; set; }

        /// <summary>
        /// The latitude value in degrees (WGS84/EPSG:4326) from south to north. This refers to the coordinates on the segment to which the input position matches. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.
        /// </summary>
        /// <value>The latitude value in degrees (WGS84/EPSG:4326) from south to north. This refers to the coordinates on the segment to which the input position matches. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.</value>
        [DataMember(Name = "latitude", EmitDefaultValue = true)]
        public double? Latitude { get; set; }

        /// <summary>
        /// The longitude value in degrees (WGS84/EPSG:4326) from west to east. This refers to the coordinates on the segment to which the input position matches. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.
        /// </summary>
        /// <value>The longitude value in degrees (WGS84/EPSG:4326) from west to east. This refers to the coordinates on the segment to which the input position matches. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.</value>
        [DataMember(Name = "longitude", EmitDefaultValue = true)]
        public double? Longitude { get; set; }

        /// <summary>
        /// The geometry of the matched segment as a GeoJSON representation. Coordinates are always present in WGS84 (EPSG:4326). It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.
        /// </summary>
        /// <value>The geometry of the matched segment as a GeoJSON representation. Coordinates are always present in WGS84 (EPSG:4326). It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.</value>
        [DataMember(Name = "segmentGeometry", EmitDefaultValue = true)]
        public string SegmentGeometry { get; set; }

        /// <summary>
        /// The straight-line distance (Euclidean distance) [m] from the input position to the matching segment. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.
        /// </summary>
        /// <value>The straight-line distance (Euclidean distance) [m] from the input position to the matching segment. It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.</value>
        [DataMember(Name = "matchDistance", EmitDefaultValue = true)]
        public int? MatchDistance { get; set; }

        /// <summary>
        /// The difference in degrees \\[°\\] between the angle of the heading of the input position and the angle of the matching segment. This difference is always smaller than the straight angle.  It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.
        /// </summary>
        /// <value>The difference in degrees \\[°\\] between the angle of the heading of the input position and the angle of the matching segment. This difference is always smaller than the straight angle.  It is available only if MatchedTrackPosition.matchType is MATCH\\_SUCCESSFUL.</value>
        [DataMember(Name = "angleDifference", EmitDefaultValue = true)]
        public double? AngleDifference { get; set; }

        /// <summary>
        /// Gets or Sets SegmentAttributes
        /// </summary>
        [DataMember(Name = "segmentAttributes", EmitDefaultValue = false)]
        public SegmentAttributes SegmentAttributes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MatchedTrackPosition {\n");
            sb.Append("  MatchType: ").Append(MatchType).Append("\n");
            sb.Append("  DistanceFromPreviousMatch: ").Append(DistanceFromPreviousMatch).Append("\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("  SegmentGeometry: ").Append(SegmentGeometry).Append("\n");
            sb.Append("  MatchDistance: ").Append(MatchDistance).Append("\n");
            sb.Append("  AngleDifference: ").Append(AngleDifference).Append("\n");
            sb.Append("  SegmentAttributes: ").Append(SegmentAttributes).Append("\n");
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
            return this.Equals(input as MatchedTrackPosition);
        }

        /// <summary>
        /// Returns true if MatchedTrackPosition instances are equal
        /// </summary>
        /// <param name="input">Instance of MatchedTrackPosition to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MatchedTrackPosition input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.MatchType == input.MatchType ||
                    this.MatchType.Equals(input.MatchType)
                ) && 
                (
                    this.DistanceFromPreviousMatch == input.DistanceFromPreviousMatch ||
                    (this.DistanceFromPreviousMatch != null &&
                    this.DistanceFromPreviousMatch.Equals(input.DistanceFromPreviousMatch))
                ) && 
                (
                    this.Latitude == input.Latitude ||
                    (this.Latitude != null &&
                    this.Latitude.Equals(input.Latitude))
                ) && 
                (
                    this.Longitude == input.Longitude ||
                    (this.Longitude != null &&
                    this.Longitude.Equals(input.Longitude))
                ) && 
                (
                    this.SegmentGeometry == input.SegmentGeometry ||
                    (this.SegmentGeometry != null &&
                    this.SegmentGeometry.Equals(input.SegmentGeometry))
                ) && 
                (
                    this.MatchDistance == input.MatchDistance ||
                    (this.MatchDistance != null &&
                    this.MatchDistance.Equals(input.MatchDistance))
                ) && 
                (
                    this.AngleDifference == input.AngleDifference ||
                    (this.AngleDifference != null &&
                    this.AngleDifference.Equals(input.AngleDifference))
                ) && 
                (
                    this.SegmentAttributes == input.SegmentAttributes ||
                    (this.SegmentAttributes != null &&
                    this.SegmentAttributes.Equals(input.SegmentAttributes))
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
                hashCode = (hashCode * 59) + this.MatchType.GetHashCode();
                if (this.DistanceFromPreviousMatch != null)
                {
                    hashCode = (hashCode * 59) + this.DistanceFromPreviousMatch.GetHashCode();
                }
                if (this.Latitude != null)
                {
                    hashCode = (hashCode * 59) + this.Latitude.GetHashCode();
                }
                if (this.Longitude != null)
                {
                    hashCode = (hashCode * 59) + this.Longitude.GetHashCode();
                }
                if (this.SegmentGeometry != null)
                {
                    hashCode = (hashCode * 59) + this.SegmentGeometry.GetHashCode();
                }
                if (this.MatchDistance != null)
                {
                    hashCode = (hashCode * 59) + this.MatchDistance.GetHashCode();
                }
                if (this.AngleDifference != null)
                {
                    hashCode = (hashCode * 59) + this.AngleDifference.GetHashCode();
                }
                if (this.SegmentAttributes != null)
                {
                    hashCode = (hashCode * 59) + this.SegmentAttributes.GetHashCode();
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
            // DistanceFromPreviousMatch (int?) minimum
            if (this.DistanceFromPreviousMatch < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DistanceFromPreviousMatch, must be a value greater than or equal to 0.", new [] { "DistanceFromPreviousMatch" });
            }

            // Latitude (double?) maximum
            if (this.Latitude > (double?)90)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Latitude, must be a value less than or equal to 90.", new [] { "Latitude" });
            }

            // Latitude (double?) minimum
            if (this.Latitude < (double?)-90)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Latitude, must be a value greater than or equal to -90.", new [] { "Latitude" });
            }

            // Longitude (double?) maximum
            if (this.Longitude > (double?)180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Longitude, must be a value less than or equal to 180.", new [] { "Longitude" });
            }

            // Longitude (double?) minimum
            if (this.Longitude < (double?)-180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Longitude, must be a value greater than or equal to -180.", new [] { "Longitude" });
            }

            // MatchDistance (int?) minimum
            if (this.MatchDistance < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MatchDistance, must be a value greater than or equal to 0.", new [] { "MatchDistance" });
            }

            // AngleDifference (double?) maximum
            if (this.AngleDifference > (double?)180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AngleDifference, must be a value less than or equal to 180.", new [] { "AngleDifference" });
            }

            // AngleDifference (double?) minimum
            if (this.AngleDifference < (double?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AngleDifference, must be a value greater than or equal to 0.", new [] { "AngleDifference" });
            }

            yield break;
        }
    }

}
