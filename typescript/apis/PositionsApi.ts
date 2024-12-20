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


import * as runtime from '../runtime';
import type {
  CalculationMode,
  ErrorResponse,
  MatchedPosition,
  PositionsResultType,
} from '../models/index';
import {
    CalculationModeFromJSON,
    CalculationModeToJSON,
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    MatchedPositionFromJSON,
    MatchedPositionToJSON,
    PositionsResultTypeFromJSON,
    PositionsResultTypeToJSON,
} from '../models/index';

export interface MatchPositionRequest {
    latitude: number;
    longitude: number;
    heading?: number;
    calculationMode?: CalculationMode;
    results?: Array<PositionsResultType>;
    language?: string;
}

/**
 * 
 */
export class PositionsApi extends runtime.BaseAPI {

    /**
     * Matches a single unrelated position on a map.
     */
    async matchPositionRaw(requestParameters: MatchPositionRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<MatchedPosition>> {
        if (requestParameters['latitude'] == null) {
            throw new runtime.RequiredError(
                'latitude',
                'Required parameter "latitude" was null or undefined when calling matchPosition().'
            );
        }

        if (requestParameters['longitude'] == null) {
            throw new runtime.RequiredError(
                'longitude',
                'Required parameter "longitude" was null or undefined when calling matchPosition().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['heading'] != null) {
            queryParameters['heading'] = requestParameters['heading'];
        }

        if (requestParameters['calculationMode'] != null) {
            queryParameters['calculationMode'] = requestParameters['calculationMode'];
        }

        if (requestParameters['results'] != null) {
            queryParameters['results'] = requestParameters['results']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['language'] != null) {
            queryParameters['language'] = requestParameters['language'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = await this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/positions/{latitude}/{longitude}`.replace(`{${"latitude"}}`, encodeURIComponent(String(requestParameters['latitude']))).replace(`{${"longitude"}}`, encodeURIComponent(String(requestParameters['longitude']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => MatchedPositionFromJSON(jsonValue));
    }

    /**
     * Matches a single unrelated position on a map.
     */
    async matchPosition(requestParameters: MatchPositionRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<MatchedPosition> {
        const response = await this.matchPositionRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
