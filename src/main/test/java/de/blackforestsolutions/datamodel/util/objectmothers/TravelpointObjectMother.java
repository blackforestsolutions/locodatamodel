package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Coordinates;
import de.blackforestsolutions.datamodel.TravelPoint;

import java.util.Locale;

import static de.blackforestsolutions.datamodel.util.testutil.TestUtils.getResourceFileAsString;
import static org.apache.commons.lang.StringUtils.deleteWhitespace;

public class TravelpointObjectMother {

    public static TravelPoint getTravelPoint() {
        TravelPoint travelPoint = new TravelPoint();
        travelPoint.setAirportName("Berlin Tegel");
        travelPoint.setCity("Berlin");
        travelPoint.setAirportId("TXL");
        travelPoint.setCountry(new Locale("", "DEU"));
        travelPoint.setGpsCoordinates(new Coordinates(1, 0));
        return travelPoint;
    }

    public static String getTravelPointString() {
        return deleteWhitespace(getResourceFileAsString("json/travelpoint.json"));
    }
}
