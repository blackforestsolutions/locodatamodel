package de.blackforestsolutions.datamodel.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;
import de.blackforestsolutions.datamodel.*;
import de.blackforestsolutions.datamodel.deserializer.ZonedDateTimeDeserializer;
import org.springframework.data.geo.GeoModule;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class LocoJsonMapper {

    private final ObjectMapper mapper;

    public LocoJsonMapper() {
        this.mapper = new ObjectMapper();
        JavaTimeModule module = new JavaTimeModule();
        module.addSerializer(new ZonedDateTimeSerializer(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        module.addDeserializer(ZonedDateTime.class, new ZonedDateTimeDeserializer());
        mapper.registerModule(module);
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


    public String map(ApiTokenAndUrlInformation apiTokenAndUrlInformation) throws JsonProcessingException {
        ApiTokenAndUrlInformationDto dto = new ApiTokenAndUrlInformationDto(apiTokenAndUrlInformation);
        return mapper.writeValueAsString(dto);
    }

    public ApiTokenAndUrlInformation mapJsonToApiTokenAndUrlInformation(String apiTokenAndUrlInformationDto) throws JsonProcessingException {
        ApiTokenAndUrlInformationDto dto = mapper.readValue(apiTokenAndUrlInformationDto, ApiTokenAndUrlInformationDto.class);
        ApiTokenAndUrlInformation.ApiTokenAndUrlInformationBuilder builder = new ApiTokenAndUrlInformation.ApiTokenAndUrlInformationBuilder(dto);
        return builder.build();
    }


    public Map<UUID, Journey> mapJsonToJourneyMap(String journeyMap) throws JsonProcessingException {
        return mapper.readValue(journeyMap, mapper.getTypeFactory().constructMapType(HashMap.class, UUID.class, Journey.class));
    }

    public String map(Map<UUID, Journey> journeys) throws JsonProcessingException {
        return mapper.writeValueAsString(journeys);
    }

    public List<TravelPoint> mapJsonToTravelPointList(String travelPointList) throws JsonProcessingException {
        return mapper.readValue(travelPointList, mapper.getTypeFactory().constructCollectionType(List.class, TravelPoint.class));
    }

    public String map(List<TravelPoint> travelPoints) throws JsonProcessingException {
        return mapper.writeValueAsString(travelPoints);
    }

    public Coordinates mapJsonToCoordinates(String coordinates) throws JsonProcessingException {
        return mapper.readValue(coordinates, Coordinates.class);
    }

    public String map(Coordinates coordinates) throws JsonProcessingException {
        return mapper.writeValueAsString(coordinates);
    }

}
