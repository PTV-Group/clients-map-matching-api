/* tslint:disable */
/* eslint-disable */
/**
 * Map Matching
 * With the Map Matching service you can assign GPS positions to road segments on a digital map.
 *
 * The version of the OpenAPI document: 1.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface MatchedTrackIdentifier
 */
export interface MatchedTrackIdentifier {
    /**
     * The ID of the MatchedTrack.
     * @type {string}
     * @memberof MatchedTrackIdentifier
     */
    id: string;
}

/**
 * Check if a given object implements the MatchedTrackIdentifier interface.
 */
export function instanceOfMatchedTrackIdentifier(value: object): value is MatchedTrackIdentifier {
    if (!('id' in value) || value['id'] === undefined) return false;
    return true;
}

export function MatchedTrackIdentifierFromJSON(json: any): MatchedTrackIdentifier {
    return MatchedTrackIdentifierFromJSONTyped(json, false);
}

export function MatchedTrackIdentifierFromJSONTyped(json: any, ignoreDiscriminator: boolean): MatchedTrackIdentifier {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
    };
}

export function MatchedTrackIdentifierToJSON(value?: MatchedTrackIdentifier | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
    };
}

