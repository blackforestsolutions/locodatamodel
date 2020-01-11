package de.blackforestsolutions.datamodel;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
public class ApiTokenAndUrlInformation {

    private final String protocol;
    private final String host;
    private final Integer port;
    private final String apiVersion;
    private final String pathVariable;
    private final String departure;
    private final String arrival;
    private final Date departureDate;
    private final Date arrivalDate;
    private final String xOriginationIpKey;
    private final String xOriginationIp;
    private final String authorizationKey;
    private final String authorization;
    private final String path;
    private final String hazelcastPath;
    private final String hazelcastWritePath;
    private final String hazelcastReadAllPath;
    private final String hazelcastSearchPath;
    private final String germanRailJourneyDeatilsPath;
    private final String germanRailDepartureBoardPath;
    private final String germanRailArrivalBoardPath;
    private final String germanRailLocationPath;
    private final Date germanRailDatePathVariable;
    private final String stationId;
    private final String journeyDetailsId;
    private final String bahnLocation;

    private final String datePathVariable;
    private final String searchChRoutePathVariable;
    private final String searchChResults;
    private final String searchChDelayParameter;
    private final String timePathVariable;
    private final String startLocation;
    private final String destinationLocation;
    private final String locationPath;
    private final String searchChTermParameter;
    private final String searchChStationId;
    private final String searchChStationCoordinateParameter;
    private final String locationSearchTerm;
    private final String language;
    private final String authentificationUser;
    private final String authentificationType;
    private final String authentificationPassword;
    private final String stationListPathVariable;
    private final String journeyPathVariable;
    private final String travelPointPathVariable;
    private final int resultLength;
    private final int distanceFromTravelPoint;
    private final int resultLengthBeforeDepartureTime;
    private final int resultLengthAfterDepartureTime;
    private final String tariff;
    private final Boolean timeIsDeparture;
    private final Boolean hvvFilterEquivalent;
    private final Boolean hvvAllowTypeSwitch;
    private final Boolean allowTariffDetails;
    private final Boolean allowReducedPrice;
    private final Boolean allowIntermediateStops;
    private final Boolean hvvReturnContSearchData;


