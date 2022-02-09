package com.kodilla.good.patterns.Food2Door;

public class HealthyShopService implements OrderService {

    @Override
    public boolean orderConfirmation(Order order) {
        return false;
    }

    @Override
    public boolean process(Order order) {
        return false;
    }
}
