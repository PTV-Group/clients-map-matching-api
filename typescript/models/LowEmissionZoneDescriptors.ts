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
    Vehicle,
    VehicleFromJSON,
    VehicleFromJSONTyped,
    VehicleToJSON,
} from './Vehicle';

/**
 * Describes the low emission zone properties of a segment.
 * @export
 * @interface LowEmissionZoneDescriptors
 */
export interface LowEmissionZoneDescriptors {
    /**
     * Name of the low emission zone.
     * @type {string}
     * @memberof LowEmissionZoneDescriptors
     */
    name?: string;
    /**
     * List of all badges that are approved to enter the low emission zone. In difference to the Routing API it contains also badges for Mexico.  
     * Available values are: "NONE", "AT_EURO_1", "AT_EURO_2", "AT_EURO_3", "AT_EURO_4", "AT_EURO_5", "AT_EURO_6", "DE_GREEN", "DE_YELLOW", "DE_RED", "DK_AUTHORIZED", "ES_CAT_B", "ES_CAT_C", "ES_CAT_ECO", "ES_CAT_ZERO", "FR_CRITAIR_0", "FR_CRITAIR_1", "FR_CRITAIR_2", "FR_CRITAIR_3", "FR_CRITAIR_4", "FR_CRITAIR_5", "MX_HOLOGRAMA_0", "MX_HOLOGRAMA_00", "MX_HOLOGRAMA_1", "MX_HOLOGRAMA_2", "MX_HOLOGRAMA_EXEMPT", "MX_HOLOGRAMA_FOREIGN".  
     * This list can be extended at any time, clients should handle unknown values properly.
     * @type {Array<string>}
     * @memberof LowEmissionZoneDescriptors
     */
    approvals?: Array<string>;
    /**
     * List of all possible vehicle categories that are restricted to enter the low emission zone.  
     * Available values are:  "ALL_VEHICLES", "BUS", "CAR", "CARPOOL", "DELIVERY_TRUCK", "MOTORCYCLE", "TAXI", "THROUGH_TRAFFIC", "TRUCK", "PEDESTRIAN", "EMERGENCY_VEHICLE".  
     * This list can be extended at any time, clients should handle unknown values properly.
     * @type {Array<string>}
     * @memberof LowEmissionZoneDescriptors
     */
    vehicleCategories?: Array<string>;
    /**
     * List of all possible fuel types that are restricted to enter the low emission zone.  
     * Available values are: "CNG_GASOLINE", "COMPRESSED_NATURAL_GAS", "DIESEL", "ETHANOL", "GASOLINE", "LIQUEFIED_PETROLEUM_GAS", "LIQUEFIED_NATURAL_GAS", "LPG_GASOLINE", "NONE".  
     * This list can be extended at any time, clients should handle unknown values properly.
     * @type {Array<string>}
     * @memberof LowEmissionZoneDescriptors
     */
    fuelTypes?: Array<string>;
    /**
     * List of more specific characteristics of the listed vehicle categories.
     * @type {Array<Vehicle>}
     * @memberof LowEmissionZoneDescriptors
     */
    vehicles?: Array<Vehicle>;
}

export function LowEmissionZoneDescriptorsFromJSON(json: any): LowEmissionZoneDescriptors {
    return LowEmissionZoneDescriptorsFromJSONTyped(json, false);
}

export function LowEmissionZoneDescriptorsFromJSONTyped(json: any, ignoreDiscriminator: boolean): LowEmissionZoneDescriptors {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'name': !exists(json, 'name') ? undefined : json['name'],
        'approvals': !exists(json, 'approvals') ? undefined : json['approvals'],
        'vehicleCategories': !exists(json, 'vehicleCategories') ? undefined : json['vehicleCategories'],
        'fuelTypes': !exists(json, 'fuelTypes') ? undefined : json['fuelTypes'],
        'vehicles': !exists(json, 'vehicles') ? undefined : ((json['vehicles'] as Array<any>).map(VehicleFromJSON)),
    };
}

export function LowEmissionZoneDescriptorsToJSON(value?: LowEmissionZoneDescriptors | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'name': value.name,
        'approvals': value.approvals,
        'vehicleCategories': value.vehicleCategories,
        'fuelTypes': value.fuelTypes,
        'vehicles': value.vehicles === undefined ? undefined : ((value.vehicles as Array<any>).map(VehicleToJSON)),
    };
}

