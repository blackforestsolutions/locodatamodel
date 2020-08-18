package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import de.blackforestsolutions.datamodel.util.LocoJsonMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springdoc.core.Constants;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.Objects;

@Slf4j
@Getter
@JsonDeserialize(builder = TravelPoint.TravelPointBuilder.class)
@Schema(accessMode = Schema.AccessMode.READ_ONLY)
public final class TravelPoint implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;
    private static final int HASH_CODE_CONSTANT_SEVENTEEN = 17;
    private static final int HASH_CODE_CONSTANT_THIRTY_ONE = 31;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, required = true)
    private final String city;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, type = Constants.OPENAPI_STRING_TYPE)
    private final Locale country;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String postalCode;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String street;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final Coordinates gpsCoordinates;

    /**
     * gate property
     */
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String platform;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String terminal;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final ZonedDateTime departureTime;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final ZonedDateTime arrivalTime;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String stationName;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
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

    @Override
    public String toString() {
        LocoJsonMapper jsonMapper = new LocoJsonMapper();
        try {
            return jsonMapper.map(this);
        } catch (JsonProcessingException e) {
            log.error("TravelPoint-Object could not be mapped: ", e);
            return super.toString();
        }
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
    @Accessors(chain = true)
    @JsonPOJOBuilder(withPrefix = "set")
    public static class TravelPointBuilder {

        private String city = "";

        private Locale country;

        private String postalCode = "";

        private String street = "";

        private Coordinates gpsCoordinates = new Coordinates.CoordinatesBuilder(0, 0).build();

        private String platform = "";

        private String terminal = "";

        private ZonedDateTime departureTime;

        private ZonedDateTime arrivalTime;

        private String stationName = "";

        private String stationId = "";

        public TravelPoint build() {
            return new TravelPoint(this);
        }
    }
}
