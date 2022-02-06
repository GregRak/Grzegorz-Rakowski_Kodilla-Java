package com.kodilla.good.patterns.orders_service;

public interface InformationService {

    boolean sendEmail(OrderRequest orderRequest);

    boolean sendSMS(OrderRequest orderRequest);
}
