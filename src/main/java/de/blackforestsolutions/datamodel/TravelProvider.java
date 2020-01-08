package de.blackforestsolutions.datamodel;

public enum TravelProvider {
    DB,
    SBB,
    ÖBB,
    LUFTHANSA,
    EUROWINGS,
    CONDOR,
    FLIXBUS,
    HVV;

    public static TravelProvider map(String providerVariable) {
        if (providerVariable.equalsIgnoreCase("LH") || providerVariable.equalsIgnoreCase("LX")) {
            return TravelProvider.LUFTHANSA;
        }
        return TravelProvider.DB;
    }
}
