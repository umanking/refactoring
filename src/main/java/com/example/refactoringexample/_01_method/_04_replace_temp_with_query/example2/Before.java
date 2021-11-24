package com.example.refactoringexample._01_method._04_replace_temp_with_query.example2;

public class Before {

    private double quantity;
    private double itemPrice;

    double getPrice() {
        double basePrice = quantity * itemPrice;
        double discountFactor;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }

}
