package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;
import java.util.Set;

public class WorldTestSuite {
    private static int testCounter = 0;

    public Set<Continent> createWorld() {
        //countries
        Country poland = new Country("Poland");
        Country germany = new Country("Germany");
        Country france = new Country("France");
        Country canada = new Country("Canada");
        Country usa = new Country("USA");
        //continents
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(usa);
        //world
        World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);
        return world.getWorld();
    }

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
    public void shouldReturnTotalNumberOfPeopleForGivenContinents() {
        //Given
        Set<Continent> preparedData = createWorld();

        //When
        BigDecimal actual = preparedData.stream()
                .flatMap(c -> c.getCountries().stream())
                .map(w -> w.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        System.out.println("Testing " + actual);

        //Then
        BigDecimal expected = new BigDecimal("500000000000");
        Assert.assertEquals(expected, actual);
    }
}