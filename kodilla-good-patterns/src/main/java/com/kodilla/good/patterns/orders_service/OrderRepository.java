package com.kodilla.good.patterns.orders_service;

public interface OrderRepository {

    boolean saveOrderData(int orderNumber, String productName, int quantity, User user);
}
