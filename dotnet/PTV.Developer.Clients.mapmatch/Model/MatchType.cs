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
    /// Gives information on the result of this match, i.e. whether the position was matched successfully or whether the position is considered as part of the track or not.    * &#x60;MATCH_SUCCESSFUL&#x60; - The position was matched successfully.    * &#x60;MATCH_FAILED&#x60; - The position could not be matched.    * &#x60;NOT_CONSIDERED&#x60; - The position was not considered.
    /// </summary>
    /// <value>Gives information on the result of this match, i.e. whether the position was matched successfully or whether the position is considered as part of the track or not.    * &#x60;MATCH_SUCCESSFUL&#x60; - The position was matched successfully.    * &#x60;MATCH_FAILED&#x60; - The position could not be matched.    * &#x60;NOT_CONSIDERED&#x60; - The position was not considered.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum MatchType
    {
        /// <summary>
        /// Enum MATCH_SUCCESSFUL for value: MATCH_SUCCESSFUL
        /// </summary>
        [EnumMember(Value = "MATCH_SUCCESSFUL")]
        MATCH_SUCCESSFUL = 1,

        /// <summary>
        /// Enum MATCH_FAILED for value: MATCH_FAILED
        /// </summary>
        [EnumMember(Value = "MATCH_FAILED")]
        MATCH_FAILED = 2,

        /// <summary>
        /// Enum NOT_CONSIDERED for value: NOT_CONSIDERED
        /// </summary>
        [EnumMember(Value = "NOT_CONSIDERED")]
        NOT_CONSIDERED = 3

    }

}
