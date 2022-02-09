package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShopService implements OrderService {

    @Override
    public boolean orderConfirmation(Order order) {
        System.out.println("The order number: " + order.getOrderNumber() + "\nproduct: " +
                order.getSupplier().getSupplierProduct() + "\nquantity: " + order.getQuantity() +
                "\ncannot be realized. Please contact with " + order.getSupplier().getSupplierName());
        return false;
    }

    @Override
    public boolean process(Order order) {
        System.out.println("The order number " + order.getOrderNumber() + ", from user: " + order.getUser().getUserName() +
                " has been completed by " + order.getSupplier().getSupplierName());
        return true;
    }
}
