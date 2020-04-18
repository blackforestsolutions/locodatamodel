package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Slf4j
@JsonDeserialize(builder = Journey.JourneyBuilder.class)
public final class Journey implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;
    private static final int HASH_CODE_CONSTANT_SEVENTEEN = 17;
    private static final int HASH_CODE_CONSTANT_THIRTY_ONE = 31;

    @Id
    private final UUID id;

    private final LinkedHashMap<UUID, Leg> legs;

    private final List<UUID> journeysRelated;

    /**
     * search for First and last travelPoint method
     * startTime and Arrival time
     * duration total journey
     * distance total journey
     * price total journey
     * list of incidents
     */

    /**
     * wrapper Method
     * legs einfügen vor und danach
     * legs austauschen
     */

    /**
     * Copy Constructor
     *
     * @param journey you would like to copy
     */
    public Journey(Journey journey) {
        this.id = UUID.randomUUID();
        this.legs = journey.getLegs();
        this.journeysRelated = journey.getJourneysRelated();
    }

    private Journey(JourneyBuilder journey) {
        this.id = journey.getId();
        this.legs = journey.getLegs();
        this.journeysRelated = journey.getJourneysRelated();
    }

    public LinkedHashMap<UUID, Leg> getLegs() {
        if (legs != null) {
            return (LinkedHashMap<UUID, Leg>) legs.clone();
        }
        return null;
    }

    /**
     * Checks all first level attributes of an object and tells if there are null values
     *
     * @return if object has null values or not
     */
    public boolean hasNullAttributes() throws IllegalAccessException {
        for (Field attributeToCheck : this.getClass().getDeclaredFields()) {
            if (attributeToCheck.get(this) == null) {
                System.out.println(attributeToCheck.getName() + " is null in journey");
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if an object string field is empty or not
     *
     * @return if object has empty strings or not
     */
    public boolean hasEmptyString() throws IllegalAccessException {
        for (Field attributeToCheck : this.getClass().getDeclaredFields()) {
            if (attributeToCheck.get(this) != null && attributeToCheck.get(this).getClass().toString().equals(String.class.toString())) {
                String value = (String) attributeToCheck.get(this);
                if (StringUtils.isEmpty(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(HASH_CODE_CONSTANT_SEVENTEEN, HASH_CODE_CONSTANT_THIRTY_ONE);
        for (Field attributeToCheck : this.getClass().getDeclaredFields()) {
            try {
                if (attributeToCheck.get(this) != null) {
                    hashCodeBuilder.append(attributeToCheck.hashCode());
                }
            } catch (IllegalAccessException e) {
                log.error("Access Error while accessing to Travelpoint", e);
            }
        }
        return hashCodeBuilder.toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Journey journey = (Journey) o;
        return Objects.equals(id, journey.id)
                &&
                Objects.equals(journey, journey.getLegs())
                &&
                Objects.equals(journeysRelated, journey.journeysRelated);
    }

    @Setter
    @Getter
    @JsonPOJOBuilder(withPrefix = "set")
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class JourneyBuilder {

        @Id
        private UUID id;

        private LinkedHashMap<UUID, Leg> legs;

        private List<UUID> journeysRelated;

        public JourneyBuilder(UUID id) {
            this.id = id;
        }

        public Journey build() {
            return new Journey(this);
        }

        public void setLegs(LinkedHashMap<UUID, Leg> legs) {
            this.legs = (LinkedHashMap<UUID, Leg>) legs.clone();
        }

        public LinkedHashMap<UUID, Leg> getLegs() {
            if (legs != null) {
                return (LinkedHashMap<UUID, Leg>) legs.clone();
            }
            return null;
        }
    }
}