    public ApiTokenAndUrlInformation(ApiTokenAndUrlInformation apiTokenAndUrlInformation) {
        this.protocol = apiTokenAndUrlInformation.getProtocol();
        this.host = apiTokenAndUrlInformation.getHost();
        this.port = apiTokenAndUrlInformation.getPort();
        this.apiVersion = apiTokenAndUrlInformation.getApiVersion();
        this.pathVariable = apiTokenAndUrlInformation.getPathVariable();
        this.departure = apiTokenAndUrlInformation.getDeparture();
        this.arrival = apiTokenAndUrlInformation.getArrival();
        this.departureDate = apiTokenAndUrlInformation.getDepartureDate();
        this.arrivalDate = apiTokenAndUrlInformation.getArrivalDate();
        this.xOriginationIpKey = apiTokenAndUrlInformation.getXOriginationIpKey();
        this.xOriginationIp = apiTokenAndUrlInformation.getXOriginationIp();
        this.authorizationKey = apiTokenAndUrlInformation.getAuthorizationKey();
        this.authorization = apiTokenAndUrlInformation.getAuthorization();
        this.path = apiTokenAndUrlInformation.getPath();
        this.hazelcastPath = apiTokenAndUrlInformation.getHazelcastPath();
        this.hazelcastWritePath = apiTokenAndUrlInformation.getHazelcastWritePath();
        this.hazelcastReadAllPath = apiTokenAndUrlInformation.getHazelcastReadAllPath();
        this.hazelcastSearchPath = apiTokenAndUrlInformation.getHazelcastSearchPath();
        this.germanRailJourneyDeatilsPath = apiTokenAndUrlInformation.getGermanRailJourneyDeatilsPath();
        this.germanRailDepartureBoardPath = apiTokenAndUrlInformation.getGermanRailDepartureBoardPath();
        this.germanRailArrivalBoardPath = apiTokenAndUrlInformation.getGermanRailArrivalBoardPath();
        this.germanRailLocationPath = apiTokenAndUrlInformation.getGermanRailLocationPath();
        this.stationId = apiTokenAndUrlInformation.getStationId();
        this.journeyDetailsId = apiTokenAndUrlInformation.getJourneyDetailsId();
        this.bahnLocation = apiTokenAndUrlInformation.getBahnLocation();
        this.germanRailDatePathVariable = apiTokenAndUrlInformation.getGermanRailDatePathVariable();
        this.datePathVariable = apiTokenAndUrlInformation.getDatePathVariable();
        this.searchChRoutePathVariable = apiTokenAndUrlInformation.getSearchChRoutePathVariable();
        this.searchChResults = apiTokenAndUrlInformation.getSearchChResults();
        this.searchChDelayParameter = apiTokenAndUrlInformation.getSearchChDelayParameter();
        this.timePathVariable = apiTokenAndUrlInformation.getTimePathVariable();
        this.startLocation = apiTokenAndUrlInformation.getStartLocation();
        this.destinationLocation = apiTokenAndUrlInformation.getDestinationLocation();
        this.locationPath = apiTokenAndUrlInformation.getLocationPath();
        this.searchChTermParameter = apiTokenAndUrlInformation.getSearchChTermParameter();
        this.searchChStationId = apiTokenAndUrlInformation.getSearchChStationId();
        this.searchChStationCoordinateParameter = apiTokenAndUrlInformation.getSearchChStationCoordinateParameter();
        this.locationSearchTerm = apiTokenAndUrlInformation.getLocationSearchTerm();
        this.language = apiTokenAndUrlInformation.getLanguage();
        this.authentificationUser = apiTokenAndUrlInformation.getAuthentificationUser();
        this.authentificationType = apiTokenAndUrlInformation.getAuthentificationType();
        this.authentificationPassword = apiTokenAndUrlInformation.getAuthentificationPassword();
        this.stationListPathVariable = apiTokenAndUrlInformation.getStationListPathVariable();
        this.journeyPathVariable = apiTokenAndUrlInformation.getJourneyPathVariable();
        this.travelPointPathVariable = apiTokenAndUrlInformation.getTravelPointPathVariable();
        this.resultLength = apiTokenAndUrlInformation.getResultLength();
        this.distanceFromTravelPoint = apiTokenAndUrlInformation.getDistanceFromTravelPoint();
        this.resultLengthBeforeDepartureTime = apiTokenAndUrlInformation.getResultLengthBeforeDepartureTime();
        this.resultLengthAfterDepartureTime = apiTokenAndUrlInformation.getResultLengthAfterDepartureTime();
        this.tariff = apiTokenAndUrlInformation.getTariff();
        this.timeIsDeparture = apiTokenAndUrlInformation.getTimeIsDeparture();
        this.hvvFilterEquivalent = apiTokenAndUrlInformation.getHvvFilterEquivalent();
        this.hvvAllowTypeSwitch = apiTokenAndUrlInformation.getHvvAllowTypeSwitch();
        this.allowTariffDetails = apiTokenAndUrlInformation.getAllowTariffDetails();
        this.allowReducedPrice = apiTokenAndUrlInformation.getAllowReducedPrice();
        this.allowIntermediateStops = apiTokenAndUrlInformation.getAllowIntermediateStops();
        this.hvvReturnContSearchData = apiTokenAndUrlInformation.getHvvReturnContSearchData();
    }

