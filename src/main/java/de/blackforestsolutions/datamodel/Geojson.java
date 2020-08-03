package de.blackforestsolutions.datamodel;
// todo auch testen

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
        "type",
        "coordinates"
})

@Schema(accessMode = Schema.AccessMode.READ_ONLY)
public class Geojson {

    private final static long serialVersionUID = -2529427008797565631L;

    @JsonProperty("type")
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private String type;

    @JsonProperty("coordinates")
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private List<List<Double>> coordinates = null;

    @JsonIgnore
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Geojson() {
    }

    public Geojson(String type, List<List<Double>> coordinates) {
        super();
        this.type = type;
        this.coordinates = coordinates;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("coordinates")
    public List<List<Double>> getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(List<List<Double>> coordinates) {
        this.coordinates = coordinates;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}