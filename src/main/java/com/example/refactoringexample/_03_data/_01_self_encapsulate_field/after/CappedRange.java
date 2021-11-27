package com.example.refactoringexample._03_data._01_self_encapsulate_field.after;

public class CappedRange extends IntRange{

    private int cap;

    public CappedRange(int low, int high, int cap) {
        super(low, high);
        this.cap = cap;
    }

    public int getCap() {
        return cap;
    }

    public int getHigh() {
        return Math.min(super.getHigh(), getCap());
    }
}
