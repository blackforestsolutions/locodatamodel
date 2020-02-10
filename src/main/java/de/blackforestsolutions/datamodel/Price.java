package de.blackforestsolutions.datamodel;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Currency;

@Setter
@Getter
public class Price implements Serializable {

    private static final long serialVersionUID = 6106269076155338045L;

    private double value;

    private Currency currency;

    private String symbol;

    private String affiliateLink;

    public Price() {
    }

}
