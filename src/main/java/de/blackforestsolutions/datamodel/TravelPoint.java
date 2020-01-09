package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.blackforestsolutions.datamodel.deserializer.CoordinatesDeserializer;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Setter
@Getter
public class TravelPoint {

    private static final int HASHCODECONSTANT_SEVENTEEN = 17;

    private static final int HASHCODECONSTANT_THIRTY_ONE = 31;

    private String city = "";

    private Locale country;

    private String postalCode = "";

    private String stateOrProvince = "";

    private String street = "";

    private String streetNumber = "";

    private Coordinates gpsCoordinates = new Coordinates(0, 0);

    private String airportId = "";

    private String airportName = "";

    private String platform = "";

    private String terminal = "";

    private Date departureTime;

    private Date arrivalTime;

    private String stationName = "";

    private String stationId = "";

    private List<String> vehicleTypes = new ArrayList<>();

    public TravelPoint() {
    }

    public Date getDepartureTime() {
        if (departureTime != null) {
            return (Date) departureTime.clone();
        }
        return null;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = (Date) departureTime.clone();
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

    @JsonDeserialize(using = CoordinatesDeserializer.class)
    public void setGpsCoordinates(Coordinates gpsCoordinates) {
        this.gpsCoordinates = gpsCoordinates;
    }
}