    public ApiTokenAndUrlInformation(ApiTokenAndUrlInformationBuilder apiTokenAndUrlInformation) {
        this.protocol = apiTokenAndUrlInformation.getProtocol();
        this.host = apiTokenAndUrlInformation.getHost();
        this.port = apiTokenAndUrlInformation.getPort();
        this.apiVersion = apiTokenAndUrlInformation.getApiVersion();
        this.pathVariable = apiTokenAndUrlInformation.getPathVariable();
        this.departure = apiTokenAndUrlInformation.getDeparture();
        this.arrival = apiTokenAndUrlInformation.getArrival();
        this.departureDate = apiTokenAndUrlInformation.getDepartureDate();
        this.arrivalDate = apiTokenAndUrlInformation.getArrivalDate();
        this.xOriginationIpKey = apiTokenAndUrlInformation.getXOriginationIpKey();
        this.xOriginationIp = apiTokenAndUrlInformation.getXOriginationIp();
        this.authorizationKey = apiTokenAndUrlInformation.getAuthorizationKey();
        this.authorization = apiTokenAndUrlInformation.getAuthorization();
        this.path = apiTokenAndUrlInformation.getPath();
        this.hazelcastPath = apiTokenAndUrlInformation.getHazelcastPath();
        this.hazelcastWritePath = apiTokenAndUrlInformation.getHazelcastWritePath();
        this.hazelcastReadAllPath = apiTokenAndUrlInformation.getHazelcastReadAllPath();
        this.hazelcastSearchPath = apiTokenAndUrlInformation.getHazelcastSearchPath();
        this.germanRailJourneyDeatilsPath = apiTokenAndUrlInformation.getGermanRailJourneyDeatilsPath();
        this.germanRailDepartureBoardPath = apiTokenAndUrlInformation.getGermanRailDepartureBoardPath();
        this.germanRailArrivalBoardPath = apiTokenAndUrlInformation.getGermanRailArrivalBoardPath();
        this.germanRailLocationPath = apiTokenAndUrlInformation.getGermanRailLocationPath();
        this.stationId = apiTokenAndUrlInformation.getStationId();
        this.journeyDetailsId = apiTokenAndUrlInformation.getJourneyDetailsId();
        this.bahnLocation = apiTokenAndUrlInformation.getBahnLocation();
        this.germanRailDatePathVariable = apiTokenAndUrlInformation.getGermanRailDatePathVariable();
        this.datePathVariable = apiTokenAndUrlInformation.getDatePathVariable();
        this.searchChRoutePathVariable = apiTokenAndUrlInformation.getSearchChRoutePathVariable();
        this.searchChResults = apiTokenAndUrlInformation.getSearchChResults();
        this.searchChDelayParameter = apiTokenAndUrlInformation.getSearchChDelayParameter();
        this.locationSearchTerm = apiTokenAndUrlInformation.getLocationSearchTerm();
        this.timePathVariable = apiTokenAndUrlInformation.getTimePathVariable();
        this.startLocation = apiTokenAndUrlInformation.getStartLocation();
        this.destinationLocation = apiTokenAndUrlInformation.getDestinationLocation();
        this.locationPath = apiTokenAndUrlInformation.getLocationPath();
        this.searchChTermParameter = apiTokenAndUrlInformation.getSearchChTermParameter();
        this.searchChStationId = apiTokenAndUrlInformation.getSearchChStationId();
        this.searchChStationCoordinateParameter = apiTokenAndUrlInformation.getSearchChStationCoordinateParameter();
        this.language = apiTokenAndUrlInformation.getLanguage();
        this.authentificationUser = apiTokenAndUrlInformation.getAuthentificationUser();
        this.authentificationType = apiTokenAndUrlInformation.getAuthentificationType();
        this.authentificationPassword = apiTokenAndUrlInformation.getAuthentificationPassword();
        this.stationListPathVariable = apiTokenAndUrlInformation.getStationListPathVariable();
        this.journeyPathVariable = apiTokenAndUrlInformation.getJourneyPathVariable();
        this.travelPointPathVariable = apiTokenAndUrlInformation.getTravelPointPathVariable();
        this.resultLength = apiTokenAndUrlInformation.getResultLength();
        this.distanceFromTravelPoint = apiTokenAndUrlInformation.getDistanceFromTravelPoint();
        this.resultLengthBeforeDepartureTime = apiTokenAndUrlInformation.getResultLengthBeforeDepartureTime();
        this.resultLengthAfterDepartureTime = apiTokenAndUrlInformation.getResultLengthAfterDepartureTime();
        this.tariff = apiTokenAndUrlInformation.getTariff();
        this.timeIsDeparture = apiTokenAndUrlInformation.getTimeIsDeparture();
        this.hvvFilterEquivalent = apiTokenAndUrlInformation.getHvvFilterEquivalent();
        this.hvvAllowTypeSwitch = apiTokenAndUrlInformation.getHvvAllowTypeSwitch();
        this.allowTariffDetails = apiTokenAndUrlInformation.getAllowTariffDetails();
        this.allowReducedPrice = apiTokenAndUrlInformation.getAllowReducedPrice();
        this.allowIntermediateStops = apiTokenAndUrlInformation.getAllowIntermediateStops();
        this.hvvReturnContSearchData = apiTokenAndUrlInformation.getHvvReturnContSearchData();
    }

