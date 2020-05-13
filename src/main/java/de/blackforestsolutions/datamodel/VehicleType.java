package de.blackforestsolutions.datamodel;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(accessMode = Schema.AccessMode.READ_ONLY)
public enum VehicleType {
    BUS,
    TRAIN,
    CAR,
    WALK,
    PLANE,
    FERRY,
    BIKE
}
