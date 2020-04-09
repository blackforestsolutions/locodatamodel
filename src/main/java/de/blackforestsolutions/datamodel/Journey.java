package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import de.blackforestsolutions.datamodel.deserializer.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Distance;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.time.Duration;
import java.util.*;

@Getter
@Slf4j
@JsonDeserialize(builder = Journey.JourneyBuilder.class)
public final class Journey implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;
    private static final int HASH_CODE_CONSTANT_SEVENTEEN = 17;
    private static final int HASH_CODE_CONSTANT_THIRTY_ONE = 31;

    private static final String NUMBER = "number";

    @Id
    @Schema(accessMode = Schema.AccessMode.READ_ONLY, required = true)
    private final UUID id;

    @JsonDeserialize(using = TravelPointDeserializer.class)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final TravelPoint start;

    @JsonDeserialize(using = TravelPointDeserializer.class)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final TravelPoint destination;

    @JsonDeserialize(using = TravelLineDeserializer.class)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final TravelLine travelLine;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final TravelProvider travelProvider;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String unknownTravelProvider;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final Date startTime;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final Date arrivalTime;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, type = NUMBER)
    private final Duration duration;

    @JsonDeserialize(using = PriceDeserializer.class)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final Price price;

    @JsonDeserialize(using = PriceDeserializer.class)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final Price priceWithCommision;

    @JsonDeserialize(using = PriceDeserializer.class)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final Price childPrice;

    @JsonDeserialize(using = PriceDeserializer.class)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final Price reducedPrice;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final List<UUID> journeysRelated;

    @JsonDeserialize(contentUsing = JourneyDeserializer.class)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final List<Journey> betweenTrips;

    @JsonDeserialize(using = DistanceDeserializer.class)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY, type = NUMBER)
    private final Distance distance;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String providerId;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final Duration delay;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String vehicleType;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String vehicleName;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String vehicleNumber;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String startStatus;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String arrivalStatus;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final boolean matchesRequest;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final Date startTimeUpdated;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final Date arrivalTimeUpdated;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String description;

    /**
     * Copy Constructor
     *
     * @param journey you would like to copy
     */
    public Journey(Journey journey) {
        this.id = UUID.randomUUID();
        this.start = journey.getStart();
        this.destination = journey.getDestination();
        this.travelLine = journey.getTravelLine();
        this.travelProvider = journey.getTravelProvider();
        this.unknownTravelProvider = journey.getUnknownTravelProvider();
        this.startTime = journey.getStartTime();
        this.arrivalTime = journey.getArrivalTime();
        this.duration = journey.getDuration();
        this.price = journey.getPrice();
        this.priceWithCommision = journey.getPriceWithCommision();
        this.childPrice = journey.getChildPrice();
        this.reducedPrice = journey.getReducedPrice();
        this.journeysRelated = journey.getJourneysRelated();
        this.betweenTrips = journey.getBetweenTrips();
        this.distance = journey.getDistance();
        this.providerId = journey.getProviderId();
        this.delay = journey.getDelay();
        this.vehicleType = journey.getVehicleType();
        this.vehicleName = journey.getVehicleName();
        this.vehicleNumber = journey.getVehicleNumber();
        this.startStatus = journey.getStartStatus();
        this.arrivalStatus = journey.getArrivalStatus();
        this.matchesRequest = journey.isMatchesRequest();
        this.startTimeUpdated = journey.getStartTimeUpdated();
        this.arrivalTimeUpdated = journey.getArrivalTimeUpdated();
        this.description = journey.getDescription();
    }

    private Journey(JourneyBuilder journey) {
        this.id = journey.getId();
        this.start = journey.getStart();
        this.destination = journey.getDestination();
        this.travelLine = journey.getTravelLine();
        this.travelProvider = journey.getTravelProvider();
        this.unknownTravelProvider = journey.getUnknownTravelProvider();
        this.startTime = journey.getStartTime();
        this.arrivalTime = journey.getArrivalTime();
        this.duration = journey.getDuration();
        this.price = journey.getPrice();
        this.priceWithCommision = journey.getPriceWithCommision();
        this.childPrice = journey.getChildPrice();
        this.reducedPrice = journey.getReducedPrice();
        this.journeysRelated = journey.getJourneysRelated();
        this.betweenTrips = journey.getBetweenTrips();
        this.distance = journey.getDistance();
        this.providerId = journey.getProviderId();
        this.delay = journey.getDelay();
        this.vehicleType = journey.getVehicleType();
        this.vehicleName = journey.getVehicleName();
        this.vehicleNumber = journey.getVehicleNumber();
        this.startStatus = journey.getStartStatus();
        this.arrivalStatus = journey.getArrivalStatus();
        this.matchesRequest = journey.isMatchesRequest();
        this.startTimeUpdated = journey.getStartTimeUpdated();
        this.arrivalTimeUpdated = journey.getArrivalTimeUpdated();
        this.description = journey.getDescription();
    }

    public Date getStartTimeUpdated() {
        if (startTimeUpdated != null) {
            return (Date) startTimeUpdated.clone();
        }
        return null;
    }

    public Date getArrivalTimeUpdated() {
        if (arrivalTimeUpdated != null) {
            return (Date) arrivalTimeUpdated.clone();
        }
        return null;
    }

    public Date getStartTime() {
        if (startTime != null) {
            return (Date) startTime.clone();
        }
        return null;
    }

    public Date getArrivalTime() {
        if (arrivalTime != null) {
            return (Date) arrivalTime.clone();
        }
        return null;
    }


    /**
     * Checks all first level attributes of an object and tells if there are null values
     *
     * @return if object has null values or not
     */
    public boolean hasNullAttributes() throws IllegalAccessException {
        for (Field attributeToCheck : this.getClass().getDeclaredFields()) {
            if (attributeToCheck.get(this) == null) {
                System.out.println(attributeToCheck.getName() + " is null in journey");
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if an object string field is empty or not
     *
     * @return if object has empty strings or not
     */
    public boolean hasEmptyString() throws IllegalAccessException {
        for (Field attributeToCheck : this.getClass().getDeclaredFields()) {
            if (attributeToCheck.get(this) != null && attributeToCheck.get(this).getClass().toString().equals(String.class.toString())) {
                String value = (String) attributeToCheck.get(this);
                if (StringUtils.isEmpty(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(HASH_CODE_CONSTANT_SEVENTEEN, HASH_CODE_CONSTANT_THIRTY_ONE);
        for (Field attributeToCheck : this.getClass().getDeclaredFields()) {
            try {
                if (attributeToCheck.get(this) != null) {
                    hashCodeBuilder.append(attributeToCheck.hashCode());
                }
            } catch (IllegalAccessException e) {
                log.error("Access Error while accessing to Travelpoint", e);
            }
        }
        return hashCodeBuilder.toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Journey journey = (Journey) o;
        return matchesRequest == journey.matchesRequest
                &&
                Objects.equals(id, journey.id)
                &&
                Objects.equals(start, journey.start)
                &&
                Objects.equals(destination, journey.destination)
                &&
                Objects.equals(travelLine, journey.travelLine)
                &&
                travelProvider == journey.travelProvider
                &&
                Objects.equals(unknownTravelProvider, journey.unknownTravelProvider)
                &&
                Objects.equals(startTime, journey.startTime)
                &&
                Objects.equals(arrivalTime, journey.arrivalTime)
                &&
                Objects.equals(duration, journey.duration)
                &&
                Objects.equals(price, journey.price)
                &&
                Objects.equals(priceWithCommision, journey.priceWithCommision)
                &&
                Objects.equals(childPrice, journey.childPrice)
                &&
                Objects.equals(journeysRelated, journey.journeysRelated)
                &&
                Objects.equals(betweenTrips, journey.betweenTrips)
                &&
                Objects.equals(distance, journey.distance)
                &&
                Objects.equals(providerId, journey.providerId)
                &&
                Objects.equals(delay, journey.delay)
                &&
                Objects.equals(vehicleType, journey.vehicleType)
                &&
                Objects.equals(vehicleName, journey.vehicleName)
                &&
                Objects.equals(vehicleNumber, journey.vehicleNumber)
                &&
                Objects.equals(startStatus, journey.startStatus)
                &&
                Objects.equals(arrivalStatus, journey.arrivalStatus)
                &&
                Objects.equals(startTimeUpdated, journey.startTimeUpdated)
                &&
                Objects.equals(arrivalTimeUpdated, journey.arrivalTimeUpdated)
                &&
                Objects.equals(description, journey.description);
    }

    @Setter
    @Getter
    @JsonPOJOBuilder(withPrefix = "set")
    public static class JourneyBuilder {

        @Id
        private UUID id;

        private TravelPoint start;

        private TravelPoint destination;

        private TravelLine travelLine;

        private TravelProvider travelProvider;

        private String unknownTravelProvider = "";

        private Date startTime;

        private Date arrivalTime;

        private Duration duration;

        private Price price;

        private Price priceWithCommision;

        private Price childPrice;

        private Price reducedPrice;

        private List<UUID> journeysRelated = new ArrayList<>();

        private List<Journey> betweenTrips = new ArrayList<>();

        private Distance distance;

        private String providerId = "";

        private Duration delay;

        private String vehicleType = "";

        private String vehicleName = "";

        private String vehicleNumber = "";

        private String startStatus = "";

        private String arrivalStatus = "";

        private boolean matchesRequest;

        private Date startTimeUpdated;

        private Date arrivalTimeUpdated;

        private String description = "";

        private List<String> remarks = new ArrayList<>();

        public JourneyBuilder() {

        }

        public JourneyBuilder(UUID id) {
            this.id = id;
        }

        public Date getStartTimeUpdated() {
            if (startTimeUpdated != null) {
                return (Date) startTimeUpdated.clone();
            }
            return null;
        }

        public void setStartTimeUpdated(Date startTimeUpdated) {
            this.startTimeUpdated = (Date) startTimeUpdated.clone();
        }

        public Date getArrivalTimeUpdated() {
            if (arrivalTimeUpdated != null) {
                return (Date) arrivalTimeUpdated.clone();
            }
            return null;
        }

        public void setArrivalTimeUpdated(Date arrivalTimeUpdated) {
            this.arrivalTimeUpdated = (Date) arrivalTimeUpdated.clone();
        }

        public Date getStartTime() {
            if (startTime != null) {
                return (Date) startTime.clone();
            }
            return null;
        }

        public void setStartTime(Date startTime) {
            this.startTime = (Date) startTime.clone();
        }

        public Date getArrivalTime() {
            if (arrivalTime != null) {
                return (Date) arrivalTime.clone();
            }
            return null;
        }

        public void setArrivalTime(Date arrivalTime) {
            this.arrivalTime = (Date) arrivalTime.clone();
        }

        public Journey build() {
            return new Journey(this);
        }

    }
}
