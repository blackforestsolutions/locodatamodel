package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Coordinates;

public class CoordinatesObjectMother {

    public static Coordinates getCoordinates() {
        return new Coordinates.CoordinatesBuilder(0, 0).build();
    }
}
