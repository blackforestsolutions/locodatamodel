package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Coordinates;

import static de.blackforestsolutions.datamodel.testutil.TestUtils.getResourceFileAsString;

public class CoordinatesObjectMother {

    public static Coordinates getCoordinatesWithNoEmptyFields() {
        return new Coordinates.CoordinatesBuilder(0, 0).build();
    }

    public static String getCoordinatesStringWithNoEmptyFields() {
        return getResourceFileAsString("json/coordinates.json");
    }
}
