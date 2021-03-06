import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;
import org.junit.*;

import java.util.HashMap;
import java.util.Map;

public class FlightFinderTestSuite {
    private static int testCounter = 0;

    /*public Map<String, Boolean> createListOfFlights() {
        //flights
        Flight polandToGermany = new Flight("Warsaw", "Berlin");
        Flight russiaToNorway = new Flight("Moscow", "Oslo");
        //airports
        Map<String, Boolean> airportAvailabilityList = new HashMap<>();
        airportAvailabilityList.put(polandToGermany.getDepartureAirport(), true);
        airportAvailabilityList.put(polandToGermany.getArrivalAirport(), false);
        airportAvailabilityList.put(russiaToNorway.getDepartureAirport(), true);
        airportAvailabilityList.put(russiaToNorway.getArrivalAirport(), false);

        return airportAvailabilityList;
    }*/

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

    @Test
    public void shouldCheckIfAirportIsAvailableForArrival () throws RouteNotFoundException {
        //Given
        FlightFinder flightFinder = new FlightFinder();
        Flight polandToGermany = new Flight("Warsaw", "Berlin");

        //When
        //Boolean actual = flightFinder.findFlight(polandToGermany);
        //System.out.println("Testing " + actual);

        //Then
        //Boolean expected = true;
        //Assert.assertEquals(expected, actual);
    }
}