package de.blackforestsolutions.datamodel;

import org.junit.jupiter.api.Test;

import static de.blackforestsolutions.datamodel.util.objectmothers.CallStatusObjectMother.getCallStatusTravelPoint;
import static de.blackforestsolutions.datamodel.util.objectmothers.CallStatusObjectMother.getJsonCallStatusTravelPoint;
import static org.apache.commons.lang3.StringUtils.deleteWhitespace;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CallStatusTest {

    private final CallStatus<TravelPoint> classUnderTest = getCallStatusTravelPoint();

    @Test
    void test_toString_with_callStatusTravelPoint_returns_apiToken_as_json_string() {

        String result = classUnderTest.toString();

        assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getJsonCallStatusTravelPoint()));
    }

    @Test
    void test_isEqualTo_with_callStatusTravelPoint_and_junit4_returns_equal_value() {

        assertThat(classUnderTest).isEqualTo(classUnderTest);
    }

    @Test
    void test_assertEquals_with_callStatusTravelPoint_and_junit5_returns_equal_value() {

        assertEquals(classUnderTest, classUnderTest);
    }
}
