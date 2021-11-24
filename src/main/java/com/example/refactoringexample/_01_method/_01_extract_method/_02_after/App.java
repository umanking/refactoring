package com.example.refactoringexample._01_method._01_extract_method._02_after;

import com.example.refactoringexample._01_method._01_extract_method.Order;
import java.util.List;

public class App {

    private String name;
    private List<Order> orders;

    void printOwing(double prevAmount) {
        double outStanding = prevAmount * 1.2;
        // 지역변수가 없는 경우 그냥 extract method
        printBanner();

        // 복잡한 경우, 지역변수로 값 대입
        double outstanding = getOutstanding(outStanding);

        // 간단한 경우, 지역변수가 있는경우, 읽히기만 하고, 변경이 되지 않을때는 > 그냥 매개변수로 전달
        printDetails(outstanding);
    }

    private double getOutstanding(double initialValue) {
        double result = initialValue;
        while (orders.iterator().hasNext()) {
            Order each = orders.iterator().next();
            result += each.getAmount();
        }
        return result;
    }

    private void printDetails(double outstanding) {
        System.out.println("고객명:" + name);
        System.out.println("외상액:" + outstanding);
    }

    private void printBanner() {
        // 배너출력
        System.out.println("--------------");
        System.out.println("---- 고객 외상--");
        System.out.println("--------------");
    }
}
