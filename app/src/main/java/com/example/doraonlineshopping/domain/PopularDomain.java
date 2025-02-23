package com.example.doraonlineshopping.domain;

import java.io.Serializable;

public class PopularDomain implements Serializable {
    private String title;
    private String picUrl;
    private double score;
    private int numInCart;
    private double price;
    private String description;


    public PopularDomain(String title, String picUrl, double score, double price, String description) {
        this.title = title;
        this.picUrl = picUrl;
        this.score = score;
        this.price = price;
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getNumInCart() {
        return numInCart;
    }

    public void setNumInCart(int numInCart) {
        this.numInCart = numInCart;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
