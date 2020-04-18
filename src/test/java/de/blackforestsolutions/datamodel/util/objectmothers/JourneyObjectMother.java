package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Journey;
import de.blackforestsolutions.datamodel.Leg;

import java.util.*;

import static de.blackforestsolutions.datamodel.util.objectmothers.LegObjectMother.getLegWithNoEmptyFields;
import static de.blackforestsolutions.datamodel.util.objectmothers.UUIDObjectMother.*;
import static de.blackforestsolutions.datamodel.testutil.TestUtils.getResourceFileAsString;
import static org.apache.commons.lang.StringUtils.deleteWhitespace;

public class JourneyObjectMother {

    public static Journey.JourneyBuilder getJourneyWithNoEmptyFields() {
        Journey.JourneyBuilder journey = new Journey.JourneyBuilder(TEST_UUID_1);
        journey.setJourneysRelated(Collections.singletonList(TEST_UUID_2));
        journey.setLegs(buildLinkedLegHashMap());
        return journey;
    }

    public static String getJourneyStringWithNoEmptyFields() {
        return getResourceFileAsString("json/journey.json");
    }

    private static LinkedHashMap<UUID, Leg> buildLinkedLegHashMap() {
        LinkedHashMap<UUID, Leg> legs = new LinkedHashMap<>();
        legs.put(getLegWithNoEmptyFields().getId(), getLegWithNoEmptyFields().build());
        return legs;
    }
}
