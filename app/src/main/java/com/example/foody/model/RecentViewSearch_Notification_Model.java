package com.example.foody.model;

public class RecentViewSearch_Notification_Model {
    int anh;
    String tv1_recentview;
    String tv2_recentview;
    String tv3_recentview;
    String tv4_recentview;
    String tv5_recentview;
    String tv6_recentview;

    public RecentViewSearch_Notification_Model(int anh,  String tv1_recentview, String tv2_recentview, String tv3_recentview, String tv4_recentview, String tv5_recentview, String tv6_recentview ){
        this.anh = anh;
        this.tv1_recentview = tv1_recentview;
        this.tv2_recentview = tv2_recentview;
        this.tv3_recentview = tv3_recentview;
        this.tv4_recentview = tv4_recentview;
        this.tv5_recentview =tv5_recentview;
        this.tv6_recentview =tv6_recentview;
    }

    public int getImage() {
        return anh;
    }

    public void setImage(int anh) {
        this.anh = anh;
    }

    public String getTieude1() {
        return tv1_recentview;
    }

    public void setTieude1(String tieude1) {
        this.tv1_recentview = tieude1;
    }

    public String getTieude2() {
        return tv2_recentview;
    }

    public void setTieude2(String tieude2) {
        this.tv2_recentview = tieude2;
    }

    public String getTieude3() {
        return tv3_recentview;
    }

    public void setTieude3(String tieude3) {
        this.tv3_recentview = tieude3;
    }

    public String getTieude4() {
        return tv4_recentview;
    }

    public void setTieude4(String tieude4) {
        this.tv4_recentview = tieude4;
    }

    public String getTieude5() {
        return tv5_recentview;
    }

    public void setTieude5(String tieude5) {
        this.tv6_recentview = tieude5;
    }

    public String getTieude6() {
        return tv6_recentview;
    }

    public void setTieude6(String tieude6) {
        this.tv6_recentview = tieude6;
    }
}
