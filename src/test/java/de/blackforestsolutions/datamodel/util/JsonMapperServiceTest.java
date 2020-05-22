package de.blackforestsolutions.datamodel.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.blackforestsolutions.datamodel.ApiTokenAndUrlInformation;
import de.blackforestsolutions.datamodel.Journey;
import de.blackforestsolutions.datamodel.Leg;
import de.blackforestsolutions.datamodel.TravelPoint;
import de.blackforestsolutions.datamodel.util.objectmothers.ApiTokenAndUrlInformationObjectMother;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static de.blackforestsolutions.datamodel.util.objectmothers.ApiTokenAndUrlInformationObjectMother.getApiTokenAndUrlInformationStringWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.JourneyObjectMother.getJourneyStringWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.JourneyObjectMother.getJourneyWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.LegObjectMother.getFirstLegWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.LegObjectMother.getLegStringWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother.getStartTravelPointWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother.getTravelPointStringWithNoEmptyFields;
import static org.apache.commons.lang.StringUtils.deleteWhitespace;

public class JsonMapperServiceTest {

    private final LocoJsonMapper classUnderTest = new LocoJsonMapper();

    @Test
    public void test_map_journey_returns_jsonobject() throws JsonProcessingException {
        Journey journey = getJourneyWithNoEmptyFields().build();

        String result = classUnderTest.map(journey);

        Assertions.assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getJourneyStringWithNoEmptyFields()));
    }

    @Test
    public void test_mapJsonToJourney_with_valid_json_returns_journeyobject() throws IOException, IllegalAccessException {
        String journey = getJourneyStringWithNoEmptyFields();
        Journey expectedJourney = getJourneyWithNoEmptyFields().build();

        Journey result = classUnderTest.mapJsonToJourney(journey);

        Assertions.assertThat(result.hasNullAttributes()).isFalse();
        Assertions.assertThat(result.hasEmptyString()).isFalse();
        Assertions.assertThat(result).isEqualToIgnoringGivenFields(expectedJourney, "legs");
    }

    @Test
    public void test_map_travel_point_returns_jsonobject() throws JsonProcessingException {
        TravelPoint travelPoint = getStartTravelPointWithNoEmptyFields().build();

        String result = classUnderTest.map(travelPoint);

        Assertions.assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getTravelPointStringWithNoEmptyFields()));
    }

    @Test
    public void test_mapJsonToTravelPoint_with_valid_json_returns_journeyobject() throws IOException, IllegalAccessException {
        String travelPoint = getTravelPointStringWithNoEmptyFields();
        TravelPoint expectedTravelPoint = getStartTravelPointWithNoEmptyFields().build();

        TravelPoint result = classUnderTest.mapJsonToTravelPoint(travelPoint);

        Assertions.assertThat(result.hasNullAttributes()).isFalse();
        Assertions.assertThat(result.hasEmptyString()).isFalse();
        Assertions.assertThat(result).isEqualToComparingFieldByField(expectedTravelPoint);
    }

    @Test
    public void test_map_leg_returns_jsonobject() throws JsonProcessingException {
        Leg leg = getFirstLegWithNoEmptyFields().build();

        String result = classUnderTest.map(leg);

        Assertions.assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getLegStringWithNoEmptyFields()));
    }

    @Test
    public void test_mapJsonToLeg_with_valid_json_returns_legobject() throws IOException, IllegalAccessException {
        String leg = getLegStringWithNoEmptyFields();
        Leg expetedLeg = getFirstLegWithNoEmptyFields().build();

        Leg result = classUnderTest.mapJsonToLeg(leg);

        Assertions.assertThat(result.hasNullAttributes()).isFalse();
        Assertions.assertThat(result.hasEmptyString()).isFalse();
        Assertions.assertThat(result).isEqualToIgnoringGivenFields(expetedLeg, "price", "travelLine");
        Assertions.assertThat(result.getPrice()).isEqualToComparingFieldByField(expetedLeg.getPrice());
        Assertions.assertThat(result.getTravelLine()).isEqualToComparingFieldByField(expetedLeg.getTravelLine());
    }

    @Test
    public void test_map_ApiTokenAndUrlInformation_returns_jsonobject() throws JsonProcessingException {
        ApiTokenAndUrlInformation apiTokenAndUrlInformation = ApiTokenAndUrlInformationObjectMother.getApiTokenAndUrlInformation();

        String result = classUnderTest.map(apiTokenAndUrlInformation);

        Assertions.assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getApiTokenAndUrlInformationStringWithNoEmptyFields()));
    }

    @Test
    public void test_mapJsonToApiTokenAndUrlInformation_with_valid_json_returns_ApiTokenAndUrlInformation() throws IOException {
        ApiTokenAndUrlInformation apiTokenAndUrlInformation = ApiTokenAndUrlInformationObjectMother.getApiTokenAndUrlInformation();
        String apiTokenAndUrlInformationString = getApiTokenAndUrlInformationStringWithNoEmptyFields();

        ApiTokenAndUrlInformation result = classUnderTest.mapJsonToApiTokenAndUrlInformation(apiTokenAndUrlInformationString);

        Assertions.assertThat(result).isEqualToIgnoringNullFields(apiTokenAndUrlInformation);
    }

}
