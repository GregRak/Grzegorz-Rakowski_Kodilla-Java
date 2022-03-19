package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product bread = new Product("Bread");
        Product honey = new Product("Honey");
        Product butter = new Product("Butter");

        Invoice invoice1 = new Invoice("2022/03/19/001");

        Item item1 = new Item(bread, new BigDecimal(5.40), 4);
        Item item2 = new Item(honey, new BigDecimal(23.50), 2);
        Item item3 = new Item(butter, new BigDecimal(6.50), 10);
        bread.getItem().add(item1);
        honey.getItem().add(item2);
        butter.getItem().add(item3);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        //Then
        assertEquals(3, invoice1.getItems().size());
        assertNotEquals(0, invoice1Id);

        //CleanUp
        try {
            invoiceDao.deleteById(invoice1Id);
        } catch (Exception e) {
            //do nothing
        }
    }
}
