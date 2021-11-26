package com.example.refactoringexample._02_move_instance._07_introduce_foreign_method;

import java.util.Date;

public class Before {

    // 서버에서 제공하는 어떤 메서드인데, 그 클래스를 수정할 수 없을때, 클라이언트 클래스안에 새로운 메서드를 작성하자.
    void method(Date previousEnd) {
        Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
    }

}
