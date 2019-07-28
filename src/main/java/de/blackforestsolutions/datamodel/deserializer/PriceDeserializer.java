package de.blackforestsolutions.datamodel.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.blackforestsolutions.datamodel.Price;

import java.io.IOException;

public class PriceDeserializer extends JsonDeserializer<Price> {
    @Override
    public Price deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec objectCodec = jsonParser.getCodec();
        JsonNode node = objectCodec.readTree(jsonParser);
        ObjectMapper mapper = new ObjectMapper();
        Price result = mapper.treeToValue(node, Price.class);
        return result;
    }
}
