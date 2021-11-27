package com.example.refactoringexample._03_data._05_replace_array_with_object.after;

public class Performance {

    private String name;
    private String wins;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return Integer.parseInt(wins);
    }

    public void setWins(String wins) {
        this.wins = wins;
    }
}
