package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;

@Getter
@JsonDeserialize(builder = TravelLine.TravelLineBuilder.class)
public final class TravelLine implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;

    private final String name;

    private final TravelPoint origin;

    private final TravelPoint direction;

    private final HashMap<Integer, TravelPoint> betweenHolds;

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

    public HashMap<Integer, TravelPoint> getBetweenHolds() {
        if (betweenHolds != null) {
            return (HashMap<Integer, TravelPoint>) betweenHolds.clone();
        }
        return null;
    }

    @Setter
    @Getter
    @JsonPOJOBuilder(withPrefix = "set")
    public static class TravelLineBuilder {

        private String name = "";

        private TravelPoint origin;

        private TravelPoint direction;

        private HashMap<Integer, TravelPoint> betweenHolds = new HashMap<>();

        public TravelLine build() {
            return new TravelLine(this);
        }

        public void setBetweenHolds(HashMap<Integer, TravelPoint> betweenHolds) {
            this.betweenHolds = (HashMap<Integer, TravelPoint>) betweenHolds.clone();
        }

        public HashMap<Integer, TravelPoint> getBetweenHolds() {
            if (betweenHolds != null) {
                return (HashMap<Integer, TravelPoint>) betweenHolds.clone();
            }
            return null;
        }
    }

}
