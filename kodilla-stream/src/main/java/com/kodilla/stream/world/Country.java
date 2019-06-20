package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Set;
import java.util.stream.Collectors;

public class Country {
    private final String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public static BigDecimal getPeopleQuantity(String countryName) {
        BigDecimal peopleQuantity = new BigDecimal("1290845387943568");
        return peopleQuantity;
    }
}
