package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.CallStatus;
import de.blackforestsolutions.datamodel.Status;
import de.blackforestsolutions.datamodel.TravelPoint;

import static de.blackforestsolutions.datamodel.testutil.TestUtils.getResourceFileAsString;
import static de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother.getStartTravelPointWithNoEmptyFields;

public class CallStatusObjectMother {

    public static CallStatus<TravelPoint> getCallStatusTravelPoint() {
        return new CallStatus<>(getStartTravelPointWithNoEmptyFields().build(), Status.SUCCESS, null);
    }

    public static String getJsonCallStatusTravelPoint() {
        return getResourceFileAsString("json/callstatusTravelPoint.json");
    }
}
