//package com.quinbay.wholesaler.controller;
//
//import com.quinbay.wholesaler.model.Wholesalers;
//import com.quinbay.wholesaler.service.loadData;
//import com.quinbay.wholesaler.model.Products;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//
//@RestController
//@RequestMapping(value="/wholesalers")
//public class WholesalerController {
//
//    @Autowired
//    com.quinbay.wholesaler.client.webClientAPI webClientAPI;
//
//    @GetMapping("/load")
//    public String loadData() {
//        return loadData.obtainData();
//    }
//
//    @GetMapping("/getWholesalers")
//    public ArrayList<Wholesalers> getWholesalers() {
//        return webClientAPI.getWholesalerDetails();
//    }
//
//    @PostMapping("/addWholesaler")
//    public String addWholesalerDetails(@RequestBody Wholesalers w) {
//        return webClientAPI.addWholesalerDetails(w);
//    }
//
//    @PutMapping("/updateDetails")
//    public String updateWholesalerDetails(@RequestBody Wholesalers w_to_change) {
//        return webClientAPI.updateWholesalerDetails(w_to_change);
//    }
//
//    @DeleteMapping("/deleteWholesaler")
//    public String deleteWholesalerDetails(@RequestParam int wholesalerid) {
//        return webClientAPI.deleteWholesalerDetails(wholesalerid);
//    }
//
//    @PutMapping("/allocateToWholeSaler")
//    public String allocateToWholeSaler(@RequestParam int wholeSalerId,@RequestParam int productId,@RequestParam int stock){
//        return webClientAPI.allocateToWholeSaler(wholeSalerId,productId,stock);
//    }
//
//}
