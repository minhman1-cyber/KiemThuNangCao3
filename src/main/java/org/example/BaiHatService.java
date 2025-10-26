package org.example;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    public BaiHat baiHat = new BaiHat("1", "ten 1", "ca si 1", 140f,    "the loai 1");
    public List<BaiHat> baiHats = new ArrayList<BaiHat>();
    public List<BaiHat> getBaiHat() {
        return baiHats;
    }

    public void themBaiHat(BaiHat newBaiHat) {
        if(newBaiHat.getMa().isBlank() || newBaiHat.getTen().isBlank()
        || newBaiHat.getTenCaSi().isBlank() || newBaiHat.getTheLoai().isBlank()){
            throw new IllegalArgumentException("Khong duoc de trong");
        }

        if(newBaiHat.getThoiLuong() < 120 || newBaiHat.getThoiLuong() >= 300){
            throw new IllegalArgumentException("Thoi luong tu 2p - 5p59");
        }
        baiHats.add(newBaiHat);
    }

}
