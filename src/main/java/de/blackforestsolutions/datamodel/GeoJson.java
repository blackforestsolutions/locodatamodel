package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Getter
@JsonDeserialize(builder = GeoJson.GeoJsonBuilder.class)
@Schema(accessMode = Schema.AccessMode.READ_ONLY)
public final class GeoJson implements Serializable {

    private static final long serialVersionUID = -2529427008797565631L;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String type;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final List<List<Double>> coordinates;

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
    @Accessors(chain = true)
    public static class GeoJsonBuilder {

        private String type;

        private List<List<Double>> coordinates;

        public GeoJson build() {
            return new GeoJson(this);
        }

    }
}