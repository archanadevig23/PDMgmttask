//package com.quinbay.product.model;
//
//
//public class Products {
//
//    int id;
//    String name;
//    float price;
//    int gst;
//    int stock;
//
//    public Products() {
//
//    }
//
//    public Products(int id, String name, int stock, float price, int gst) {
//        this.setId(id);
//        this.setName(name);
//        this.setStock(stock);
//        this.setPrice(price);
//        this.setGst(gst);
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getStock() {
//        return stock;
//    }
//
//    public void setStock(int stock) {
//        this.stock = stock;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }
//
//    public int getGst() {
//        return gst;
//    }
//
//    public void setGst(int gst) {
//        this.gst = gst;
//    }
//
//}

package com.quinbay.product.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) long id;
    @Column(name = "code")
    String code;
    @Column(name = "name")
    String name;
    @Column(name = "price")
    float price;
    @Column(name = "gst")
    int gst;
    @Column(name = "desc")
    String desc;
    public Products() { }
    public Products(String code, String name, float price, int gst, String desc) {
        this.setCode(code);
        this.setName(name);
        this.setPrice(price);
        this.setGst(gst);
        this.setDesc(desc);
    }
    public long getId() {
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
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}

