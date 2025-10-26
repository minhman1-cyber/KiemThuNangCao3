package org.example;

public class Calculator {
    public Integer add(Integer a, Integer b) {
        if(a > 1000 || b > 1000) {
            throw new IllegalArgumentException("Moi phan tu nho hon 1000");
        }

        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("Moi phan tu lon hon 0");
        }
        return a + b;
    }

    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    public Integer mul(Integer a, Integer b) {
        return a * b;
    }

    public Float div(Integer a, Integer b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return  (float) a / b;
    }
}
