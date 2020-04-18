package de.blackforestsolutions.datamodel;

import de.blackforestsolutions.datamodel.util.objectmothers.TravelPointObjectMother;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TravelPointTest {

    private final TravelPoint.TravelPointBuilder classUnderTest = TravelPointObjectMother.getTravelPointWithNoEmptyFields();

    @Test
    public void test_hasNullAttributes_with_no_null_attribute_is_false() throws IllegalAccessException {

        boolean result = classUnderTest.build().hasNullAttributes();

        assertThat(result).isFalse();
    }

    @Test
    public void test_hasNullAttributes_with_a_null_attribute_is_true() throws IllegalAccessException {
        classUnderTest.setCity(null);

        boolean result = classUnderTest.build().hasNullAttributes();

        assertThat(result).isTrue();
    }

    @Test
    public void test_hasEmptyString_with_empty_string_attribute_is_true() throws IllegalAccessException {
        classUnderTest.setStationName("");

        boolean result = classUnderTest.build().hasEmptyString();

        assertThat(result).isTrue();
    }

    @Test
    public void test_hasEmptyString_with_no_empty_string_attribute_is_false() throws IllegalAccessException {
        TravelPoint classUnderTest = TravelPointObjectMother.getTravelPointWithNoEmptyFields().build();

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
        classUnderTest.setStationId(null);

        int result = classUnderTest.hashCode();

        assertThat(result).isNotNull();
    }

    @Test
    public void test_TravelPoint_copy_constructor_with_complete_object_returns_copy() {
        TravelPoint testData = TravelPointObjectMother.getTravelPointWithNoEmptyFields().build();

        TravelPoint result = new TravelPoint(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }

    @Test
    public void test_TravelPoint_copy_constructor_with_not_complete_object_returns_copy() {
        TravelPoint testData = new TravelPoint.TravelPointBuilder().build();

        TravelPoint result = new TravelPoint(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }
}
