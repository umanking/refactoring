package com.example.refactoringexample._01_method._04_replace_temp_with_query;

public class Before {

    private double quantity;
    private double itemPrice;

    double getPrice() {
        double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }

}
