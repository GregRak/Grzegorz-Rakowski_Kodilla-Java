package com.kodilla.testing.calculator;

public class Calculator {

    private int numberA;
    private int numberB;

    public Calculator(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public int getNumberA() {
        return numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public int addAToB () {
        return numberA + numberB;
    }

    public int subAFromB () {
        return numberA - numberB;
    }
}
