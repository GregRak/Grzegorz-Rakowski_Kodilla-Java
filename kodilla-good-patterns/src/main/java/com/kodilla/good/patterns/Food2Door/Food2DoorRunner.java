package com.kodilla.good.patterns.Food2Door;

public class Food2DoorRunner {

    public static void main (String[] args) {
        UserRetriever userRetriever = new UserRetriever();
        SuppliersList suppliersList = new SuppliersList();
        CompletingChecker completingChecker = new CompletingChecker();

        Order order1 = new Order(1, userRetriever.userRetriever(), suppliersList.getSuppliersList().get(0), 5);
        OrderProcessing orderProcessing = new OrderProcessing(new ExtraFoodShopService(), new ExtraFoodShopInfoService());

        completingChecker.checkCompletingOrder(orderProcessing, order1);
    }
}
