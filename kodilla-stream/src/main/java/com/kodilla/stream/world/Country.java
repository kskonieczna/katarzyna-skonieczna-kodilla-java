package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country implements PeopleQuantity {
    private final String countryName;

    public Country(final String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal("100000000000");
        return peopleQuantity;
    }
}