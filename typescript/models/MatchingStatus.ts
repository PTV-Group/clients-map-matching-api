/* tslint:disable */
/* eslint-disable */
/**
 * Map Matching
 * With the Map Matching service you can assign GPS positions to road segments on a digital map.
 *
 * The version of the OpenAPI document: 1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * The current status of the matching calculation. 
 *  * `RUNNING` - The matching calculation is still running. 
 *  * `SUCCEEDED` - The matching calculation has completed successfully. 
 *  * `FAILED` - The matching calculation has completed with a failure.
 * @export
 * @enum {string}
 */
export enum MatchingStatus {
    RUNNING = 'RUNNING',
    SUCCEEDED = 'SUCCEEDED',
    FAILED = 'FAILED'
}

export function MatchingStatusFromJSON(json: any): MatchingStatus {
    return MatchingStatusFromJSONTyped(json, false);
}

export function MatchingStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): MatchingStatus {
    return json as MatchingStatus;
}

export function MatchingStatusToJSON(value?: MatchingStatus | null): any {
    return value as any;
}

