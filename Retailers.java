//package com.quinbay.retailer.model;
//
//import java.util.ArrayList;
//
//public class Retailers {
//    int id;
//    String name;
//    int w_id;
//    public ArrayList<Products> r_products = new ArrayList<Products>();
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
//    public int getW_id() {
//        return w_id;
//    }
//
//    public void setW_id(int w_id) {
//        this.w_id = w_id;
//    }
//
//    public ArrayList<Products> getR_products() {
//        return r_products;
//    }
//
//    public void setR_products(ArrayList<Products> r_products) {
//        this.r_products = r_products;
//    }
//
//    public Retailers() {
//
//    }
//
//    public Retailers(int id, String name, ArrayList<Products> r_products) {
//        this.setId(id);
//        this.setName(name);
//        this.setR_products(r_products);
//    }
//}

package com.quinbay.retailer.model;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name="retailers")
public class Retailers {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long id;
    @Column(name="code") String code;
    @Column(name="name") String name;
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
    public Retailers() {

    }
    public Retailers(String code, String name) {
        this.setName(name);
        this.setCode(code);
    }
}
