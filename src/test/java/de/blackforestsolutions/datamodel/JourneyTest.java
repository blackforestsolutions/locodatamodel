package de.blackforestsolutions.datamodel;

import de.blackforestsolutions.datamodel.exception.CompromisedAttributeException;
import de.blackforestsolutions.datamodel.util.objectmothers.JourneyObjectMother;
import de.blackforestsolutions.datamodel.util.objectmothers.LegObjectMother;
import de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother;
import org.assertj.core.api.WritableAssertionInfo;
import org.assertj.core.internal.Strings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

import static de.blackforestsolutions.datamodel.util.objectmothers.UUIDObjectMother.*;
import static org.assertj.core.api.Assertions.assertThat;

class JourneyTest {

    private Journey.JourneyBuilder classUnderTest = JourneyObjectMother.getJourneyWithNoEmptyFields();
    private Journey.JourneyBuilder classUnderTestWithError = JourneyObjectMother.getJourneyWithEmptyLeg();

    @Test
    void test_insertLegsBeforeAllLegs_with_third_leg_to_insert_at_the_beginning_returns_new_correct_journey_with_three_legs_insted_of_two_legs() {
        LinkedHashMap<UUID, Leg> legsToInsert = new LinkedHashMap<>();
        Leg thirdLeg = LegObjectMother.getThirdLegWithNoEmptyFields().build();
        legsToInsert.put(thirdLeg.getId(), thirdLeg);

        Journey result = classUnderTest.build().insertLegsBeforeAllLegs(legsToInsert);

        assertThat(result).isEqualToIgnoringGivenFields(classUnderTest.build(), "legs");
        assertThat(result.getLegs().size()).isEqualTo(3);
        assertThat(result.getLegs().values())
                .extracting(
                        Leg::getId
                )
                .containsExactly(
                        TEST_UUID_5,
                        TEST_UUID_3,
                        TEST_UUID_4
                );
    }

    @Test
    void test_appendLegsAfterAllLegs_with_third_leg_to_insert_at_the_end_returns_new_correct_journey_with_three_legs_insted_of_two_legs() {
        LinkedHashMap<UUID, Leg> legsToInsert = new LinkedHashMap<>();
        Leg thirdLeg = LegObjectMother.getThirdLegWithNoEmptyFields().build();
        legsToInsert.put(thirdLeg.getId(), thirdLeg);

        Journey result = classUnderTest.build().appendLegsAfterAllLegs(legsToInsert);

        assertThat(result).isEqualToIgnoringGivenFields(classUnderTest.build(), "legs");
        assertThat(result.getLegs().size()).isEqualTo(3);
        assertThat(result.getLegs().values())
                .extracting(
                        Leg::getId
                )
                .containsExactly(
                        TEST_UUID_3,
                        TEST_UUID_4,
                        TEST_UUID_5
                );
    }


    @Test
    void test_getStartFromJourney_returns_start_travelPoint_from_first_leg() throws CompromisedAttributeException {
        TravelPoint expectedStart = TravelPointObjectMother.getStartTravelPointWithNoEmptyFields().build();

        TravelPoint result = classUnderTest.build().getStartFromJourney();

        assertThat(result).isEqualToComparingFieldByField(expectedStart);
    }

    @Test
    void test_getDestinationFromJourney_with_empty_legs_throws_CompromisedAttributeException() {
        Assertions.assertThrows(CompromisedAttributeException.class, () -> classUnderTestWithError.build().getDestinationFromJourney());
    }

    @Test
    void test_getDestinationFromJourney_returns_destination_travelPoint_from_last_leg() throws CompromisedAttributeException {
        TravelPoint expectedDestination = TravelPointObjectMother.getDestinationTravelPointWithNoEmptyFields().build();

        TravelPoint result = classUnderTest.build().getDestinationFromJourney();

        assertThat(result).isEqualToComparingFieldByField(expectedDestination);
    }

    @Test
    void test_getStartFromJourney_with_empty_legs_throws_CompromisedAttributeException() {
        Assertions.assertThrows(CompromisedAttributeException.class, () -> classUnderTestWithError.build().getStartFromJourney());
    }

    @Test
    void test_getStartTimeFromJourney_returns_startTime_from_first_leg() throws CompromisedAttributeException {
        ZonedDateTime expectedStartTime = LegObjectMother.getFirstLegWithNoEmptyFields().build().getStartTime();

        ZonedDateTime result = classUnderTest.build().getStartTimeFromJourney();

        assertThat(result).isEqualTo(expectedStartTime);
    }

    @Test
    void test_getStartTimeFromJourney_with_empty_legs_throws_CompromisedAttributeException() {
        Assertions.assertThrows(CompromisedAttributeException.class, () -> classUnderTestWithError.build().getStartTimeFromJourney());
    }

