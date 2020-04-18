package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Leg;
import de.blackforestsolutions.datamodel.TravelProvider;
import de.blackforestsolutions.datamodel.VehicleType;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import static de.blackforestsolutions.datamodel.testutil.TestUtils.getResourceFileAsString;
import static de.blackforestsolutions.datamodel.util.objectmothers.PriceObjectMother.getPriceWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.TravelLineObjectMother.getTravelLineWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother.getTravelPointWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.UUIDObjectMother.TEST_UUID_3;

public class LegObjectMother {

    public static Leg.LegBuilder getLegWithNoEmptyFields() {
        Leg.LegBuilder leg = new Leg.LegBuilder(TEST_UUID_3);
        leg.setStart(getTravelPointWithNoEmptyFields().build());
        leg.setDestination(getTravelPointWithNoEmptyFields().build());
        leg.setStartTime(Date.from(Instant.ofEpochMilli(1L)));
        leg.setArrivalTime(Date.from(Instant.ofEpochMilli(1L)));
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
