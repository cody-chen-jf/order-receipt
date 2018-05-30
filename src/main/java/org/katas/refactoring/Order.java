package org.katas.refactoring;

import java.util.List;

public class Order {
    private List<LineItem> lineItems;
    private Customer customer;

    public Order(Customer customer, List<LineItem> lineItems) {
        this.customer = customer;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customer.getCustomerName();
    }

    public String getCustomerAddress() {
        return customer.getCustomerAddress();
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    String generateCustomerInfo() {
        return getCustomerName() + getCustomerAddress();
    }
}
