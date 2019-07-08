package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> airportAvailabilityList = new HashMap<String, Boolean>();

        if(flight != null) {
            System.out.println("Status update: airport .................");
        } else {
            throw new RouteNotFoundException("Given airport does not exist");
        }
    }
}
