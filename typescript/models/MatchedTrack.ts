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
import {
    MatchedPath,
    MatchedPathFromJSON,
    MatchedPathFromJSONTyped,
    MatchedPathToJSON,
} from './MatchedPath';
import {
    MatchedTrackPosition,
    MatchedTrackPositionFromJSON,
    MatchedTrackPositionFromJSONTyped,
    MatchedTrackPositionToJSON,
} from './MatchedTrackPosition';

/**
 * Contains the result of the matched track.
 * @export
 * @interface MatchedTrack
 */
export interface MatchedTrack {
    /**
     * The ID of the MatchedTrack.
     * @type {string}
     * @memberof MatchedTrack
     */
    id: string;
    /**
     * The distance [m] of the complete track. It is the sum of distances of all path distances.
     * @type {number}
     * @memberof MatchedTrack
     */
    distance: number;
    /**
     * 
     * @type {Array<MatchedPath>}
     * @memberof MatchedTrack
     */
    paths?: Array<MatchedPath>;
    /**
     * The geometry of the paths (collection of polylines) as a GeoJSON representation. Coordinates are always present in WGS84 (EPSG:4326).
     * @type {string}
     * @memberof MatchedTrack
     */
    geometry?: string;
    /**
     * 
     * @type {Array<MatchedTrackPosition>}
     * @memberof MatchedTrack
     */
    trackPositions?: Array<MatchedTrackPosition>;
}

export function MatchedTrackFromJSON(json: any): MatchedTrack {
    return MatchedTrackFromJSONTyped(json, false);
}

export function MatchedTrackFromJSONTyped(json: any, ignoreDiscriminator: boolean): MatchedTrack {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
        'distance': json['distance'],
        'paths': !exists(json, 'paths') ? undefined : ((json['paths'] as Array<any>).map(MatchedPathFromJSON)),
        'geometry': !exists(json, 'geometry') ? undefined : json['geometry'],
        'trackPositions': !exists(json, 'trackPositions') ? undefined : ((json['trackPositions'] as Array<any>).map(MatchedTrackPositionFromJSON)),
    };
}

export function MatchedTrackToJSON(value?: MatchedTrack | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'distance': value.distance,
        'paths': value.paths === undefined ? undefined : ((value.paths as Array<any>).map(MatchedPathToJSON)),
        'geometry': value.geometry,
        'trackPositions': value.trackPositions === undefined ? undefined : ((value.trackPositions as Array<any>).map(MatchedTrackPositionToJSON)),
    };
}

