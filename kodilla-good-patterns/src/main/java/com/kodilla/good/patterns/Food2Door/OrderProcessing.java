package com.kodilla.good.patterns.Food2Door;

public class OrderProcessing {

    private OrderService orderService;
    private InfoService infoService;

    public OrderProcessing(OrderService orderService, InfoService infoService) {
        this.orderService = orderService;
        this.infoService = infoService;
    }

    public boolean orderConfirmationProcess(Order order) {
        boolean orderConfirmation = orderService.orderConfirmation(order);
        if (orderConfirmation) {
            infoService.sendEMailToSupplier(order);
            infoService.sendEmailToUser(order);
            infoService.sendSMSToUser(order);
            return true;
//            return false;
        } else {
            return false;
        }
    }

    public boolean orderCompletingProcess(Order order) {
        boolean orderCompleting = orderService.process(order);
        if (orderCompleting) {
            return true;
        } else {
            return false;
        }
    }
}
