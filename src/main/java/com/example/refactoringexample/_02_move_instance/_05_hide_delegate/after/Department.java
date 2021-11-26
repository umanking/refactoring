package com.example.refactoringexample._02_move_instance._05_hide_delegate.after;

public class Department {

    private String chargeCode;
    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }
}
