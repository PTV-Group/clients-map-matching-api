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
    /// Select properties for the MatchedTrack.    * &#x60;PATHS&#x60; - The MatchedTrack will contain the paths.    * &#x60;GEOMETRY&#x60; - The MatchedTrack will contain the geometry.    * &#x60;TRACK_POSITIONS&#x60; - The MatchedTrack will contain the track positions.    * &#x60;ROUTE_ID&#x60; - The MatchedTrack will contain the route ID for each path. PATHS will automatically be included.    * &#x60;SEGMENT_ATTRIBUTES&#x60; - The MatchedTrack will contain segment attributes for the track positions.  TRACK_POSITIONS will automatically be included.
    /// </summary>
    /// <value>Select properties for the MatchedTrack.    * &#x60;PATHS&#x60; - The MatchedTrack will contain the paths.    * &#x60;GEOMETRY&#x60; - The MatchedTrack will contain the geometry.    * &#x60;TRACK_POSITIONS&#x60; - The MatchedTrack will contain the track positions.    * &#x60;ROUTE_ID&#x60; - The MatchedTrack will contain the route ID for each path. PATHS will automatically be included.    * &#x60;SEGMENT_ATTRIBUTES&#x60; - The MatchedTrack will contain segment attributes for the track positions.  TRACK_POSITIONS will automatically be included.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum MatchedTrackResultType
    {
        /// <summary>
        /// Enum PATHS for value: PATHS
        /// </summary>
        [EnumMember(Value = "PATHS")]
        PATHS = 1,

        /// <summary>
        /// Enum GEOMETRY for value: GEOMETRY
        /// </summary>
        [EnumMember(Value = "GEOMETRY")]
        GEOMETRY = 2,

        /// <summary>
        /// Enum TRACK_POSITIONS for value: TRACK_POSITIONS
        /// </summary>
        [EnumMember(Value = "TRACK_POSITIONS")]
        TRACK_POSITIONS = 3,

        /// <summary>
        /// Enum ROUTE_ID for value: ROUTE_ID
        /// </summary>
        [EnumMember(Value = "ROUTE_ID")]
        ROUTE_ID = 4,

        /// <summary>
        /// Enum SEGMENT_ATTRIBUTES for value: SEGMENT_ATTRIBUTES
        /// </summary>
        [EnumMember(Value = "SEGMENT_ATTRIBUTES")]
        SEGMENT_ATTRIBUTES = 5
    }

}
