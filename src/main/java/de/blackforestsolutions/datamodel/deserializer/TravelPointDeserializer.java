package de.blackforestsolutions.datamodel.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.blackforestsolutions.datamodel.TravelPoint;

import java.io.IOException;

public class TravelPointDeserializer extends JsonDeserializer<TravelPoint> {
    @Override
    public TravelPoint deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec objectCodec = jsonParser.getCodec();
        JsonNode node = objectCodec.readTree(jsonParser);
        ObjectMapper mapper = new ObjectMapper();
        TravelPoint result = mapper.treeToValue(node, TravelPoint.class);
        return result;
    }
}
