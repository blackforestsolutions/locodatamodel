package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.*;

import java.time.Instant;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;


public class JourneyObjectMother {

    public static Journey getJourneyBerlinHamburg() {
        //Coordinates coordinates = new Coordinates(43974.48, 397937.34);
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
        start.setStart(null);
        start.setDestination(null);
        destination.setStart(null);
        destination.setDestination(null);
        Journey journey = new Journey();
        journey.setStart(start);
        journey.setDestination(destination);
        journey.setTravelProvider(TravelProvider.DB);
        journey.setStartTime(Date.from(Instant.ofEpochMilli(1l)));
        journey.setArrivalTime(Date.from(Instant.ofEpochMilli(1l)));
        journey.setId(UUID.fromString("cb11896e-c38a-4f53-8d40-1f28ca690f5a"));
        Price price = new Price();
        price.setCurrency(Currency.getInstance("EUR"));
        price.setSymbol("€");
        price.setValue(234.90);
        journey.setPrice(price);
        return journey;
    }

    public static String getJourneyStringBerlinHamburg() {
        return "{\"id\":\"cb11896e-c38a-4f53-8d40-1f28ca690f5a\",\"start\":{\"city\":\"Berlin\",\"country\":\"de_DE\",\"postalCode\":\"64664\",\"stateOrProvince\":\"Brandenburg\",\"street\":\"Feldweg\",\"streetNumber\":\"34\",\"gpsCoordinates\":{\"latitude\":1.0,\"longitude\":0.0},\"dbStationId\":\"\",\"dbStationName\":\"\",\"airportId\":\"\",\"airportName\":\"\",\"platform\":\"\",\"terminal\":\"\",\"start\":null,\"destination\":null,\"startTime\":1,\"arrivalTime\":1},\"destination\":{\"city\":\"Hamburg\",\"country\":\"de_DE\",\"postalCode\":\"58974\",\"stateOrProvince\":\"Hamburg\",\"street\":\"Fischmarkt\",\"streetNumber\":\"6\",\"gpsCoordinates\":{\"latitude\":1.0,\"longitude\":0.0},\"dbStationId\":\"\",\"dbStationName\":\"\",\"airportId\":\"\",\"airportName\":\"\",\"platform\":\"\",\"terminal\":\"\",\"start\":null,\"destination\":null,\"startTime\":1,\"arrivalTime\":1},\"travelProvider\":\"DB\",\"startTime\":1,\"arrivalTime\":1,\"duration\":null,\"price\":{\"value\":234.9,\"currency\":\"EUR\",\"symbol\":\"€\"},\"priceWithCommision\":null,\"journeysRelated\":null,\"distance\":null,\"providerId\":null,\"delay\":null,\"trainName\":null,\"vehicleNumber\":null}";
    }
}
