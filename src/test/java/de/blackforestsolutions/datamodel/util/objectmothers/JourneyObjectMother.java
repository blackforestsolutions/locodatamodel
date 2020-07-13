package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Journey;
import de.blackforestsolutions.datamodel.Leg;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import static de.blackforestsolutions.datamodel.testutil.TestUtils.getResourceFileAsString;
import static de.blackforestsolutions.datamodel.util.objectmothers.LegObjectMother.getFirstLegWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.LegObjectMother.getSecondLegWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.UUIDObjectMother.TEST_UUID_1;
import static de.blackforestsolutions.datamodel.util.objectmothers.UUIDObjectMother.TEST_UUID_2;

public class JourneyObjectMother {

    public static Journey.JourneyBuilder getJourneyWithNoEmptyFields() {
        Journey.JourneyBuilder journey = new Journey.JourneyBuilder(TEST_UUID_1);
        journey.setJourneysRelated(Collections.singletonList(TEST_UUID_2));
        journey.setLegs(buildLinkedLegHashMap());
        return journey;
    }

    public static Journey.JourneyBuilder getJourneyWithEmptyLeg() {
        Journey.JourneyBuilder journey = new Journey.JourneyBuilder(TEST_UUID_1);
        journey.setLegs(new LinkedHashMap<>());
        return journey;
    }

    public static String getJourneyStringWithNoEmptyFields() {
        return getResourceFileAsString("json/journey.json");
    }

    private static LinkedHashMap<UUID, Leg> buildLinkedLegHashMap() {
        LinkedHashMap<UUID, Leg> legs = new LinkedHashMap<>();
        legs.put(getFirstLegWithNoEmptyFields().getId(), getFirstLegWithNoEmptyFields().build());
        legs.put(getSecondLegWithNoEmptyFields().getId(), getSecondLegWithNoEmptyFields().build());
        return legs;
    }

    public static String getJourneysStringWithNoEmptyFields() {
        return getResourceFileAsString("json/journeyMap.json");
    }

    public static Map<UUID,Journey> getJourneyMapWithNoEmptyFields() {
        return Map.of(
                getJourneyWithNoEmptyFields().getId(), getJourneyWithNoEmptyFields().build()
        );
    }
}
