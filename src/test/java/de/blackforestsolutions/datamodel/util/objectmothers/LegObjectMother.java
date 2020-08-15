package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Leg;
import de.blackforestsolutions.datamodel.TravelProvider;
import de.blackforestsolutions.datamodel.VehicleType;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.List;

import static de.blackforestsolutions.datamodel.testutil.TestUtils.getResourceFileAsString;
import static de.blackforestsolutions.datamodel.util.objectmothers.GeoJsonObjectMother.getGeoJsonWithNoEmptyField;
import static de.blackforestsolutions.datamodel.util.objectmothers.PriceObjectMother.getPriceWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.TravelLineObjectMother.getTravelLineWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother.getDestinationTravelPointWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother.getStartTravelPointWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.UUIDObjectMother.*;

public class LegObjectMother {

    public static Leg.LegBuilder getFirstLegWithNoEmptyFields() {
        Leg.LegBuilder leg = new Leg.LegBuilder(TEST_UUID_3);
        leg.setStart(getStartTravelPointWithNoEmptyFields().build());
        leg.setDestination(getStartTravelPointWithNoEmptyFields().build());
        leg.setStartTime(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
        leg.setArrivalTime(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
        leg.setDuration(Duration.ofSeconds(22222L));
        leg.setDelay(Duration.ofSeconds(22L));
        leg.setTravelLine(getTravelLineWithNoEmptyFields().build());
        leg.setPrice(getPriceWithNoEmptyFields().build());
        leg.setDistance(new Distance(20000L, Metrics.KILOMETERS));
        leg.setProviderId("12345");
        leg.setTravelProvider(TravelProvider.DB);
        leg.setUnknownTravelProvider("Deutsche Bahn AG");
        leg.setVehicleType(VehicleType.TRAIN);
        leg.setVehicleName("ICE");
        leg.setVehicleNumber("71");
        leg.setIncidents(List.of("Weather Warning"));
        leg.setGeojson(getGeoJsonWithNoEmptyField().build());
        return leg;
    }

    public static Leg.LegBuilder getSecondLegWithNoEmptyFields() {
        Leg.LegBuilder leg = new Leg.LegBuilder(TEST_UUID_4);
        leg.setStart(getDestinationTravelPointWithNoEmptyFields().build());
        leg.setDestination(getDestinationTravelPointWithNoEmptyFields().build());
        leg.setStartTime(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
        leg.setArrivalTime(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
        leg.setDuration(Duration.ofSeconds(22222L));
        leg.setDelay(Duration.ofSeconds(22L));
        leg.setTravelLine(getTravelLineWithNoEmptyFields().build());
        leg.setPrice(getPriceWithNoEmptyFields().build());
        leg.setDistance(new Distance(20000L, Metrics.KILOMETERS));
        leg.setProviderId("12345");
        leg.setTravelProvider(TravelProvider.DB);
        leg.setUnknownTravelProvider("Deutsche Bahn AG");
        leg.setVehicleType(VehicleType.TRAIN);
        leg.setVehicleName("ICE");
        leg.setVehicleNumber("71");
        leg.setIncidents(List.of("Weather Warning"));
        leg.setGeojson(getGeoJsonWithNoEmptyField().build());
        return leg;
    }

    public static Leg.LegBuilder getThirdLegWithNoEmptyFields() {
        Leg.LegBuilder leg = new Leg.LegBuilder(TEST_UUID_5);
        leg.setStart(getDestinationTravelPointWithNoEmptyFields().build());
        leg.setDestination(getDestinationTravelPointWithNoEmptyFields().build());
        leg.setStartTime(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
        leg.setArrivalTime(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
        leg.setDuration(Duration.ofSeconds(22222L));
        leg.setDelay(Duration.ofSeconds(22L));
        leg.setTravelLine(getTravelLineWithNoEmptyFields().build());
        leg.setPrice(getPriceWithNoEmptyFields().build());
        leg.setDistance(new Distance(20000L, Metrics.KILOMETERS));
        leg.setProviderId("12345");
        leg.setTravelProvider(TravelProvider.DB);
        leg.setUnknownTravelProvider("Deutsche Bahn AG");
        leg.setVehicleType(VehicleType.TRAIN);
        leg.setVehicleName("ICE");
        leg.setVehicleNumber("71");
        leg.setIncidents(List.of("Weather Warning"));
        return leg;
    }

    public static String getLegStringWithNoEmptyFields() {
        return getResourceFileAsString("json/leg.json");
    }
}
