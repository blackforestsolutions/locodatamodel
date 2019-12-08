package de.blackforestsolutions.datamodel.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.blackforestsolutions.datamodel.Journey;
import de.blackforestsolutions.datamodel.TravelPoint;

import java.io.IOException;

public class LocoJsonMapper {

    private ObjectMapper mapper;

    public LocoJsonMapper() {
        this.mapper = new ObjectMapper();
    }

    public String map(Journey journey) throws JsonProcessingException {
        return mapper.writeValueAsString(journey);
    }

    public Journey mapJsonToJourney(String journey) throws IOException {
        return mapper.readValue(journey, Journey.class);
    }

    public String map(TravelPoint travelPoint) throws JsonProcessingException {
        return mapper.writeValueAsString(travelPoint);
    }

    public TravelPoint mapJsonToTravelPoint(String travelPoint) throws IOException {
        return mapper.readValue(travelPoint, TravelPoint.class);
    }
}
