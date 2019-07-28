package de.blackforestsolutions.datamodel;

import lombok.Getter;
import lombok.Setter;

import java.util.Currency;

@Setter
@Getter
public class Price {

    private double value;

    private Currency currency;

    private String symbol;

    public Price() {
    }

}
