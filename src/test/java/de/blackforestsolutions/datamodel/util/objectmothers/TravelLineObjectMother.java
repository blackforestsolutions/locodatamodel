package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.TravelLine;

import java.util.Collections;

import static de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother.getStartTravelPointWithNoEmptyFields;

public class TravelLineObjectMother {

    public static TravelLine.TravelLineBuilder getTravelLineWithNoEmptyFields() {
        TravelLine.TravelLineBuilder travelLine = new TravelLine.TravelLineBuilder();
        travelLine.setName("Schwarzwald Bahn");
        travelLine.setOrigin(getStartTravelPointWithNoEmptyFields().build());
        travelLine.setDirection(getStartTravelPointWithNoEmptyFields().build());
        travelLine.setBetweenHolds(Collections.singletonMap(1, getStartTravelPointWithNoEmptyFields().build()));
        return travelLine;
    }
}
