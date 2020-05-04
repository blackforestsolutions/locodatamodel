package de.blackforestsolutions.datamodel;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
public final class Problem implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;

    private final List<Exception> exceptions;

    private final List<String> loggedMessages;

    public Problem(Problem problem) {
        this.loggedMessages = problem.getLoggedMessages();
        this.exceptions = problem.getExceptions();
    }

    private Problem(ProblemBuilder problem) {
        this.exceptions = problem.getExceptions();
        this.loggedMessages = problem.getLoggedMessages();
    }

    @Setter
    @Getter
    @Accessors(chain = true)
    public static class ProblemBuilder {

        private List<Exception> exceptions = new ArrayList<>();

        private List<String> loggedMessages = new ArrayList<>();

        public Problem build() {
            return new Problem(this);
        }
    }
}
