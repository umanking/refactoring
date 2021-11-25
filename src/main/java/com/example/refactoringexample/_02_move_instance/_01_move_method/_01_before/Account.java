package com.example.refactoringexample._02_move_instance._01_move_method._01_before;

public class Account {

    private AccountType type;
    private int daysOverDrawn;

    // 해당 메서드를 AccountType으로 옮기려고 한다.
    double overdraftCharge() {
        if (type.isPremium()) {
            double result = 10;
            if (daysOverDrawn > 7) {
                result += daysOverDrawn - 7 * 0.85;
            }
            return result;

        } else {
            return daysOverDrawn * 1.75;
        }
    }

    double bankCharge() {
        double result = 4.5;
        if (daysOverDrawn > 0) {
            result += overdraftCharge();
        }
        return result;
    }

}
