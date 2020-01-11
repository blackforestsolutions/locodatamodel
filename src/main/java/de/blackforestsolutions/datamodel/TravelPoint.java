package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.blackforestsolutions.datamodel.deserializer.CoordinatesDeserializer;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Locale;

@Setter
@Getter
@Slf4j
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

    public TravelPoint() {
    }

    /**
     * Copy constructor for travel point.
     *
     * @param travelPoint you would like to copy
     */
    public TravelPoint(TravelPoint travelPoint) {
        this.city = travelPoint.getCity();
        this.country = travelPoint.getCountry();
        this.postalCode = travelPoint.getPostalCode();
        this.stateOrProvince = travelPoint.getStateOrProvince();
        this.street = travelPoint.getStreet();
        this.streetNumber = travelPoint.getStreetNumber();
        this.gpsCoordinates = travelPoint.getGpsCoordinates();
        this.airportId = travelPoint.getAirportId();
        this.airportName = travelPoint.getAirportName();
        this.platform = travelPoint.getPlatform();
        this.terminal = travelPoint.getTerminal();
        this.departureTime = travelPoint.getDepartureTime();
        this.arrivalTime = travelPoint.getArrivalTime();
        this.stationName = travelPoint.getStationName();
        this.stationId = travelPoint.getStationId();
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

    @Override
    public int hashCode() {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(HASHCODECONSTANT_SEVENTEEN, HASHCODECONSTANT_THIRTY_ONE);
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

    /**
     * Checks all first level attributes of an object and tells if there are null values
     *
     * @return if object has null values or not
     */
    public boolean hasNullAttributes() throws IllegalAccessException {
        for (Field attributeToCheck : this.getClass().getDeclaredFields()) {
            if (attributeToCheck.get(this) == null) {
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
            if (attributeToCheck.get(this) != null) {
                if (attributeToCheck.get(this).getClass().toString().equals(String.class.toString())) {
                    String value = (String) attributeToCheck.get(this);
                    if (StringUtils.isEmpty(value)) {
                        System.out.println(attributeToCheck.getName() + " is empty in TravelPoint");
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
