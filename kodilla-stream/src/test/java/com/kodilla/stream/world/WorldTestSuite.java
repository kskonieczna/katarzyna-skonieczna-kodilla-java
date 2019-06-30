package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;
import org.junit.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*public class WorldTestSuite {
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
        Set<Country> continents = new HashSet<>();
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");

        List<Country> countries = new ArrayList<>();
        Country poland = new Country("Poland");
        Country germany = new Country("Germany");
        Country france = new Country("France");
        Country canada = new Country("Canada");
        Country usa = new Country("USA");

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(usa);

        Set<Continent> world = new HashSet<>();
        World worldPrepared = new World();
        world.add(europe);
        world.add(northAmerica);

        //When
        BigDecimal actual = continents.stream()
                //.map(Continent::getPeopleQuantity)
                .map(World::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        System.out.println("Testing " + actual);

        //Then
        BigDecimal expected = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expected, actual);
    }
}*/
