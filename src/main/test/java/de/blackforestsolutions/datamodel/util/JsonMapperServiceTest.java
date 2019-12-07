package de.blackforestsolutions.datamodel.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.blackforestsolutions.datamodel.Journey;
import de.blackforestsolutions.datamodel.TravelPoint;
import de.blackforestsolutions.datamodel.util.objectmothers.JourneyObjectMother;
import de.blackforestsolutions.datamodel.util.objectmothers.TravelpointObjectMother;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class JsonMapperServiceTest {

    private LocoJsonMapper classUnderTest = new LocoJsonMapper();

    @Test
    public void test_map_journey_returns_jsonobject() throws JsonProcessingException {
        Journey journey = JourneyObjectMother.getJourneyBerlinHamburg();

        String result = classUnderTest.map(journey);

        Assertions.assertThat(result).isEqualTo(JourneyObjectMother.getJourneyStringBerlinHamburg());
    }

    @Test
    public void test_mapJsonToJourney_with_valid_json_returns_journeyobject() throws IOException {
        String journey = JourneyObjectMother.getJourneyStringBerlinHamburg();

        Journey result = classUnderTest.mapJsonToJourney(journey);

        Assertions.assertThat(result.getDestination().getCity()).isEqualTo(JourneyObjectMother.getJourneyBerlinHamburg().getDestination().getCity());
        Assertions.assertThat(result.getStart().getCity()).isEqualTo(JourneyObjectMother.getJourneyBerlinHamburg().getStart().getCity());
        Assertions.assertThat(result.getTravelProvider()).isEqualTo(JourneyObjectMother.getJourneyBerlinHamburg().getTravelProvider());
    }

    @Test
    public void test_map_travel_point_returns_jsonobject() throws JsonProcessingException {
        TravelPoint travelPoint = TravelpointObjectMother.getTravelPoint();

        String result = classUnderTest.map(travelPoint);

        Assertions.assertThat(result).isEqualTo(TravelpointObjectMother.getTravelPointString());
    }

    @Test
    public void test_mapJsonToTravelPoint_with_valid_json_returns_journeyobject() throws IOException {
        String travelPoint = TravelpointObjectMother.getTravelPointString();

        TravelPoint result = classUnderTest.mapJsonToTravelPoint(travelPoint);

        Assertions.assertThat(result.getCity()).isEqualTo(TravelpointObjectMother.getTravelPoint().getCity());
        Assertions.assertThat(result.getAirportName()).isEqualTo(TravelpointObjectMother.getTravelPoint().getAirportName());
        Assertions.assertThat(result.getAirportId()).isEqualTo(TravelpointObjectMother.getTravelPoint().getAirportId());
        Assertions.assertThat(result.getGpsCoordinates().getLatitude()).isEqualTo(TravelpointObjectMother.getTravelPoint().getGpsCoordinates().getLatitude());
        Assertions.assertThat(result.getGpsCoordinates().getLongitude()).isEqualTo(TravelpointObjectMother.getTravelPoint().getGpsCoordinates().getLongitude());
        Assertions.assertThat(result.getCountry().getCountry()).isEqualTo(TravelpointObjectMother.getTravelPoint().getCountry().getCountry());
    }
}
