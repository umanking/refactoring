package com.example.refactoringexample._03_data._02_replace_data_value_with_object.after;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
