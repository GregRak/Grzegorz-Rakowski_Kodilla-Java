package com.kodilla.good.patterns.orders_service;

public class ComputerInformationService implements InformationService {

    @Override
    public boolean sendEmail(OrderRequest orderRequest) {
        System.out.println("Email to user " + orderRequest.getUser().getUserName() +
                " has been send to address: " + orderRequest.getUser().getUserEmail());
        return true;
    }

    @Override
    public boolean sendSMS(OrderRequest orderRequest) {
        System.out.println("SMS to user " + orderRequest.getUser().getUserName() +
                " has been send to phone number: " + orderRequest.getUser().getUserPhoneNumber());
        return true;
    }
}
