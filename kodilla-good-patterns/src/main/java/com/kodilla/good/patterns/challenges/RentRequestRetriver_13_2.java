package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class RentRequestRetriver_13_2 {

    public RentRequest_13_2 retrieve() {

        User user = new User("John", "Wekl");

        LocalDateTime rentFrom = LocalDateTime.of(2017, 8, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);

        return new RentRequest_13_2(user, rentFrom, rentTo);
    }
}
