package de.blackforestsolutions.datamodel;

import de.blackforestsolutions.datamodel.util.objectmothers.CoordinatesObjectMother;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinatesTest {

    @Test
    public void test_Coordinates_copy_constructor_with_complete_object_returns_copy() {
        Coordinates testData = CoordinatesObjectMother.getCoordinatesWithNoEmptyFields().build();

        Coordinates result = new Coordinates(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }
}
