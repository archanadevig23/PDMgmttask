package com.quinbay.retailer.model;

import javax.persistence.*;

@Entity
@Table(name="retailers_stock")
public class RetailersStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) long id;
    @Column(name="stock") int stock;
    @Column(name="margin") int margin;
    @Column(name="price") int price;
}
