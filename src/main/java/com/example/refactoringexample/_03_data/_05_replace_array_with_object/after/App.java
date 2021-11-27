package com.example.refactoringexample._03_data._05_replace_array_with_object.after;

public class App {

    public static void main(String[] args) {
        Performance row = new Performance();
        row.setName("리버풀");
        row.setWins("15");

        String name = row.getName();
        int wins = row.getWins();
    }

}
