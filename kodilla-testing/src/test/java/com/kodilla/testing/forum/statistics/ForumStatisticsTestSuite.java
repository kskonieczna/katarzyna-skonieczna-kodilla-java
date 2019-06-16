package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @Before
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
    public void shouldCalculateAdvStatisticsWithMock() {
        //Given
        List<String> usersNames = new ArrayList<String>();
        for (int n = 0; n < 100; n++) {
            usersNames.add("John");
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(50);
        ArrayList<Double> expected = new ArrayList<Double>(
                Arrays.asList(100.0, 1000.0, 50.0, 0.5, 10.0, 0.05));

        ForumStatistics preparedStatistics = new ForumStatistics(statisticsMock);

        //When
        ArrayList<Double> actual = preparedStatistics.calculateAdvStatistics();
        System.out.println("Testing " + actual);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAdvStatisticsWithMockWhenNoUsers() {
        //Given
        List<String> usersNames = new ArrayList<String>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ArrayList<Double> expected = new ArrayList<Double>(
                Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0, 0.0));

        ForumStatistics preparedStatistics = new ForumStatistics(statisticsMock);

        //When
        ArrayList<Double> actual = preparedStatistics.calculateAdvStatistics();
        System.out.println("Testing " + actual);
        // Then
        Assert.assertEquals(expected, actual);
    }
}