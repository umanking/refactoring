package com.example.refactoringexample._02_move_instance._02_move_field._02_after;

public class Account {
    private AccountType type;

    double interestForAmountDays(double amount, int days) {
        return type.getInterestRate() * amount * days / 365;
    }

}
