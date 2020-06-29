package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public final class ApiTokenAndUrlInformationDto {

    @JsonProperty("apiName")
    private String apiName;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("host")
    private String host;
    @JsonProperty("port")
    private Integer port;
    @JsonProperty("apiVersion")
    private String apiVersion;
    @JsonProperty("pathVariable")
    private String pathVariable;
    @Schema(required = true)
    @JsonProperty("departure")
    private String departure;
    @Schema(required = true)
    @JsonProperty("arrival")
    private String arrival;
    @Schema(required = true)
    @JsonProperty("departureDate")
    private Date departureDate;
    @Schema(required = true)
    @JsonProperty("arrivalDate")
    private Date arrivalDate;
    @JsonProperty("xOriginationIpKey")
    private String xOriginationIpKey;
    @JsonProperty("xOriginationIp")
    private String xOriginationIp;
    @JsonProperty("authorizationKey")
    private String authorizationKey;
    /**
     * We need to update our bearer token for lufthansa request
     */
    @Setter
    @JsonProperty("authorization")
    private String authorization;
    @JsonProperty("path")
    private String path;
    @JsonProperty("hazelcastPath")
    private String hazelcastPath;
    @JsonProperty("hazelcastWritePath")
    private String hazelcastWritePath;
    @JsonProperty("hazelcastReadAllPath")
    private String hazelcastReadAllPath;
    @JsonProperty("hazelcastSearchPath")
    private String hazelcastSearchPath;
    @JsonProperty("germanRailJourneyDeatilsPath")
    private String germanRailJourneyDeatilsPath;
    @JsonProperty("germanRailDepartureBoardPath")
    private String germanRailDepartureBoardPath;
    @JsonProperty("germanRailArrivalBoardPath")
    private String germanRailArrivalBoardPath;
    @JsonProperty("germanRailLocationPath")
    private String germanRailLocationPath;
    @JsonProperty("germanRailDatePathVariable")
    private Date germanRailDatePathVariable;
    @JsonProperty("stationId")
    private String stationId;
    @JsonProperty("journeyDetailsId")
    private String journeyDetailsId;
    @JsonProperty("bahnLocation")
    private String bahnLocation;
    @JsonProperty("datePathVariable")
    private String datePathVariable;
    @JsonProperty("searchChRoutePathVariable")
    private String searchChRoutePathVariable;
    @JsonProperty("searchChResults")
    private String searchChResults;
    @JsonProperty("searchChDelayParameter")
    private String searchChDelayParameter;
    @JsonProperty("timePathVariable")
    private String timePathVariable;
    @JsonProperty("startLocation")
    private String startLocation;
    @JsonProperty("destinationLocation")
    private String destinationLocation;
    @JsonProperty("locationPath")
    private String locationPath;
    @JsonProperty("coordinatesPath")
    private String coordinatesPath;
    @JsonProperty("searchChTermParameter")
    private String searchChTermParameter;
    @JsonProperty("searchChStationId")
    private String searchChStationId;
    @JsonProperty("searchChStationCoordinateParameter")
    private String searchChStationCoordinateParameter;
    @JsonProperty("locationSearchTerm")
    private String locationSearchTerm;
    @JsonProperty("language")
    private String language;
    @JsonProperty("authentificationUser")
    private String authentificationUser;
    @JsonProperty("authentificationType")
    private String authentificationType;
    @JsonProperty("authentificationPassword")
    private String authentificationPassword;
    @JsonProperty("stationListPathVariable")
    private String stationListPathVariable;
    @JsonProperty("journeyPathVariable")
    private String journeyPathVariable;
    @JsonProperty("travelPointPathVariable")
    private String travelPointPathVariable;
    @JsonProperty("resultLength")
    private Integer resultLength;
    @JsonProperty("distanceFromTravelPoint")
    private Integer distanceFromTravelPoint;
    @JsonProperty("resultLengthBeforeDepartureTime")
    private Integer resultLengthBeforeDepartureTime;
    @JsonProperty("resultLengthAfterDepartureTime")
    private Integer resultLengthAfterDepartureTime;
    @JsonProperty("tariff")
    private String tariff;
    @JsonProperty("timeIsDeparture")
    private Boolean timeIsDeparture;
    @JsonProperty("hvvFilterEquivalent")
    private Boolean hvvFilterEquivalent;
    @JsonProperty("hvvAllowTypeSwitch")
    private Boolean hvvAllowTypeSwitch;
    @JsonProperty("allowTariffDetails")
    private Boolean allowTariffDetails;
    @JsonProperty("allowReducedPrice")
    private Boolean allowReducedPrice;
    @JsonProperty("allowIntermediateStops")
    private Boolean allowIntermediateStops;
    @JsonProperty("hvvReturnContSearchData")
    private Boolean hvvReturnContSearchData;
    @JsonProperty("mic")
    private String mic;
    @JsonProperty("checksum")
    private String checksum;
    @JsonProperty("mac")
    private String mac;
    @JsonProperty("hafasRtMode")
    private String hafasRtMode;
    @JsonProperty("clientId")
    private String clientId;
    @JsonProperty("clientSecret")
    private String clientSecret;
    @JsonProperty("clientVersion")
    private String clientVersion;
    @JsonProperty("clientName")
    private String clientName;
    @JsonProperty("clientType")
    private String clientType;
    @JsonProperty("transfers")
    private Integer transfers;
    @JsonProperty("minTransferTime")
    private Integer minTransferTime;
    @JsonProperty("hafasProductionValue")
    private String hafasProductionValue;
    @JsonProperty("forDisabledPersons")
    private String forDisabledPersons;
    @JsonProperty("walkingSpeed")
    private String walkingSpeed;
    @JsonProperty("allowCoordinates")
    private Boolean allowCoordinates;
    @JsonProperty("departureCoordinates")
    private Coordinates departureCoordinates;
    @JsonProperty("arrivalCoordinates")
    private Coordinates arrivalCoordinates;
    @JsonProperty("outputFormat")
    private String outputFormat;
    @JsonProperty("radius")
    private Integer radius;
    @JsonProperty("numberOfPersons")
    private Integer numberOfPersons;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("sortDirection")
    private String sortDirection;
    @JsonProperty("locoApiFlightPath")
    private String locoApiFlightPath;
    @JsonProperty("locoApiLocaterPath")
    private String locoApiLocaterPath;
    @JsonProperty("locoApiNearestAirportsPath")
    private String locoApiNearestAirportsPath;
    @JsonProperty("locoApiNationalTrainPath")
    private String locoApiNationalTrainPath;
    @JsonProperty("locoApiRegionalTrainPath")
    private String locoApiRegionalTrainPath;
    @JsonProperty("locoApiRideSharesPath")
    private String locoApiRideSharesPath;
    @JsonProperty("locoApiRidesPath")
    private String locoApiRidesPath;
    @JsonProperty("locoApiFootPath")
    private String locoApiFootPath;
    @JsonProperty("locoApiDirectConnectionPath")
    private String locoApiDirectConnectionPath;

    public ApiTokenAndUrlInformationDto() {
    }

    public ApiTokenAndUrlInformationDto(ApiTokenAndUrlInformation apiTokenAndUrlInformation) {
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
        this.locoApiFlightPath = apiTokenAndUrlInformation.getLocoApiFlightPath();
        this.locoApiLocaterPath = apiTokenAndUrlInformation.getLocoApiLocaterPath();
        this.locoApiNearestAirportsPath = apiTokenAndUrlInformation.getLocoApiNearestAirportsPath();
        this.locoApiNationalTrainPath = apiTokenAndUrlInformation.getLocoApiNationalTrainPath();
        this.locoApiRegionalTrainPath = apiTokenAndUrlInformation.getLocoApiRegionalTrainPath();
        this.locoApiRideSharesPath = apiTokenAndUrlInformation.getLocoApiRideSharesPath();
        this.locoApiRidesPath = apiTokenAndUrlInformation.getLocoApiRidesPath();
        this.locoApiFootPath = apiTokenAndUrlInformation.getLocoApiFootPath();
        this.locoApiDirectConnectionPath = apiTokenAndUrlInformation.getLocoApiDirectConnectionPath();
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
}
