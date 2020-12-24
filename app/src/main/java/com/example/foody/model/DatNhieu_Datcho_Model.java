package com.example.foody.model;

public class DatNhieu_Datcho_Model {
    String anh;
    int anhchamtron;
    String tieude;
    String diachi;
    String khoangcach;
    String thongtin;
    String cangay;
    String giam;

    public DatNhieu_Datcho_Model() {
    }

    public DatNhieu_Datcho_Model(String anh, int anhchamtron, String tieude, String diachi, String khoangcach, String thongtin, String cangay, String giam) {
        this.anh = anh;
        this.anhchamtron = anhchamtron;
        this.tieude = tieude;
        this.diachi = diachi;
        this.khoangcach = khoangcach;
        this.thongtin = thongtin;
        this.cangay = cangay;
        this.giam = giam;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public int getAnhchamtron() {
        return anhchamtron;
    }

    public void setAnhchamtron(int anhchamtron) {
        this.anhchamtron = anhchamtron;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getKhoangcach() {
        return khoangcach;
    }

    public void setKhoangcach(String khoangcach) {
        this.khoangcach = khoangcach;
    }

    public String getThongtin() {
        return thongtin;
    }

    public void setThongtin(String thongtin) {
        this.thongtin = thongtin;
    }

    public String getCangay() {
        return cangay;
    }

    public void setCangay(String cangay) {
        this.cangay = cangay;
    }

    public String getGiam() {
        return giam;
    }

    public void setGiam(String giam) {
        this.giam = giam;
    }
}
