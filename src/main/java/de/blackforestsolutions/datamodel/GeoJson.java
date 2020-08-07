package de.blackforestsolutions.datamodel;
// todo auch testen

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@JsonDeserialize(builder = GeoJson.GeoJsonBuilder.class)
@Schema(accessMode = Schema.AccessMode.READ_ONLY)
public class GeoJson implements Serializable {

    private static final long serialVersionUID = -2529427008797565631L;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private String type;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private List<List<Double>> coordinates;

    public GeoJson(GeoJson geojson) {
        this.type = geojson.getType();
        this.coordinates = geojson.coordinates;
    }

    public GeoJson(String type, List<List<Double>> coordinates) {
        super();
        this.type = type;
        this.coordinates = coordinates;
    }

    private GeoJson(GeoJsonBuilder geojsonBuilder) {
        this.coordinates = geojsonBuilder.getCoordinates();
        this.type = geojsonBuilder.getType();
    }


    @Getter
    @Setter
    @JsonPOJOBuilder(withPrefix = "set")
    public static class GeoJsonBuilder {

        private String type;

        private List<List<Double>> coordinates;

        public GeoJson build() {
            return new GeoJson(this);
        }
    }
}