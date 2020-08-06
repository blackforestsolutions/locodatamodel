package de.blackforestsolutions.datamodel;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@Getter
@AllArgsConstructor
public class JourneyStatus {

    private Optional<Journey> journey;
    private Optional<Problem> problem;
}
