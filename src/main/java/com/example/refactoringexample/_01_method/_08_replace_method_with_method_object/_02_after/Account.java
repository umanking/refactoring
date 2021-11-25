package com.example.refactoringexample._01_method._08_replace_method_with_method_object._02_after;

public class Account {

    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }
    public int delta() {
        return 0;
    }



}
