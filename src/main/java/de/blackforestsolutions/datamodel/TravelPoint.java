package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

@Slf4j
@Getter
@JsonDeserialize(builder = TravelPoint.TravelPointBuilder.class)
public final class TravelPoint implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;
    private static final int HASH_CODE_CONSTANT_SEVENTEEN = 17;
    private static final int HASH_CODE_CONSTANT_THIRTY_ONE = 31;

    private final String city;

    private final Locale country;

    private final String postalCode;

    private final String street;

    private final Coordinates gpsCoordinates;

    /**
     * gate property
     */
    private final String platform;

    private final String terminal;

    private final Date departureTime;

    private final Date arrivalTime;

    private final String stationName;

    private final String stationId;

    /**
     * Copy constructor for travel point.
     *
     * @param travelPoint you would like to copy
     */
    public TravelPoint(TravelPoint travelPoint) {
        this.city = travelPoint.getCity();
        this.country = travelPoint.getCountry();
        this.postalCode = travelPoint.getPostalCode();
        this.street = travelPoint.getStreet();
        this.gpsCoordinates = travelPoint.getGpsCoordinates();
        this.platform = travelPoint.getPlatform();
        this.terminal = travelPoint.getTerminal();
        this.departureTime = travelPoint.getDepartureTime();
        this.arrivalTime = travelPoint.getArrivalTime();
        this.stationName = travelPoint.getStationName();
        this.stationId = travelPoint.getStationId();
    }

    private TravelPoint(TravelPointBuilder travelPoint) {
        this.city = travelPoint.getCity();
        this.country = travelPoint.getCountry();
        this.postalCode = travelPoint.getPostalCode();
        this.street = travelPoint.getStreet();
        this.gpsCoordinates = travelPoint.getGpsCoordinates();
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

    public Date getArrivalTime() {
        if (arrivalTime != null) {
            return (Date) arrivalTime.clone();
        }
        return null;
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
        TravelPoint that = (TravelPoint) o;
        return Objects.equals(city, that.city)
                && Objects.equals(country, that.country)
                &&
                Objects.equals(postalCode, that.postalCode)
                &&
                Objects.equals(street, that.street)
                &&
                Objects.equals(gpsCoordinates, that.gpsCoordinates)
                &&
                Objects.equals(platform, that.platform)
                &&
                Objects.equals(terminal, that.terminal)
                &&
                Objects.equals(departureTime, that.departureTime)
                &&
                Objects.equals(arrivalTime, that.arrivalTime)
                &&
                Objects.equals(stationName, that.stationName)
                &&
                Objects.equals(stationId, that.stationId);
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
            if (attributeToCheck.get(this) != null && attributeToCheck.get(this).getClass().toString().equals(String.class.toString())) {
                String value = (String) attributeToCheck.get(this);
                if (StringUtils.isEmpty(value)) {
                    System.out.println(attributeToCheck.getName() + " is empty in TravelPoint");
                    return true;
                }
            }
        }
        return false;
    }

    @Setter
    @Getter
    @JsonPOJOBuilder(withPrefix = "set")
    public static class TravelPointBuilder {

        private String city = "";

        private Locale country;

        private String postalCode = "";

        private String street = "";

        private Coordinates gpsCoordinates = new Coordinates.CoordinatesBuilder(0, 0).build();

        private String platform = "";

        private String terminal = "";

        private Date departureTime;

        private Date arrivalTime;

        private String stationName = "";

        private String stationId = "";

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

        public TravelPoint build() {
            return new TravelPoint(this);
        }
    }
}
