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

    public static Journey.JourneyBuilder getJourneyBerlinHamburg() {
        Journey.JourneyBuilder journey = new Journey.JourneyBuilder(UUID.fromString("cb11896e-c38a-4f53-8d40-1f28ca690f5a"));
        journey.setStart(getTravelPointBrandenBurg());
        journey.setTravelLine(getBerlinHamburgTravelLine());
        journey.setDestination(getTravelPointHamburg());
        journey.setTravelProvider(TravelProvider.DB);
        journey.setStartTime(Date.from(Instant.ofEpochMilli(1L)));
        journey.setArrivalTime(Date.from(Instant.ofEpochMilli(1L)));
        journey.setMatchesRequest(false);
        journey.setStartTimeUpdated(Date.from(Instant.ofEpochMilli(1L)));
        journey.setArrivalTimeUpdated(Date.from(Instant.ofEpochMilli(1L)));
        Price.PriceBuilder price = new Price.PriceBuilder();
        price.setCurrency(Currency.getInstance("EUR"));
        price.setSymbol("€");
        price.setValue(234.90);
        journey.setPrice(price.build());
        journey.setChildPrice(price.build());
        journey.setPriceWithCommision(price.build());
        journey.setReducedPrice(price.build());
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

        Journey.JourneyBuilder journey = new Journey.JourneyBuilder(UUID.fromString("cb11896e-c38a-4f53-8d40-1f28ca690f5a"));
        journey.setStart(getTravelPointBrandenBurg());
        journey.setTravelLine(getBerlinHamburgTravelLine());
        journey.setDestination(getTravelPointHamburg());
        journey.setTravelProvider(TravelProvider.DB);
        journey.setStartTime(Date.from(Instant.ofEpochMilli(1L)));
        journey.setArrivalTime(Date.from(Instant.ofEpochMilli(1L)));
        journey.setMatchesRequest(false);
        journey.setStartTimeUpdated(Date.from(Instant.ofEpochMilli(1L)));
        journey.setArrivalTimeUpdated(Date.from(Instant.ofEpochMilli(1L)));
        Price.PriceBuilder price = new Price.PriceBuilder();
        price.setCurrency(Currency.getInstance("EUR"));
        price.setSymbol("€");
        price.setValue(234.90);
        journey.setPrice(price.build());
        journey.setChildPrice(price.build());
        journey.setPriceWithCommision(price.build());
        journey.setReducedPrice(price.build());
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

        betweenTrips.add(journey.build());

        return betweenTrips;
    }

    public static TravelPoint getTravelPointBrandenBurg() {
        TravelPoint.TravelPointBuilder start = new TravelPoint.TravelPointBuilder();
        start.setCity("Berlin");
        start.setPostalCode("64664");
        start.setStateOrProvince("Brandenburg");
        start.setStreetNumber("34");
        start.setStreet("Feldweg");
        start.setDepartureTime(Date.from(Instant.ofEpochMilli(1L)));
        start.setArrivalTime(Date.from(Instant.ofEpochMilli(1L)));
        start.setCountry(new Locale("DE", "DE"));
        start.setGpsCoordinates(new Coordinates.CoordinatesBuilder(1, 0).build());
        return start.build();
    }

    public static TravelPoint getTravelPointHamburg() {
        TravelPoint.TravelPointBuilder destination = new TravelPoint.TravelPointBuilder();
        destination.setCity("Hamburg");
        destination.setPostalCode("58974");
        destination.setStateOrProvince("Hamburg");
        destination.setStreetNumber("6");
        destination.setStreet("Fischmarkt");
        destination.setCountry(new Locale("DE", "DE"));
        destination.setGpsCoordinates(new Coordinates.CoordinatesBuilder(1, 0).build());
        destination.setDepartureTime(Date.from(Instant.ofEpochMilli(1L)));
        destination.setArrivalTime(Date.from(Instant.ofEpochMilli(1L)));
        return destination.build();
    }

    public static String getJourneyStringBerlinHamburg() {
        return deleteWhitespace(getResourceFileAsString("json/journey.json"));
    }

    public static TravelLine getBerlinHamburgTravelLine() {
        TravelLine.TravelLineBuilder travelLine = new TravelLine.TravelLineBuilder();
        travelLine.setOrigin(getTravelPointHamburg());
        travelLine.getBetweenHolds().put(2, getTravelPointHamburg());
        travelLine.getBetweenHolds().put(1, getTravelPointBrandenBurg());
        travelLine.setDirection(getTravelPointBrandenBurg());
        return travelLine.build();
    }
}
