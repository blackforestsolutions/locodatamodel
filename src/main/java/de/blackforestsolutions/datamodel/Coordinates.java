package de.blackforestsolutions.datamodel;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.HashCodeBuilder;

@Getter
@Setter
public class Coordinates {

    private static final int HASHCODECONSTANT_SEVENTEEN = 17;
    private static final int HASHCODECONSTANT_THIRTY_ONE = 31;
    private double latitude;
    private double longitude;

    public Coordinates() {
    }

    public Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
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
        return new HashCodeBuilder(HASHCODECONSTANT_SEVENTEEN, HASHCODECONSTANT_THIRTY_ONE) // two randomly chosen prime numbers
                .append(latitude)
                .append(longitude)
                .toHashCode();
    }
}
