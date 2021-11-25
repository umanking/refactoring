package com.example.refactoringexample._01_method._08_replace_method_with_method_object._01_before;

public class Account {

    int gamma(int inputVal, int quantity, int yearToDate) {
        int importantValue1 = inputVal * quantity + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        //기타 작업

        return importantValue3 - 2 * importantValue1;
    }

    private int delta() {
        return 0;
    }

}
