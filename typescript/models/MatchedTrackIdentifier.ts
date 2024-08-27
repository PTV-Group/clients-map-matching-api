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

export function MatchedTrackIdentifierFromJSON(json: any): MatchedTrackIdentifier {
    return MatchedTrackIdentifierFromJSONTyped(json, false);
}

export function MatchedTrackIdentifierFromJSONTyped(json: any, ignoreDiscriminator: boolean): MatchedTrackIdentifier {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
    };
}

export function MatchedTrackIdentifierToJSON(value?: MatchedTrackIdentifier | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
    };
}

