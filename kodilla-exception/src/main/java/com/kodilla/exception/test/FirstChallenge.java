package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {

        try {

            return a / b;

        } catch (ArithmeticException e) {

            divide(a,0);
            System.out.println("you cannot divide by zero!" + e);

        } finally {

            System.out.println("I'm going to be here..always!");
        }

        return a / b;

    }


    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}