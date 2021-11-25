package com.example.refactoringexample._02_move_instance._03_extract_class._01_before;

public class Person {

    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public String getName() {
        return name;
    }

    // TelephoneNumber클래스로 추출 가능
    public String getTelephoneNumber() {
        return "(" + officeAreaCode + ")" + officeNumber;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
