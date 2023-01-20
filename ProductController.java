//package com.quinbay.product.controller;
//
//import com.quinbay.product.model.Products;
//import com.quinbay.product.service.loadData;
//import com.quinbay.product.client.webClientAPI;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//
//@RestController
//@RequestMapping(value="/products")
//public class ProductController {
//
//    @Autowired
//    webClientAPI webClientAPI;
//
//    @GetMapping("/load")
//    public String loadData() {
//        return loadData.obtainData();
//    }
//
//    @GetMapping("/getProducts")
//    public ArrayList<Products> getProducts() {
//        return webClientAPI.getProductDetails();
//    }
//
//    @PostMapping("/addProduct")
//    public String addProductDetails(@RequestBody Products p) {
//        return webClientAPI.addProductDetails(p);
//    }
//
//    @PutMapping("/updateDetails")
//    public String updateProductDetails(@RequestBody Products p_to_change) {
//        return webClientAPI.updateProductDetails(p_to_change);
//    }
//
//    @DeleteMapping("/deleteProduct")
//    public String deleteProductDetails(@RequestParam int productId) {
//        return webClientAPI.deleteProductDetails(productId);
//    }
//
//}
