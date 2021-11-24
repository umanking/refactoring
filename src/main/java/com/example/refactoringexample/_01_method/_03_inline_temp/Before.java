package com.example.refactoringexample._01_method._03_inline_temp;


public class Before {

    private Order order;

    public boolean method() {
        double basePrice = order.basePrice();
        return basePrice > 10000;
    }
}
