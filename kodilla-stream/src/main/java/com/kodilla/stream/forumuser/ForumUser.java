package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate userDateOfBirth;
    private final int postNumber;

    public ForumUser(final int userId, final String userName, final char userSex, final LocalDate userDateOfBirth, final int postNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userDateOfBirth = userDateOfBirth;
        this.postNumber = postNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public static int calculateAge(LocalDate userDateOfBirth, LocalDate currentDate) {
        return Period.between(userDateOfBirth, currentDate).getYears();
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userDateOfBirth=" + userDateOfBirth +
                ", postNumber=" + postNumber +
                '}';
    }
}
