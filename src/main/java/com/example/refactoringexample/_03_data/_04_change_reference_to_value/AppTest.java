package com.example.refactoringexample._03_data._04_change_reference_to_value;

public class AppTest {

    public static void main(String[] args) {

        System.out.println(new Currency("USD").equals(new Currency("USD")));
    }

}
