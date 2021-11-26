package com.example.refactoringexample._02_move_instance._05_hide_delegate.after;

public class Person {

    Department department;

    // getter를 제공할 필요가 없다.
//    public Department getDepartment() {
//        return department;
//    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // 클라이언트가 getManager정보를 얻기위해서, 위임으로 department에서 getManager를 가지고 온다.
    public Person getManager() {
        return department.getManager();
    }
}
