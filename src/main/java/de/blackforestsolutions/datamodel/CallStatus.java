package de.blackforestsolutions.datamodel;

import lombok.Getter;
import org.springframework.lang.NonNull;

@Getter
public class CallStatus {

    private final Object calledObject;

    private final Status status;

    private final Exception exception;

    public CallStatus(Object calledObject, @NonNull Status status, Exception exception) {
        this.calledObject = calledObject;
        this.status = status;
        this.exception = exception;
    }
}
