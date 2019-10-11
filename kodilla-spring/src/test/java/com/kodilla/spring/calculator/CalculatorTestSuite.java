package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    double a = 10.0;
    double b = 5.0;

    @Test
    public void shouldReturnAddResult() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(a, b);
        //Then
        Assert.assertEquals(15.0, result,0.1);
    }

    @Test
    public void shouldReturnSubResult() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.sub(a, b);
        //Then
        Assert.assertEquals(5.0, result,0.1);
    }

    @Test
    public void shouldReturnMulResult() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.mul(a, b);
        //Then
        Assert.assertEquals(50.0, result,0.1);
    }

    @Test
    public void shouldReturnDivResult() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.div(a, b);
        //Then
        Assert.assertEquals(2.0, result,0.1);
    }
}