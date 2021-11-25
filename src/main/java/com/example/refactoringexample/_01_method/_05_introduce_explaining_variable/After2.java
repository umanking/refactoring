package com.example.refactoringexample._01_method._05_introduce_explaining_variable;

public class After2 {

    private int quantity;
    private int itemPrice;

    double price() {
        // 결제액(price) = 총구매액(base price) - 대량할인금액(quantity discount) + 배송비 (shipping)
        return basePrice() - quantityDiscount() + shipping();
    }

    private double shipping() {
        return Math.min(quantity * itemPrice * 0.1, 100.0);
    }

    private double quantityDiscount() {
        return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }

    private int basePrice() {
        return quantity * itemPrice;
    }

}
