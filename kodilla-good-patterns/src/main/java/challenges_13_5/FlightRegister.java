package challenges_13_5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FlightRegister {
    private final Set<Flight> flightRegister = new HashSet<>();

    public FlightRegister() {
    }

    public void addFlight(Flight flight) {
        flightRegister.add(flight);
    }

    public Set<Flight> getFlightRegister() {
        return new HashSet<>(flightRegister);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightRegister that = (FlightRegister) o;
        return Objects.equals(flightRegister, that.flightRegister);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightRegister);
    }
}