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
 * Gives information on the result of this match, i.e. whether the position was matched successfully or whether the position is considered as part of the track or not.  
 *  * `MATCH_SUCCESSFUL` - The position was matched successfully.  
 *  * `MATCH_FAILED` - The position could not be matched.  
 *  * `NOT_CONSIDERED` - The position was not considered.
 * @export
 * @enum {string}
 */
export enum MatchType {
    MATCH_SUCCESSFUL = 'MATCH_SUCCESSFUL',
    MATCH_FAILED = 'MATCH_FAILED',
    NOT_CONSIDERED = 'NOT_CONSIDERED'
}

export function MatchTypeFromJSON(json: any): MatchType {
    return MatchTypeFromJSONTyped(json, false);
}

export function MatchTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): MatchType {
    return json as MatchType;
}

export function MatchTypeToJSON(value?: MatchType | null): any {
    return value as any;
}

