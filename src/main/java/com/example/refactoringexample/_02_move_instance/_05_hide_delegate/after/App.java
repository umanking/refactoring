package com.example.refactoringexample._02_move_instance._05_hide_delegate.after;

public class App {

    public static void main(String[] args) {
        Person person = new Person();
//        Person manager = person.getDepartment().getManager();
        Person manager1 = person.getManager(); //아래 방식으로 사용할 수 있게
    }

}
