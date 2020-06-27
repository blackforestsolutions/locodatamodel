package de.blackforestsolutions.datamodel;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Setter
@Getter
public class TravelPointStatus {

    private Optional<TravelPoint> travelPoint;
    private Optional<Problem> problem;
}
