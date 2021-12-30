package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public void exceptionChecker(double a, double b) {
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            System.out.println("The result of dividing is: " + firstChallenge.divide(a, b));
        } catch (ArithmeticException ae) {
            System.out.println("You cannot divide by zero." + ae);
        } finally {
            System.out.println("Thank you for using the calculator.");
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double c = 3;
        double d = 0;
        firstChallenge.exceptionChecker(c, d);
    }
}
