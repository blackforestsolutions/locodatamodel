package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.blackforestsolutions.datamodel.deserializer.CoordinatesDeserializer;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.HashCodeBuilder;

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

    private String dbStationId = "";

    private String dbStationName = "";

    private String airportId = "";

    private String airportName = "";

    private String platform = "";

    private String terminal = "";

    private String stationName = "";

    public TravelPoint() {
    }

    @JsonDeserialize(using = CoordinatesDeserializer.class)
    public void setGpsCoordinates(Coordinates gpsCoordinates) {
        this.gpsCoordinates = gpsCoordinates;
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof TravelPoint)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        TravelPoint c = (TravelPoint) o;

        // Compare the data members and return accordingly
        return city.equals(c.city)
                &&
                country.equals(c.country)
                &&
                postalCode.equals(c.postalCode)
                &&
                stateOrProvince.equals(c.stateOrProvince)
                &&
                street.equals(c.street)
                &&
                streetNumber.equals(c.streetNumber)
                &&
                gpsCoordinates.equals(c.gpsCoordinates)
                &&
                dbStationId.equals(c.dbStationId)
                &&
                dbStationName.equals(c.dbStationName)
                &&
                airportId.equals(c.airportId)
                &&
                airportName.equals(c.airportName)
                &&
                platform.equals(c.platform)
                &&
                terminal.equals(c.terminal)
                &&
                stationName.equals(c.stationName);
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder(HASHCODECONSTANT_SEVENTEEN, HASHCODECONSTANT_THIRTY_ONE)
                .append(city)
                .append(country.hashCode())
                .append(postalCode)
                .append(stateOrProvince)
                .append(streetNumber)
                .append(gpsCoordinates.hashCode())
                .append(dbStationId)
                .append(dbStationName.hashCode())
                .append(airportId)
                .append(airportName)
                .append(platform)
                .append(terminal.hashCode())
                .append(stationName.hashCode())
                .toHashCode();
    }
}
