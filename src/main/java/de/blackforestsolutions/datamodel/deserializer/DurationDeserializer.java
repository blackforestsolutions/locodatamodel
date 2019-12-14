package de.blackforestsolutions.datamodel.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.time.Duration;

public class DurationDeserializer extends JsonDeserializer<Duration> {
    @Override
    public Duration deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        ObjectCodec objectCodec = jsonParser.getCodec();
        JsonNode node = objectCodec.readTree(jsonParser);
        ObjectMapper mapper = new ObjectMapper();
        Duration result = mapper.treeToValue(node, Duration.class);
        return result;
    }
}
