package de.blackforestsolutions.datamodel;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.NonNull;

@Slf4j
@Getter
public class CallStatus<T> {

    private final T calledObject;

    private final Status status;

    private final Throwable throwable;

    public CallStatus(T calledObject, @NonNull Status status, Throwable throwable) {
        this.calledObject = calledObject;
        this.status = status;
        this.throwable = throwable;
    }
}
