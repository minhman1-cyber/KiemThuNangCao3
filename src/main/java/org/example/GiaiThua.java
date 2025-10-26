package org.example;

public class GiaiThua {
    public Long tinhGiaiThua(int n){
        if(n > 10){
            throw new IllegalArgumentException("Nhap trong khoang 0 - 10");
        }
        if(n <= 0){
            throw new IllegalArgumentException("khong the tinh giai thua cho so < 0");
        }
        long giaiThua = 1L;
        for (int i = 2; i <= n; i++) {
            giaiThua *= i;
        }
        return giaiThua;
    }
}
