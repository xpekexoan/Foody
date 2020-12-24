package com.example.foody.model;

public class News_Nofication_Model {
    int anh;
    String tv1_tintuc;
    String tv2_tintuc;
    String tv3_tintuc;

    public News_Nofication_Model() {
    }

    public News_Nofication_Model(int anh, String tv1_tintuc, String tv2_tintuc, String tv3_tintuc) {
        this.anh = anh;
        this.tv1_tintuc = tv1_tintuc;
        this.tv2_tintuc = tv2_tintuc;
        this.tv3_tintuc = tv3_tintuc;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTieude1() {
        return tv1_tintuc;
    }

    public void setTieude1(String tieude1) {
        this.tv1_tintuc = tieude1;
    }

    public String getTieude2() {
        return tv2_tintuc;
    }

    public void setTieude2(String tieude2) {
        this.tv2_tintuc = tieude2;
    }

    public String getTieude3() {
        return tv3_tintuc;
    }

    public void setTieude3(String tieude3) {
        this.tv3_tintuc = tieude3;
    }
}
