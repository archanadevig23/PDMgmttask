package com.quinbay.product.controller;

import com.quinbay.product.model.Products;
import com.quinbay.product.service.ProductsService;
import com.quinbay.product.service.ProductsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductsServiceImpl productsServiceImpl;

    @PostMapping("/add")    // Create
    public String add(@RequestBody Products p) {
        return productsServiceImpl.addProduct(p);
    }

    @GetMapping("/viewAll")     // Read
    public List<Products> viewAll() {
        return productsServiceImpl.viewProducts();
    }

    @PutMapping("/update")      // Update
    public String update(@RequestBody Products p, @RequestParam long pid) {
        return productsServiceImpl.updateProduct(p,pid);
    }

    @DeleteMapping("/delete")      // Delete
    public String delete(@RequestParam int pid) {
        return productsServiceImpl.deleteProduct(pid);
    }

    @GetMapping("/findProduct/{pid}")      // Delete
    public Products find(@PathVariable int pid) {
        return productsServiceImpl.findProductByID(pid);
    }
}
