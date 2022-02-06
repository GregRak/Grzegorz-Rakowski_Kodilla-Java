package com.kodilla.good.patterns.orders_service;

public class OrderDto {

    private final int orderNumber;
    private boolean isOrdered;

    public OrderDto(final int orderNumber, boolean isOrdered) {
        this.orderNumber = orderNumber;
        this.isOrdered = isOrdered;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
