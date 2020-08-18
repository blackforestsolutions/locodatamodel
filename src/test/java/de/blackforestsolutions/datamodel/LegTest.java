package de.blackforestsolutions.datamodel;

import org.junit.jupiter.api.Test;

import static de.blackforestsolutions.datamodel.util.objectmothers.LegObjectMother.getFirstLegWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.LegObjectMother.getLegStringWithNoEmptyFields;
import static org.apache.commons.lang.StringUtils.deleteWhitespace;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LegTest {

    private Leg.LegBuilder classUnderTest = getFirstLegWithNoEmptyFields();

    @Test
    void test_hasNullAttributes_with_no_null_attribute_is_false() throws IllegalAccessException {

        boolean result = classUnderTest.build().hasNullAttributes();

        assertThat(result).isFalse();
    }

    @Test
    void test_hasNullAttributes_with_a_null_attribute_is_true() throws IllegalAccessException {
        classUnderTest.setStart(null);

        boolean result = classUnderTest.build().hasNullAttributes();

        assertThat(result).isTrue();
    }

    @Test
    void test_hasEmptyString_with_empty_string_attribute_is_true() throws IllegalAccessException {
        classUnderTest.setUnknownTravelProvider("");

        boolean result = classUnderTest.build().hasEmptyString();

        assertThat(result).isTrue();
    }

    @Test
    void test_hasEmptyString_with_no_empty_string_attribute_is_false() throws IllegalAccessException {
        classUnderTest = getFirstLegWithNoEmptyFields();

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
        classUnderTest.setUnknownTravelProvider(null);

        int result = classUnderTest.hashCode();

        assertThat(result).isNotNull();
    }

    @Test
    void test_toString_with_leg_returns_apiToken_as_json_string() {

        String result = classUnderTest.build().toString();

        assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getLegStringWithNoEmptyFields()));
    }

    @Test
    void test_isEqualTo_with_leg_and_junit4_returns_equal_value() {

        assertThat(classUnderTest.build()).isEqualTo(classUnderTest.build());
    }

    @Test
    void test_assertEquals_with_leg_and_junit5_returns_equal_value() {

        assertEquals(classUnderTest.build(), classUnderTest.build());
    }


    @Test
    void test_isNotEqualTo_with_leg_and_junit4_returns_not_an_equal_value() {
        classUnderTest.setStart(null);

        assertThat(classUnderTest.build()).isNotEqualTo(getFirstLegWithNoEmptyFields().build());
    }

    @Test
    void test_assertNotEquals_with_leg_and_junit5_returns_not_an_equal_value() {
        classUnderTest.setStart(null);

        assertNotEquals(getFirstLegWithNoEmptyFields(), classUnderTest.build());
    }
}
