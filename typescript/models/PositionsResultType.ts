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

/**
 * 
 * @export
 * @enum {string}
 */
export enum PositionsResultType {
    GEOMETRY = 'GEOMETRY',
    SEGMENT_LOCATION_DESCRIPTORS = 'SEGMENT_LOCATION_DESCRIPTORS',
    SEGMENT_ATTRIBUTES = 'SEGMENT_ATTRIBUTES',
    LOW_EMISSION_ZONES = 'LOW_EMISSION_ZONES',
    TOLL = 'TOLL'
}

export function PositionsResultTypeFromJSON(json: any): PositionsResultType {
    return PositionsResultTypeFromJSONTyped(json, false);
}

export function PositionsResultTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): PositionsResultType {
    return json as PositionsResultType;
}

export function PositionsResultTypeToJSON(value?: PositionsResultType | null): any {
    return value as any;
}

