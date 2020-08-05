package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.ApiTokenAndUrlInformation;

import java.time.ZonedDateTime;

import static de.blackforestsolutions.datamodel.testutil.TestUtils.getResourceFileAsString;

public class ApiTokenAndUrlInformationObjectMother {

    public static ApiTokenAndUrlInformation getApiTokenAndUrlInformation() {
        ApiTokenAndUrlInformation.ApiTokenAndUrlInformationBuilder builder = new ApiTokenAndUrlInformation.ApiTokenAndUrlInformationBuilder();
        builder.setApiName("testApi");
        builder.setProtocol("http");
        builder.setHost("testHost");
        builder.setPort(8089);
        builder.setApiVersion("V1");
        builder.setPathVariable("/testPathVariable/");
        builder.setDeparture("Berlin");
        builder.setArrival("Furtwangen");
        try {
            builder.setDepartureDate(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
            builder.setArrivalDate(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
            builder.setGermanRailDatePathVariable(ZonedDateTime.parse("2020-06-29T10:15:30+01:00"));
        } catch (Exception ignored) {

        }
        builder.setXOriginationIpKey("testKey");
        builder.setXOriginationIp("testIp");
        builder.setAuthorizationKey("testAuthKey");
        builder.setAuthorization("testAuth");
        builder.setPath("/testPath/");
        builder.setHazelcastPath("/hazelcastPath/");
        builder.setHazelcastWritePath("/hazelCastWritePath/");
        builder.setHazelcastReadAllPath("/hazelcastReadPath/");
        builder.setHazelcastSearchPath("/hazelcastSearchPath/");
        builder.setGermanRailJourneyDeatilsPath("/germanRailDetailsPath/");
        builder.setGermanRailDepartureBoardPath("/departureBoard");
        builder.setGermanRailArrivalBoardPath("arrivalBoard");
        builder.setGermanRailLocationPath("locationPath");
        builder.setStationId("testStationId");
        builder.setJourneyDetailsId("testJourneyDetailsId");
        builder.setDatePathVariable("dataPathVariable");
        builder.setSearchChRoutePathVariable("SearchChRoutePathVariable");
        builder.setSearchChResults("setSearchChResults");
        builder.setSearchChDelayParameter("setSearchChDelayParameter");
        builder.setTimePathVariable("setTimePathVariable");
        builder.setStartLocation("setStartLocation");
        builder.setDestinationLocation("setDestinationLocation");
        builder.setLocationPath("setLocationPath");
        builder.setCoordinatesPath("setCoordinatesPath");
        builder.setSearchChTermParameter("setSearchChTermParameter");
        builder.setSearchChStationId("setSearchChStationId");
        builder.setSearchChStationCoordinateParameter("setSearchChStationCoordinateParameter");
        builder.setLocationSearchTerm("setLocationSearchTerm");
        builder.setLanguage("setLanguage");
        builder.setAuthentificationUser("setAuthentificationUser");
        builder.setAuthentificationType("setAuthentificationPassword");
        builder.setAuthentificationPassword("");
        builder.setStationListPathVariable("setStationListPathVariable");
        builder.setJourneyPathVariable("setJourneyPathVariable");
        builder.setTravelPointPathVariable("setTravelPointPathVariable");
        builder.setResultLength(888);
        builder.setDistanceFromTravelPoint(999);
        builder.setResultLengthBeforeDepartureTime(1111);
        builder.setResultLengthAfterDepartureTime(2222);
        builder.setTariff("setTariff");
        builder.setTimeIsDeparture(false);
        builder.setHvvFilterEquivalent(false);
        builder.setHvvAllowTypeSwitch(false);
        builder.setAllowTariffDetails(false);
        builder.setAllowReducedPrice(false);
        builder.setAllowIntermediateStops(false);
        builder.setHvvReturnContSearchData(false);
        builder.setMic("setMic");
        builder.setChecksum("setChecksum");
        builder.setMac("setMac");
        builder.setHafasRtMode("setHafasRtMode");
        builder.setClientId("setClientId");
        builder.setClientSecret("setClientSecret");
        builder.setClientVersion("setClientVersion");
        builder.setClientName("setClientName");
        builder.setClientType("setClientType");
        builder.setTransfers(6);
        builder.setMinTransferTime(777);
        builder.setHafasProductionValue("setHafasProductionValue");
        builder.setForDisabledPersons("setForDisabledPersons");
        builder.setWalkingSpeed("setWalkingSpeed");
        builder.setAllowCoordinates(false);
        builder.setDepartureCoordinates(CoordinatesObjectMother.getCoordinatesWithNoEmptyFields().build());
        builder.setArrivalCoordinates(CoordinatesObjectMother.getCoordinatesWithNoEmptyFields().build());
        builder.setOutputFormat("setOutputFormat");
        builder.setRadius(1000);
        builder.setNumberOfPersons(1);
        builder.setCurrency("Eur");
        builder.setSortDirection("desc");
        builder.setLocoApiFlightPath("locoApiFlightPath");
        builder.setLocoApiLocaterPath("locoApiLocaterPath");
        builder.setLocoApiNearestAirportsPath("locoApiNearestAirportsPath");
        builder.setLocoApiNationalTrainPath("locoApiNationalTrainPath");
        builder.setLocoApiRegionalTrainPath("locoApiRegionalTrainPath");
        builder.setLocoApiRideSharesPath("locoApiRideSharesPath");
        builder.setLocoApiRidesPath("locoApiRidesPath");
        builder.setLocoApiFootPath("locoApiFootPath");
        builder.setLocoApiDirectConnectionPath("locoApiDirectConnectionPath");
        return builder.build();
    }

    public static String getApiTokenAndUrlInformationStringWithNoEmptyFields() {
        return getResourceFileAsString("json/apitokenandurlinformation.json");
    }
}
