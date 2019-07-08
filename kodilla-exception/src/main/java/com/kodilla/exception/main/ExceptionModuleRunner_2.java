package com.kodilla.exception.main;

import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;

public class ExceptionModuleRunner_2 {

    public static void main(String args[]){

        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight();
        } catch (RouteNotFoundException e) {
            System.out.println("Given airport does not exist!");
        }
    }
}