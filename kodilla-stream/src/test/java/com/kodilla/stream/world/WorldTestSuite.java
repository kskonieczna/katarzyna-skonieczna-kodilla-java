package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
        List<Continent> continents = new ArrayList<>();
        //continents.add(new Country());

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
}
