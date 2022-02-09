package com.kodilla.good.patterns.Food2Door;

public interface OrderService {

    boolean orderConfirmation(Order order);

    boolean process(Order order);
}
