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
    MatchType,
    MatchTypeFromJSON,
    MatchTypeFromJSONTyped,
    MatchTypeToJSON,
} from './MatchType';
import {
    SegmentAttributes,
    SegmentAttributesFromJSON,
    SegmentAttributesFromJSONTyped,
    SegmentAttributesToJSON,
} from './SegmentAttributes';

/**
 * Detailed information about a position on a track matched on a map.
 * @export
 * @interface MatchedTrackPosition
 */
export interface MatchedTrackPosition {
    /**
     * 
     * @type {MatchType}
     * @memberof MatchedTrackPosition
     */
    matchType: MatchType;
    /**
     * The travel distance [m] from the previous position. It is available only if MatchedTrackPosition.matchType is MATCH\_SUCCESSFUL.
     * @type {number}
     * @memberof MatchedTrackPosition
     */
    distanceFromPreviousMatch?: number | null;
    /**
     * The latitude value in degrees (WGS84/EPSG:4326) from south to north. This refers to the coordinates on the segment to which the input position matches. It is available only if MatchedTrackPosition.matchType is MATCH\_SUCCESSFUL.
     * @type {number}
     * @memberof MatchedTrackPosition
     */
    latitude?: number | null;
    /**
     * The longitude value in degrees (WGS84/EPSG:4326) from west to east. This refers to the coordinates on the segment to which the input position matches. It is available only if MatchedTrackPosition.matchType is MATCH\_SUCCESSFUL.
     * @type {number}
     * @memberof MatchedTrackPosition
     */
    longitude?: number | null;
    /**
     * The geometry of the matched segment as a GeoJSON representation. Coordinates are always present in WGS84 (EPSG:4326). It is available only if MatchedTrackPosition.matchType is MATCH\_SUCCESSFUL.
     * @type {string}
     * @memberof MatchedTrackPosition
     */
    segmentGeometry?: string | null;
    /**
     * The straight-line distance (Euclidean distance) [m] from the input position to the matching segment. It is available only if MatchedTrackPosition.matchType is MATCH\_SUCCESSFUL.
     * @type {number}
     * @memberof MatchedTrackPosition
     */
    matchDistance?: number | null;
    /**
     * The difference in degrees \[°\] between the angle of the heading of the input position and the angle of the matching segment. This difference is always smaller than the straight angle.  It is available only if MatchedTrackPosition.matchType is MATCH\_SUCCESSFUL.
     * @type {number}
     * @memberof MatchedTrackPosition
     */
    angleDifference?: number | null;
    /**
     * 
     * @type {SegmentAttributes}
     * @memberof MatchedTrackPosition
     */
    segmentAttributes?: SegmentAttributes;
}

export function MatchedTrackPositionFromJSON(json: any): MatchedTrackPosition {
    return MatchedTrackPositionFromJSONTyped(json, false);
}

export function MatchedTrackPositionFromJSONTyped(json: any, ignoreDiscriminator: boolean): MatchedTrackPosition {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'matchType': MatchTypeFromJSON(json['matchType']),
        'distanceFromPreviousMatch': !exists(json, 'distanceFromPreviousMatch') ? undefined : json['distanceFromPreviousMatch'],
        'latitude': !exists(json, 'latitude') ? undefined : json['latitude'],
        'longitude': !exists(json, 'longitude') ? undefined : json['longitude'],
        'segmentGeometry': !exists(json, 'segmentGeometry') ? undefined : json['segmentGeometry'],
        'matchDistance': !exists(json, 'matchDistance') ? undefined : json['matchDistance'],
        'angleDifference': !exists(json, 'angleDifference') ? undefined : json['angleDifference'],
        'segmentAttributes': !exists(json, 'segmentAttributes') ? undefined : SegmentAttributesFromJSON(json['segmentAttributes']),
    };
}

export function MatchedTrackPositionToJSON(value?: MatchedTrackPosition | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'matchType': MatchTypeToJSON(value.matchType),
        'distanceFromPreviousMatch': value.distanceFromPreviousMatch,
        'latitude': value.latitude,
        'longitude': value.longitude,
        'segmentGeometry': value.segmentGeometry,
        'matchDistance': value.matchDistance,
        'angleDifference': value.angleDifference,
        'segmentAttributes': SegmentAttributesToJSON(value.segmentAttributes),
    };
}

