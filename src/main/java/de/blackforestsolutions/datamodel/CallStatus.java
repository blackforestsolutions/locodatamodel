package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.blackforestsolutions.datamodel.util.LocoJsonMapper;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.NonNull;

@Slf4j
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CallStatus<T> {

    private T calledObject;

    private Status status;

    private Exception exception;

    public CallStatus(T calledObject, @NonNull Status status, Exception exception) {
        this.calledObject = calledObject;
        this.status = status;
        this.exception = exception;
    }

    @Override
    public String toString() {
        LocoJsonMapper jsonMapper = new LocoJsonMapper();
        try {
            return jsonMapper.map(this);
        } catch (JsonProcessingException e) {
            log.error("CallStatus-Object could not be mapped: ", e);
            return super.toString();
        }
    }
}
