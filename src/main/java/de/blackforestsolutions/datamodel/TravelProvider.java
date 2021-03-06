package de.blackforestsolutions.datamodel;

import java.io.Serializable;

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
    VMT,
    BLABLACAR,
    BLABLABUS;

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
