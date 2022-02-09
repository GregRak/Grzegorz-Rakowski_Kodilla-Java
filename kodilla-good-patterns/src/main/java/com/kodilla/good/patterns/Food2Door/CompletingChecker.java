package com.kodilla.good.patterns.Food2Door;

public class CompletingChecker {

    public boolean checkCompletingOrder(OrderProcessing orderProcessing, Order order) {
        boolean checkConfirmation = orderProcessing.orderConfirmationProcess(order);
        if (checkConfirmation) {
            orderProcessing.orderCompletingProcess(order);
            return true;
        } else {
            System.out.println("\nThe order number " + order.getOrderNumber() + " is still pending...");
            return false;
        }
    }
}
