package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final String continentName;
    private final Set<Country> continents = new HashSet<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }
    //zawiera kolekcję krajów leżących na tym kontynencie


    public void addCountry(Country country) {
        continents.add(country);
    }

    public Set<Country> getContinents() {
        return continents;
    }
}
