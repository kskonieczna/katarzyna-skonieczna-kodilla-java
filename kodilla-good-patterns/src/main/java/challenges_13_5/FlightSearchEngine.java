package challenges_13_5;

import java.util.stream.Collectors;

public class FlightSearchEngine {
    private FlightRegister flightRegister = new FlightRegister();

    public FlightSearchEngine() {
        this.flightRegister = flightRegister;
    }

    String returnAllFlightsFromGivenCity(String cityName) {
        String actual = flightRegister.getFlightRegister().stream()
                .filter(t -> t.getDepartureCity().equals(cityName))
                .map(n -> n.toString())
                .collect(Collectors.joining(" | "));
        return actual;
    }

    String returnAllFlightsToGivenCity(String cityName) {
        String actual = flightRegister.getFlightRegister().stream()
                .filter(t -> t.getArrivalCity().equals(cityName))
                .map(n -> n.toString())
                .collect(Collectors.joining(" | "));
        return actual;
    }

    String returnAllFlightsWithGivenTransferCity(String cityName) {
        String actual = flightRegister.getFlightRegister().stream()
                .filter(t -> t.getTransferCity().equals(cityName))
                .map(n -> n.toString())
                .collect(Collectors.joining(" | "));
        return actual;
    }
}