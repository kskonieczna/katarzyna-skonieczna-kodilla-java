package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void shouldCalculateAdvStatisticsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        //do wywalenia?
        List<String> usersList = new ArrayList<String>();
        usersList.add("John");
        usersList.add("Bob");
        usersList.add("David");
        //
        when(statisticsMock.usersNames()).thenReturn(usersList);
        //when(statisticsMock.usersNames().size()).thenReturn(45);
        when(statisticsMock.postsCount()).thenReturn(52);
        when(statisticsMock.commentsCount()).thenReturn(89);

        ForumStatistics preparedStatistics = new ForumStatistics(statisticsMock);

        //When
        int quantityOfUsers = preparedStatistics.countUsersNumber(usersList);

        //Then
        Assert.assertEquals(3, quantityOfUsers);
    }
}