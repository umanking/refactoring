
package com.example.refactoringexample._03_data._01_self_encapsulate_field.after;

// 자체 캡슐화를 위해 읽기메서드와 쓰기 메서드를 다음과 같이 정의함
public class IntRange {

    boolean includes(int arg) {
        return arg > getLow() && arg <= getHigh();
    }

    void grow(int factor) {
        setHigh(getHigh() * factor);
    }

    public IntRange(int low, int high) {
        initialize(low, high);
    }

    private void initialize(int low, int high) {
        this.low = low;
        this.high = high;
    }

    private int low, high;

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
