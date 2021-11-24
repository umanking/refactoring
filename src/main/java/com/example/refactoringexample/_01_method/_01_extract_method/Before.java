package com.example.refactoringexample._01_method._01_extract_method;

import com.example.refactoringexample._01_method._01_extract_method.Order;
import java.util.List;

public class Before {

    private String name;
    private List<Order> orders;

    void printOwing(double amount) {
        double outstanding = 0.0;

        // 배너출력
        System.out.println("--------------");
        System.out.println("---- 고객 외상--");
        System.out.println("--------------");

        while (orders.iterator().hasNext()) {
            Order each = orders.iterator().next();
            outstanding += each.getAmount();
        }

        System.out.println("고객명:" + name);
        System.out.println("외상액:" + outstanding);
    }

}
