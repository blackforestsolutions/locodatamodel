package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@JsonDeserialize(builder = TravelLine.TravelLineBuilder.class)
public final class TravelLine implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;

    private final String name;
    private final TravelPoint origin;
    private final TravelPoint direction;
    private final Map<Integer, TravelPoint> betweenHolds;

    /**
     * Copy constructor
     *
     * @param travelLine you would like to copy
     */
    public TravelLine(TravelLine travelLine) {
        this.name = travelLine.getName();
        this.origin = travelLine.getOrigin();
        this.direction = travelLine.getDirection();
        this.betweenHolds = travelLine.getBetweenHolds();
    }

    private TravelLine(TravelLineBuilder travelLine) {
        this.name = travelLine.getName();
        this.origin = travelLine.getOrigin();
        this.direction = travelLine.getDirection();
        this.betweenHolds = travelLine.getBetweenHolds();
    }

    public Map<Integer, TravelPoint> getBetweenHolds() {
        if (betweenHolds != null) {
            return (Map<Integer, TravelPoint>) new HashMap<>(betweenHolds).clone();
        }
        return null;
    }

    @Setter
    @Getter
    @Accessors(chain = true)
    @JsonPOJOBuilder(withPrefix = "set")
    public static class TravelLineBuilder {

        private String name = "";

        private TravelPoint origin;

        private TravelPoint direction;

        private Map<Integer, TravelPoint> betweenHolds = new HashMap<>();

        public TravelLine build() {
            return new TravelLine(this);
        }

        public TravelLineBuilder setBetweenHolds(Map<Integer, TravelPoint> betweenHolds) {
            this.betweenHolds = (Map<Integer, TravelPoint>) new HashMap<>(betweenHolds).clone();
            return this;
        }

        public Map<Integer, TravelPoint> getBetweenHolds() {
            if (betweenHolds != null) {
                return (Map<Integer, TravelPoint>) new HashMap<>(betweenHolds).clone();
            }
            return null;
        }
    }

}
