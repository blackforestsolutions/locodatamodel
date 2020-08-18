package de.blackforestsolutions.datamodel;

import de.blackforestsolutions.datamodel.util.objectmothers.GeoJsonObjectMother;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeoJsonTest {

    @Test
    void test_GeoJson_copy_constructor_with_complete_object_returns_copy() {
        GeoJson testData = GeoJsonObjectMother.getGeoJsonWithNoEmptyField().build();

        GeoJson result = new GeoJson(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }

    @Test
    void test_GeoJson_copy_constructor_with_not_complete_object_returns_copy() {
        GeoJson testData = new GeoJson.GeoJsonBuilder().build();

        GeoJson result = new GeoJson(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }
}