    public ApiTokenAndUrlInformation(ApiTokenAndUrlInformationBuilderConfig apiTokenAndUrlInformation) {
        this.protocol = apiTokenAndUrlInformation.getProtocol();
        this.host = apiTokenAndUrlInformation.getHost();
        this.port = apiTokenAndUrlInformation.getPort();
        this.apiVersion = apiTokenAndUrlInformation.getApiVersion();
        this.pathVariable = apiTokenAndUrlInformation.getPathVariable();
        this.departure = null;
        this.arrival = null;
        this.departureDate = null;
        this.arrivalDate = null;
        this.xOriginationIpKey = null;
        this.xOriginationIp = null;
        this.authorizationKey = null;
        this.authorization = null;
        this.path = null;
        this.hazelcastPath = apiTokenAndUrlInformation.getHazelcastPath();
        this.hazelcastWritePath = apiTokenAndUrlInformation.getHazelcastWritePath();
        this.hazelcastReadAllPath = apiTokenAndUrlInformation.getHazelcastReadAllPath();
        this.hazelcastSearchPath = apiTokenAndUrlInformation.getHazelcastSearchPath();
        this.germanRailJourneyDeatilsPath = apiTokenAndUrlInformation.getGermanRailJourneyDeatilsPath();
        this.germanRailDepartureBoardPath = apiTokenAndUrlInformation.getGermanRailDepartureBoardPathVariable();
        this.germanRailArrivalBoardPath = apiTokenAndUrlInformation.getGermanRailArrivalBoardPath();
        this.germanRailLocationPath = apiTokenAndUrlInformation.getGermanRailLocationPath();
        this.germanRailDatePathVariable = null;
        this.stationId = null;
        this.journeyDetailsId = null;
        this.bahnLocation = null;
        this.datePathVariable = apiTokenAndUrlInformation.getDatePathVariable();
        this.searchChRoutePathVariable = apiTokenAndUrlInformation.getSearchChRoutePathVariable();
        this.searchChResults = apiTokenAndUrlInformation.getSearchChResults();
        this.searchChDelayParameter = apiTokenAndUrlInformation.getSearchChDelayParameter();
        this.timePathVariable = apiTokenAndUrlInformation.getTimePathVariable();
        this.startLocation = apiTokenAndUrlInformation.getStartLocation();
        this.destinationLocation = apiTokenAndUrlInformation.getDestinationLocation();
        this.locationPath = apiTokenAndUrlInformation.getLocationPath();
        this.searchChTermParameter = apiTokenAndUrlInformation.getSearchChTermParameter();
        this.searchChStationId = apiTokenAndUrlInformation.getSearchChStationId();
        this.searchChStationCoordinateParameter = apiTokenAndUrlInformation.getSearchChStationCoordinateParameter();
        this.locationSearchTerm = apiTokenAndUrlInformation.getLocationSearchTerm();
        this.language = apiTokenAndUrlInformation.getLanguage();
        this.authentificationUser = apiTokenAndUrlInformation.getAuthentificationUser();
        this.authentificationType = apiTokenAndUrlInformation.getAuthentificationType();
        this.authentificationPassword = apiTokenAndUrlInformation.getAuthentificationPassword();
        this.stationListPathVariable = apiTokenAndUrlInformation.getStationListPathVariable();
        this.journeyPathVariable = apiTokenAndUrlInformation.getJourneyPathVariable();
        this.travelPointPathVariable = apiTokenAndUrlInformation.getTravelPointPathVariable();
        this.resultLength = apiTokenAndUrlInformation.getResultLength();
        this.distanceFromTravelPoint = apiTokenAndUrlInformation.getDistanceFromTravelPoint();
        this.resultLengthBeforeDepartureTime = apiTokenAndUrlInformation.getResultLengthBeforeDepartureTime();
        this.resultLengthAfterDepartureTime = apiTokenAndUrlInformation.getResultLengthAfterDepartureTime();
        this.tariff = apiTokenAndUrlInformation.getTariff();
        this.timeIsDeparture = apiTokenAndUrlInformation.getTimeIsDeparture();
        this.hvvFilterEquivalent = apiTokenAndUrlInformation.getHvvFilterEquivalent();
        this.hvvAllowTypeSwitch = apiTokenAndUrlInformation.getHvvAllowTypeSwitch();
        this.allowTariffDetails = apiTokenAndUrlInformation.getAllowTariffDetails();
        this.allowReducedPrice = apiTokenAndUrlInformation.getAllowReducedPrice();
        this.allowIntermediateStops = apiTokenAndUrlInformation.getAllowIntermediateStops();
        this.hvvReturnContSearchData = apiTokenAndUrlInformation.getHvvReturnContSearchData();
    }

