package de.blackforestsolutions.datamodel;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
public class ApiTokenAndUrlInformation {

    public static final String ACCEPT = "Accept";
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
    private final String bbcPathVariable;
    private final String bbcVersion;
    private final String baApplication;
    private final String baClientKey;
    private final String baHost;
    private final String baVersion;
    private final String baVariable;
    private final String bbcAuthorization;
    private final String bbcAuthorizationKey;
    private final String baApplicationKey;
    private final String baClientKeyKey;
    private final String searchChTermParameter;
    private final String searchChStationCoordinateParameter;
    private final String searchChStationId;
    private final String locationPath;
    private final String locationSearchTerm;


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
        this.bbcPathVariable = apiTokenAndUrlInformation.getBbcPathVariable();
        this.bbcVersion = apiTokenAndUrlInformation.getBbcVersion();
        this.baApplication = apiTokenAndUrlInformation.getBaApplication();
        this.baClientKey = apiTokenAndUrlInformation.getBaClientKey();
        this.baHost = apiTokenAndUrlInformation.getBaHost();
        this.baVersion = apiTokenAndUrlInformation.getBaVersion();
        this.baVariable = apiTokenAndUrlInformation.getBaVariable();
        this.bbcAuthorization = apiTokenAndUrlInformation.getBbcAuthorization();
        this.bbcAuthorizationKey = apiTokenAndUrlInformation.getBbcAuthorizationKey();
        this.baApplicationKey = apiTokenAndUrlInformation.getBaApplicationKey();
        this.baClientKeyKey = apiTokenAndUrlInformation.getBaClientKeyKey();
        this.searchChTermParameter = apiTokenAndUrlInformation.getSearchChTermParameter();
        this.searchChStationCoordinateParameter = apiTokenAndUrlInformation.getSearchChStationCoordinateParameter();
        this.searchChStationId = apiTokenAndUrlInformation.getSearchChStationId();
        this.locationPath = apiTokenAndUrlInformation.getLocationPath();
        this.locationSearchTerm = apiTokenAndUrlInformation.getLocationSearchTerm();
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
        this.bbcPathVariable = apiTokenAndUrlInformation.getBbcPathVariable();
        this.bbcVersion = apiTokenAndUrlInformation.getBbcVersion();
        this.baApplication = apiTokenAndUrlInformation.getBaApplication();
        this.baClientKey = apiTokenAndUrlInformation.getBaClientKey();
        this.baHost = apiTokenAndUrlInformation.getBaHost();
        this.baVersion = apiTokenAndUrlInformation.getBaVersion();
        this.baVariable = apiTokenAndUrlInformation.getBaVariable();
        this.bbcAuthorization = apiTokenAndUrlInformation.getBbcAuthorization();
        this.bbcAuthorizationKey = apiTokenAndUrlInformation.getBbcAuthorizationKey();
        this.baApplicationKey = apiTokenAndUrlInformation.getBaApplicationKey();
        this.baClientKeyKey = apiTokenAndUrlInformation.getBaClientKeyKey();
        this.searchChTermParameter = apiTokenAndUrlInformation.getSearchChTermParameter();
        this.searchChStationCoordinateParameter = apiTokenAndUrlInformation.getSearchChStationCoordinateParameter();
        this.searchChStationId = apiTokenAndUrlInformation.getSearchChStationId();
        this.locationPath = apiTokenAndUrlInformation.getLocationPath();
        this.locationSearchTerm = apiTokenAndUrlInformation.getLocationSearchTerm();
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
        this.bbcPathVariable = apiTokenAndUrlInformation.getBbcPathVariable();
        this.bbcVersion = apiTokenAndUrlInformation.getBbcVersion();
        this.baApplication = apiTokenAndUrlInformation.getBaApplication();
        this.baClientKey = apiTokenAndUrlInformation.getBaClientKey();
        this.baHost = apiTokenAndUrlInformation.getBaHost();
        this.baVersion = apiTokenAndUrlInformation.getBaVersion();
        this.baVariable = apiTokenAndUrlInformation.getBaVariable();
        this.bbcAuthorization = apiTokenAndUrlInformation.getBbcAuthorization();
        this.bbcAuthorizationKey = apiTokenAndUrlInformation.getBbcAuthorizationKey();
        this.baApplicationKey = apiTokenAndUrlInformation.getBaApplicationKey();
        this.baClientKeyKey = apiTokenAndUrlInformation.getBaClientKeyKey();
        this.searchChTermParameter = apiTokenAndUrlInformation.getSearchChStationCoordinateParameter();
        this.searchChStationCoordinateParameter = apiTokenAndUrlInformation.getSearchChStationCoordinateParameter();
        this.searchChStationId = apiTokenAndUrlInformation.getSearchChStationId();
        this.locationPath = apiTokenAndUrlInformation.getLocationPath();
        this.locationSearchTerm = null;
    }

    public String getBbcPathVariable() {
        return bbcPathVariable;
    }

    public String getBbcVersion() {
        return bbcVersion;
    }

    public String getBaApplication() {
        return baApplication;
    }

    public String getBaClientKey() {
        return baClientKey;
    }

    public String getBaHost() {
        return baHost;
    }

    public String getBaVersion() {
        return baVersion;
    }

    public String getBaVariable() {
        return baVariable;
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
        private String bbcPathVariable;
        @Getter
        @Setter
        private String bbcVersion;
        @Getter
        @Setter
        private String baApplication;
        @Getter
        @Setter
        private String baClientKey;
        @Getter
        @Setter
        private String baHost;
        @Getter
        @Setter
        private String baVersion;
        @Getter
        @Setter
        private String baVariable;
        @Getter
        @Setter
        private String bbcAuthorization;
        @Getter
        @Setter
        private String bbcAuthorizationKey;
        @Getter
        @Setter
        private String baApplicationKey;
        @Getter
        @Setter
        private String baClientKeyKey;
        @Getter
        @Setter
        private String searchChTermParameter;
        @Getter
        @Setter
        private String searchChStationCoordinateParameter;
        @Getter
        @Setter
        private String searchChStationId;
        @Getter
        @Setter
        private String locationPath;
        @Getter
        @Setter
        private String locationSearchTerm;

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
        private String bbcPathVariable;
        private String bbcVersion;
        private String baApplication;
        private String baClientKey;
        private String baHost;
        private String baVersion;
        private String baVariable;
        private String bbcAuthorization;
        private String bbcAuthorizationKey;
        private String baApplicationKey;
        private String baClientKeyKey;
        private String searchChTermParameter;
        private String searchChStationCoordinateParameter;
        private String searchChStationId;
        private String locationPath;
        private String locationSearchTerm;

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
            this.bbcPathVariable = apiTokenAndUrlInformation.getBbcPathVariable();
            this.bbcVersion = apiTokenAndUrlInformation.getBbcVersion();
            this.baApplication = apiTokenAndUrlInformation.getBaApplication();
            this.baClientKey = apiTokenAndUrlInformation.getBaClientKey();
            this.baHost = apiTokenAndUrlInformation.getBaHost();
            this.baVersion = apiTokenAndUrlInformation.getBaVersion();
            this.baVariable = apiTokenAndUrlInformation.getBaVariable();
            this.bbcAuthorization = apiTokenAndUrlInformation.getBbcAuthorization();
            this.bbcAuthorizationKey = apiTokenAndUrlInformation.getBbcAuthorizationKey();
            this.baApplicationKey = apiTokenAndUrlInformation.getBaApplicationKey();
            this.baClientKeyKey = apiTokenAndUrlInformation.getBaClientKeyKey();
            this.searchChTermParameter = apiTokenAndUrlInformation.getSearchChTermParameter();
            this.searchChStationCoordinateParameter = apiTokenAndUrlInformation.getSearchChStationCoordinateParameter();
            this.searchChStationId = apiTokenAndUrlInformation.getSearchChStationId();
            this.locationPath = apiTokenAndUrlInformation.getLocationPath();
            this.locationSearchTerm = apiTokenAndUrlInformation.getLocationSearchTerm();
        }

        public ApiTokenAndUrlInformationBuilder() {

        }

        public String getBbcPathVariable() {
            return bbcPathVariable;
        }

        public String getBbcVersion() {
            return bbcVersion;
        }

        public String getBaApplication() {
            return baApplication;
        }

        public String getBaClientKey() {
            return baClientKey;
        }

        public String getBaHost() {
            return baHost;
        }

        public String getBaVersion() {
            return baVersion;
        }

        public String getBaVariable() {
            return baVariable;
        }
        public String getBbcAuthorization() {
            return bbcAuthorization;
        }
        public String getBbcAuthorizationKey() {
            return bbcAuthorizationKey;
        }
        public String getBaApplicationKey() {
            return baApplicationKey;
        }
        public String getBaClientKeyKey() { return baClientKeyKey;}

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
