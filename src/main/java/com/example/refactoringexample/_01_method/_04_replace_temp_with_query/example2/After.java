package com.example.refactoringexample._01_method._04_replace_temp_with_query.example2;

public class After {

    private double quantity;
    private double itemPrice;

    double getPrice() {
        return basePrice() * discountFactor();
    }

    private double discountFactor() {
        if (basePrice() > 1000) {
            return 0.95;
        } else {
            return 0.98;
        }
    }

    private double basePrice() {
        return quantity * itemPrice;
    }

}
