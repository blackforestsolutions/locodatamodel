package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Problem;

public class ProblemObjectMother {

    public static Problem getProblem() {
        return new Problem.ProblemBuilder().build();
    }
}
