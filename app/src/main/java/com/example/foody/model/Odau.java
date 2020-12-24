package com.example.foody.model;

public class Odau {
    private int anh;
    private int gia;
    private String ten;
    private String diaChi;
    private String ThoiGian;
    private String mieuTa;

    public Odau(String ten, int anh, int gia, String diaChi, String thoiGian, String mieuTa) {
        this.ten = ten;
        this.anh = anh;
        this.gia = gia;
        this.diaChi = diaChi;
        ThoiGian = thoiGian;
        this.mieuTa = mieuTa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMieuTa() {
        return mieuTa;
    }

    public void setMieuTa(String mieuTa) {
        this.mieuTa = mieuTa;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(String thoiGian) {
        ThoiGian = thoiGian;
    }
}
