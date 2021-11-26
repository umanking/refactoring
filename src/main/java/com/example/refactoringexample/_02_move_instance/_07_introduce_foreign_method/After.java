package com.example.refactoringexample._02_move_instance._07_introduce_foreign_method;

import java.util.Date;

public class After {


    void clientMethod(Date previousEnd) {
        // 클라이언트에서 사용한다.
        Date newStart = nextDay(previousEnd);
    }

    // 클라이언트에서 만든 코드
    private static Date nextDay(Date arg) {
        // Date 클래스에 있을 외래 메서드
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }

}
