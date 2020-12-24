package com.example.foody.model;

import java.io.Serializable;

public class Product implements Serializable {
    String title;
    String detail;
    String image_product;

    public Product() {
    }

    public Product(String title, String detail, String image_product) {
        this.title = title;
        this.detail = detail;
        this.image_product = image_product;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImage_product() {
        return image_product;
    }

    public void setImage_product(String image_product) {
        this.image_product = image_product;
    }
}
