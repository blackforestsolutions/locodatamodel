package de.blackforestsolutions.datamodel.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.geo.Distance;

import java.io.IOException;

public class DistanceDeserializer extends JsonDeserializer<Distance> {
    @Override
    public Distance deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        ObjectCodec objectCodec = jsonParser.getCodec();
        JsonNode node = objectCodec.readTree(jsonParser);
        ObjectMapper mapper = new ObjectMapper();
        Distance result = mapper.treeToValue(node, Distance.class);
        return result;
    }
}
