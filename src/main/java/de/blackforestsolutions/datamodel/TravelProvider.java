package de.blackforestsolutions.datamodel;

public enum TravelProvider {
    DB, SBB, ÖBB, LUFTHANSA, EUROWINGS, CONDOR, FLIXBUS, BRITISHAIRWAYS;

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
