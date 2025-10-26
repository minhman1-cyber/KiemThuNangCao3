package org.example;

public class HocLuc {
    public String kiemTraHocLuc(Float diem){
        if(diem < 5.0){
            return "Yếu";
        }else if(diem < 7.0){
            return "Trung bình";
        }else if(diem < 9.0){
            return "Giỏi";
        }else{
            return "Xuất sắc";
        }
    }
}
