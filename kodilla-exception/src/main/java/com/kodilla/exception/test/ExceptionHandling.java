package com.kodilla.exception.test;

public class ExceptionHandling {

    public void ExceptionHandling(double x, double y) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            System.out.println("Number x must be greater than or equal to 1 and less than 2, number y must not be 1.5");
        } finally {
            System.out.println("Thank you!");
        }
    }
}
