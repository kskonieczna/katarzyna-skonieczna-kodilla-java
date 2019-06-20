package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class World {
    //zawiera kolekcję kontynentów
    private final Continent continent;
    private final Set<Continent> continentList = new HashSet<>();

    public World(Continent continent) {
        this.continent = continent;
    }

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    public Set<Continent> getContinents() {
        return continentList;
    }


    //public Set<BigDecimal> getPeopleQuantity() {
    //return continentList.stream()
    //.map(continent -> continent.getSandQuantity())
    //.collect(Collectors.toSet());

    public Set<BigDecimal> getPeopleQuantity() {
        //uruchamiany strumień na kolekcji friends:
        return continentList.stream()
                // dokonujemy spłaszczenia strumienia - dla każdego przyjaciela (user)
                // pobieramy jego listę przyjaciół (user.getFriends()) i ją przekazujemy
                // do dalszego przetwarzania w postaci nowego strumienia Stream.
                // Od tego momentu pracujemy nie na liście przyjaciół, lecz na liście "przyjaciół przyjaciół".
                .flatMap(continent -> continent.getCountries().stream())
                //wykluczamy ze zbioru wynikowego odwołania do "samego siebie"
                //.filter(continent -> continent != this)
                //zamiast obiektów ForumUser, dalej będą już przez niego przepływały jedynie obiekty String
                // będące lokalizacjami użytkowników (pobieramy je przy pomocy metody ForumUser::getLocation).
                .map(Country::getPeopleQuantity)
                //złożenie strumienia wynikowego w kolekcję typu Set zawierającą listę lokalizacji
                // "przyjaciół przyjaciół"
                .collect(Collectors.toSet());
    }
}

