package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ForumStatistics {
    Statistics statistics;
    List<String> userNames = new ArrayList<>();

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
        this.userNames = userNames;
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

    public Integer averagePostNumberPerUser(Statistics statistics){
        Iterator<String> userNamesIterator = userNames.iterator();

        while (userNamesIterator.hasNext()) {
        //    return statistics.postsCount()/userNames.size();
        }
        return 2;
    }

    public Integer averageCommentNumberPerUser(){
        Iterator<String> userNamesIterator = userNames.iterator();

        while (userNamesIterator.hasNext()) {
        //    return statistics.commentsCount()/userNames.size();
        }
        return 2;
    }

    public Integer averageCommentNumberPerPost(){

        //return statistics.postsCount()/statistics.commentsCount();
        return 2;
    }

    public Statistics calculateAdvStatistics(Statistics statistics){
        Integer usersNumber = countUsersNumber(statistics.usersNames());
        Integer postsNumber = countPostsNumber();

        return statistics;
    }
}