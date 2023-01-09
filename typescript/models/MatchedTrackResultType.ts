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
 * Select properties for the MatchedTrack.  
 *  * `PATHS` - The MatchedTrack will contain the paths.  
 *  * `GEOMETRY` - The MatchedTrack will contain the geometry.  
 *  * `TRACK_POSITIONS` - The MatchedTrack will contain the track positions.  
 *  * `ROUTE_ID` - The MatchedTrack will contain the route ID for each path. PATHS will automatically be included.  
 *  * `SEGMENT_ATTRIBUTES` - The MatchedTrack will contain segment attributes for the track positions.  TRACK_POSITIONS will automatically be included.
 * @export
 * @enum {string}
 */
export enum MatchedTrackResultType {
    PATHS = 'PATHS',
    GEOMETRY = 'GEOMETRY',
    TRACK_POSITIONS = 'TRACK_POSITIONS',
    ROUTE_ID = 'ROUTE_ID',
    SEGMENT_ATTRIBUTES = 'SEGMENT_ATTRIBUTES'
}

export function MatchedTrackResultTypeFromJSON(json: any): MatchedTrackResultType {
    return MatchedTrackResultTypeFromJSONTyped(json, false);
}

export function MatchedTrackResultTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): MatchedTrackResultType {
    return json as MatchedTrackResultType;
}

export function MatchedTrackResultTypeToJSON(value?: MatchedTrackResultType | null): any {
    return value as any;
}

