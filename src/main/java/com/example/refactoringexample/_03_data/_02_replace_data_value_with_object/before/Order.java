package com.example.refactoringexample._03_data._02_replace_data_value_with_object.before;

public class Order {

    private String customer;

    public Order(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

}
