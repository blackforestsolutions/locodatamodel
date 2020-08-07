package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.GeoJson;

import java.util.ArrayList;
import java.util.List;

public class GeojsonObjectMother {
    public static GeoJson.GeoJsonBuilder getGeojsonWithNoEmptyField() {
        GeoJson.GeoJsonBuilder geojson = new GeoJson.GeoJsonBuilder();
        geojson.setType("LineString");


        List<Double> coordinates1 = new ArrayList<>();
        coordinates1.add(13.388798);
        coordinates1.add(52.517033);

        List<Double> coordinates2 = new ArrayList<>();
        coordinates2.add(13.391308);
        coordinates2.add(52.501831);

        List<Double> coordinates3 = new ArrayList<>();
        coordinates3.add(13.38864);
        coordinates3.add(52.501251);

        List<Double> coordinates4 = new ArrayList<>();
        coordinates4.add(13.388931);
        coordinates4.add(52.497613);

        List<Double> coordinates5 = new ArrayList<>();
        coordinates5.add(13.388357);
        coordinates5.add(52.497726);

        List<Double> coordinates6 = new ArrayList<>();
        coordinates6.add(13.386905);
        coordinates6.add(52.496405);

        List<Double> coordinates7 = new ArrayList<>();
        coordinates7.add(13.386074);
        coordinates7.add(52.49652);

        List<Double> coordinates8 = new ArrayList<>();
        coordinates8.add(13.386189);
        coordinates8.add(52.496826);


        List<List<Double>> coordinates = new ArrayList<>();
        coordinates.add(coordinates1);
        coordinates.add(coordinates2);
        coordinates.add(coordinates3);
        coordinates.add(coordinates4);
        coordinates.add(coordinates5);
        coordinates.add(coordinates7);
        coordinates.add(coordinates8);

        geojson.setCoordinates(coordinates);

        return geojson;

    }

}