package com.example.refactoringexample._01_method._04_replace_temp_with_query;

public class After {

    private double quantity;
    private double itemPrice;

    double getPrice() {
        if (getBasePrice() > 1000) {
            return getBasePrice() * 0.95;
        } else {
            return getBasePrice() * 0.98;
        }
    }

    private double getBasePrice() {
        return quantity * itemPrice;
    }

}
