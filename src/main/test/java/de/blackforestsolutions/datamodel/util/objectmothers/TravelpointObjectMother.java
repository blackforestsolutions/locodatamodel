package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Coordinates;
import de.blackforestsolutions.datamodel.TravelPoint;

import java.time.Instant;
import java.util.Date;
import java.util.Locale;

public class TravelpointObjectMother {

    public static TravelPoint getTravelPoint() {
        TravelPoint travelPoint = new TravelPoint();
        travelPoint.setAirportName("Berlin Tegel");
        travelPoint.setCity("Berlin");
        travelPoint.setAirportId("TXL");
        travelPoint.setCountry(new Locale("", "DEU"));
        travelPoint.setGpsCoordinates(new Coordinates(1, 0));
        travelPoint.setStartTime(Date.from(Instant.ofEpochMilli(1l)));
        travelPoint.setArrivalTime(Date.from(Instant.ofEpochMilli(1l)));
        TravelPoint start = new TravelPoint();
        start.setCity("Berlin");
        start.setPostalCode("64664");
        start.setStateOrProvince("Brandenburg");
        start.setStreetNumber("34");
        start.setStreet("Feldweg");
        start.setCountry(new Locale("DE", "DE"));
        start.setGpsCoordinates(new Coordinates(1, 0));
        start.setStartTime(Date.from(Instant.ofEpochMilli(1l)));
        start.setArrivalTime(Date.from(Instant.ofEpochMilli(1l)));
        TravelPoint destination = new TravelPoint();
        destination.setCity("Hamburg");
        destination.setPostalCode("58974");
        destination.setStateOrProvince("Hamburg");
        destination.setStreetNumber("6");
        destination.setStreet("Fischmarkt");
        destination.setCountry(new Locale("DE", "DE"));
        destination.setGpsCoordinates(new Coordinates(1, 0));
        destination.setStartTime(Date.from(Instant.ofEpochMilli(1l)));
        destination.setArrivalTime(Date.from(Instant.ofEpochMilli(1l)));
        travelPoint.setStart(start);
        travelPoint.setDestination(destination);
        return travelPoint;
    }

    public static String getTravelPointString() {
        return "{\"city\":\"Berlin\",\"country\":\"_DEU\",\"postalCode\":\"\",\"stateOrProvince\":\"\",\"street\":\"\",\"streetNumber\":\"\",\"gpsCoordinates\":{\"latitude\":1.0,\"longitude\":0.0},\"dbStationId\":\"\",\"dbStationName\":\"\",\"airportId\":\"TXL\",\"airportName\":\"Berlin Tegel\",\"platform\":\"\",\"terminal\":\"\",\"start\":{\"city\":\"Berlin\",\"country\":\"de_DE\",\"postalCode\":\"64664\",\"stateOrProvince\":\"Brandenburg\",\"street\":\"Feldweg\",\"streetNumber\":\"34\",\"gpsCoordinates\":{\"latitude\":1.0,\"longitude\":0.0},\"dbStationId\":\"\",\"dbStationName\":\"\",\"airportId\":\"\",\"airportName\":\"\",\"platform\":\"\",\"terminal\":\"\",\"start\":null,\"destination\":null,\"startTime\":1,\"arrivalTime\":1},\"destination\":{\"city\":\"Hamburg\",\"country\":\"de_DE\",\"postalCode\":\"58974\",\"stateOrProvince\":\"Hamburg\",\"street\":\"Fischmarkt\",\"streetNumber\":\"6\",\"gpsCoordinates\":{\"latitude\":1.0,\"longitude\":0.0},\"dbStationId\":\"\",\"dbStationName\":\"\",\"airportId\":\"\",\"airportName\":\"\",\"platform\":\"\",\"terminal\":\"\",\"start\":null,\"destination\":null,\"startTime\":1,\"arrivalTime\":1},\"startTime\":1,\"arrivalTime\":1}";
    }
}
