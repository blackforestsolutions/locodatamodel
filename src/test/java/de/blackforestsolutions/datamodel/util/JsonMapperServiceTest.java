package de.blackforestsolutions.datamodel.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.blackforestsolutions.datamodel.*;
import de.blackforestsolutions.datamodel.util.objectmothers.ApiTokenAndUrlInformationObjectMother;
import de.blackforestsolutions.datamodel.util.objectmothers.CoordinatesObjectMother;
import de.blackforestsolutions.datamodel.util.objectmothers.JourneyObjectMother;
import de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static de.blackforestsolutions.datamodel.util.objectmothers.ApiTokenAndUrlInformationObjectMother.getApiTokenAndUrlInformationStringWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.CallStatusObjectMother.getCallStatusTravelPoint;
import static de.blackforestsolutions.datamodel.util.objectmothers.CallStatusObjectMother.getJsonCallStatusTravelPoint;
import static de.blackforestsolutions.datamodel.util.objectmothers.CoordinatesObjectMother.getCoordinatesStringWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.JourneyObjectMother.*;
import static de.blackforestsolutions.datamodel.util.objectmothers.LegObjectMother.getFirstLegWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.LegObjectMother.getLegStringWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother.*;
import static de.blackforestsolutions.datamodel.util.objectmothers.UUIDObjectMother.TEST_UUID_1;
import static org.apache.commons.lang.StringUtils.deleteWhitespace;


class JsonMapperServiceTest {

    private final LocoJsonMapper classUnderTest = new LocoJsonMapper();

