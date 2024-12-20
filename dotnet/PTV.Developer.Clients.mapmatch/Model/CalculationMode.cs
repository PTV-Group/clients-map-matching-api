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
    /// Enumeration to define the calculation behavior of the matching, i.e. if the focus of calculation is on performance, quality or both.    * &#x60;PERFORMANCE&#x60; - The matching focuses on performance. This means to take into account a higher number of failed matches and in the case of track matching that the matched track may be split into several paths.    * &#x60;STANDARD&#x60; - The matching chooses a standard trade-off between quality and performance.    * &#x60;QUALITY&#x60; - The matching focuses on high solution quality. This means that as many as possible of the input positions are matched and taken into account. Though the processing time of the request can be high.
    /// </summary>
    /// <value>Enumeration to define the calculation behavior of the matching, i.e. if the focus of calculation is on performance, quality or both.    * &#x60;PERFORMANCE&#x60; - The matching focuses on performance. This means to take into account a higher number of failed matches and in the case of track matching that the matched track may be split into several paths.    * &#x60;STANDARD&#x60; - The matching chooses a standard trade-off between quality and performance.    * &#x60;QUALITY&#x60; - The matching focuses on high solution quality. This means that as many as possible of the input positions are matched and taken into account. Though the processing time of the request can be high.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CalculationMode
    {
        /// <summary>
        /// Enum PERFORMANCE for value: PERFORMANCE
        /// </summary>
        [EnumMember(Value = "PERFORMANCE")]
        PERFORMANCE = 1,

        /// <summary>
        /// Enum STANDARD for value: STANDARD
        /// </summary>
        [EnumMember(Value = "STANDARD")]
        STANDARD = 2,

        /// <summary>
        /// Enum QUALITY for value: QUALITY
        /// </summary>
        [EnumMember(Value = "QUALITY")]
        QUALITY = 3
    }

}
