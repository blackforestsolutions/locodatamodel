package de.blackforestsolutions.datamodel;

import lombok.Getter;
import lombok.Setter;

public enum TravelProvider {
    DB("DB"),
    SBB("SBB"),
    ÖBB("ÖBB"),
    LUFTHANSA("Lufthansa"),
    EUROWINGS("Eurowings"),
    CONDOR("Condor"),
    FLIXBUS("Flixbus");

    @Getter
    @Setter
    private String unknownTravelProvider;

    TravelProvider(String unknownTravelProvider) {
        this.unknownTravelProvider = unknownTravelProvider;
    }

    public static TravelProvider map(String providerVariable) {
        if (providerVariable.equalsIgnoreCase("LH") || providerVariable.equalsIgnoreCase("LX")) {
            return TravelProvider.LUFTHANSA;
        }
        return TravelProvider.DB;
    }
}
