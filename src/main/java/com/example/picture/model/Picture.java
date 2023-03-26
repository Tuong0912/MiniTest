package com.example.picture.model;

public class Picture {
    private int id;
    private int maPicture;
    private double dai;
    private double rong;
    private String chatLieu;
    private String moTa;
    private double price;

    public Picture() {
    }

    public Picture(int id, int maPicture, double dai, double rong, String chatLieu, String moTa, double price) {
        this.id = id;
        this.maPicture = maPicture;
        this.dai = dai;
        this.rong = rong;
        this.chatLieu = chatLieu;
        this.moTa = moTa;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaPicture() {
        return maPicture;
    }

    public void setMaPicture(int maPicture) {
        this.maPicture = maPicture;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
