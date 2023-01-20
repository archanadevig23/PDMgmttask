package com.quinbay.retailer.controller;//package com.quinbay.product.controller;
//
//import com.quinbay.day5.model.Products;
//import com.quinbay.day5.service.sample;
//import com.quinbay.day5.web.client.webClientAPI;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@ResponseBody
//public class sampleController {
//
//    @Autowired
//    sample s;
//
//    @Autowired
//    webClientAPI webClientAPI;
//
//    @GetMapping("/")
//    public String dispMsg() {
//        return s.returnMsg();
//    }
//
//    @GetMapping("/productdisp")
//    public String getProductById() {
//        return webClientAPI.getProductById();
//    }
//
//    @GetMapping("/product/{productId}")
//        public String getProductDetails(@PathVariable int productId) {
//            System.out.println("hello - " + productId);
//            return webClientAPI.getProductDetails(productId);
//    }
//
//    @PostMapping("/addProduct")
//    public Products addProductDetails(@PathVariable Products product) {
//        return webClientAPI.addProductDetails(product);
//    }
//}
