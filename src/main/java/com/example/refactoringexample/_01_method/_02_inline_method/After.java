package com.example.refactoringexample._01_method._02_inline_method;

public class After {

    private final int numberOfLateDeliveries = 3;

    public int getRating() {
        return numberOfLateDeliveries > 5 ? 2 : 1;
    }
}
