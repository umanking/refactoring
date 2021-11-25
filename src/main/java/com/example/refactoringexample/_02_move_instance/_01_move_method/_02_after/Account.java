package com.example.refactoringexample._02_move_instance._01_move_method._02_after;

public class Account {

    private AccountType type;
    private int daysOverDrawn;

    double bankCharge() {
        double result = 4.5;
        if (daysOverDrawn > 0) {
            result += type.overdraftCharge(daysOverDrawn);
        }
        return result;
    }

}
