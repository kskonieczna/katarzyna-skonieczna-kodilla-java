package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class WorldTestSuite {
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

    @Test
    public void shouldReturnTotalNumberOfPeopleForGivenContinents() {
        //Given
        Set<PeopleQuantity> countries = new HashSet<>();
        Country poland = new Country("Poland");
        Country germany = new Country("Germany");
        Country france = new Country("France");
        Country canada = new Country("Canada");
        Country usa = new Country("USA");

        Set<Continent> continents = new HashSet<>();
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(usa);

        Set<Continent> world = new HashSet<>();
        //world.add(new Continent("Europe"));
        //world.add(new Continent("North America"));

        //When
        //BigDecimal actual = (BigDecimal) world.stream()
            //.map(World::getPeopleQuantityOfCountries)
            //.reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
            //System.out.println("Testing " + actual);

        //Then
        BigDecimal expected = new BigDecimal("2111111100");
        //Assert.assertEquals(expected, actual);
    }
}