package com.kodilla.patterns.strategy;

public class Customer {

    private final String name;
    protected BuyPredictor buyPredictor;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBuyPredictor(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }

    public String predict() {
        return buyPredictor.predictWhatToBuy();
    }
}
