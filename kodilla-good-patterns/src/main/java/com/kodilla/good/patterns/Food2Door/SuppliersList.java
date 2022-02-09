package com.kodilla.good.patterns.Food2Door;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SuppliersList {

    List<Supplier> suppliersList;

    Supplier supplier1 = new Supplier("ExtraFoodShop", "extrafoodshop@domain.com", "Avocado");
    Supplier supplier2 = new Supplier("HealthyShop", "healthyshop@domain.com", "Vitamin Complex");
    Supplier supplier3 = new Supplier("GlutenFreeShop", "glutenfreeshop@domain.com", "KetoBread");

    public SuppliersList() {
        List<Supplier> currentSuppliersList = new LinkedList<>();
        currentSuppliersList.add(supplier1);
        currentSuppliersList.add(supplier2);
        currentSuppliersList.add(supplier3);
        this.suppliersList = currentSuppliersList;
    }

    public List<Supplier> getSuppliersList() {
        return suppliersList;
    }
}
