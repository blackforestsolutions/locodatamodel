package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Coordinates;
import de.blackforestsolutions.datamodel.TravelPoint;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Locale;

import static de.blackforestsolutions.datamodel.testutil.TestUtils.getResourceFileAsString;

public class TravelPointObjectMother {

    public static TravelPoint.TravelPointBuilder getStartTravelPointWithNoEmptyFields() {
        TravelPoint.TravelPointBuilder travelPoint = new TravelPoint.TravelPointBuilder();
        travelPoint.setCity("Hamburg");
        travelPoint.setCountry(new Locale("german", "DEU"));
        travelPoint.setPostalCode("98383");
        travelPoint.setStreet("Saatwinkler Damm 2");
        travelPoint.setGpsCoordinates(new Coordinates.CoordinatesBuilder(1, 0).build());
        travelPoint.setPlatform("3");
        travelPoint.setTerminal("4");
        travelPoint.setDepartureTime(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
        travelPoint.setArrivalTime(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
        travelPoint.setStationName("Hamburg Airport");
        travelPoint.setStationId("TXL");
        return travelPoint;
    }

    public static TravelPoint.TravelPointBuilder getDestinationTravelPointWithNoEmptyFields() {
        TravelPoint.TravelPointBuilder travelPoint = new TravelPoint.TravelPointBuilder();
        travelPoint.setCity("Berlin");
        travelPoint.setCountry(new Locale("german", "DEU"));
        travelPoint.setPostalCode("24768");
        travelPoint.setStreet("Saatwinkler Damm 2");
        travelPoint.setGpsCoordinates(new Coordinates.CoordinatesBuilder(1, 0).build());
        travelPoint.setPlatform("3");
        travelPoint.setTerminal("4");
        travelPoint.setDepartureTime(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
        travelPoint.setArrivalTime(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
        travelPoint.setStationName("Berlin Tegel");
        travelPoint.setStationId("TXL");
        return travelPoint;
    }

    public static String getTravelPointStringWithNoEmptyFields() {
        return getResourceFileAsString("json/travelpoint.json");
    }

    public static List<TravelPoint> getTravelPointListWithNoEmptyFields() {
        return List.of(
                getStartTravelPointWithNoEmptyFields().build(),
                getDestinationTravelPointWithNoEmptyFields().build()
        );
    }

    public static String getTravelPointListStringWithNoEmptyFields() {
        return getResourceFileAsString("json/travelPointList.json");
    }
}