    public Date getGermanRailDatePathVariable() {
        if (germanRailDatePathVariable != null) {
            return (Date) germanRailDatePathVariable.clone();
        }
        return null;
    }


    public Date getDepartureDate() {
        if (departureDate != null) {
            return (Date) departureDate.clone();
        }
        return null;
    }

    public Date getArrivalDate() {
        if (arrivalDate != null) {
            return (Date) arrivalDate.clone();
        }
        return null;
    }

    public static class ApiTokenAndUrlInformationBuilderConfig {
        @Getter
        @Setter
        private String protocol;
        @Getter
        @Setter
        private String host;
        @Getter
        @Setter
        private Integer port = -1;
        @Getter
        @Setter
        private String apiVersion;
        @Getter
        @Setter
        private String pathVariable;
        @Getter
        @Setter
        private String departure;
        @Getter
        @Setter
        private String arrival;
        @Getter
        @Setter
        private String hazelcastPath;
        @Getter
        @Setter
        private String hazelcastWritePath;
        @Getter
        @Setter
        private String hazelcastReadAllPath;
        @Getter
        @Setter
        private String hazelcastSearchPath;
        @Getter
        @Setter
        private String xOriginationIpKey;
        @Getter
        @Setter
        private String xOriginationIp;
        @Getter
        @Setter
        private String authorizationKey;
        @Getter
        @Setter
        private String authorization;
        @Getter
        @Setter
        private String germanRailJourneyDeatilsPath;
        @Getter
        @Setter
        private String germanRailArrivalBoardPath;
        @Getter
        @Setter
        private String germanRailLocationPath;
        @Getter
        @Setter
        private String germanRailDepartureBoardPathVariable;
        @Getter
        @Setter
        private String datePathVariable;
        @Getter
        @Setter
        private String searchChRoutePathVariable;
        @Getter
        @Setter
        private String searchChResults;
        @Getter
        @Setter
        private String searchChDelayParameter;
        @Getter
        @Setter
        private String timePathVariable;
        @Getter
        @Setter
        private String startLocation;
        @Getter
        @Setter
        private String destinationLocation;
        @Getter
        @Setter
        private String locationPath;
        @Getter
        @Setter
        private String searchChTermParameter;
        @Getter
        @Setter
        private String searchChStationId;
        @Getter
        @Setter
        private String searchChStationCoordinateParameter;
        @Getter
        @Setter
        private String locationSearchTerm;
        @Getter
        @Setter
        private String language;
        @Getter
        @Setter
        private String authentificationUser;
        @Getter
        @Setter
        private String authentificationType;
        @Getter
        @Setter
        private String authentificationPassword;
        @Getter
        @Setter
        private String stationListPathVariable;
        @Getter
        @Setter
        private String journeyPathVariable;
        @Getter
        @Setter
        private String travelPointPathVariable;
        @Getter
        @Setter
        private int resultLength;
        @Getter
        @Setter
        private int distanceFromTravelPoint;
        @Getter
        @Setter
        private int resultLengthBeforeDepartureTime;
        @Getter
        @Setter
        private int resultLengthAfterDepartureTime;
        @Getter
        @Setter
        private String tariff;
        @Getter
        @Setter
        private Boolean timeIsDeparture;
        @Getter
        @Setter
        private Boolean hvvFilterEquivalent;
        @Getter
        @Setter
        private Boolean hvvAllowTypeSwitch;
        @Getter
        @Setter
        private Boolean allowTariffDetails;
        @Getter
        @Setter
        private Boolean allowReducedPrice;
        @Getter
        @Setter
        private Boolean allowIntermediateStops;
        @Getter
        @Setter
        private Boolean hvvReturnContSearchData;


        public ApiTokenAndUrlInformationBuilderConfig() {
        }

        public ApiTokenAndUrlInformation build() {
            return new ApiTokenAndUrlInformation(this);
        }

    }

