package de.blackforestsolutions.datamodel;

import lombok.Getter;

public class CallStatus {

    @Getter
    private final Object calledObject;
    @Getter
    private final Status status;
    @Getter
    private final Exception exception;

    public CallStatus(Object calledObject, Status status, Exception exception) {
        this.calledObject = calledObject;
        this.status = status;
        this.exception = exception;
    }
}
