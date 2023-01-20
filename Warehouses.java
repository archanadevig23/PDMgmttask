package com.quinbay.product.model;

import javax.persistence.*;

@Entity
@Table(name = "warehouses")
public class Warehouses {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) long id;
    @Column(name = "code")
    String code;
    @Column(name = "name")
    String name;
    public Warehouses() {
    }
    public Warehouses(String code, String name) {
        this.setName(name);
        this.setCode(code);
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
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}