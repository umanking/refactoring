package com.example.refactoringexample._03_data._03_change_value_to_reference;


public class Order {

    private Customer customer;

    public Order(String customerName) {
        this.customer = Customer.create(customerName);
    }

    public String getCustomer() {
        return customer.getName();
    }

//    public void setCustomer(String customerName) {
//        this.customer = new Customer(customerName);
//    }

}
