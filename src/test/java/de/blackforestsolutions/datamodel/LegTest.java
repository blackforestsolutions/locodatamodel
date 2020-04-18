package de.blackforestsolutions.datamodel;

import de.blackforestsolutions.datamodel.util.objectmothers.LegObjectMother;
import org.assertj.core.api.WritableAssertionInfo;
import org.assertj.core.internal.Strings;
import org.junit.jupiter.api.Test;

import java.util.UUID;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class LegTest {

    Leg.LegBuilder classUnderTest = LegObjectMother.getLegWithNoEmptyFields();

    @Test
    public void test_hasNullAttributes_with_no_null_attribute_is_false() throws IllegalAccessException {

        boolean result = classUnderTest.build().hasNullAttributes();

        assertThat(result).isFalse();
    }

    @Test
    public void test_hasNullAttributes_with_a_null_attribute_is_true() throws IllegalAccessException {
        classUnderTest.setStart(null);

        boolean result = classUnderTest.build().hasNullAttributes();

        assertThat(result).isTrue();
    }

    @Test
    public void test_hasEmptyString_with_empty_string_attribute_is_true() throws IllegalAccessException {
        classUnderTest.setUnknownTravelProvider("");

        boolean result = classUnderTest.build().hasEmptyString();

        assertThat(result).isTrue();
    }

    @Test
    public void test_hasEmptyString_with_no_empty_string_attribute_is_false() throws IllegalAccessException {
        classUnderTest = LegObjectMother.getLegWithNoEmptyFields();

        boolean result = classUnderTest.build().hasEmptyString();

        assertThat(result).isFalse();
    }

    @Test
    public void test_hashCode_with_complete_object_returns_hashCode() {

        int result = classUnderTest.hashCode();

        assertThat(result).isNotNull();
    }

    @Test
    public void test_hashCode_with_object_with_null_attribute_returns_hashCode() {
        classUnderTest.setUnknownTravelProvider(null);

        int result = classUnderTest.hashCode();

        assertThat(result).isNotNull();
    }

    @Test
    public void test_Leg_copy_constructor_with_complete_object_returns_copy() {
        Leg testData = LegObjectMother.getLegWithNoEmptyFields().build();
        Pattern checkPattern = Pattern.compile("([a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12})");

        Leg result = new Leg(testData);

        assertThat(result).isEqualToIgnoringGivenFields(testData, "id");
        Strings.instance().assertContainsPattern(new WritableAssertionInfo(), testData.getId().toString(), checkPattern);
    }

    @Test
    public void test_Leg_copy_constructor_with_not_complete_object_returns_copy() {
        Leg testData = new Leg.LegBuilder(UUID.fromString("cb11896e-c38a-4f53-8d40-1f28ca690f5a")).build();
        Pattern checkPattern = Pattern.compile("([a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12})");

        Leg result = new Leg(testData);

        assertThat(result).isEqualToIgnoringGivenFields(testData, "id");
        Strings.instance().assertContainsPattern(new WritableAssertionInfo(), testData.getId().toString(), checkPattern);
    }
}
