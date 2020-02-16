package de.blackforestsolutions.datamodel.util.objectmothers;

import de.blackforestsolutions.datamodel.Price;

import java.util.Currency;
import java.util.Locale;

public class PriceObjectMother {

    public static Price getPriceWithNoEmptyFields() {
        Price.PriceBuilder price = new Price.PriceBuilder();
        price.setCurrency(Currency.getInstance(Locale.US));
        price.setSymbol("$");
        price.setValue(1.4);
        price.setAffiliateLink("www.google.de");
        return price.build();
    }
}
