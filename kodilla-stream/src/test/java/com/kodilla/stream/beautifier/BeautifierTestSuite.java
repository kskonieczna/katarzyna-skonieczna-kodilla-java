package com.kodilla.stream.beautifier;

import org.junit.*;

public class BeautifierTestSuite {
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
    public void should_decorate_a_text_with_first_given_motive() {
        //Given
        PoemBeautifier beautifier = new PoemBeautifier();
        String expected = "~~~Słowa~~~";
        //When
        String actual = beautifier.addMotive("Słowa", (textToBeDecorated) -> "~~~" + textToBeDecorated + "~~~");
        System.out.println("Testing " + actual);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_decorate_a_text_with_second_given_motive() {
        //Given
        PoemBeautifier beautifier = new PoemBeautifier();
        String expected = "-->Słowa<--";
        //When
        String actual = beautifier.addMotive("Słowa", (textToBeDecorated) -> "-->" + textToBeDecorated + "<--");
        System.out.println("Testing " + actual);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_transform_a_text_to_upper_case() {
        //Given
        PoemBeautifier beautifier = new PoemBeautifier();
        String expected = "SŁOWO";
        //When
        String actual = beautifier.beautify("Słowo", String::toUpperCase);
        System.out.println("Testing " + actual);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_transform_a_text_to_lower_case() {
        //Given
        PoemBeautifier beautifier = new PoemBeautifier();
        String expected = "słowo";
        //When
        String actual = beautifier.beautify("Słowo", String::toLowerCase);
        System.out.println("Testing " + actual);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
