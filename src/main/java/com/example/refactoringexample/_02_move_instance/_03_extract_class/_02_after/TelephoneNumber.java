package com.example.refactoringexample._02_move_instance._03_extract_class._02_after;

public class TelephoneNumber {

    private String areaCode;
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
