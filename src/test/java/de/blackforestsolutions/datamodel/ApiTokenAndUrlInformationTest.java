package de.blackforestsolutions.datamodel;

import org.junit.jupiter.api.Test;

import static de.blackforestsolutions.datamodel.util.objectmothers.ApiTokenAndUrlInformationObjectMother.getApiTokenAndUrlInformation;
import static de.blackforestsolutions.datamodel.util.objectmothers.ApiTokenAndUrlInformationObjectMother.getApiTokenAndUrlInformationStringWithNoEmptyFields;
import static org.apache.commons.lang.StringUtils.deleteWhitespace;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ApiTokenAndUrlInformationTest {

    private final ApiTokenAndUrlInformation classUnderTest = getApiTokenAndUrlInformation();

    @Test
    void test_toString_with_apiToken_returns_apiToken_as_json_string() {

        String result = classUnderTest.toString();

        assertThat(deleteWhitespace(result)).isEqualTo(deleteWhitespace(getApiTokenAndUrlInformationStringWithNoEmptyFields()));
    }

    @Test
    void test_isEqualTo_with_apiToken_and_junit4_returns_equal_value() {

        assertThat(classUnderTest).isEqualTo(classUnderTest);
    }

    @Test
    void test_assertEquals_with_apiToken_and_junit5_returns_equal_value() {

        assertEquals(classUnderTest, classUnderTest);
    }

    @Test
    void test_isNotEqualTo_with_apiToken_and_junit4_returns_not_an_equal_value() {
        ApiTokenAndUrlInformation.ApiTokenAndUrlInformationBuilder classUnderTest = new ApiTokenAndUrlInformation.ApiTokenAndUrlInformationBuilder(this.classUnderTest);
        classUnderTest.setArrivalDate(null);

        assertThat(classUnderTest.build()).isNotEqualTo(this.classUnderTest);
    }

    @Test
    void test_assertNotEquals_with_apiToken_and_junit5_returns_not_an_equal_value() {
        ApiTokenAndUrlInformation.ApiTokenAndUrlInformationBuilder classUnderTest = new ApiTokenAndUrlInformation.ApiTokenAndUrlInformationBuilder(this.classUnderTest);
        classUnderTest.setArrivalDate(null);

        assertNotEquals(getApiTokenAndUrlInformation(), classUnderTest.build());
    }
}
