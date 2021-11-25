package com.example.refactoringexample._01_method._08_replace_method_with_method_object._02_after;

public class Gamma {

    private final Account account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    //얘네들은 필요없는데 ~
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    public Gamma(Account account, int inputVal, int quantity, int yearToDate) {
        this.account = account;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    int compute() {
        int importantValue1 = inputVal * quantity + account.delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        //기타 작업

        return importantValue3 - 2 * importantValue1;
    }
}
