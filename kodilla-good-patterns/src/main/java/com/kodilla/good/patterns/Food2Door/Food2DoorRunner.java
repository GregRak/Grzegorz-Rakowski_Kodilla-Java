package com.kodilla.good.patterns.Food2Door;

import java.util.List;

public class Food2DoorRunner {

    public static void main (String[] args) {
        List<Order> ordersList = new OrderRetriever().orderRetriever();
        CompletingChecker completingChecker = new CompletingChecker();

        OrderProcessing orderProcessing1 = new OrderProcessing(new ExtraFoodShopService(), new ExtraFoodShopInfoService());
        OrderProcessing orderProcessing2 = new OrderProcessing(new HealthyShopService(), new HealthyShopInfoService());
        OrderProcessing orderProcessing3 = new OrderProcessing(new GlutenFreeShopService(), new GlutenFreeShopInfoService());

        completingChecker.checkCompletingOrder(orderProcessing1, ordersList.get(0));
        completingChecker.checkCompletingOrder(orderProcessing2, ordersList.get(1));
        completingChecker.checkCompletingOrder(orderProcessing3, ordersList.get(2));
    }
}
