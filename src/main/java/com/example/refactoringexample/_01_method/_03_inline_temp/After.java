package com.example.refactoringexample._01_method._03_inline_temp;


public class After {

    private Order order;

    public boolean method() {
        return order.basePrice() > 10000;
    }
}
