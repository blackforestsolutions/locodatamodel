package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Price;
import de.blackforestsolutions.datamodel.PriceCategory;

import java.math.BigDecimal;
import java.util.*;

public class PriceObjectMother {

    public static Price.PriceBuilder getPriceWithNoEmptyFields() {
        Price.PriceBuilder price = new Price.PriceBuilder();
        price.setValues(buildPriceValues());
        price.setCurrency(Currency.getInstance("EUR"));
        price.setSymbol("€");
        price.setAffiliateLinks(buildPriceAffiliateLinks());
        return price;
    }

    private static HashMap<PriceCategory, BigDecimal> buildPriceValues() {
        HashMap<PriceCategory, BigDecimal> values = new HashMap<>();
        values.put(PriceCategory.CHILD, new BigDecimal("160.90"));
        values.put(PriceCategory.ADULT, new BigDecimal("234.90"));
        return values;
    }

    private static HashMap<PriceCategory, String> buildPriceAffiliateLinks() {
        HashMap<PriceCategory, String> affiliateLinks = new HashMap<>();
        affiliateLinks.put(PriceCategory.CHILD, "www.bahn.de");
        affiliateLinks.put(PriceCategory.ADULT, "www.bahn.de");
        return affiliateLinks;
    }
}
