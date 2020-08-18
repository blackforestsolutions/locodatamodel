package de.blackforestsolutions.datamodel;

import org.junit.jupiter.api.Test;

import static de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother.getStartTravelPointWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother.getTravelPointStringWithNoEmptyFields;
import static org.apache.commons.lang3.StringUtils.deleteWhitespace;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TravelPointTest {

    private final TravelPoint.TravelPointBuilder classUnderTest = getStartTravelPointWithNoEmptyFields();

    @Test
    void test_hasNullAttributes_with_no_null_attribute_is_false() throws IllegalAccessException {

        boolean result = classUnderTest.build().hasNullAttributes();

        assertThat(result).isFalse();
    }

    @Test
    void test_hasNullAttributes_with_a_null_attribute_is_true() throws IllegalAccessException {
        classUnderTest.setCity(null);

        boolean result = classUnderTest.build().hasNullAttributes();

        assertThat(result).isTrue();
    }

    @Test
    void test_hasEmptyString_with_empty_string_attribute_is_true() throws IllegalAccessException {
        classUnderTest.setStationName("");

        boolean result = classUnderTest.build().hasEmptyString();

        assertThat(result).isTrue();
    }

    @Test
    void test_hasEmptyString_with_no_empty_string_attribute_is_false() throws IllegalAccessException {
        TravelPoint classUnderTest = getStartTravelPointWithNoEmptyFields().build();

        boolean result = classUnderTest.hasEmptyString();

        assertThat(result).isFalse();
    }

    @Test
    void test_hashCode_with_complete_object_returns_hashCode() {

        int result = classUnderTest.hashCode();

        assertThat(result).isNotNull();
    }

    @Test
    void test_hashCode_with_object_with_null_attribute_returns_hashCode() {
        classUnderTest.setStationId(null);

        int result = classUnderTest.hashCode();

        assertThat(result).isNotNull();
    }

    @Test
    void test_TravelPoint_copy_constructor_with_complete_object_returns_copy() {
        TravelPoint testData = getStartTravelPointWithNoEmptyFields().build();

        TravelPoint result = new TravelPoint(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }

    @Test
    void test_TravelPoint_copy_constructor_with_not_complete_object_returns_copy() {
        TravelPoint testData = new TravelPoint.TravelPointBuilder().build();

        TravelPoint result = new TravelPoint(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }

    @Test
    void test_toString_with_travelPoint_returns_apiToken_as_json_string() {

        String result = classUnderTest.build().toString();

        assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getTravelPointStringWithNoEmptyFields()));
    }

    @Test
    void test_isEqualTo_with_travelPoint_and_junit4_returns_equal_value() {

        assertThat(classUnderTest.build()).isEqualTo(classUnderTest.build());
    }

    @Test
    void test_assertEquals_with_travelPoint_and_junit5_returns_equal_value() {

        assertEquals(classUnderTest.build(), classUnderTest.build());
    }

    @Test
    void test_isNotEqualTo_with_travelPoint_and_junit4_returns_not_an_equal_value() {
        classUnderTest.setStationId(null);

        assertThat(classUnderTest.build()).isNotEqualTo(getStartTravelPointWithNoEmptyFields());
    }

    @Test
    void test_assertNotEquals_with_travelPoint_and_junit5_returns_not_an_equal_value() {
        classUnderTest.setStationId(null);

        assertNotEquals(getStartTravelPointWithNoEmptyFields(), classUnderTest.build());
    }
}
