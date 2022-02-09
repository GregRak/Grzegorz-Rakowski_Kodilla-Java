package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShopService implements OrderService {

    @Override
    public boolean orderConfirmation(Order order) {
        System.out.println("The order number " + order.getOrderNumber() + " containing the product " +
                order.getSupplier().getSupplierProduct() + " in quantity: " + order.getQuantity() +
                " has been handed over for execution");
        return true;
    }

    @Override
    public boolean process(Order order) {
        System.out.println("The order number " + order.getOrderNumber() + ", from user: " + order.getUser().getUserName() +
                " has been completed by " + order.getSupplier().getSupplierName());
        return true;
    }
}
