package com.kodilla.stream.world;
/*
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class World {
    //zawiera kolekcję kontynentów
    //private final Continent continent;
    private final List<Continent> world = new ArrayList<>();

    //public World(Continent continent) {
    //    this.continent = continent;
    //}

    public void addContinent(Continent continent) {
        world.add(continent);
    }

    public List<Continent> getWorld() {
        return world;
    }

    public Set<BigDecimal> getPeopleQuantity() {
        //uruchamiany strumień na kolekcji friends:
        return world.stream()
                // dokonujemy spłaszczenia strumienia - dla każdego przyjaciela (user)
                // pobieramy jego listę przyjaciół (user.getFriends()) i ją przekazujemy
                // do dalszego przetwarzania w postaci nowego strumienia Stream.
                // Od tego momentu pracujemy nie na liście przyjaciół, lecz na liście "przyjaciół przyjaciół".
                .flatMap(continent -> continent.addCountry().stream())
                //wykluczamy ze zbioru wynikowego odwołania do "samego siebie"
                //.filter(continent -> continent != this)
                //zamiast obiektów ForumUser, dalej będą już przez niego przepływały jedynie obiekty String
                // będące lokalizacjami użytkowników (pobieramy je przy pomocy metody ForumUser::getLocation).
                .map(Country::getPeopleQuantity)
                //złożenie strumienia wynikowego w kolekcję typu Set zawierającą listę lokalizacji
                // "przyjaciół przyjaciół"
                .collect(Collectors.toSet());
    }
}*/

