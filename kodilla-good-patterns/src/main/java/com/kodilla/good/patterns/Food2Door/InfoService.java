package com.kodilla.good.patterns.Food2Door;

public interface InfoService {

    void sendSMSToUser(Order order);

    void sendEmailToUser(Order order);

    void sendEMailToSupplier(Order order);
}
