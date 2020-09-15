package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

@Getter
@JsonDeserialize(builder = Price.PriceBuilder.class)
public final class Price implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;

    @JsonPropertyOrder(alphabetic = true)
    private final Map<PriceCategory, BigDecimal> values;
    private final Currency currency;
    private final String symbol;
    @JsonPropertyOrder(alphabetic = true)
    private final Map<PriceCategory, String> affiliateLinks;

    /**
     * Copy constructor
     *
     * @param price you would like to copy
     */
    public Price(Price price) {
        this.values = price.getValues();
        this.currency = price.getCurrency();
        this.symbol = price.getSymbol();
        this.affiliateLinks = price.getAffiliateLinks();
    }

    private Price(PriceBuilder price) {
        this.values = price.getValues();
        this.currency = price.getCurrency();
        this.symbol = price.getSymbol();
        this.affiliateLinks = price.getAffiliateLinks();
    }

    public Map<PriceCategory, BigDecimal> getValues() {
        return (Map<PriceCategory, BigDecimal>) new HashMap<>(values).clone();
    }

    public Map<PriceCategory, String> getAffiliateLinks() {
        return (Map<PriceCategory, String>) new HashMap<>(affiliateLinks).clone();
    }

    @Setter
    @Getter
    @Accessors(chain = true)
    @JsonPOJOBuilder(withPrefix = "set")
    public static class PriceBuilder {

        private Map<PriceCategory, BigDecimal> values = new HashMap<>();

        private Currency currency;

        private String symbol = "";

        private Map<PriceCategory, String> affiliateLinks = new HashMap<>();

        public Price build() {
            return new Price(this);
        }

        public PriceBuilder setValues(Map<PriceCategory, BigDecimal> values) {
            this.values = (Map<PriceCategory, BigDecimal>) new HashMap<>(values).clone();
            return this;
        }

        public Map<PriceCategory, BigDecimal> getValues() {
            return (Map<PriceCategory, BigDecimal>) new HashMap<>(values).clone();
        }

        public PriceBuilder setAffiliateLinks(Map<PriceCategory, String> affiliateLinks) {
            this.affiliateLinks = (Map<PriceCategory, String>) new HashMap<>(affiliateLinks).clone();
            return this;
        }

        public Map<PriceCategory, String> getAffiliateLinks() {
            return (Map<PriceCategory, String>) new HashMap<>(affiliateLinks).clone();
        }

    }
}
