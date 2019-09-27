package com.kodilla.exception.main;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;

public class ExceptionFlightRunner {


    public static void main(String args[]) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Rome", "Moscow");

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport " + flight.getArrivalAirport() +
                    " not available but still processing!");
        } finally {
            System.out.println("Processing next request...");
        }
    }
}
