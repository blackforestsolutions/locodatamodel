package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.blackforestsolutions.datamodel.deserializer.TravelPointDeserializer;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class TravelLine {

    private TravelPoint origin;
    private TravelPoint direction;
    private Map<Integer, TravelPoint> betweenHolds = new HashMap<>();

    @JsonDeserialize(using = TravelPointDeserializer.class)
    public void setOrigin(TravelPoint origin) {
        this.origin = origin;
    }

    @JsonDeserialize(using = TravelPointDeserializer.class)
    public void setDirection(TravelPoint direction) {
        this.direction = direction;
    }
}
