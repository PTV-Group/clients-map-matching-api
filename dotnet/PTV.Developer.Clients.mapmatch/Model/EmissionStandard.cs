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
    /// The emission standard of the vehicle valid in the European Union.
    /// </summary>
    /// <value>The emission standard of the vehicle valid in the European Union.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum EmissionStandard
    {
        /// <summary>
        /// Enum NONE for value: NONE
        /// </summary>
        [EnumMember(Value = "NONE")]
        NONE = 1,

        /// <summary>
        /// Enum EURO_0 for value: EURO_0
        /// </summary>
        [EnumMember(Value = "EURO_0")]
        EURO_0 = 2,

        /// <summary>
        /// Enum EURO_1 for value: EURO_1
        /// </summary>
        [EnumMember(Value = "EURO_1")]
        EURO_1 = 3,

        /// <summary>
        /// Enum EURO_2 for value: EURO_2
        /// </summary>
        [EnumMember(Value = "EURO_2")]
        EURO_2 = 4,

        /// <summary>
        /// Enum EURO_3 for value: EURO_3
        /// </summary>
        [EnumMember(Value = "EURO_3")]
        EURO_3 = 5,

        /// <summary>
        /// Enum EURO_4 for value: EURO_4
        /// </summary>
        [EnumMember(Value = "EURO_4")]
        EURO_4 = 6,

        /// <summary>
        /// Enum EURO_5 for value: EURO_5
        /// </summary>
        [EnumMember(Value = "EURO_5")]
        EURO_5 = 7,

        /// <summary>
        /// Enum EURO_EEV for value: EURO_EEV
        /// </summary>
        [EnumMember(Value = "EURO_EEV")]
        EURO_EEV = 8,

        /// <summary>
        /// Enum EURO_6 for value: EURO_6
        /// </summary>
        [EnumMember(Value = "EURO_6")]
        EURO_6 = 9,

        /// <summary>
        /// Enum EURO_6C for value: EURO_6C
        /// </summary>
        [EnumMember(Value = "EURO_6C")]
        EURO_6C = 10,

        /// <summary>
        /// Enum EURO_6D_TEMP for value: EURO_6D_TEMP
        /// </summary>
        [EnumMember(Value = "EURO_6D_TEMP")]
        EURO_6D_TEMP = 11,

        /// <summary>
        /// Enum EURO_6D for value: EURO_6D
        /// </summary>
        [EnumMember(Value = "EURO_6D")]
        EURO_6D = 12,

        /// <summary>
        /// Enum EURO_6E for value: EURO_6E
        /// </summary>
        [EnumMember(Value = "EURO_6E")]
        EURO_6E = 13,

        /// <summary>
        /// Enum EURO_7 for value: EURO_7
        /// </summary>
        [EnumMember(Value = "EURO_7")]
        EURO_7 = 14
    }

}
