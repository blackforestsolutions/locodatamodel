package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

@Getter
@JsonDeserialize(builder = Coordinates.CoordinatesBuilder.class)
public final class Coordinates implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;
    private static final int HASH_CODE_CONSTANT_SEVENTEEN = 17;
    private static final int HASH_CODE_CONSTANT_THIRTY_ONE = 31;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final double latitude;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final double longitude;

    public Coordinates(Coordinates coordinates) {
        this.latitude = coordinates.getLatitude();
        this.longitude = coordinates.getLongitude();
    }

    private Coordinates(CoordinatesBuilder coordinates) {
        this.latitude = coordinates.getLatitude();
        this.longitude = coordinates.getLongitude();
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Coordinates)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Coordinates c = (Coordinates) o;

        // Compare the data members and return accordingly
        return Double.compare(latitude, c.latitude) == 0
                &&
                Double.compare(longitude, c.longitude) == 0;

    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(HASH_CODE_CONSTANT_SEVENTEEN, HASH_CODE_CONSTANT_THIRTY_ONE) // two randomly chosen prime numbers
                .append(latitude)
                .append(longitude)
                .toHashCode();
    }

    @Setter
    @Getter
    @JsonPOJOBuilder(withPrefix = "set")
    public static class CoordinatesBuilder {

        private double latitude;
        private double longitude;

        public CoordinatesBuilder() {

        }

        public CoordinatesBuilder(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public Coordinates build() {
            return new Coordinates(this);
        }
    }
}
