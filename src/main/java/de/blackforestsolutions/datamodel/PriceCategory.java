package de.blackforestsolutions.datamodel;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(accessMode = Schema.AccessMode.READ_ONLY)
public enum PriceCategory {
    ADULT,
    // younger than fourteen years
    CHILD,
    // younger than three years
    BABY,
    ADULT_REDUCED,
    CHILD_REDUCED,
}
