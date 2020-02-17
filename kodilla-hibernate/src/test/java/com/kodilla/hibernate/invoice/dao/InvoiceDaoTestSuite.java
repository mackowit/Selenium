package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(1500), 1, new BigDecimal(1500));
        Item item2 = new Item(new BigDecimal(1500), 2, new BigDecimal(3000));
        Item item3 = new Item(new BigDecimal(1800), 3, new BigDecimal(5400));
        Item item4 = new Item(new BigDecimal(1500), 4, new BigDecimal(6000));

        Product product1 = new Product("Lenovo Tab");
        Product product2 = new Product("Toshiba Satellite");

        Invoice invoice = new Invoice("1/2020");

        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product1.getItems().add(item4);
        product2.getItems().add(item3);
        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product2);
        item4.setProduct(product1);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);

        //Then
        Assert.assertEquals(2, productDao.count());
        Assert.assertEquals(4, itemDao.count());
        Assert.assertEquals(1, invoiceDao.count());

        //CleanUp
        itemDao.deleteById(item1.getId());
        itemDao.deleteById(item2.getId());
        itemDao.deleteById(item3.getId());
        itemDao.deleteById(item4.getId());
        invoiceDao.deleteById(invoice.getId());
        productDao.deleteById(product1.getId());
        productDao.deleteById(product2.getId());
    }
}
