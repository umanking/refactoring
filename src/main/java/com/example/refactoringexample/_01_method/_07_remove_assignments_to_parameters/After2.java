package com.example.refactoringexample._01_method._07_remove_assignments_to_parameters;

public class After2 {

    // 매개변수를 final로 설정해서 강제할 수 있다.
    int discount(final int inputVal, final int quantity, final int yearToDate) {
        int result = inputVal;
        if (inputVal > 50) {
            result -= 2;
        }
        if (quantity > 100) {
            result -= 1;
        }
        if (yearToDate > 10000) {
            result -= 4;
        }
        return result;
    }

}
