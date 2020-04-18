package de.blackforestsolutions.datamodel;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
public class JourneyStatus {

    private Optional<Journey> journey;
    private Optional<Problem> problem;
}
