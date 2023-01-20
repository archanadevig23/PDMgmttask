//package com.quinbay.product.client;
//
//import com.quinbay.product.model.Products;
//import com.quinbay.product.service.loadData;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//@Component
//public class webClientAPI {
//
//    @Autowired
//    RestTemplate restTemplate;
//
//    public  ArrayList<Products> getProductDetails() {
//        ArrayList<Products> products = loadData.products;
//        System.out.println("P Size - " + loadData.products.size());
//        return products;
//    }
//
//    public String addProductDetails(Products p) {
//        loadData.products.add(p);
//        return "Product added successfully";
//    }
//
//    public String updateProductDetails(@RequestBody Products p_to_change) {
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
//
//    public String deleteProductDetails(@PathVariable int id) {
//        for(Products p: loadData.products) {
//            if(p.getId()==id)
//            {
//                loadData.products.remove(loadData.products.indexOf(p));
//                return "Details deleted successfully";
//            }
//        }
//        return "Unable to delete details";
//    }
//
//
////    public String getProductById() {
////        HttpHeaders headers = new HttpHeaders();
////        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
////        HttpEntity<String> entity = new HttpEntity<String>(headers);
////        return restTemplate.exchange("http://localhost:8080/product", HttpMethod.GET, entity, String.class).getBody();
////    }
////
////    public String getProductDetails(@PathVariable int productId) {
////        System.out.println("hi - " + productId);
////
////        HttpHeaders headers = new HttpHeaders();
////        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
////
////        String url = UriComponentsBuilder.fromHttpUrl("http://localhost:8080/product").queryParam("productId", productId).toUriString();
////
////        HttpEntity<String> entity = new HttpEntity<String>(headers);
////        return restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
////    }
////
////    public Products addProductDetails(@RequestBody Products product) {
////
////        HttpHeaders headers = new HttpHeaders();
////        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
////
////        String url = UriComponentsBuilder.fromHttpUrl("http://localhost:8080/addProduct")
////                .queryParam("id", product.getId())
////                .queryParam("name", product.getName())
////                .queryParam("stock", product.getStock())
////                .queryParam("price", product.getPrice())
////                .queryParam("gst", product.getGst()).toUriString();
////
////        HttpEntity<Products> entity = new HttpEntity<Products>(product, headers);
////        return restTemplate.exchange(url, HttpMethod.POST, entity, Products.class).getBody();
////    }
//
//
//
//}
