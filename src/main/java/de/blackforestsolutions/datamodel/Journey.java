package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.blackforestsolutions.datamodel.deserializer.PriceDeserializer;
import de.blackforestsolutions.datamodel.deserializer.TravelPointDeserializer;
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
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Setter
@Getter
@Slf4j
public class Journey implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;
    private static final int HASH_CODE_CONSTANT_SEVENTEEN = 17;
    private static final int HASH_CODE_CONSTANT_THIRTY_ONE = 31;

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

    private List<UUID> journeysRelated;

    private List<Journey> betweenTrips;

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

    public Journey() {
    }

    public Journey(Journey journey) {
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

    @JsonDeserialize(using = PriceDeserializer.class)
    public void setPriceWithCommission(Price priceWithCommission) {
        this.priceWithCommision = priceWithCommission;
    }

    @JsonDeserialize(using = PriceDeserializer.class)
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonDeserialize(using = PriceDeserializer.class)
    public void setChildPrice(Price childPrice) {
        this.childPrice = childPrice;
    }

    @JsonDeserialize(using = TravelPointDeserializer.class)
    public void setStart(TravelPoint start) {
        this.start = start;
    }

    @JsonDeserialize(using = TravelPointDeserializer.class)
    public void setDestination(TravelPoint destination) {
        this.destination = destination;
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
}
