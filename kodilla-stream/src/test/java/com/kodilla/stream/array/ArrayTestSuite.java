package com.kodilla.stream.array;

import org.junit.*;

import java.util.OptionalDouble;
import java.util.stream.IntStream;


public class ArrayTestSuite {
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
    public void shoudlGiveAverage() {
        //Given
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        //When
        OptionalDouble actual = ArrayOperations.getAverage(numbers);
        System.out.println("Testing " + actual);

        //Then
        OptionalDouble expected = IntStream.range(0, 10)
                .average();
        Assert.assertEquals(expected, actual);
    }
}