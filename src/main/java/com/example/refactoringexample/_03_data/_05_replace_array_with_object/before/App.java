package com.example.refactoringexample._03_data._05_replace_array_with_object.before;

public class App {

    public static void main(String[] args) {
        String[] row = new String[3];
        row[0] = "리버풀"; //name
        row[1] = "15"; // wins

        String name = row[0];
        int wins = Integer.parseInt(row[1]);
    }

}
