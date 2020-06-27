package de.blackforestsolutions.datamodel.exception;

public class IncompleteRoutingException extends Exception {

    public IncompleteRoutingException() {
        super("No Journey found for Request");
    }
}
