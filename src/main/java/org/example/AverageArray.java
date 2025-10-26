package org.example;

public class AverageArray {
    public Float avgArr(int[] arr){
        if(arr.length > 10){
            throw new IllegalArgumentException("do dai cua mang toi da la 10 phan tu");
        }
        if(arr.length == 0){
            throw new IllegalArgumentException("mang khong duoc rong");
        }
        int tong = 0;
        for (int i = 0; i < arr.length; i++){
            tong += arr[i];
        }
        Float kq = (float) tong / arr.length;
        return kq;
    }
}
