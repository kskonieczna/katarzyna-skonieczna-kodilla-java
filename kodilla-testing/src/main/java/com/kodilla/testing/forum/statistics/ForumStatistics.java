package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ForumStatistics {
    Statistics statistics;
    private List<String> userNames = new ArrayList<>();
    private Integer postCounter;
    private Integer commentCounter;

    public ForumStatistics(Statistics statistics, List<String> userNames, Integer postCounter, Integer commentCounter) {
        this.statistics = statistics;
        this.userNames = userNames;
        this.postCounter = postCounter;
        this.commentCounter = commentCounter;
    }

    public Integer countUsersNumber(List<String> usersNames){
        return usersNames.size();
    }

    public Integer countPostsNumber(){
        return statistics.postsCount();
    }

    public Integer countCommentsNumber(){
        return statistics.commentsCount();
    }

    public Double averagePostNumberPerUser(Integer postCounter){

        return (double)postCounter/countUsersNumber(userNames);
    }

    public Double averageCommentNumberPerUser(Integer commentCounter){

        return (double)commentCounter/countUsersNumber(userNames);
    }

    public Double averageCommentNumberPerPost(Integer postCounter, Integer commentCounter){

        return (double)commentCounter/postCounter;
    }

    public Statistics calculateAdvStatistics(Statistics statistics){
        Integer usersNumber = countUsersNumber(statistics.usersNames());
        Integer postsNumber = countPostsNumber();

        return statistics;
    }
}