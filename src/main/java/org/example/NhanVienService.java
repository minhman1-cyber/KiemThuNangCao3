package org.example;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    List<NhanVien> list = new ArrayList<>();
    public NhanVien nhanVien = new NhanVien(1, "nhan vien 1", "phong ban 1", 5);

    public List<NhanVien> getList(){
        return list;
    }

    public void addNhanVien(NhanVien nhanVien1){
        if(nhanVien1 == null){
            throw new IllegalArgumentException("Nhan vien khong duoc null");
        }
        if(nhanVien1.getId() == null || nhanVien1.getId() < 0 || nhanVien1.getDoTuoi() == null || nhanVien1.getDoTuoi() < 5) {
            throw new IllegalArgumentException("truong nhap khong hop le");
        }
        list.add(nhanVien1);
    }

    public void updateNhanVien(NhanVien nhanVien1){
        if(nhanVien1 == null){
            throw new IllegalArgumentException("Nhan vien khong duoc null");
        }
        if(nhanVien1.getId() == null || nhanVien1.getId() < 0 || nhanVien1.getDoTuoi() == null || nhanVien1.getDoTuoi() < 5) {
            throw new IllegalArgumentException("truong nhap khong hop le");
        }
        nhanVien.setId(nhanVien1.getId());
        nhanVien.setTenNhanVien(nhanVien1.getTenNhanVien());
        nhanVien.setDoTuoi(nhanVien1.getDoTuoi());
        nhanVien.setPhongBan(nhanVien1.getPhongBan());
    }

}
