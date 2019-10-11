import challenges_13_5.Flight;
import challenges_13_5.FlightRegister;
import org.junit.*;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class FlightSearchEngineTestSuit {
    private static int testCounter = 0;

    public void before() {
        testCounter++;
        System.out.println("Test Case #" + testCounter + ": begin");
    }

    @After
    public void after() {
        System.out.println("Test Case #" + testCounter + ": finished");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: All tests are finished");
    }

    public Set<Flight> createFlightsRegister() {
        //flights
        Flight flight_001 = new Flight("Warszawa", "Łódź", "Poznań");
        Flight flight_002 = new Flight("Warszawa", "Łódź", "Gdańsk");
        Flight flight_003 = new Flight("Warszawa", "Wrocław", "Kraków");
        Flight flight_004 = new Flight("Kraków", "Łódź", "Gdańsk");
        Flight flight_005 = new Flight("Kraków", "Łódź", "Warszawa");
        Flight flight_006 = new Flight("Gdańsk", "Warszawa", "Wrocław");
        Flight flight_007 = new Flight("Gdańsk", "Warszawa", "Kraków");
        Flight flight_008 = new Flight("Gdańsk", "Poznań", "Kraków");
        Flight flight_009 = new Flight("Gdańsk", "Łódź", "Wrocław");
        //flights register
        FlightRegister flightRegister = new FlightRegister();
        flightRegister.addFlight(flight_001);
        flightRegister.addFlight(flight_002);
        flightRegister.addFlight(flight_003);
        flightRegister.addFlight(flight_004);
        flightRegister.addFlight(flight_005);
        flightRegister.addFlight(flight_006);
        flightRegister.addFlight(flight_007);
        flightRegister.addFlight(flight_008);
        flightRegister.addFlight(flight_009);
        return flightRegister.getFlightRegister();
    }

    @Test
    public void shouldReturnAllFlightsFromGivenCity() {
        //Given
        Set<Flight> preparedData = createFlightsRegister();

        //When
        String actual = preparedData.stream()
                .filter(t -> t.getDepartureCity().equals("Warszawa"))
                .map(n -> n.toString())
                .collect(Collectors.joining(" | "));
        System.out.println("Testing: " + actual);

        //Then
        String expected = "Departure: Warszawa, Transfer: Wrocław, Arrival: Kraków. | Departure: Warszawa, Transfer: Łódź, Arrival: Poznań. |" +
                " Departure: Warszawa, Transfer: Łódź, Arrival: Gdańsk.";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAllFlightsToGivenCity() {
        //Given
        Set<Flight> preparedData = createFlightsRegister();

        //When
        String actual = preparedData.stream()
                .filter(t -> t.getArrivalCity().equals("Warszawa"))
                .map(n -> n.toString())
                .collect(Collectors.joining(" | "));
        System.out.println("Testing: " + actual);

        //Then
        String expected = "Departure: Kraków, Transfer: Łódź, Arrival: Warszawa.";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAllFlightsWithGivenTransferCity() {
        //Given
        Set<Flight> preparedData = createFlightsRegister();

        //When
        String actual = preparedData.stream()
                .filter(t -> t.getTransferCity().equals("Warszawa"))
                .map(n -> n.toString())
                .collect(Collectors.joining(" | "));
        System.out.println("Testing: " + actual);

        //Then
        String expected = "Departure: Gdańsk, Transfer: Warszawa, Arrival: Kraków. | Departure: Gdańsk, Transfer: Warszawa, Arrival: Wrocław.";
        Assert.assertEquals(expected, actual);
    }
}