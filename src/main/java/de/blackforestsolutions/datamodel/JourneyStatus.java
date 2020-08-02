package de.blackforestsolutions.datamodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class JourneyStatus {

    private Optional<Journey> journey;
    private Optional<Problem> problem;
}
