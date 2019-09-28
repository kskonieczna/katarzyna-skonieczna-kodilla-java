package com.kodilla.good.patterns.challenges;

public class RentalDto_13_2 {

    public User user;
    public boolean isRented;

    public RentalDto_13_2(final User user, final boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean isRented() {
        return isRented;
    }
}