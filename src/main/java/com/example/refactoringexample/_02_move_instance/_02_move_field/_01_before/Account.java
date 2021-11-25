package com.example.refactoringexample._02_move_instance._02_move_field._01_before;

public class Account {
    private AccountType type;
    private double interestRate;

    double interestForAmountDays(double amount, int days) {
        return interestRate * amount * days / 365;
    }

}
