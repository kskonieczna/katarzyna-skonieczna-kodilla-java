package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    Statistics statistics;
    private Double usersNumber;
    private Double postsNumber;
    private Double commentsNumber;
    private Double postNumberPerUser;
    private Double commentNumberPerUser;
    private Double commentNumberPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
        this.usersNumber = usersNumber;
        this.postsNumber = postsNumber;
        this.commentsNumber = commentsNumber;
        this.postNumberPerUser = postNumberPerUser;
        this.commentNumberPerUser = commentNumberPerUser;
        this.commentNumberPerPost = commentNumberPerPost;
    }

    public Double getUsersNumber() {
        return usersNumber;
    }

    public Double getPostsNumber() {
        return postsNumber;
    }

    public Double getCommentsNumber() {
        return commentsNumber;
    }

    public Double getPostNumberPerUser() {
        return postNumberPerUser;
    }

    public Double getCommentNumberPerUser() {
        return commentNumberPerUser;
    }

    public Double getCommentNumberPerPost() {
        return commentNumberPerPost;
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

    public String calculateAdvStatistics() {

        usersNumber = countUsersNumber();
        postsNumber = countPostsNumber();
        commentsNumber = countCommentsNumber();
        commentNumberPerUser = averageCommentNumberPerUser();
        postNumberPerUser = averagePostNumberPerUser();
        commentNumberPerPost = averageCommentNumberPerPost();

        return "ForumStatistics{" +
                "usersNumber=" + usersNumber +
                ", postsNumber=" + postsNumber +
                ", commentsNumber=" + commentsNumber +
                ", postNumberPerUser=" + postNumberPerUser +
                ", commentNumberPerUser=" + commentNumberPerUser +
                ", commentNumberPerPost=" + commentNumberPerPost +
                '}';
    }
}