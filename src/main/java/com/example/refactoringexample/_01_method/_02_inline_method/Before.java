package com.example.refactoringexample._01_method._02_inline_method;

public class Before {

    private final int numberOfLateDeliveries = 3;

    public int getRating() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }

}
