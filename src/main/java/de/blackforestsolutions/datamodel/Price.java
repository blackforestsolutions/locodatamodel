package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;

@Getter
@JsonDeserialize(builder = Price.PriceBuilder.class)
public final class Price implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;

    @JsonPropertyOrder(alphabetic = true)
    private final HashMap<PriceCategory, BigDecimal> values;

    private final Currency currency;

    private final String symbol;

    @JsonPropertyOrder(alphabetic = true)
    private final HashMap<PriceCategory, String> affiliateLinks;

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

    public HashMap<PriceCategory, BigDecimal> getValues() {
        return (HashMap<PriceCategory, BigDecimal>) values.clone();
    }

    public HashMap<PriceCategory, String> getAffiliateLinks() {
        return (HashMap<PriceCategory, String>) affiliateLinks.clone();
    }

    @Setter
    @Getter
    @JsonPOJOBuilder(withPrefix = "set")
    public static class PriceBuilder {

        private HashMap<PriceCategory, BigDecimal> values = new HashMap<>();

        private Currency currency;

        private String symbol = "";

        private HashMap<PriceCategory, String> affiliateLinks = new HashMap<>();

        public Price build() {
            return new Price(this);
        }

        public void setValues(HashMap<PriceCategory, BigDecimal> values) {
            this.values = (HashMap<PriceCategory, BigDecimal>) values.clone();
        }

        public HashMap<PriceCategory, BigDecimal> getValues() {
            return (HashMap<PriceCategory, BigDecimal>) values.clone();
        }

        public void setAffiliateLinks(HashMap<PriceCategory, String> affiliateLinks) {
            this.affiliateLinks = (HashMap<PriceCategory, String>) affiliateLinks.clone();
        }

        public HashMap<PriceCategory, String> getAffiliateLinks() {
            return (HashMap<PriceCategory, String>) affiliateLinks.clone();
        }

    }
}
