package com.kodilla.testing.calculator;

public class Calculator {
    private Integer firstNumber;
    private Integer secondNumber;

    public Calculator() {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Integer addFirstNumberToSecondNumber(Integer firstNumber, Integer secondNumber) {

        return firstNumber + secondNumber;
    }

    public Integer subtractFirstNumberToSecondNumber(Integer firstNumber, Integer secondNumber) {

        return firstNumber - secondNumber;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.addFirstNumberToSecondNumber(2, 2));
        System.out.println(calculator.subtractFirstNumberToSecondNumber(2, 2));
    }
}