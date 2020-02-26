package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Coordinates;
import de.blackforestsolutions.datamodel.TravelPoint;

import java.time.Instant;
import java.util.Date;
import java.util.Locale;

import static de.blackforestsolutions.datamodel.testutil.TestUtils.getResourceFileAsString;
import static org.apache.commons.lang.StringUtils.deleteWhitespace;

public class TravelpointObjectMother {

    public static TravelPoint.TravelPointBuilder getTravelPoint() {
        TravelPoint.TravelPointBuilder travelPoint = new TravelPoint.TravelPointBuilder();
        travelPoint.setAirportName("Berlin Tegel");
        travelPoint.setCity("Berlin");
        travelPoint.setAirportId("TXL");
        travelPoint.setCountry(new Locale("", "DEU"));
        travelPoint.setGpsCoordinates(new Coordinates.CoordinatesBuilder(1, 0).build());
        travelPoint.setDepartureTime(Date.from(Instant.ofEpochMilli(1L)));
        travelPoint.setArrivalTime(Date.from(Instant.ofEpochMilli(1L)));
        return travelPoint;
    }

    public static String getTravelPointString() {
        return deleteWhitespace(getResourceFileAsString("json/travelpoint.json"));
    }

    public static TravelPoint getTravelPointWithNoEmptyStrings() {
        TravelPoint.TravelPointBuilder travelPoint = new TravelPoint.TravelPointBuilder();
        travelPoint.setAirportName("Berlin Tegel");
        travelPoint.setCity("Berlin");
        travelPoint.setAirportId("TXL");
        travelPoint.setCountry(new Locale("", "DEU"));
        travelPoint.setGpsCoordinates(new Coordinates.CoordinatesBuilder(1, 0).build());
        travelPoint.setDepartureTime(Date.from(Instant.ofEpochMilli(1L)));
        travelPoint.setArrivalTime(Date.from(Instant.ofEpochMilli(1L)));
        travelPoint.setPostalCode("98383");
        travelPoint.setStateOrProvince("tikitakaland");
        travelPoint.setStreet("feldweg");
        travelPoint.setStreetNumber("2");
        travelPoint.setPlatform("3");
        travelPoint.setTerminal("4");
        travelPoint.setStationName("transall");
        travelPoint.setStationId("34");
        return travelPoint.build();
    }
}
