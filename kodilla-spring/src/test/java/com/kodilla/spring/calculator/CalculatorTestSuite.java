package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testAddMethodCalculator() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 32.5;
        double b = 23.4;
        //When
        double result = calculator.add(a, b);
        //Then
        assertEquals(55.9, result);
    }

    @Test
    void testSubMethodCalculator() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        double a = 12.45;
        double b = 9.44;
        //When
        double result = calculator.sub(a, b);
        //Then
        assertEquals(3.01, result);
    }

    @Test
    void testMulMethodCalculator() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 4.25;
        double b = 3;
        //When
        double result = calculator.mul(a, b);
        //Then
        assertEquals(12.75, result);
    }

    @Test
    void testDivMethodCalculator() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        double a = 45.5;
        double b = 2;
        //When
        double result = calculator.div(a, b);
        //Then
        assertEquals(22.75, result);
    }
}
