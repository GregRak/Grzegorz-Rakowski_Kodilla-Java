package com.kodilla.good.patterns.orders_service;

public class OrderRequest {

    private final int orderNumber;
    private final User user;
    private final String productName;
    private final int quantity;

    public OrderRequest(final int orderNumber, final User user, final String productName, final int quantity) {
        this.orderNumber = orderNumber;
        this.user = user;
        this.productName = productName;
        this.quantity = quantity;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
