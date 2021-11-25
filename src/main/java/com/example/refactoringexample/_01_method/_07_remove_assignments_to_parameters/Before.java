package com.example.refactoringexample._01_method._07_remove_assignments_to_parameters;

public class Before {

    int discount(int inputVal, int quantity, int yearToDate) {
        if (inputVal > 50) {
            inputVal -= 2;
        }
        if (quantity > 100) {
            inputVal -= 1;
        }
        if (yearToDate > 10000) {
            inputVal -= 4;
        }
        return inputVal;
    }

}
