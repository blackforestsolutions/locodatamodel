package de.blackforestsolutions.datamodel;

import de.blackforestsolutions.datamodel.util.objectmothers.TravelLineObjectMother;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TravelLineTest {

    @Test
    void test_TravelLine_copy_constructor_with_complete_object_returns_copy() {
        TravelLine testData = TravelLineObjectMother.getTravelLineWithNoEmptyFields().build();

        TravelLine result = new TravelLine(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }

    @Test
    void test_TravelLine_copy_constructor_with_not_complete_object_returns_copy() {
        TravelLine testData = new TravelLine.TravelLineBuilder().build();

        TravelLine result = new TravelLine(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }
}
