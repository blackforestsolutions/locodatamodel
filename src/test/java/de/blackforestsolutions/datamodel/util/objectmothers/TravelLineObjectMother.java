package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.TravelLine;

import static de.blackforestsolutions.datamodel.util.objectmothers.TravelpointObjectMother.getTravelPointWithNoEmptyStrings;

public class TravelLineObjectMother {

    public static TravelLine getTravelLineWithNoEmptyFields() {
        TravelLine.TravelLineBuilder travelLine = new TravelLine.TravelLineBuilder();
        travelLine.setOrigin(getTravelPointWithNoEmptyStrings());
        travelLine.setDirection(getTravelPointWithNoEmptyStrings());
        travelLine.setName("U-Bahn Daegu");
        return travelLine.build();
    }
}
