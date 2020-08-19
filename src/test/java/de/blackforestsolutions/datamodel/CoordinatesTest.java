package de.blackforestsolutions.datamodel;

import org.junit.jupiter.api.Test;

import static de.blackforestsolutions.datamodel.util.objectmothers.CoordinatesObjectMother.getCoordinatesStringWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.CoordinatesObjectMother.getCoordinatesWithNoEmptyFields;
import static org.apache.commons.lang3.StringUtils.deleteWhitespace;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CoordinatesTest {

    private final Coordinates classUnderTest = getCoordinatesWithNoEmptyFields();

    @Test
    void test_Coordinates_copy_constructor_with_complete_object_returns_copy() {

        Coordinates result = new Coordinates(classUnderTest);

        assertThat(result).isEqualToComparingFieldByField(classUnderTest);
    }

    @Test
    void test_toString_with_coordinates_returns_coordinates_as_json_string() {

        String result = classUnderTest.toString();

        assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getCoordinatesStringWithNoEmptyFields()));
    }

    @Test
    void test_isEqualTo_with_coordinates_and_junit4_returns_equal_value() {

        assertThat(classUnderTest).isEqualTo(classUnderTest);
    }

    @Test
    void test_assertEquals_with_coordinates_and_junit5_returns_equal_value() {

        assertEquals(classUnderTest, classUnderTest);
    }
}
