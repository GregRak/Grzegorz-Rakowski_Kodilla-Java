package com.kodilla.good.patterns.orders_service;

public interface OrderService {

    boolean order(int orderNumber, String productName, int quantity, User user);
}
