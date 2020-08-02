package de.blackforestsolutions.datamodel;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@Getter
@AllArgsConstructor
public class TravelPointStatus {

    private Optional<TravelPoint> travelPoint;
    private Optional<Problem> problem;
}
