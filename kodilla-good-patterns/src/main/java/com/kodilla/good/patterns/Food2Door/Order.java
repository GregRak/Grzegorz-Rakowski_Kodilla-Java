package com.kodilla.good.patterns.Food2Door;

public class Order {

    private final int orderNumber;
    private final User user;
    private final Supplier supplier;
    private final int quantity;

    public Order(int orderNumber, User user, Supplier supplier, int quantity) {
        this.orderNumber = orderNumber;
        this.user = user;
        this.supplier = supplier;
        this.quantity = quantity;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public User getUser() {
        return user;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public int getQuantity() {
        return quantity;
    }
}
