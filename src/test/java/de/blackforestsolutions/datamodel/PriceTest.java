package de.blackforestsolutions.datamodel;

import de.blackforestsolutions.datamodel.util.objectmothers.PriceObjectMother;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PriceTest {

    @Test
    public void test_Price_copy_constructor_with_complete_object_returns_copy() {
        Price testData = PriceObjectMother.getPriceWithNoEmptyFields().build();

        Price result = new Price(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }

    @Test
    public void test_Price_copy_constructor_with_not_complete_object_returns_copy() {
        Price testData = new Price.PriceBuilder().build();

        Price result = new Price(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }
}
