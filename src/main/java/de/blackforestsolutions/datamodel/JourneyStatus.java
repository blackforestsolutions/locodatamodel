package de.blackforestsolutions.datamodel;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Optional;

@Getter
@Setter
@Accessors(chain = true)
public class JourneyStatus {

    private Optional<Journey> journey;
    private Optional<Problem> problem;
}
