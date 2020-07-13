package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Coordinates;

import static de.blackforestsolutions.datamodel.testutil.TestUtils.getResourceFileAsString;

public class CoordinatesObjectMother {

    public static Coordinates.CoordinatesBuilder getCoordinatesWithNoEmptyFields() {
        return new Coordinates.CoordinatesBuilder(0, 0);
    }

    public static String getCoordinatesStringWithNoEmptyFields() {
        return getResourceFileAsString("json/coordinates.json");
    }
}
