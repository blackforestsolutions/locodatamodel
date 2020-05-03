package de.blackforestsolutions.datamodel.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import de.blackforestsolutions.datamodel.Journey;
import de.blackforestsolutions.datamodel.Leg;
import de.blackforestsolutions.datamodel.TravelPoint;
import org.springframework.data.geo.GeoModule;

import java.io.IOException;

public class LocoJsonMapper {

    private final ObjectMapper mapper;

    public LocoJsonMapper() {
        this.mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.registerModule(new GeoModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
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

    public String map(Leg leg) throws JsonProcessingException {
        return mapper.writeValueAsString(leg);
    }

    public Leg mapJsonToLeg(String leg) throws JsonProcessingException {
        return mapper.readValue(leg, Leg.class);
    }

}
