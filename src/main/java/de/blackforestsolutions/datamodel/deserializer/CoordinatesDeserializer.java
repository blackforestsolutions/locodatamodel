package de.blackforestsolutions.datamodel.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.blackforestsolutions.datamodel.Coordinates;

import java.io.IOException;

public class CoordinatesDeserializer extends JsonDeserializer<Coordinates> {
    @Override
    public Coordinates deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        ObjectCodec objectCodec = jsonParser.getCodec();
        JsonNode node = objectCodec.readTree(jsonParser);
        ObjectMapper mapper = new ObjectMapper();
        Coordinates result = mapper.treeToValue(node, Coordinates.class);
        return result;
    }
}
