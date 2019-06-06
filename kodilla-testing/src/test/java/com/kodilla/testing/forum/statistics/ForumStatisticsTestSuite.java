package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
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
        List<String> usersList = new ArrayList<String>();
        usersList.add("John");
        usersList.add("Bob");
        usersList.add("David");
        int dummyPostsCount = 100;
        int dummyCommentsCount = 100;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(dummyPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(dummyCommentsCount);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        int quantityOfUsers = forumStatistics.countUsersNumber(usersList);

        //Then
        Assert.assertEquals(3, quantityOfUsers);
    }
}