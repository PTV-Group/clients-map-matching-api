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

import { exists, mapValues } from '../runtime';
import {
    SegmentAttributes,
    SegmentAttributesFromJSON,
    SegmentAttributesFromJSONTyped,
    SegmentAttributesToJSON,
} from './SegmentAttributes';
import {
    SegmentLocationDescriptors,
    SegmentLocationDescriptorsFromJSON,
    SegmentLocationDescriptorsFromJSONTyped,
    SegmentLocationDescriptorsToJSON,
} from './SegmentLocationDescriptors';
import {
    Warning,
    WarningFromJSON,
    WarningFromJSONTyped,
    WarningToJSON,
} from './Warning';

/**
 * Represents the successful match of a position on the map including the matched segment and the deviation to the input position. For unsuccessful matches an empty object is returned.
 * @export
 * @interface MatchedPosition
 */
export interface MatchedPosition {
    /**
     * The latitude value in degrees (WGS84/EPSG:4326) from south to north. This refers to the coordinates on the segment to which the input position matches.
     * @type {number}
     * @memberof MatchedPosition
     */
    latitude?: number | null;
    /**
     * The longitude value in degrees (WGS84/EPSG:4326) from west to east. This refers to the coordinates on the segment to which the input position matches.
     * @type {number}
     * @memberof MatchedPosition
     */
    longitude?: number | null;
    /**
     * The geometry of the matched segment as a GeoJSON representation. Coordinates are always present in WGS84 (EPSG:4326).
     * @type {string}
     * @memberof MatchedPosition
     */
    segmentGeometry?: string | null;
    /**
     * The straight-line distance (Euclidean distance) [m] from the input position to the matching segment.
     * @type {number}
     * @memberof MatchedPosition
     */
    matchDistance?: number | null;
    /**
     * The difference in degrees \[°\] between the angle of the travel direction and the angle of the matching segment. This value is always smaller than the straight angle.
     * @type {number}
     * @memberof MatchedPosition
     */
    angleDifference?: number | null;
    /**
     * 
     * @type {SegmentLocationDescriptors}
     * @memberof MatchedPosition
     */
    segmentLocationDescriptors?: SegmentLocationDescriptors;
    /**
     * 
     * @type {SegmentAttributes}
     * @memberof MatchedPosition
     */
    segmentAttributes?: SegmentAttributes;
    /**
     * A list of warnings concerning the validity of the result.
     * @type {Array<Warning>}
     * @memberof MatchedPosition
     */
    warnings?: Array<Warning>;
}

export function MatchedPositionFromJSON(json: any): MatchedPosition {
    return MatchedPositionFromJSONTyped(json, false);
}

export function MatchedPositionFromJSONTyped(json: any, ignoreDiscriminator: boolean): MatchedPosition {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'latitude': !exists(json, 'latitude') ? undefined : json['latitude'],
        'longitude': !exists(json, 'longitude') ? undefined : json['longitude'],
        'segmentGeometry': !exists(json, 'segmentGeometry') ? undefined : json['segmentGeometry'],
        'matchDistance': !exists(json, 'matchDistance') ? undefined : json['matchDistance'],
        'angleDifference': !exists(json, 'angleDifference') ? undefined : json['angleDifference'],
        'segmentLocationDescriptors': !exists(json, 'segmentLocationDescriptors') ? undefined : SegmentLocationDescriptorsFromJSON(json['segmentLocationDescriptors']),
        'segmentAttributes': !exists(json, 'segmentAttributes') ? undefined : SegmentAttributesFromJSON(json['segmentAttributes']),
        'warnings': !exists(json, 'warnings') ? undefined : ((json['warnings'] as Array<any>).map(WarningFromJSON)),
    };
}

export function MatchedPositionToJSON(value?: MatchedPosition | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'latitude': value.latitude,
        'longitude': value.longitude,
        'segmentGeometry': value.segmentGeometry,
        'matchDistance': value.matchDistance,
        'angleDifference': value.angleDifference,
        'segmentLocationDescriptors': SegmentLocationDescriptorsToJSON(value.segmentLocationDescriptors),
        'segmentAttributes': SegmentAttributesToJSON(value.segmentAttributes),
        'warnings': value.warnings === undefined ? undefined : ((value.warnings as Array<any>).map(WarningToJSON)),
    };
}

