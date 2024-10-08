/* tslint:disable */
/* eslint-disable */
/**
 * Map Matching
 * With the Map Matching service you can assign GPS positions to road segments on a digital map.
 *
 * The version of the OpenAPI document: 1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * Describes the location of a segment. Not all descriptors are available for all segments.
 * @export
 * @interface SegmentLocationDescriptors
 */
export interface SegmentLocationDescriptors {
    /**
     * The country in which the segment is located.
     * @type {string}
     * @memberof SegmentLocationDescriptors
     */
    countryName?: string | null;
    /**
     * The city to which the segment belongs.
     * @type {string}
     * @memberof SegmentLocationDescriptors
     */
    city?: string | null;
    /**
     * The postal code of the city to which the segment belongs to.
     * @type {string}
     * @memberof SegmentLocationDescriptors
     */
    postalCode?: string | null;
    /**
     * The name or number of the road to which the segment belongs. The string may consist of several number entries divided by "/".
     * @type {string}
     * @memberof SegmentLocationDescriptors
     */
    street?: string | null;
}

export function SegmentLocationDescriptorsFromJSON(json: any): SegmentLocationDescriptors {
    return SegmentLocationDescriptorsFromJSONTyped(json, false);
}

export function SegmentLocationDescriptorsFromJSONTyped(json: any, ignoreDiscriminator: boolean): SegmentLocationDescriptors {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'countryName': !exists(json, 'countryName') ? undefined : json['countryName'],
        'city': !exists(json, 'city') ? undefined : json['city'],
        'postalCode': !exists(json, 'postalCode') ? undefined : json['postalCode'],
        'street': !exists(json, 'street') ? undefined : json['street'],
    };
}

export function SegmentLocationDescriptorsToJSON(value?: SegmentLocationDescriptors | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'countryName': value.countryName,
        'city': value.city,
        'postalCode': value.postalCode,
        'street': value.street,
    };
}

