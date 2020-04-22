package de.blackforestsolutions.datamodel;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.EnumMap;

@Getter
@JsonDeserialize(builder = Price.PriceBuilder.class)
public final class Price implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;

    @JsonPropertyOrder(alphabetic = true)
    private final EnumMap<PriceCategory, BigDecimal> values;

    private final Currency currency;

    private final String symbol;

    @JsonPropertyOrder(alphabetic = true)
    private final EnumMap<PriceCategory, String> affiliateLinks;

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

    public EnumMap<PriceCategory, BigDecimal> getValues() {
        return values.clone();
    }

    public EnumMap<PriceCategory, String> getAffiliateLinks() {
        return affiliateLinks.clone();
    }

    @Setter
    @Getter
    @JsonPOJOBuilder(withPrefix = "set")
    public static class PriceBuilder {

        private EnumMap<PriceCategory, BigDecimal> values = new EnumMap<>(PriceCategory.class);

        private Currency currency;

        private String symbol = "";

        private EnumMap<PriceCategory, String> affiliateLinks = new EnumMap<>(PriceCategory.class);

        public Price build() {
            return new Price(this);
        }

        public void setValues(EnumMap<PriceCategory, BigDecimal> values) {
            this.values = values.clone();
        }

        public EnumMap<PriceCategory, BigDecimal> getValues() {
            return values.clone();
        }

        public void setAffiliateLinks(EnumMap<PriceCategory, String> affiliateLinks) {
            this.affiliateLinks = affiliateLinks.clone();
        }

        public EnumMap<PriceCategory, String> getAffiliateLinks() {
            return affiliateLinks.clone();
        }

    }
}
