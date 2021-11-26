package com.example.refactoringexample._02_move_instance._05_hide_delegate.before;

public class Person {

    Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
