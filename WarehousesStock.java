package com.quinbay.product.model;

import javax.persistence.*;

@Entity
@Table(name = "warehouses_stock")
public class WarehousesStock {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) long id;
    @Column(name="stock") int stock;   
}
