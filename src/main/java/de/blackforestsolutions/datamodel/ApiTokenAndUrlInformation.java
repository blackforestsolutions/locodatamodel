package de.blackforestsolutions.datamodel;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
public final class ApiTokenAndUrlInformation {

    private final String apiName;
    private final String protocol;
    private final String host;
    private final Integer port;
    private final String apiVersion;
    private final String pathVariable;
    @Schema(required = true)
    private final String departure;
    @Schema(required = true)
    private final String arrival;
    @Schema(required = true)
    private final Date departureDate;
    @Schema(required = true)
    private final Date arrivalDate;
    private final String xOriginationIpKey;
    private final String xOriginationIp;
    private final String authorizationKey;
    /**
     * We need to update our bearer token for lufthansa request
     */
    @Setter
    private String authorization;
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
    private final String coordinatesPath;
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
    private final Integer resultLength;
    private final Integer distanceFromTravelPoint;
    private final Integer resultLengthBeforeDepartureTime;
    private final Integer resultLengthAfterDepartureTime;
    private final String tariff;
    private final Boolean timeIsDeparture;
    private final Boolean hvvFilterEquivalent;
    private final Boolean hvvAllowTypeSwitch;
    private final Boolean allowTariffDetails;
    private final Boolean allowReducedPrice;
    private final Boolean allowIntermediateStops;
    private final Boolean hvvReturnContSearchData;

    private final String mic;
    private final String checksum;
    private final String mac;
    private final String hafasRtMode;
    private final String clientId;
    private final String clientSecret;
    private final String clientVersion;
    private final String clientName;
    private final String clientType;
    private final Integer transfers;
    private final Integer minTransferTime;
    private final String hafasProductionValue;
    private final String forDisabledPersons;
    private final String walkingSpeed;
    private final Boolean allowCoordinates;

    private final Coordinates departureCoordinates;
    private final Coordinates arrivalCoordinates;
    private final String outputFormat;

    private final Integer radius;
    private final Integer numberOfPersons;
    private final String currency;
    private final String sortDirection;

