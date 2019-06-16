package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class ForumStatistics {
    Statistics statistics;
    private Double usersNumber;
    private Double postsNumber;
    private Double commentsNumber;
    private Double postNumberPerUser;
    private Double commentNumberPerUser;
    private Double commentNumberPerPost;
    private ArrayList<Integer> advStatistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
        this.usersNumber = usersNumber;
        this.postsNumber = postsNumber;
        this.commentsNumber = commentsNumber;
        this.postNumberPerUser = postNumberPerUser;
        this.commentNumberPerUser = commentNumberPerUser;
        this.commentNumberPerPost = commentNumberPerPost;
        this.advStatistics = advStatistics;
    }

    public Double countUsersNumber() {
        return (double) statistics.usersNames().size();
    }

    public Double countPostsNumber() {
        return (double) statistics.postsCount();
    }

    public Double countCommentsNumber() {
        return (double) statistics.commentsCount();
    }

    public Double averagePostNumberPerUser() {
        Double x = (double) countPostsNumber() / countUsersNumber();
        if (Double.isNaN(x)) {
            x = 0.0;
        }
        return x;
    }

    public Double averageCommentNumberPerUser() {
        Double x = (double) countCommentsNumber() / countUsersNumber();
        if (Double.isNaN(x)) {
            x = 0.0;
        }
        return x;
    }

    public Double averageCommentNumberPerPost() {
        Double x = (double) countCommentsNumber() / countPostsNumber();
        if (Double.isNaN(x)) {
            x = 0.0;
        }
        return x;
    }

    public ArrayList<Double> calculateAdvStatistics() {

        ArrayList<Double> advStatistics = new ArrayList<Double>();
        advStatistics.add(usersNumber = countUsersNumber());
        advStatistics.add(postsNumber = countPostsNumber());
        advStatistics.add(commentsNumber = countCommentsNumber());
        advStatistics.add(commentNumberPerUser = averageCommentNumberPerUser());
        advStatistics.add(postNumberPerUser = averagePostNumberPerUser());
        advStatistics.add(commentNumberPerPost = averageCommentNumberPerPost());
        return advStatistics;
    }
}