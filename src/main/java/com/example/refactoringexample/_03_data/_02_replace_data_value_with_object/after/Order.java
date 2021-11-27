package com.example.refactoringexample._03_data._02_replace_data_value_with_object.after;

public class Order {

    private Customer customer;

    public Order(String customerName) {
        this.customer = new Customer(customerName);
    }

    public String getCustomer() {
        return customer.getName();
    }

    public void setCustomer(String customerName) {
        this.customer = new Customer(customerName);
    }

}
