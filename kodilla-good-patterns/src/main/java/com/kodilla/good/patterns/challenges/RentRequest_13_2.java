package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class RentRequest_13_2 {

    private User user;
    private LocalDateTime from;
    private LocalDateTime to;

    public RentRequest_13_2(final User user, final LocalDateTime from, final LocalDateTime to) {
        this.user = user;
        this.from = from;
        this.to = to;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
