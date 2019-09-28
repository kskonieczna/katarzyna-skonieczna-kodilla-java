package com.kodilla.good.patterns.challenges;

public class MailService_13_2 implements InformationService {

    @Override
    public void inform(User user) {

        System.out.println("Dear " + user.getName() + "your purchase has been completed.");
    }
}
