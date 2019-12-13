package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.*;

import java.time.Instant;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import static de.blackforestsolutions.datamodel.util.testutil.TestUtils.getResourceFileAsString;
import static org.apache.commons.lang.StringUtils.deleteWhitespace;


public class JourneyObjectMother {

    public static Journey getJourneyBerlinHamburg() {
        //Coordinates coordinates = new Coordinates(43974.48, 397937.34);
        TravelPoint start = new TravelPoint();
        start.setCity("Berlin");
        start.setPostalCode("64664");
        start.setStateOrProvince("Brandenburg");
        start.setStreetNumber("34");
        start.setStreet("Feldweg");
        start.setDepartureTime(Date.from(Instant.ofEpochMilli(1L)));
        start.setArrivalTime(Date.from(Instant.ofEpochMilli(1L)));
        start.setCountry(new Locale("DE", "DE"));
        start.setGpsCoordinates(new Coordinates(1, 0));
        TravelPoint destination = new TravelPoint();
        destination.setCity("Hamburg");
        destination.setPostalCode("58974");
        destination.setStateOrProvince("Hamburg");
        destination.setStreetNumber("6");
        destination.setStreet("Fischmarkt");
        destination.setCountry(new Locale("DE", "DE"));
        destination.setGpsCoordinates(new Coordinates(1, 0));
        destination.setDepartureTime(Date.from(Instant.ofEpochMilli(1L)));
        destination.setArrivalTime(Date.from(Instant.ofEpochMilli(1L)));
        Journey journey = new Journey();
        journey.getBetweenHolds().put(1, start);
        journey.getBetweenHolds().put(2, destination);
        journey.setStart(start);
        journey.setDestination(destination);
        journey.setTravelProvider(TravelProvider.DB);
        journey.setStartTime(Date.from(Instant.ofEpochMilli(1L)));
        journey.setArrivalTime(Date.from(Instant.ofEpochMilli(1L)));
        journey.setId(UUID.fromString("cb11896e-c38a-4f53-8d40-1f28ca690f5a"));
        Price price = new Price();
        price.setCurrency(Currency.getInstance("EUR"));
        price.setSymbol("€");
        price.setValue(234.90);
        journey.setPrice(price);
        return journey;
    }

    public static String getJourneyStringBerlinHamburg() {
        return deleteWhitespace(getResourceFileAsString("json/journey.json"));
    }
}
