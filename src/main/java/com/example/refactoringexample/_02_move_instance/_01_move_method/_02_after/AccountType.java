package com.example.refactoringexample._02_move_instance._01_move_method._02_after;

public class AccountType {

    double overdraftCharge(double daysOverDrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverDrawn > 7) {
                result += daysOverDrawn - 7 * 0.85;
            }
            return result;

        } else {
            return daysOverDrawn * 1.75;
        }
    }
    public boolean isPremium() {
        return false;
    }
}