    private ApiTokenAndUrlInformation(ApiTokenAndUrlInformationBuilder apiTokenAndUrlInformation) {
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
        this.coordinatesPath = apiTokenAndUrlInformation.getCoordinatesPath();
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
        this.apiName = apiTokenAndUrlInformation.getApiName();
        this.checksum = apiTokenAndUrlInformation.getChecksum();
        this.mic = apiTokenAndUrlInformation.getMic();
        this.mac = apiTokenAndUrlInformation.getMac();
        this.hafasRtMode = apiTokenAndUrlInformation.getHafasRtMode();
        this.clientId = apiTokenAndUrlInformation.getClientId();
        this.clientSecret = apiTokenAndUrlInformation.getClientSecret();
        this.clientVersion = apiTokenAndUrlInformation.getClientVersion();
        this.clientName = apiTokenAndUrlInformation.getClientName();
        this.clientType = apiTokenAndUrlInformation.getClientType();
        this.transfers = apiTokenAndUrlInformation.getTransfers();
        this.minTransferTime = apiTokenAndUrlInformation.getMinTransferTime();
        this.hafasProductionValue = apiTokenAndUrlInformation.getHafasProductionValue();
        this.forDisabledPersons = apiTokenAndUrlInformation.getForDisabledPersons();
        this.walkingSpeed = apiTokenAndUrlInformation.getWalkingSpeed();
        this.allowCoordinates = apiTokenAndUrlInformation.getAllowCoordinates();
        this.arrivalCoordinates = apiTokenAndUrlInformation.getArrivalCoordinates();
        this.departureCoordinates = apiTokenAndUrlInformation.getDepartureCoordinates();
        this.outputFormat = apiTokenAndUrlInformation.getOutputFormat();
        this.radius = apiTokenAndUrlInformation.getRadius();
        this.numberOfPersons = apiTokenAndUrlInformation.getNumberOfPersons();
        this.currency = apiTokenAndUrlInformation.getCurrency();
        this.sortDirection = apiTokenAndUrlInformation.getSortDirection();
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


    @Getter
    @Setter
    @NoArgsConstructor
    public static class ApiTokenAndUrlInformationBuilder {
        private String apiName;
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
        private String coordinatesPath;
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
        private Integer resultLength;
        private Integer distanceFromTravelPoint;
        private Integer resultLengthBeforeDepartureTime;
        private Integer resultLengthAfterDepartureTime;
        private String tariff;
        private Boolean timeIsDeparture;
        private Boolean hvvFilterEquivalent;
        private Boolean hvvAllowTypeSwitch;
        private Boolean allowTariffDetails;
        private Boolean allowReducedPrice;
        private Boolean allowIntermediateStops;
        private Boolean hvvReturnContSearchData;
        private String checksum;
        private String mic;
        private String mac;
        private String hafasRtMode;
        private String clientId;
        private String clientSecret;
        private String clientVersion;
        private String clientName;
        private String clientType;
        private Integer transfers;
        private Integer minTransferTime;
        private String hafasProductionValue;
        private String forDisabledPersons;
        private String walkingSpeed;
        private Boolean allowCoordinates;
        private Coordinates arrivalCoordinates;
        private Coordinates departureCoordinates;
        private String outputFormat;
        private Integer radius;
        private Integer numberOfPersons;
        private String currency;
        private String sortDirection;

        public ApiTokenAndUrlInformationBuilder(ApiTokenAndUrlInformation apiTokenAndUrlInformation) {
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
            this.coordinatesPath = apiTokenAndUrlInformation.getCoordinatesPath();
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
            this.apiName = apiTokenAndUrlInformation.getApiName();
            this.mic = apiTokenAndUrlInformation.getMic();
            this.mac = apiTokenAndUrlInformation.getMac();
            this.checksum = apiTokenAndUrlInformation.getChecksum();
            this.hafasRtMode = apiTokenAndUrlInformation.getHafasRtMode();
            this.clientId = apiTokenAndUrlInformation.getClientId();
            this.clientSecret = apiTokenAndUrlInformation.getClientSecret();
            this.clientVersion = apiTokenAndUrlInformation.getClientVersion();
            this.clientName = apiTokenAndUrlInformation.getClientName();
            this.clientType = apiTokenAndUrlInformation.getClientType();
            this.transfers = apiTokenAndUrlInformation.getTransfers();
            this.minTransferTime = apiTokenAndUrlInformation.getMinTransferTime();
            this.hafasProductionValue = apiTokenAndUrlInformation.getHafasProductionValue();
            this.forDisabledPersons = apiTokenAndUrlInformation.getForDisabledPersons();
            this.walkingSpeed = apiTokenAndUrlInformation.getWalkingSpeed();
            this.allowCoordinates = apiTokenAndUrlInformation.getAllowCoordinates();
            this.departureCoordinates = apiTokenAndUrlInformation.getDepartureCoordinates();
            this.arrivalCoordinates = apiTokenAndUrlInformation.getArrivalCoordinates();
            this.outputFormat = apiTokenAndUrlInformation.getOutputFormat();
            this.radius = apiTokenAndUrlInformation.getRadius();
            this.numberOfPersons = apiTokenAndUrlInformation.getNumberOfPersons();
            this.currency = apiTokenAndUrlInformation.getCurrency();
            this.sortDirection = apiTokenAndUrlInformation.getSortDirection();
        }

        private ApiTokenAndUrlInformationBuilder copyFrom(ApiTokenAndUrlInformationDto apiTokenAndUrlInformationDto) {
            ApiTokenAndUrlInformationBuilder builder = new ApiTokenAndUrlInformationBuilder();
            builder.setProtocol(apiTokenAndUrlInformationDto.getProtocol());
            builder.setHost(apiTokenAndUrlInformationDto.getHost());
            builder.setPort(apiTokenAndUrlInformationDto.getPort());
            builder.setApiVersion(apiTokenAndUrlInformationDto.getApiVersion());
            builder.setPathVariable(apiTokenAndUrlInformationDto.getPathVariable());
            builder.setDeparture(apiTokenAndUrlInformationDto.getDeparture());
            builder.setArrival(apiTokenAndUrlInformationDto.getArrival());
            builder.setDepartureDate(apiTokenAndUrlInformationDto.getDepartureDate());
            builder.setArrivalDate(apiTokenAndUrlInformationDto.getArrivalDate());
            builder.setXOriginationIpKey(apiTokenAndUrlInformationDto.getXOriginationIpKey());
            builder.setXOriginationIp(apiTokenAndUrlInformationDto.getXOriginationIp());
            builder.setAuthorizationKey(apiTokenAndUrlInformationDto.getAuthorizationKey());
            builder.setAuthorization(apiTokenAndUrlInformationDto.getAuthorization());
            builder.setPath(apiTokenAndUrlInformationDto.getPath());
            builder.setHazelcastPath(apiTokenAndUrlInformationDto.getHazelcastPath());
            builder.setHazelcastWritePath(apiTokenAndUrlInformationDto.getHazelcastWritePath());
            builder.setHazelcastReadAllPath(apiTokenAndUrlInformationDto.getHazelcastReadAllPath());
            builder.setHazelcastSearchPath(apiTokenAndUrlInformationDto.getHazelcastSearchPath());
            builder.setGermanRailJourneyDeatilsPath(apiTokenAndUrlInformationDto.getGermanRailJourneyDeatilsPath());
            builder.setGermanRailDepartureBoardPath(apiTokenAndUrlInformationDto.getGermanRailDepartureBoardPath());
            builder.setGermanRailArrivalBoardPath(apiTokenAndUrlInformationDto.getGermanRailArrivalBoardPath());
            builder.setGermanRailLocationPath(apiTokenAndUrlInformationDto.getGermanRailLocationPath());
            builder.setStationId(apiTokenAndUrlInformationDto.getStationId());
            builder.setJourneyDetailsId(apiTokenAndUrlInformationDto.getJourneyDetailsId());
            builder.setBahnLocation(apiTokenAndUrlInformationDto.getBahnLocation());
            builder.setGermanRailDatePathVariable(apiTokenAndUrlInformationDto.getGermanRailDatePathVariable());
            builder.setDatePathVariable(apiTokenAndUrlInformationDto.getDatePathVariable());
            builder.setSearchChRoutePathVariable(apiTokenAndUrlInformationDto.getSearchChRoutePathVariable());
            builder.setSearchChResults(apiTokenAndUrlInformationDto.getSearchChResults());
            builder.setSearchChDelayParameter(apiTokenAndUrlInformationDto.getSearchChDelayParameter());
            builder.setLocationSearchTerm(apiTokenAndUrlInformationDto.getLocationSearchTerm());
            builder.setTimePathVariable(apiTokenAndUrlInformationDto.getTimePathVariable());
            builder.setStartLocation(apiTokenAndUrlInformationDto.getStartLocation());
            builder.setDestinationLocation(apiTokenAndUrlInformationDto.getDestinationLocation());
            builder.setLocationPath(apiTokenAndUrlInformationDto.getLocationPath());
            builder.setCoordinatesPath(apiTokenAndUrlInformationDto.getCoordinatesPath());
            builder.setSearchChTermParameter(apiTokenAndUrlInformationDto.getSearchChTermParameter());
            builder.setSearchChStationId(apiTokenAndUrlInformationDto.getSearchChStationId());
            builder.setSearchChStationCoordinateParameter(apiTokenAndUrlInformationDto.getSearchChStationCoordinateParameter());
            builder.setLanguage(apiTokenAndUrlInformationDto.getLanguage());
            builder.setAuthentificationUser(apiTokenAndUrlInformationDto.getAuthentificationUser());
            builder.setAuthentificationType(apiTokenAndUrlInformationDto.getAuthentificationType());
            builder.setAuthentificationPassword(apiTokenAndUrlInformationDto.getAuthentificationPassword());
            builder.setStationListPathVariable(apiTokenAndUrlInformationDto.getStationListPathVariable());
            builder.setJourneyPathVariable(apiTokenAndUrlInformationDto.getJourneyPathVariable());
            builder.setTravelPointPathVariable(apiTokenAndUrlInformationDto.getTravelPointPathVariable());
            builder.setResultLength(apiTokenAndUrlInformationDto.getResultLength());
            builder.setDistanceFromTravelPoint(apiTokenAndUrlInformationDto.getDistanceFromTravelPoint());
            builder.setResultLengthBeforeDepartureTime(apiTokenAndUrlInformationDto.getResultLengthBeforeDepartureTime());
            builder.setResultLengthAfterDepartureTime(apiTokenAndUrlInformationDto.getResultLengthAfterDepartureTime());
            builder.setTariff(apiTokenAndUrlInformationDto.getTariff());
            builder.setTimeIsDeparture(apiTokenAndUrlInformationDto.getTimeIsDeparture());
            builder.setHvvFilterEquivalent(apiTokenAndUrlInformationDto.getHvvFilterEquivalent());
            builder.setHvvAllowTypeSwitch(apiTokenAndUrlInformationDto.getHvvAllowTypeSwitch());
            builder.setAllowTariffDetails(apiTokenAndUrlInformationDto.getAllowTariffDetails());
            builder.setAllowReducedPrice(apiTokenAndUrlInformationDto.getAllowReducedPrice());
            builder.setAllowIntermediateStops(apiTokenAndUrlInformationDto.getAllowIntermediateStops());
            builder.setHvvReturnContSearchData(apiTokenAndUrlInformationDto.getHvvReturnContSearchData());
            builder.setApiName(apiTokenAndUrlInformationDto.getApiName());
            builder.setChecksum(apiTokenAndUrlInformationDto.getChecksum());
            builder.setMic(apiTokenAndUrlInformationDto.getMic());
            builder.setMac(apiTokenAndUrlInformationDto.getMac());
            builder.setHafasRtMode(apiTokenAndUrlInformationDto.getHafasRtMode());
            builder.setClientId(apiTokenAndUrlInformationDto.getClientId());
            builder.setClientSecret(apiTokenAndUrlInformationDto.getClientSecret());
            builder.setClientVersion(apiTokenAndUrlInformationDto.getClientVersion());
            builder.setClientName(apiTokenAndUrlInformationDto.getClientName());
            builder.setClientType(apiTokenAndUrlInformationDto.getClientType());
            builder.setTransfers(apiTokenAndUrlInformationDto.getTransfers());
            builder.setMinTransferTime(apiTokenAndUrlInformationDto.getMinTransferTime());
            builder.setHafasProductionValue(apiTokenAndUrlInformationDto.getHafasProductionValue());
            builder.setForDisabledPersons(apiTokenAndUrlInformationDto.getForDisabledPersons());
            builder.setWalkingSpeed(apiTokenAndUrlInformationDto.getWalkingSpeed());
            builder.setAllowCoordinates(apiTokenAndUrlInformationDto.getAllowCoordinates());
            builder.setArrivalCoordinates(apiTokenAndUrlInformationDto.getArrivalCoordinates());
            builder.setDepartureCoordinates(apiTokenAndUrlInformationDto.getDepartureCoordinates());
            builder.setOutputFormat(apiTokenAndUrlInformationDto.getOutputFormat());
            builder.setRadius(apiTokenAndUrlInformationDto.getRadius());
            builder.setNumberOfPersons(apiTokenAndUrlInformationDto.getNumberOfPersons());
            builder.setCurrency(apiTokenAndUrlInformationDto.getCurrency());
            builder.setSortDirection(apiTokenAndUrlInformationDto.getSortDirection());
            return builder;
        }

        public Date getGermanRailDatePathVariable() {
            if (germanRailDatePathVariable != null) {
                return (Date) germanRailDatePathVariable.clone();
            }
            return null;
        }

        public void setGermanRailDatePathVariable(Date germanRailDatePathVariable) {
            if (germanRailDatePathVariable != null) {
                this.germanRailDatePathVariable = (Date) germanRailDatePathVariable.clone();
            } else {
                this.germanRailDatePathVariable = null;
            }
        }

        public Date getDepartureDate() {
            if (departureDate != null) {
                return (Date) departureDate.clone();
            }
            return null;
        }

        public void setDepartureDate(Date departureDate) {
            if (departureDate != null) {
                this.departureDate = (Date) departureDate.clone();
            } else {
                this.departureDate = null;
            }
        }

        public Date getArrivalDate() {
            if (arrivalDate != null) {
                return (Date) arrivalDate.clone();
            }
            return null;
        }

        public void setArrivalDate(Date arrivalDate) {
            if (arrivalDate != null) {
                this.arrivalDate = (Date) arrivalDate.clone();
            } else {
                this.arrivalDate = null;
            }
        }

        public ApiTokenAndUrlInformationBuilder buildFrom(ApiTokenAndUrlInformationDto copySource) {
            return copyFrom(copySource);
        }

        public ApiTokenAndUrlInformationBuilder buildFrom(ApiTokenAndUrlInformation copySource) {
            return new ApiTokenAndUrlInformationBuilder(
                    copySource);
        }

        public ApiTokenAndUrlInformation build() {
            return new ApiTokenAndUrlInformation(this);
        }
    }
}
