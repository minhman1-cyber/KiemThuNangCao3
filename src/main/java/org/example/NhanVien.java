package org.example;

public class NhanVien {
    private Integer id;
    private String tenNhanVien;
    private String phongBan;
    private Integer doTuoi;

    public NhanVien() {
    }

    public NhanVien(Integer id, String tenNhanVien, String phongBan, Integer doTuoi) {
        this.id = id;
        this.tenNhanVien = tenNhanVien;
        this.phongBan = phongBan;
        this.doTuoi = doTuoi;
    }

    public Integer getDoTuoi() {
        return doTuoi;
    }

    public void setDoTuoi(Integer doTuoi) {
        this.doTuoi = doTuoi;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
