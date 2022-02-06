package com.kodilla.good.patterns.orders_service;

public class ComputerOrderRepository implements OrderRepository {

    @Override
    public boolean saveOrderData(int orderNumber, String productName, int quantity, User user) {
        System.out.println("Order number: " + orderNumber +
                ", ordered product: " + productName +
                ", quantity: " + quantity +
                ", from " + user.getUserName() +
                " has been saved in the database.");
        return true;
    }
}
