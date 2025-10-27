package org.example;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    List<SanPham> list = new ArrayList<>();
    SanPham sanPham = new SanPham("1", "ten 1", 2, 45f, 4, "danh muc 1");

    public List<SanPham> getList() {
        return list;
    }

    public void them(SanPham newSanPham){
        if(newSanPham.getSoLuong() < 1 || newSanPham.getSoLuong() > 100){
            throw new IllegalArgumentException("So luong tu 1 - 100");
        }

        list.add(sanPham);

        for(int i = 0; i<list.size(); i++){
            if(list.get(i).getMa().equals(newSanPham.getMa())){
                throw new IllegalArgumentException("San pham da ton tai");
            }
        }

        list.add(newSanPham);

    }
}
