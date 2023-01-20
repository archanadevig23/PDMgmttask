package com.quinbay.product.service;

import com.quinbay.product.api.displayDetails;
import com.quinbay.product.model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductsOp {

//    public ArrayList<Products> getProductDetails() {
//        ArrayList<Products> products = loadData.products;
//        System.out.println("P Size - " + loadData.products.size());
//        return products;
//    }

//    public String addProductDetails(Products p) {
//        loadData.products.add(p);
//        return "Product added successfully";
//    }

//    public String updateProductDetails(Products p_to_change) {
//        ArrayList<Products> products = loadData.products;
//        for(Products p:products) {
//            if(p.getId()==p_to_change.getId())
//            {
//                p.setName(p_to_change.getName());
//                p.setPrice(p_to_change.getPrice());
//                p.setStock(p_to_change.getStock());
//                p.setGst(p_to_change.getGst());
//                return "Details updated successfully";
//            }
//        }
//        return "Unable to update details";
//    }

//    public String deleteProductDetails(int id) {
//        for(Products p: loadData.products) {
//            if(p.getId()==id)
//            {
//                loadData.products.remove(loadData.products.indexOf(p));
//                return "Details deleted successfully";
//            }
//        }
//        return "Unable to delete details";
//    }

}
