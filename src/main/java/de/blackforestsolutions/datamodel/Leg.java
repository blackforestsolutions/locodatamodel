package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import de.blackforestsolutions.datamodel.configuration.OpenApiConfiguration;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Distance;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Slf4j
@JsonDeserialize(builder = Leg.LegBuilder.class)
@Schema(accessMode = Schema.AccessMode.READ_ONLY)
public final class Leg implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;
    private static final int HASH_CODE_CONSTANT_SEVENTEEN = 17;
    private static final int HASH_CODE_CONSTANT_THIRTY_ONE = 31;

    @Id
    @Schema(accessMode = Schema.AccessMode.READ_ONLY, required = true)
    private final UUID id;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final TravelPoint start;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final TravelPoint destination;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final ZonedDateTime startTime;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final ZonedDateTime arrivalTime;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, type = OpenApiConfiguration.OPENAPI_INTEGER_TYPE)
    private final Duration duration;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, type = OpenApiConfiguration.OPENAPI_INTEGER_TYPE)
    private final Duration delay;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final TravelLine travelLine;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final Price price;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, type = OpenApiConfiguration.OPENAPI_INTEGER_TYPE)
    private final Distance distance;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String providerId;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final TravelProvider travelProvider;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String unknownTravelProvider;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final VehicleType vehicleType;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String vehicleName;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String vehicleNumber;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final List<String> incidents;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final boolean hasPrice;

    private Leg(LegBuilder leg) {
        this.id = leg.getId();
        this.start = leg.getStart();
        this.destination = leg.getDestination();
        this.startTime = leg.getStartTime();
        this.arrivalTime = leg.getArrivalTime();
        this.duration = leg.getDuration();
        this.delay = leg.getDelay();
        this.travelLine = leg.getTravelLine();
        this.price = leg.getPrice();
        this.distance = leg.getDistance();
        this.providerId = leg.getProviderId();
        this.travelProvider = leg.getTravelProvider();
        this.unknownTravelProvider = leg.getUnknownTravelProvider();
        this.vehicleType = leg.getVehicleType();
        this.vehicleName = leg.getVehicleName();
        this.vehicleNumber = leg.getVehicleNumber();
        this.incidents = leg.getIncidents();
        this.hasPrice = leg.getHasPrice();
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
        Leg leg = (Leg) o;
        return Objects.equals(id, leg.id)
                &&
                Objects.equals(start, leg.start)
                &&
                Objects.equals(destination, leg.destination)
                &&
                Objects.equals(startTime, leg.getStartTime())
                &&
                Objects.equals(arrivalTime, leg.arrivalTime)
                &&
                Objects.equals(duration, leg.duration)
                &&
                Objects.equals(delay, leg.delay)
                &&
                Objects.equals(travelLine, leg.travelLine)
                &&
                Objects.equals(price, leg.price)
                &&
                Objects.equals(distance, leg.distance)
                &&
                Objects.equals(providerId, leg.providerId)
                &&
                Objects.equals(travelProvider, leg.travelProvider)
                &&
                Objects.equals(unknownTravelProvider, leg.unknownTravelProvider)
                &&
                Objects.equals(vehicleType, leg.vehicleType)
                &&
                Objects.equals(vehicleName, leg.vehicleName)
                &&
                Objects.equals(vehicleNumber, leg.vehicleNumber)
                &&
                Objects.equals(incidents, leg.incidents);
    }


    @Setter
    @Getter
    @Accessors(chain = true)
    @JsonPOJOBuilder(withPrefix = "set")
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class LegBuilder {

        @Id
        private UUID id;

        private TravelPoint start;

        private TravelPoint destination;

        private ZonedDateTime startTime;

        private ZonedDateTime arrivalTime;

        private Duration duration;

        private Duration delay;

        private TravelLine travelLine;

        private Price price;

        private Distance distance;

        private String providerId = "";

        private TravelProvider travelProvider;

        private String unknownTravelProvider = "";

        private VehicleType vehicleType;

        private String vehicleName = "";

        private String vehicleNumber = "";

        private List<String> incidents = new ArrayList<>();

        private boolean hasPrice;


        public LegBuilder(UUID id) {
            this.id = id;
        }

        public boolean getHasPrice() {
            return hasPrice;
        }

        public Leg build() {
            return new Leg(this);
        }

    }

}
