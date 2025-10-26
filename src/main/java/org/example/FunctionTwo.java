package org.example;

public class FunctionTwo {
    public String checking(int a){
        if(a > 1000 || a < 0){
            throw new IllegalArgumentException("a phai nam trong khoang 0 - 1000");
        }
        if(a == 0){
            throw new IllegalArgumentException("so 0 khong phai so chan hoac so le");
        }
        if(a % 2 == 0){
            return "so chan";
        }else{
            return "so le";
        }
    }
}
