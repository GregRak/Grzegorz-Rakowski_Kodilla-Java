package com.kodilla.good.patterns.Food2Door;

public class HealthyShopInfoService implements InfoService {

    @Override
    public void sendEmailToUser(Order order) {
        System.out.println("Email with order confirmation has been send to: " + order.getUser().getUserName()
                + " to the addres: " + order.getUser().getUserEmail());
    }

    @Override
    public void sendSMSToUser(Order order) {
        System.out.println("SMS with order confirmation has been send to: " + order.getUser().getUserName()
                + " to the telephone number: " + order.getUser().getUserPhoneNumber());
    }

    @Override
    public void sendEMailToSupplier(Order order) {
        System.out.println("Email with order confirmation has been send to supplier: " + order.getSupplier().getSupplierName()
                + " to the addres: " + order.getSupplier().getSupplierEmail());
    }

    public boolean sendMessaeToSupplierSystem(Order order) {
        System.out.println("Confirmation to supplier " + order.getSupplier().getSupplierName() +
                " has been send into his system");
        return true;
    }
}
