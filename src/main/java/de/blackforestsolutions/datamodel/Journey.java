package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.blackforestsolutions.datamodel.deserializer.DistanceDeserializer;
import de.blackforestsolutions.datamodel.deserializer.DurationDeserializer;
import de.blackforestsolutions.datamodel.deserializer.PriceDeserializer;
import de.blackforestsolutions.datamodel.deserializer.TravelPointDeserializer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Distance;

import java.time.Duration;
import java.util.*;

@Setter
@Getter
public class Journey {

    @Id
    private UUID id;

    private TravelPoint start;

    private TravelPoint destination;

    private Map<Integer, TravelPoint> betweenHolds = new HashMap<>();

    private TravelProvider travelProvider;

    private String unknownTravelProvider;

    private Date startTime;

    private Date arrivalTime;

    private Duration duration;

    private Price price;

    private Price priceWithCommision;

    private List<UUID> journeysRelated;

    private Distance distance;

    private String providerId;

    private Duration delay;

    private String trainName;

    private String vehicleName;

    private String vehicleNumber;

    private String startStatus;

    private String arrivalStatus;

    private Date startTimeUpdated;

    private Date arrivalTimeUpdated;

    private String description;

    private int aircraftTypeCode;

    private boolean matchesRequest;
    
    public Journey() {
    }

    @JsonDeserialize(using = PriceDeserializer.class)
    public void setPriceWithCommission(Price priceWithCommission) {
        this.priceWithCommision = priceWithCommission;
    }

    @JsonDeserialize(using = PriceDeserializer.class)
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonDeserialize(using = TravelPointDeserializer.class)
    public void setStart(TravelPoint start) {
        this.start = start;
    }

    @JsonDeserialize(using = TravelPointDeserializer.class)
    public void setDestination(TravelPoint destination) {
        this.destination = destination;
    }

    @JsonDeserialize(using = DurationDeserializer.class)
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @JsonDeserialize(using = DistanceDeserializer.class)
    public void setDistance(Distance distance) {
        this.distance = distance;
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

}
