package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.GeoJson;

import java.util.ArrayList;
import java.util.List;

public class GeoJsonObjectMother {
    public static GeoJson.GeoJsonBuilder getGeoJsonWithNoEmptyField() {
        List<Double> coordinatesList = new ArrayList<>();
        coordinatesList.add(13.388798);
        coordinatesList.add(52.517033);

        List<List<Double>> listOfCoordinates = new ArrayList<>();
        listOfCoordinates.add(coordinatesList);

        return new GeoJson.GeoJsonBuilder()
                .setType("LineString")
                .setCoordinates(listOfCoordinates);
    }

}