package com.example.refactoringexample._03_data._04_change_reference_to_value;

import java.util.Objects;

public class Currency {

    private String code;

    public String getCode() {
        return code;
    }

    public Currency(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Currency)) {
            return false;
        }
        Currency currency = (Currency) o;
        return currency.getCode().equals(code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
