package org.example;

public class TongSoLe {
    public Integer tinhTongSoLe(Integer number){
        if(number < 1 || number > 1000){
            throw new IllegalArgumentException("nhap trong khoang 1 - 1000");
        }
        int sum = 0;
        for(int i = 1; i<=number;i++){
            if(i % 2 == 1){
                sum += i;
            }
        }
        return sum;
    }
}
