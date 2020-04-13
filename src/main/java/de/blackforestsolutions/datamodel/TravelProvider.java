package de.blackforestsolutions.datamodel;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

@Schema(accessMode = Schema.AccessMode.READ_ONLY)
public enum TravelProvider implements Serializable {
    DB,
    SBB,
    OEBB,
    LUFTHANSA,
    EUROWINGS,
    CONDOR,
    BRITISHAIRWAYS,
    FLIXBUS,
    HVV,
    VBB,
    NAHSH,
    PKP,
    BVG,
    NASA,
    RMV,
    CMTA,
    SBAHNMUENCHEN,
    VGS,
    CFL,
    NVV,
    VBN,
    RSAG,
    VMT;

    public static TravelProvider map(String providerVariable) {
        if (providerVariable.equalsIgnoreCase("LH") || providerVariable.equalsIgnoreCase("LX")) {
            return TravelProvider.LUFTHANSA;
        }
        if (providerVariable.equalsIgnoreCase("BA")) {
            return TravelProvider.BRITISHAIRWAYS;
        }
        return TravelProvider.DB;
    }
}
