package de.blackforestsolutions.datamodel;

import de.blackforestsolutions.datamodel.util.objectmothers.JourneyObjectMother;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class JourneyTest {

    Journey classUnderTest = JourneyObjectMother.getJourneyBerlinHamburg();

    @Test
    public void test_hasNullAttributes_with_no_null_attribute_is_false() throws IllegalAccessException {

        boolean result = classUnderTest.hasNullAttributes();

        assertThat(result).isFalse();
    }

    @Test
    public void test_hasNullAttributes_with_a_null_attribute_is_true() throws IllegalAccessException {
        classUnderTest.setStart(null);

        boolean result = classUnderTest.hasNullAttributes();

        assertThat(result).isTrue();
    }

    @Test
    public void test_hasEmptyString_with_empty_string_attribute_is_true() throws IllegalAccessException {
        classUnderTest.setStartStatus("");

        boolean result = classUnderTest.hasEmptyString();

        assertThat(result).isTrue();
    }

    @Test
    public void test_hasEmptyString_with_no_empty_string_attribute_is_false() throws IllegalAccessException {
        classUnderTest = JourneyObjectMother.getJourneyBerlinHamburg();

        boolean result = classUnderTest.hasEmptyString();

        assertThat(result).isFalse();
    }

    @Test
    public void test_hashCode_with_complete_object_returns_hashCode() {

        int result = classUnderTest.hashCode();

        assertThat(result).isNotNull();
    }

    @Test
    public void test_hashCode_with_object_with_null_attribute_returns_hashCode() {
        classUnderTest.setStartStatus(null);

        int result = classUnderTest.hashCode();

        assertThat(result).isNotNull();
    }

    @Test
    public void test_Journey_copy_constructor_with_complete_object_returns_copy() {
        Journey testData = JourneyObjectMother.getJourneyBerlinHamburg();

        Journey result = new Journey(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }

    @Test
    public void test_Journey_copy_constructor_with_not_complete_object_returns_copy() {
        Journey testData = new Journey();

        Journey result = new Journey(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }
}