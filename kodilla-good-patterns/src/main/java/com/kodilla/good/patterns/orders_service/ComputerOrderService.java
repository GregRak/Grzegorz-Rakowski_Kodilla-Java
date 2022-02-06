package com.kodilla.good.patterns.orders_service;

public class ComputerOrderService implements OrderService {


    @Override
    public boolean order(int orderNumber, String productName, int quantity, User user) {
        System.out.println("The order number is: " + orderNumber +
                ", ordered product: " + productName +
                ", quantity: " + quantity +
                ", Purchaser: " + user.getUserName());

        return true;
    }
}