    @Getter
    @Setter
    public static class ApiTokenAndUrlInformationBuilder {
        private String protocol;
        private String host;
        private Integer port = -1;
        private String apiVersion;
        private String pathVariable;
        private String departure;
        private String arrival;
        private Date departureDate;
        private Date arrivalDate;
        private String xOriginationIpKey;
        private String xOriginationIp;
        private String authorizationKey;
        private String authorization;
        private String path;
        private String hazelcastPath;
        private String hazelcastWritePath;
        private String hazelcastReadAllPath;
        private String hazelcastSearchPath;
        private String germanRailJourneyDeatilsPath;
        private String germanRailDepartureBoardPath;
        private String germanRailArrivalBoardPath;
        private String germanRailLocationPath;
        private Date germanRailDatePathVariable;
        private String stationId;
        private String journeyDetailsId;
        private String bahnLocation;
        private String datePathVariable;
        private String searchChRoutePathVariable;
        private String searchChResults;
        private String searchChDelayParameter;
        private String timePathVariable;
        private String startLocation;
        private String destinationLocation;
        private String locationPath;
        private String searchChTermParameter;
        private String searchChStationId;
        private String searchChStationCoordinateParameter;
        private String locationSearchTerm;
        private String language;
        private String authentificationUser;
        private String authentificationType;
        private String authentificationPassword;
        private String stationListPathVariable;
        private String journeyPathVariable;
        private String travelPointPathVariable;
        private int resultLength;
        private int distanceFromTravelPoint;
        private int resultLengthBeforeDepartureTime;
        private int resultLengthAfterDepartureTime;
        private String tariff;
        private Boolean timeIsDeparture;
        private Boolean hvvFilterEquivalent;
        private Boolean hvvAllowTypeSwitch;
        private Boolean allowTariffDetails;
        private Boolean allowReducedPrice;
        private Boolean allowIntermediateStops;
        private Boolean hvvReturnContSearchData;


