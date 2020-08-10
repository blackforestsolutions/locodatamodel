package de.blackforestsolutions.datamodel.exception;

public class NoObjectFoundException extends Exception {

    public NoObjectFoundException(String type) {
        super("Object of ".concat(type).concat(" could not be found."));
    }
}
