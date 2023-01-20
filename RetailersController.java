package com.quinbay.retailer.controller;

import com.quinbay.retailer.model.Retailers;
import com.quinbay.retailer.service.RetailersService;
import com.quinbay.retailer.service.RetailersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/retailers")
public class RetailersController {

    @Autowired
    RetailersServiceImpl retailersServiceImpl;

    @PostMapping("/add")    // Create
    public String add(@RequestBody Retailers r) {
        return retailersServiceImpl.addRetailer(r);
    }

    @GetMapping("/viewAll")     // Read
    public List<Retailers> viewAll() {
        return retailersServiceImpl.viewRetailers();
    }

    @PutMapping("/update")      // Update
    public String update(@RequestBody Retailers r, @RequestParam long rid) {
        return retailersServiceImpl.updateRetailer(r, rid);
    }

    @DeleteMapping("/delete")      // Delete
    public String delete(@RequestParam int rid) {
        return retailersServiceImpl.deleteRetailer(rid);
    }

    @GetMapping("/findRetailer/{rid}")      // Delete
    public Retailers find(@PathVariable int rid) {
        return retailersServiceImpl.findRetailerById(rid);
    }
}
