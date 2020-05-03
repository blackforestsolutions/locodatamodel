package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Price;
import de.blackforestsolutions.datamodel.PriceCategory;

import java.math.BigDecimal;
import java.util.*;

public class PriceObjectMother {

    public static Price.PriceBuilder getPriceWithNoEmptyFields() {
        Price.PriceBuilder price = new Price.PriceBuilder();
        price.setValues(Map.of(
                PriceCategory.CHILD, new BigDecimal("160.90"),
                PriceCategory.ADULT, new BigDecimal("234.90")
        ));
        price.setCurrency(Currency.getInstance("EUR"));
        price.setSymbol("€");
        price.setAffiliateLinks(Map.of(
                PriceCategory.CHILD, "www.bahn.de",
                PriceCategory.ADULT, "www.bahn.de"
        ));
        return price;
    }
}
