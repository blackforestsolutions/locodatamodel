package de.blackforestsolutions.datamodel;

import lombok.Getter;

public class CallStatus {

    @Getter
    private final Object calledObject;
    @Getter
    private final CallStatus callStatus;
    @Getter
    private final Exception exception;

    public CallStatus(Object calledObject, CallStatus callStatus, Exception exception) {
        this.calledObject = calledObject;
        this.callStatus = callStatus;
        this.exception = exception;
    }
}