    @Test
    void test_map_journey_returns_jsonobject() throws JsonProcessingException {
        Journey journey = getJourneyWithNoEmptyFields().build();

        String result = classUnderTest.map(journey);

        Assertions.assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getJourneyStringWithNoEmptyFields()));
    }

    @Test
    void test_mapJsonToJourney_with_valid_json_returns_journeyobject() throws IOException, IllegalAccessException {
        String journey = getJourneyStringWithNoEmptyFields();
        Journey expectedJourney = getJourneyWithNoEmptyFields().build();

        Journey result = classUnderTest.mapJsonToJourney(journey);

        Assertions.assertThat(result.hasNullAttributes()).isFalse();
        Assertions.assertThat(result.hasEmptyString()).isFalse();
        Assertions.assertThat(result).isEqualToIgnoringGivenFields(expectedJourney, "legs");
    }

    @Test
    void test_map_travel_point_returns_jsonobject() throws JsonProcessingException {
        TravelPoint travelPoint = getStartTravelPointWithNoEmptyFields().build();

        String result = classUnderTest.map(travelPoint);

        Assertions.assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getTravelPointStringWithNoEmptyFields()));
    }

    @Test
    void test_mapJsonToTravelPoint_with_valid_json_returns_journeyobject() throws IOException, IllegalAccessException {
        String travelPoint = getTravelPointStringWithNoEmptyFields();
        TravelPoint expectedTravelPoint = getStartTravelPointWithNoEmptyFields().build();

        TravelPoint result = classUnderTest.mapJsonToTravelPoint(travelPoint);

        Assertions.assertThat(result.hasNullAttributes()).isFalse();
        Assertions.assertThat(result.hasEmptyString()).isFalse();
        Assertions.assertThat(result).isEqualToComparingFieldByField(expectedTravelPoint);
    }

    @Test
    void test_map_leg_returns_jsonobject() throws JsonProcessingException {
        Leg leg = getFirstLegWithNoEmptyFields().build();

        String result = classUnderTest.map(leg);

        Assertions.assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getLegStringWithNoEmptyFields()));
    }

    @Test
    void test_mapJsonToLeg_with_valid_json_returns_legobject() throws IOException, IllegalAccessException {
        String leg = getLegStringWithNoEmptyFields();
        Leg expectedLeg = getFirstLegWithNoEmptyFields().build();

        Leg result = classUnderTest.mapJsonToLeg(leg);

        Assertions.assertThat(result.hasNullAttributes()).isFalse();
        Assertions.assertThat(result.hasEmptyString()).isFalse();
        Assertions.assertThat(result).isEqualToIgnoringGivenFields(expectedLeg, "price", "travelLine", "geojson");
        Assertions.assertThat(result.getPrice()).isEqualToComparingFieldByField(expectedLeg.getPrice());
        Assertions.assertThat(result.getTravelLine()).isEqualToComparingFieldByField(expectedLeg.getTravelLine());
        Assertions.assertThat(result.getGeojson()).isEqualToComparingFieldByField(expectedLeg.getGeojson());
    }

    @Test
    void test_map_ApiTokenAndUrlInformation_returns_jsonobject() throws JsonProcessingException {
        ApiTokenAndUrlInformation apiTokenAndUrlInformation = ApiTokenAndUrlInformationObjectMother.getApiTokenAndUrlInformation();

        String result = classUnderTest.map(apiTokenAndUrlInformation);

        Assertions.assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getApiTokenAndUrlInformationStringWithNoEmptyFields()));
    }

    @Test
    void test_mapJsonToApiTokenAndUrlInformation_with_valid_json_returns_ApiTokenAndUrlInformation() throws IOException {
        ApiTokenAndUrlInformation apiTokenAndUrlInformation = ApiTokenAndUrlInformationObjectMother.getApiTokenAndUrlInformation();
        String apiTokenAndUrlInformationString = getApiTokenAndUrlInformationStringWithNoEmptyFields();

        ApiTokenAndUrlInformation result = classUnderTest.mapJsonToApiTokenAndUrlInformation(apiTokenAndUrlInformationString);

        Assertions.assertThat(result).isEqualToIgnoringNullFields(apiTokenAndUrlInformation);
    }


    @Test
    void test_map_with_journeymap_returns_jsonobject() throws JsonProcessingException {
        Map<UUID, Journey> journeys = JourneyObjectMother.getJourneyMapWithNoEmptyFields();

        String result = classUnderTest.map(journeys);

        Assertions.assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getJourneysStringWithNoEmptyFields()));
    }

    @Test
    void test_mapJsonToJourneyMap_with_valid_json_returns_journeymapobject() throws IOException, IllegalAccessException {
        String journeys = getJourneysStringWithNoEmptyFields();
        Map<UUID, Journey> expectedJourneys = getJourneyMapWithNoEmptyFields();

        Map<UUID, Journey> joruneyResult = classUnderTest.mapJsonToJourneyMap(journeys);

        Assertions.assertThat(joruneyResult.size()).isEqualTo(1);
        Assertions.assertThat(joruneyResult.get(TEST_UUID_1).hasNullAttributes()).isFalse();
        Assertions.assertThat(joruneyResult.get(TEST_UUID_1).hasEmptyString()).isFalse();
        Assertions.assertThat(joruneyResult.get(TEST_UUID_1)).isEqualToIgnoringGivenFields(expectedJourneys.get(TEST_UUID_1), "legs");
    }

    @Test
    void test_mapList_with_journeymap_returns_jsonobject() throws JsonProcessingException {
        List<TravelPoint> travelPoints = TravelPointObjectMother.getTravelPointListWithNoEmptyFields();

        String result = classUnderTest.map(travelPoints);

        Assertions.assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getTravelPointListStringWithNoEmptyFields()));
    }

    @Test
    void test_mapListJsonToJourneyMap_with_valid_json_returns_journeymapobject() throws IOException, IllegalAccessException {
        String travelPoints = getTravelPointListStringWithNoEmptyFields();

        List<TravelPoint> travelPointResult = classUnderTest.mapJsonToTravelPointList(travelPoints);

        Assertions.assertThat(travelPointResult.size()).isEqualTo(2);

        Assertions.assertThat(travelPointResult.get(0).hasNullAttributes()).isFalse();
        Assertions.assertThat(travelPointResult.get(0).hasEmptyString()).isFalse();
        Assertions.assertThat(travelPointResult.get(0)).isEqualToIgnoringGivenFields(travelPointResult.get(0));

        Assertions.assertThat(travelPointResult.get(1).hasNullAttributes()).isFalse();
        Assertions.assertThat(travelPointResult.get(1).hasEmptyString()).isFalse();
        Assertions.assertThat(travelPointResult.get(1)).isEqualToIgnoringGivenFields(travelPointResult.get(1));
    }

    @Test
    void test_map_with_coordinates_returns_correct_json() throws JsonProcessingException {
        Coordinates coordinates = CoordinatesObjectMother.getCoordinatesWithNoEmptyFields();

        String result = classUnderTest.map(coordinates);

        Assertions.assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getCoordinatesStringWithNoEmptyFields()));
    }

    @Test
    void test_mapJsonToCoordinates() throws JsonProcessingException {
        String coordinates = getCoordinatesStringWithNoEmptyFields();

        Coordinates result = classUnderTest.mapJsonToCoordinates(coordinates);

        Assertions.assertThat(result).isEqualToComparingFieldByField(CoordinatesObjectMother.getCoordinatesWithNoEmptyFields());
    }

    @Test
    void test_map_with_callStatusTravelPoint_returns_correct_json() throws JsonProcessingException {
        CallStatus<TravelPoint> testData = getCallStatusTravelPoint();

        String result = classUnderTest.map(testData);

        Assertions.assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getJsonCallStatusTravelPoint()));
    }

    @Test
    void test_mapJsonToCallStatus() throws JsonProcessingException {
        String callStatusJson = getJsonCallStatusTravelPoint();

        CallStatus<TravelPoint> result = classUnderTest.mapJsonToCallStatus(callStatusJson, TravelPoint.class);

        Assertions.assertThat(result).isEqualToComparingFieldByField(getCallStatusTravelPoint());
    }
}
