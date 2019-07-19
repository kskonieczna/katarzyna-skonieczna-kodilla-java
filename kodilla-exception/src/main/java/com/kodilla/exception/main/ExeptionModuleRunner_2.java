package com.kodilla.exception.main;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;

public class ExeptionModuleRunner_2 {

    public static void main(String args[]) {

        SecondChallenge challenge = new SecondChallenge();

        try {
            challenge.probablyIWillThrowException(3.0, 3.0);
        } catch (ExceptionHandling e) {
            System.out.println("Number outside of permitted range. Exception handled by : " + e);
        } finally {
            System.out.println("Exceptions handled.");
        }
    }
}
