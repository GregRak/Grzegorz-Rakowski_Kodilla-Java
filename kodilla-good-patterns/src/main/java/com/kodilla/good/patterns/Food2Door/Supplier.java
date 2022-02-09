package com.kodilla.good.patterns.Food2Door;

public class Supplier {

    private final String supplierName;
    private final String supplierEmail;
    private final String supplierProduct;


    public Supplier(String supplierName, String supplierEmail, String supplierProduct) {
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierProduct = supplierProduct;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public String getSupplierProduct() {
        return supplierProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplier supplier = (Supplier) o;

        return supplierName.equals(supplier.supplierName);
    }

    @Override
    public int hashCode() {
        return supplierName.hashCode();
    }
}
