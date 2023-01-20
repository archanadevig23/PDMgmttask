package com.quinbay.wholesaler.controller;

import com.quinbay.wholesaler.model.Wholesalers;
import com.quinbay.wholesaler.repository.WholesalersRepository;
import com.quinbay.wholesaler.service.WholesalersService;
import com.quinbay.wholesaler.service.WholesalersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class WholesalersController {
    @Autowired
    WholesalersServiceImpl wholesalersServiceImpl;

    @PostMapping("/add")    // Create
    public String add() {
        return wholesalersServiceImpl.addWholesaler();
    }

    @GetMapping("/viewAll")     // Read
    public List<Wholesalers> viewAll() {
        return wholesalersServiceImpl.viewWholesalers();
    }

    @PutMapping("/update")      // Update
    public String update() {
        return wholesalersServiceImpl.updateWholesaler();
    }

    @DeleteMapping("/delete")      // Delete
    public String delete() {
        return wholesalersServiceImpl.deleteWholesaler();
    }
}
