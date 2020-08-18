package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import de.blackforestsolutions.datamodel.exception.CompromisedAttributeException;
import de.blackforestsolutions.datamodel.util.LocoJsonMapper;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

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
     * @return start travelPoint from first leg
     * @throws CompromisedAttributeException
     */
    @JsonIgnore
    public TravelPoint getStartFromJourney() throws CompromisedAttributeException {
        return legs
                .values()
                .stream()
                .findFirst()
                .map(Leg::getStart)
                .orElseThrow(CompromisedAttributeException::new);
    }

    /**
     * @return arrival travelPoint from last leg
     * @throws CompromisedAttributeException
     */
    @JsonIgnore
    public TravelPoint getDestinationFromJourney() throws CompromisedAttributeException {
        return legs
                .values()
                .stream()
                .reduce((first, second) -> second)
                .map(Leg::getDestination)
                .orElseThrow(CompromisedAttributeException::new);
    }

    /**
     * @return start time from first leg
     * @throws CompromisedAttributeException
     */
    @JsonIgnore
    public ZonedDateTime getStartTimeFromJourney() throws CompromisedAttributeException {
        return legs
                .values()
                .stream()
                .findFirst()
                .map(Leg::getStartTime)
                .orElseThrow(CompromisedAttributeException::new);
    }

    /**
     * @return arrival time from last leg
     * @throws CompromisedAttributeException
     */
    @JsonIgnore
    public ZonedDateTime getArrivalTimeFromJourney() throws CompromisedAttributeException {
        return legs
                .values()
                .stream()
                .reduce((first, second) -> second)
                .map(Leg::getArrivalTime)
                .orElseThrow(CompromisedAttributeException::new);
    }

    /**
     * @return duration from whole journey
     * @throws CompromisedAttributeException
     */
    @JsonIgnore
    public Duration getDurationFromJourney() throws CompromisedAttributeException {
        return Duration.between(getStartTimeFromJourney(), getArrivalTimeFromJourney());
    }

    /**
     * @return all incidents from all legs
     */
    @JsonIgnore
    public List<String> getAllIncidentsFromJourney() {
        return legs
                .values()
                .stream()
                .map(Leg::getIncidents)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    /**
     * insert a leg before all other legs
     *
     * @param leg
     * @return new Journey
     */
    @JsonIgnore
    public Journey insertLegBeforeAllLegs(Leg leg) {
        JourneyBuilder journey = new JourneyBuilder(this);
        LinkedHashMap<UUID, Leg> oldLegs = journey.getLegs();
        LinkedHashMap<UUID, Leg> newLegs = (LinkedHashMap<UUID, Leg>) oldLegs.clone();
        oldLegs.clear();
        oldLegs.put(leg.getId(), leg);
        oldLegs.putAll(newLegs);
        journey.setLegs(oldLegs);
        return journey.build();
    }

    /**
     * insert legs before all other legs
     *
     * @param legs
     * @return new Journey
     */
    @JsonIgnore
    public Journey insertLegsBeforeAllLegs(LinkedHashMap<UUID, Leg> legs) {
        JourneyBuilder journey = new JourneyBuilder(this);
        LinkedHashMap<UUID, Leg> oldLegs = journey.getLegs();
        LinkedHashMap<UUID, Leg> newLegs = (LinkedHashMap<UUID, Leg>) oldLegs.clone();
        oldLegs.clear();
        oldLegs.putAll(legs);
        oldLegs.putAll(newLegs);
        journey.setLegs(oldLegs);
        return journey.build();
    }


    /**
     * append a leg at the end of all legs
     *
     * @param leg
     * @return new Journey
     */
    @JsonIgnore
    public Journey appendLegAfterAllLegs(Leg leg) {
        JourneyBuilder journey = new JourneyBuilder(this);
        LinkedHashMap<UUID, Leg> legs = journey.getLegs();
        legs.put(leg.getId(), leg);
        journey.setLegs(legs);
        return journey.build();
    }

    /**
     * append legs at the end of all legs
     *
     * @param legs
     * @return new Journey
     */
    @JsonIgnore
    public Journey appendLegsAfterAllLegs(LinkedHashMap<UUID, Leg> legs) {
        JourneyBuilder journey = new JourneyBuilder(this);
        LinkedHashMap<UUID, Leg> newLegs = journey.getLegs();
        newLegs.putAll(legs);
        journey.setLegs(newLegs);
        return journey.build();
    }

    /**
     * @param id
     * @param leg
     * @return new Journey
     */
    @JsonIgnore
    public Journey replaceLegById(UUID id, Leg leg) {
        JourneyBuilder journey = new JourneyBuilder(this);
        LinkedHashMap<UUID, Leg> legs = journey.getLegs();
        int index = removeByKey(id, legs);
        if (index > -1) {
            putAt(index, leg.getId(), leg, legs);
            journey.setLegs(legs);
        } else {
            log.error("replacing leg was not successful");
        }
        return journey.build();
    }

    private int removeByKey(UUID oldKey, LinkedHashMap<UUID, Leg> legs) {
        Iterator<Map.Entry<UUID, Leg>> itr = legs.entrySet().iterator();
        int foundIndex = -1;
        int index = 0;
        while (itr.hasNext()) {
            Map.Entry<UUID, Leg> entry = itr.next();
            if (entry.getKey().equals(oldKey)) {
                itr.remove();
                foundIndex = index;
            }
            index++;
        }
        return foundIndex;
    }

    private void putAt(int index, UUID key, Leg value, LinkedHashMap<UUID, Leg> map) {
        int i = 0;
        List<Map.Entry<UUID, Leg>> rest = new ArrayList<>();
        for (Map.Entry<UUID, Leg> entry : map.entrySet()) {
            if (i++ >= index) {
                rest.add(entry);
            }
        }
        map.put(key, value);
        for (Map.Entry<UUID, Leg> entry : rest) {
            map.remove(entry.getKey());
            map.put(entry.getKey(), entry.getValue());
        }
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
    public String toString() {
        LocoJsonMapper jsonMapper = new LocoJsonMapper();
        try {
            return jsonMapper.map(this);
        } catch (JsonProcessingException e) {
            log.error("Journey-Object could not be mapped: ", e);
            return super.toString();
        }
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
                Objects.equals(legs, journey.getLegs())
                &&
                Objects.equals(journeysRelated, journey.journeysRelated);
    }

    @Setter
    @Getter
    @Accessors(chain = true)
    @JsonPOJOBuilder(withPrefix = "set")
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class JourneyBuilder {

        @Id
        private UUID id;

        private LinkedHashMap<UUID, Leg> legs = new LinkedHashMap<>();

        private List<UUID> journeysRelated;

        public JourneyBuilder(UUID id) {
            this.id = id;
        }

        public JourneyBuilder(Journey journey) {
            this.id = journey.getId();
            this.legs = journey.getLegs();
            this.journeysRelated = journey.getJourneysRelated();
        }

        public Journey build() {
            return new Journey(this);
        }
    }
}
