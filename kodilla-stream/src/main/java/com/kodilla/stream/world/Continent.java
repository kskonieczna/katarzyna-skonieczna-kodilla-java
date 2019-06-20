package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Continent {
    //zawiera kolekcję krajów leżących na tym kontynencie
    private final Set<Country> countryList = new HashSet<>();

    public Set<Country> getCountries() {
        countryList.add(new Country("Poland"));
        countryList.add(new Country("France"));
        countryList.add(new Country("Germany"));

        return countryList;
    }
}
