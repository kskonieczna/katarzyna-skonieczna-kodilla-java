package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<PeopleQuantity> countries = new HashSet<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public Set<PeopleQuantity> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countries=" + countries +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(continentName, continent.continentName) &&
                Objects.equals(countries, continent.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName, countries);
    }
}