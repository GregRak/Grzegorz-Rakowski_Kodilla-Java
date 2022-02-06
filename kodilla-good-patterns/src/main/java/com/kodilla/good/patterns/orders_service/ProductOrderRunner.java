package com.kodilla.good.patterns.orders_service;

public class ProductOrderRunner {

    public static void main(String[] args) {
        OrderRequest order1 = new OrderRequest(1, new UserRetriever().userRetriever(), "Computer", 2);
        ProductOrderService productOrderService = new ProductOrderService(new ComputerOrderService(), new ComputerInformationService(), new ComputerOrderRepository());
        productOrderService.process(order1);
    }
}
