package com.example.refactoringexample._03_data._01_self_encapsulate_field.before;

public class IntRange {

    private int low, high;

    boolean includes(int arg) {
        return arg > low && arg <= high;
    }

    void grow(int factor) {
        high = high * factor;
    }

    public IntRange(int low, int high) {
        this.low = low;
        this.high = high;
    }
}
