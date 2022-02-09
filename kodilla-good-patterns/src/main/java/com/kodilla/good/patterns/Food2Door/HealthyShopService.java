package com.kodilla.good.patterns.Food2Door;

public class HealthyShopService implements OrderService {

    @Override
    public boolean orderConfirmation(Order order) {
        System.out.println("The order number: " + order.getOrderNumber() + "\nproduct: " +
                order.getSupplier().getSupplierProduct() + "\nquantity: " + order.getQuantity() +
                "\nwill be prepare in 3 days");
        return true;
    }

    @Override
    public boolean process(Order order) {
        System.out.println("The order number " + order.getOrderNumber() + ", from user: " + order.getUser().getUserName() +
                " cannot be completed on time." + "\n Supplier " + order.getSupplier().getSupplierName() +
                " will inform when it is possible ASAP");
        return true;
    }
}
