package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.blackforestsolutions.datamodel.deserializer.TravelPointDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class TravelLine implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;
    private String name;
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