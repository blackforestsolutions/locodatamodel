package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.TravelLine;
import de.blackforestsolutions.datamodel.TravelPoint;

import java.util.HashMap;

import static de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother.getTravelPointWithNoEmptyFields;

public class TravelLineObjectMother {

    public static TravelLine.TravelLineBuilder getTravelLineWithNoEmptyFields() {
        TravelLine.TravelLineBuilder travelLine = new TravelLine.TravelLineBuilder();
        travelLine.setName("Schwarzwald Bahn");
        travelLine.setOrigin(getTravelPointWithNoEmptyFields().build());
        travelLine.setDirection(getTravelPointWithNoEmptyFields().build());
        travelLine.setBetweenHolds(buildBetweenHolds());
        return travelLine;
    }

    private static HashMap<Integer, TravelPoint> buildBetweenHolds() {
        HashMap<Integer, TravelPoint> betweenHolds = new HashMap<>();
        betweenHolds.put(1, getTravelPointWithNoEmptyFields().build());
        return betweenHolds;
    }
}
