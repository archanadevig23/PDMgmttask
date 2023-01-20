//package com.quinbay.retailer.controller;
//
//import com.quinbay.retailer.model.Retailers;
//import com.quinbay.retailer.service.loadData;
//import com.quinbay.retailer.model.Products;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//
//@RestController
//@RequestMapping(value="/retailers")
//public class RetailerController {
//
//    @Autowired
//    com.quinbay.retailer.client.webClientAPI webClientAPI;
//
//    @GetMapping("/load")
//    public String loadData() {
//        return loadData.obtainData();
//    }
//
//    @GetMapping("/getRetailers")
//    public ArrayList<Retailers> getRetailers() {
//        return webClientAPI.getRetailerDetails();
//    }
//
//    @PostMapping("/addRetailer")
//    public String addRetailerDetails(@RequestBody Retailers r) {
//        return webClientAPI.addRetailerDetails(r);
//    }
//
//    @PutMapping("/updateDetails")
//    public String updateRetailerDetails(@RequestBody Retailers r_to_change) {
//        return webClientAPI.updateRetailerDetails(r_to_change);
//    }
//
//    @DeleteMapping("/deleteRetailer")
//    public String deleteRetailerDetails(@RequestParam int retailerId) {
//        return webClientAPI.deleteRetailerDetails(retailerId);
//    }
//
//}
