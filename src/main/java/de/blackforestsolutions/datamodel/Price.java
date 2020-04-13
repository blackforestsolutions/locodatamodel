package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.core.Constants;

import java.io.Serializable;
import java.util.Currency;

@Getter
@JsonDeserialize(builder = Price.PriceBuilder.class)
@Schema(accessMode = Schema.AccessMode.READ_ONLY)
public final class Price implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final double value;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, type = Constants.OPENAPI_STRING_TYPE)
    private final Currency currency;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String symbol;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private final String affiliateLink;

    /**
     * Copy constructor
     *
     * @param price you would like to copy
     */
    public Price(Price price) {
        this.value = price.getValue();
        this.currency = price.getCurrency();
        this.symbol = price.getSymbol();
        this.affiliateLink = price.getAffiliateLink();
    }

    private Price(PriceBuilder price) {
        this.value = price.getValue();
        this.currency = price.getCurrency();
        this.symbol = price.getSymbol();
        this.affiliateLink = price.getAffiliateLink();
    }

    @Setter
    @Getter
    @JsonPOJOBuilder(withPrefix = "set")
    public static class PriceBuilder {

        private double value;

        private Currency currency;

        private String symbol = "";

        private String affiliateLink = "";

        public Price build() {
            return new Price(this);
        }

    }
}
