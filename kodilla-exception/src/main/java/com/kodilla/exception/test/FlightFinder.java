package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        /*Stwórz klasę zawierającą logikę imitującą wyszukiwanie lotów: a) metoda findFilght(Flight flight)
        b) wewnątrz metody zaimplementuj mapę typu HashMap, której kluczem będzie String przechowujący nazwę lotniska,
        a wartością Boolean informujący o tym czy można na dane lotnisko polecieć. Przykład: Map<String, Boolean>.
        c) logika powinna wyszukiwać loty w mapie. Jeżeli dane lotnisko nie będzie istnieć w mapie,
        należy rzucić wyjątkiem RouteNotFoundException.
         */
        HashMap<String, Boolean> airportAvailability = new HashMap<>();
            //airportAvailability.put("Warsaw",true);
            //airportAvailability.put("Rome",true);
        //Boolean isAirportAvailable = airportAvailability.containsKey(flight.getArrivalAirport());

        if (airportAvailability.containsKey(flight.getArrivalAirport())) {
            System.out.println(flight.getArrivalAirport() + " is available ");
        } else {
            throw new RouteNotFoundException("Airport not available");
        }

        //return airportAvailability.containsKey(flight.getArrivalAirport());
    }
}
