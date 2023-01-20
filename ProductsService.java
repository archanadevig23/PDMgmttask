package com.quinbay.product.service;

import com.quinbay.product.model.Products;
import java.util.List;

public interface ProductsService {
    String addProduct(Products p);
    String updateProduct(Products p, long id);
    List<Products> viewProducts();
    Products findProductByID(long id);
    String deleteProduct(long id);
}

