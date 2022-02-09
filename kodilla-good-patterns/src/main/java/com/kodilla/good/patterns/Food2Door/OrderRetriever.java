package com.kodilla.good.patterns.Food2Door;

import java.util.LinkedList;
import java.util.List;

public class OrderRetriever {

    private final UserRetriever userRetriever = new UserRetriever();
    private final SuppliersList suppliersList = new SuppliersList();
    List<Order> ordersList = new LinkedList<>();

    public List<Order> orderRetriever() {
        List<Order> currentList = new LinkedList<>();
        Order order1 = new Order(1, userRetriever.userRetriever(), suppliersList.getSuppliersList().get(0), 5);
        Order order2 = new Order(2, userRetriever.userRetriever(), suppliersList.getSuppliersList().get(1), 3);
        Order order3 = new Order(3, userRetriever.userRetriever(), suppliersList.getSuppliersList().get(2), 10);
        currentList.add(order1);
        currentList.add(order2);
        currentList.add(order3);
        this.ordersList = currentList;
        return currentList;
    }
}