        private ApiTokenAndUrlInformationBuilder(ApiTokenAndUrlInformation apiTokenAndUrlInformation) {
            this.protocol = apiTokenAndUrlInformation.getProtocol();
            this.host = apiTokenAndUrlInformation.getHost();
            this.port = apiTokenAndUrlInformation.getPort();
            this.apiVersion = apiTokenAndUrlInformation.getApiVersion();
            this.pathVariable = apiTokenAndUrlInformation.getPathVariable();
            this.departure = apiTokenAndUrlInformation.getDeparture();
            this.arrival = apiTokenAndUrlInformation.getArrival();
            this.departureDate = apiTokenAndUrlInformation.getDepartureDate();
            this.arrivalDate = apiTokenAndUrlInformation.getArrivalDate();
            this.xOriginationIpKey = apiTokenAndUrlInformation.getXOriginationIpKey();
            this.xOriginationIp = apiTokenAndUrlInformation.getXOriginationIp();
            this.authorizationKey = apiTokenAndUrlInformation.getAuthorizationKey();
            this.authorization = apiTokenAndUrlInformation.getAuthorization();
            this.path = apiTokenAndUrlInformation.getPath();
            this.hazelcastPath = apiTokenAndUrlInformation.getHazelcastPath();
            this.hazelcastWritePath = apiTokenAndUrlInformation.getHazelcastWritePath();
            this.hazelcastReadAllPath = apiTokenAndUrlInformation.getHazelcastReadAllPath();
            this.hazelcastSearchPath = apiTokenAndUrlInformation.getHazelcastSearchPath();
            this.germanRailJourneyDeatilsPath = apiTokenAndUrlInformation.getGermanRailJourneyDeatilsPath();
            this.germanRailDepartureBoardPath = apiTokenAndUrlInformation.getGermanRailDepartureBoardPath();
            this.germanRailArrivalBoardPath = apiTokenAndUrlInformation.getGermanRailArrivalBoardPath();
            this.germanRailLocationPath = apiTokenAndUrlInformation.getGermanRailLocationPath();
            this.germanRailDatePathVariable = apiTokenAndUrlInformation.getGermanRailDatePathVariable();
            this.stationId = apiTokenAndUrlInformation.getStationId();
            this.journeyDetailsId = apiTokenAndUrlInformation.getJourneyDetailsId();
            this.bahnLocation = apiTokenAndUrlInformation.getBahnLocation();
            this.datePathVariable = apiTokenAndUrlInformation.getDatePathVariable();
            this.searchChRoutePathVariable = apiTokenAndUrlInformation.getSearchChRoutePathVariable();
            this.searchChResults = apiTokenAndUrlInformation.getSearchChResults();
            this.searchChDelayParameter = apiTokenAndUrlInformation.getSearchChDelayParameter();
            this.timePathVariable = apiTokenAndUrlInformation.getTimePathVariable();
            this.startLocation = apiTokenAndUrlInformation.getStartLocation();
            this.destinationLocation = apiTokenAndUrlInformation.getDestinationLocation();
            this.locationPath = apiTokenAndUrlInformation.getLocationPath();
            this.searchChTermParameter = apiTokenAndUrlInformation.getSearchChTermParameter();
            this.searchChStationId = apiTokenAndUrlInformation.getSearchChStationId();
            this.searchChStationCoordinateParameter = apiTokenAndUrlInformation.getSearchChStationCoordinateParameter();
            this.locationSearchTerm = apiTokenAndUrlInformation.getLocationSearchTerm();
            this.language = apiTokenAndUrlInformation.getLanguage();
            this.authentificationUser = apiTokenAndUrlInformation.getAuthentificationUser();
            this.authentificationType = apiTokenAndUrlInformation.getAuthentificationType();
            this.authentificationPassword = apiTokenAndUrlInformation.getAuthentificationPassword();
            this.stationListPathVariable = apiTokenAndUrlInformation.getStationListPathVariable();
            this.journeyPathVariable = apiTokenAndUrlInformation.getJourneyPathVariable();
            this.travelPointPathVariable = apiTokenAndUrlInformation.getTravelPointPathVariable();
            this.resultLength = apiTokenAndUrlInformation.getResultLength();
            this.distanceFromTravelPoint = apiTokenAndUrlInformation.getDistanceFromTravelPoint();
            this.resultLengthBeforeDepartureTime = apiTokenAndUrlInformation.getResultLengthBeforeDepartureTime();
            this.resultLengthAfterDepartureTime = apiTokenAndUrlInformation.getResultLengthAfterDepartureTime();
            this.tariff = apiTokenAndUrlInformation.getTariff();
            this.timeIsDeparture = apiTokenAndUrlInformation.getTimeIsDeparture();
            this.hvvFilterEquivalent = apiTokenAndUrlInformation.getHvvFilterEquivalent();
            this.hvvAllowTypeSwitch = apiTokenAndUrlInformation.getHvvAllowTypeSwitch();
            this.allowTariffDetails = apiTokenAndUrlInformation.getAllowTariffDetails();
            this.timeIsDeparture = apiTokenAndUrlInformation.getTimeIsDeparture();
            this.allowReducedPrice = apiTokenAndUrlInformation.getAllowReducedPrice();
            this.allowIntermediateStops = apiTokenAndUrlInformation.getAllowIntermediateStops();
            this.hvvReturnContSearchData = apiTokenAndUrlInformation.getHvvReturnContSearchData();
        }

        public ApiTokenAndUrlInformationBuilder() {

        }

        public Date getGermanRailDatePathVariable() {
            if (germanRailDatePathVariable != null) {
                return (Date) germanRailDatePathVariable.clone();
            }
            return null;
        }

        public void setGermanRailDatePathVariable(Date germanRailDatePathVariable) {
            this.germanRailDatePathVariable = (Date) germanRailDatePathVariable.clone();
        }

        public Date getDepartureDate() {
            if (departureDate != null) {
                return (Date) departureDate.clone();
            }
            return null;
        }

        public void setDepartureDate(Date departureDate) {
            this.departureDate = (Date) departureDate.clone();
        }

        public Date getArrivalDate() {
            if (arrivalDate != null) {
                return (Date) arrivalDate.clone();
            }
            return null;
        }

        public void setArrivalDate(Date arrivalDate) {
            this.arrivalDate = (Date) arrivalDate.clone();
        }

        public ApiTokenAndUrlInformationBuilder buildFrom(ApiTokenAndUrlInformation copySource) {
            ApiTokenAndUrlInformationBuilder builder = new ApiTokenAndUrlInformationBuilder(
                    copySource);
            return builder;
        }

        public ApiTokenAndUrlInformation build() {
            ApiTokenAndUrlInformation apiTokenAndUrlInformation = new ApiTokenAndUrlInformation(this);
            return apiTokenAndUrlInformation;
        }
    }
}
