package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.*;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

import static de.blackforestsolutions.datamodel.testutil.TestUtils.getResourceFileAsString;
import static org.apache.commons.lang.StringUtils.deleteWhitespace;


public class JourneyObjectMother {

    public static Journey getJourneyBerlinHamburg() {
        //Coordinates coordinates = new Coordinates(43974.48, 397937.34);
        Journey journey = new Journey();
        journey.setStart(getTravelPointBrandenBurg());
        journey.setTravelLine(getBerlinHamburgTravelLine());
        journey.setDestination(getTravelPointHamburg());
        journey.setTravelProvider(TravelProvider.DB);
        journey.setStartTime(Date.from(Instant.ofEpochMilli(1L)));
        journey.setArrivalTime(Date.from(Instant.ofEpochMilli(1L)));
        journey.setMatchesRequest(false);
        journey.setStartTimeUpdated(Date.from(Instant.ofEpochMilli(1L)));
        journey.setArrivalTimeUpdated(Date.from(Instant.ofEpochMilli(1L)));
        journey.setId(UUID.fromString("cb11896e-c38a-4f53-8d40-1f28ca690f5a"));
        Price price = new Price();
        price.setCurrency(Currency.getInstance("EUR"));
        price.setSymbol("€");
        price.setValue(234.90);
        journey.setPrice(price);
        journey.setChildPrice(price);
        journey.setPriceWithCommision(price);
        journey.setUnknownTravelProvider("unknownTravelProvider");
        journey.setDuration(Duration.ofSeconds(22222L));
        journey.setDistance(new Distance(20000L, Metrics.KILOMETERS));
        journey.setJourneysRelated(Collections.singletonList(UUID.fromString("cb11896e-c38a-4f53-8d40-1f28ca690f5a")));
        journey.setBetweenTrips(getBetweenTrips());
        journey.setProviderId("providerId");
        journey.setDelay(Duration.ofSeconds(22L));
        journey.setVehicleType("vehicleType");
        journey.setVehicleName("vehicleName");
        journey.setVehicleNumber("vehicleNumber");
        journey.setStartStatus("startStatus");
        journey.setArrivalStatus("arrivalStatus");
        journey.setDescription("description");
        return journey;
    }

    private static List<Journey> getBetweenTrips() {
        List<Journey> betweenTrips = new ArrayList<>();

        Journey journey = new Journey();
        journey.setStart(getTravelPointBrandenBurg());
        journey.setTravelLine(getBerlinHamburgTravelLine());
        journey.setDestination(getTravelPointHamburg());
        journey.setTravelProvider(TravelProvider.DB);
        journey.setStartTime(Date.from(Instant.ofEpochMilli(1L)));
        journey.setArrivalTime(Date.from(Instant.ofEpochMilli(1L)));
        journey.setMatchesRequest(false);
        journey.setStartTimeUpdated(Date.from(Instant.ofEpochMilli(1L)));
        journey.setArrivalTimeUpdated(Date.from(Instant.ofEpochMilli(1L)));
        journey.setId(UUID.fromString("cb11896e-c38a-4f53-8d40-1f28ca690f5a"));
        Price price = new Price();
        price.setCurrency(Currency.getInstance("EUR"));
        price.setSymbol("€");
        price.setValue(234.90);
        journey.setPrice(price);
        journey.setChildPrice(price);
        journey.setPriceWithCommision(price);
        journey.setUnknownTravelProvider("unknownTravelProvider");
        journey.setDuration(Duration.ofSeconds(22222L));
        journey.setDistance(new Distance(20000L, Metrics.KILOMETERS));
        journey.setJourneysRelated(Collections.singletonList(UUID.fromString("cb11896e-c38a-4f53-8d40-1f28ca690f5a")));
        journey.setProviderId("providerId");
        journey.setDelay(Duration.ofSeconds(22L));
        journey.setVehicleName("vehicleName");
        journey.setVehicleNumber("vehicleNumber");
        journey.setStartStatus("startStatus");
        journey.setArrivalStatus("arrivalStatus");
        journey.setDescription("description");

        betweenTrips.add(journey);

        return betweenTrips;
    }

    public static TravelPoint getTravelPointBrandenBurg() {
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
        return start;
    }

    public static TravelPoint getTravelPointHamburg() {
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
        return destination;
    }

    public static String getJourneyStringBerlinHamburg() {
        return deleteWhitespace(getResourceFileAsString("json/journey.json"));
    }

    public static TravelLine getBerlinHamburgTravelLine() {
        TravelLine travelLine = new TravelLine();
        travelLine.setOrigin(getTravelPointHamburg());
        travelLine.getBetweenHolds().put(2, getTravelPointHamburg());
        travelLine.getBetweenHolds().put(1, getTravelPointBrandenBurg());
        travelLine.setDirection(getTravelPointBrandenBurg());
        return travelLine;
    }
}
