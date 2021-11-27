package com.example.refactoringexample._03_data._03_change_value_to_reference;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    private String name;
    private static Map<String, Customer> map = new HashMap<>();

    private Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Customer getNamed(String name) {
        return (Customer) map.get(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Customer create(String name) {
        return (Customer) map.get(name);
    }

    static void loadCustomers() {
        new Customer("han").store();
        new Customer("andrew").store();
        new Customer("andy").store();
    }

    private void store() {
        map.put(this.getName(), this);
    }
}
