package de.blackforestsolutions.datamodel.exception;

public class CompromisedAttributeException extends Exception {

    public CompromisedAttributeException() {
        super("Attribute for object is null or compromised");
    }
}
