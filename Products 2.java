package com.quinbay.retailer.model;

public class Products {

    int id;
    String name;
    float price;
    int gst;
    int stock;

    public int getW_id() {
        return w_id;
    }

    public void setW_id(int w_id) {
        this.w_id = w_id;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    int w_id;
    int r_id;

    public Products() {

    }

    public Products(int id, String name, int stock, float price, int gst) {
        this.setId(id);
        this.setName(name);
        this.setStock(stock);
        this.setPrice(price);
        this.setGst(gst);
    }

    public Products(int id, String name, int stock, float price, int gst, int w_id, int r_id) {
        this.id=id;
        this.name=name;
        this.stock=stock;
        this.price=price;
        this.gst=gst;
        this.w_id = w_id;
        this.r_id=r_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getGst() {
        return gst;
    }

    public void setGst(int gst) {
        this.gst = gst;
    }

}
