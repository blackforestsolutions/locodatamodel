package de.blackforestsolutions.datamodel.exception;

public class VehicleTypeException extends Exception {

    public VehicleTypeException(Class c) {
        super("No vehicle type found in: ".concat(c.getName()));
    }
}