    @Test
    void test_getDurationFromJourney_returns_total_duration_from_all_leg() throws CompromisedAttributeException {
        ZonedDateTime startTime = LegObjectMother.getFirstLegWithNoEmptyFields().build().getStartTime();
        ZonedDateTime arrivalTime = LegObjectMother.getSecondLegWithNoEmptyFields().build().getArrivalTime();
        Duration expectedDuration = Duration.between(startTime, arrivalTime);

        Duration result = classUnderTest.build().getDurationFromJourney();

        assertThat(result).isEqualTo(expectedDuration);
    }

    @Test
    void test_getDurationFromJourney_with_empty_legs_throws_CompromisedAttributeException() {
        Assertions.assertThrows(CompromisedAttributeException.class, () -> classUnderTestWithError.build().getDurationFromJourney());
    }

    @Test
    void test_getArrivalTimeFromJourney_returns_arrivalTime_from_last_leg() throws CompromisedAttributeException {
        ZonedDateTime expectedArrivalTime = LegObjectMother.getSecondLegWithNoEmptyFields().build().getArrivalTime();

        ZonedDateTime result = classUnderTest.build().getArrivalTimeFromJourney();

        assertThat(result).isEqualTo(expectedArrivalTime);
    }

    @Test
    void test_getArrivalTimeFromJourney_with_empty_legs_throws_CompromisedAttributeException() {
        Assertions.assertThrows(CompromisedAttributeException.class, () -> classUnderTestWithError.build().getArrivalTimeFromJourney());
    }

    @Test
    void test_getAllIncidentsFromJourney_returns_all_incidents_from_all_legs() {
        List<String> expectedIncidents = new ArrayList<>();
        expectedIncidents.addAll(LegObjectMother.getFirstLegWithNoEmptyFields().getIncidents());
        expectedIncidents.addAll(LegObjectMother.getSecondLegWithNoEmptyFields().getIncidents());

        List<String> result = classUnderTest.build().getAllIncidentsFromJourney();

        assertThat(result).isEqualTo(expectedIncidents);
    }

    @Test
    void test_insertLegBeforeAllLegs_with_third_leg_to_insert_at_the_beginning_returns_new_correct_journey_with_three_legs_insted_of_two_legs() {
        Leg firstLeg = LegObjectMother.getFirstLegWithNoEmptyFields().build();
        Leg secondLeg = LegObjectMother.getSecondLegWithNoEmptyFields().build();
        Leg thirdLeg = LegObjectMother.getThirdLegWithNoEmptyFields().build();

        Journey result = classUnderTest.build().insertLegBeforeAllLegs(thirdLeg);

        assertThat(result).isEqualToIgnoringGivenFields(classUnderTest.build(), "legs");
        assertThat(result.getLegs().size()).isEqualTo(3);
        assertThat(result.getLegs().values())
                .extracting(
                        Leg::getId
                )
                .containsExactly(
                        TEST_UUID_5,
                        TEST_UUID_3,
                        TEST_UUID_4
                );
        assertThat(result.getLegs().get(TEST_UUID_5)).isEqualToComparingFieldByField(thirdLeg);
        assertThat(result.getLegs().get(TEST_UUID_3)).isEqualToIgnoringGivenFields(firstLeg, "price", "travelLine");
        assertThat(result.getLegs().get(TEST_UUID_3).getPrice()).isEqualToComparingFieldByField(firstLeg.getPrice());
        assertThat(result.getLegs().get(TEST_UUID_3).getTravelLine()).isEqualToComparingFieldByField(firstLeg.getTravelLine());
        assertThat(result.getLegs().get(TEST_UUID_4)).isEqualToIgnoringGivenFields(secondLeg, "price", "travelLine");
        assertThat(result.getLegs().get(TEST_UUID_4).getPrice()).isEqualToComparingFieldByField(secondLeg.getPrice());
        assertThat(result.getLegs().get(TEST_UUID_4).getTravelLine()).isEqualToComparingFieldByField(secondLeg.getTravelLine());
    }

    @Test
    void test_appendLegAfterAllLegs_with_third_leg_to_insert_at_the_end_returns_new_correct_journey_with_three_legs_insted_of_two_legs() {
        Leg firstLeg = LegObjectMother.getFirstLegWithNoEmptyFields().build();
        Leg secondLeg = LegObjectMother.getSecondLegWithNoEmptyFields().build();
        Leg thirdLeg = LegObjectMother.getThirdLegWithNoEmptyFields().build();

        Journey result = classUnderTest.build().appendLegAfterAllLegs(thirdLeg);

        assertThat(result).isEqualToIgnoringGivenFields(classUnderTest.build(), "legs");
        assertThat(result.getLegs().size()).isEqualTo(3);
        assertThat(result.getLegs().values())
                .extracting(
                        Leg::getId
                )
                .containsExactly(
                        TEST_UUID_3,
                        TEST_UUID_4,
                        TEST_UUID_5
                );
        assertThat(result.getLegs().get(TEST_UUID_5)).isEqualToComparingFieldByField(thirdLeg);
        assertThat(result.getLegs().get(TEST_UUID_3)).isEqualToIgnoringGivenFields(firstLeg, "price", "travelLine");
        assertThat(result.getLegs().get(TEST_UUID_3).getPrice()).isEqualToComparingFieldByField(firstLeg.getPrice());
        assertThat(result.getLegs().get(TEST_UUID_3).getTravelLine()).isEqualToComparingFieldByField(firstLeg.getTravelLine());
        assertThat(result.getLegs().get(TEST_UUID_4)).isEqualToIgnoringGivenFields(secondLeg, "price", "travelLine");
        assertThat(result.getLegs().get(TEST_UUID_4).getPrice()).isEqualToComparingFieldByField(secondLeg.getPrice());
        assertThat(result.getLegs().get(TEST_UUID_4).getTravelLine()).isEqualToComparingFieldByField(secondLeg.getTravelLine());
    }

