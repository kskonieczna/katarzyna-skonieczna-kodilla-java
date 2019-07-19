package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {


    public boolean findFlight(Flight flight) {

        HashMap<String, Boolean> airportAvailability = new HashMap<>();
            airportAvailability.put("Warsaw",true);
            airportAvailability.put("Paris",false);

        return airportAvailability.containsKey(flight.getArrivalAirport());
    }
}
