package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    private final Set<Continent> world = new HashSet<>();

    public void addContinent(Continent continent) {
        world.add(continent);
    }

    public Set<Continent> getWorld() {
        return world;
    }

    public BigDecimal getPeopleQuantityOfCountries() {
        return (BigDecimal) world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(PeopleQuantity::getPeopleQuantity)
                .collect(Collectors.toSet());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world1 = (World) o;
        return Objects.equals(world, world1.world);
    }

    @Override
    public int hashCode() {
        return Objects.hash(world);
    }
}