package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShopInfoService implements InfoService {

    @Override
    public void sendEmailToUser(Order order) {
        System.out.println("Email with order confirmation has been send to: " + order.getUser().getUserName()
                + " to the addres: " + order.getUser().getUserEmail());
    }

    @Override
    public void sendSMSToUser(Order order) {
        System.out.println("Supplier " + order.getSupplier().getSupplierName() +
                " don't send SMS to Customer");
    }

    @Override
    public void sendEMailToSupplier(Order order) {
        System.out.println("Email with order confirmation has been send to supplier: " + order.getSupplier().getSupplierName()
                + " to the addres: " + order.getSupplier().getSupplierEmail());
    }
}
