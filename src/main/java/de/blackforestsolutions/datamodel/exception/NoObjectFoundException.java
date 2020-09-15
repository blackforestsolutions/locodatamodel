package de.blackforestsolutions.datamodel.exception;

public class NoObjectFoundException extends Exception {

    public <T> NoObjectFoundException(Class<T> type) {
        super("Object of ".concat(type.getName()).concat(" could not be found."));
    }
}
