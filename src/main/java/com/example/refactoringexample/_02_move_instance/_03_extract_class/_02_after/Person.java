package com.example.refactoringexample._02_move_instance._03_extract_class._02_after;

public class Person {

    private String name;
    private TelephoneNumber telephoneNumber = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return "(" + telephoneNumber.getAreaCode()+ ")" + telephoneNumber.getNumber();
    }

    // getter
    public String getOfficeAreaCode() {
        return telephoneNumber.getAreaCode();
    }

    public String getOfficeNumber() {
        return telephoneNumber.getNumber();
    }

    //setter
    public void setOfficeAreaCode(String areaCode) {
        telephoneNumber.setAreaCode(areaCode);
    }

    public void setOfficeNumber(String number) {
        telephoneNumber.setNumber(number);

    }
}