    @Test
    void test_replaceLegById_of_second_leg_with_returns_new_correct_journey_with_two_legs_in_total_and_one_replaced() {
        Leg firstLeg = LegObjectMother.getFirstLegWithNoEmptyFields().build();
        Leg secondLeg = LegObjectMother.getSecondLegWithNoEmptyFields().build();
        Leg thirdLeg = LegObjectMother.getThirdLegWithNoEmptyFields().build();

        Journey result = classUnderTest.build().replaceLegById(secondLeg.getId(), thirdLeg);

        assertThat(result).isEqualToIgnoringGivenFields(classUnderTest.build(), "legs");
        assertThat(result.getLegs().size()).isEqualTo(2);
        assertThat(result.getLegs().values())
                .extracting(
                        Leg::getId
                )
                .containsExactly(
                        TEST_UUID_3,
                        TEST_UUID_5
                );
        assertThat(result.getLegs().get(TEST_UUID_5)).isEqualToComparingFieldByField(thirdLeg);
        assertThat(result.getLegs().get(TEST_UUID_3)).isEqualToIgnoringGivenFields(firstLeg, "price", "travelLine");
        assertThat(result.getLegs().get(TEST_UUID_3).getPrice()).isEqualToComparingFieldByField(firstLeg.getPrice());
        assertThat(result.getLegs().get(TEST_UUID_3).getTravelLine()).isEqualToComparingFieldByField(firstLeg.getTravelLine());
        assertThat(result.getLegs().containsKey(TEST_UUID_4)).isFalse();
    }

    @Test
    void test_hasNullAttributes_with_no_null_attribute_is_false() throws IllegalAccessException {

        boolean result = classUnderTest.build().hasNullAttributes();

        assertThat(result).isFalse();
    }

    @Test
    void test_hasNullAttributes_with_a_null_attribute_is_true() throws IllegalAccessException {
        classUnderTest.setJourneysRelated(null);

        boolean result = classUnderTest.build().hasNullAttributes();

        assertThat(result).isTrue();
    }

    @Test
    void test_hasEmptyString_with_no_empty_string_attribute_is_false() throws IllegalAccessException {
        classUnderTest = JourneyObjectMother.getJourneyWithNoEmptyFields();

        boolean result = classUnderTest.build().hasEmptyString();

        assertThat(result).isFalse();
    }

    @Test
    void test_hashCode_with_complete_object_returns_hashCode() {

        int result = classUnderTest.hashCode();

        assertThat(result).isNotNull();
    }

    @Test
    void test_hashCode_with_object_with_null_attribute_returns_hashCode() {
        classUnderTest.setJourneysRelated(null);

        int result = classUnderTest.hashCode();

        assertThat(result).isNotNull();
    }

    @Test
    void test_Journey_copy_constructor_with_complete_object_returns_copy() {
        Journey testData = JourneyObjectMother.getJourneyWithNoEmptyFields().build();
        Pattern checkPattern = Pattern.compile("([a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12})");

        Journey result = new Journey(testData);

        assertThat(result).isEqualToIgnoringGivenFields(testData, "id");
        Strings.instance().assertContainsPattern(new WritableAssertionInfo(), testData.getId().toString(), checkPattern);
    }

    @Test
    void test_Journey_copy_constructor_with_not_complete_object_returns_copy() {
        Journey testData = new Journey.JourneyBuilder(UUID.fromString("cb11896e-c38a-4f53-8d40-1f28ca690f5a")).build();
        Pattern checkPattern = Pattern.compile("([a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12})");

        Journey result = new Journey(testData);

        assertThat(result).isEqualToIgnoringGivenFields(testData, "id");
        Strings.instance().assertContainsPattern(new WritableAssertionInfo(), testData.getId().toString(), checkPattern);
    }

    @Test
    void test_JourneyJourneyBuilder_constructor_with_Journey_returns_journey_builder_with_same_properties() {
        Journey testData = JourneyObjectMother.getJourneyWithNoEmptyFields().build();

        Journey.JourneyBuilder result = new Journey.JourneyBuilder(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }
}
