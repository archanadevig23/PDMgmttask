package com.quinbay.retailer.model;

import java.util.ArrayList;

public class Wholesalers {

    int id;
    String name;
    public ArrayList<Products> w_products = new ArrayList<Products>();

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

    public ArrayList<Products> getW_products() {
        return w_products;
    }

    public void setW_products(ArrayList<Products> w_products) {
        this.w_products = w_products;
    }

    public Wholesalers() {

    }

    public Wholesalers(int id, String name, ArrayList<Products> w_products) {
        this.setId(id);
        this.setName(name);
        this.setW_products(w_products);
    }


}
