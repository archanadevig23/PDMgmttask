package com.quinbay.product.service;

import com.quinbay.product.model.Products;
import com.quinbay.product.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsServiceImpl implements ProductsService{

    @Autowired
    ProductsRepository productsRepository;

    @Override
    public String addProduct(Products p)
    {
        productsRepository.save(p);
        return "Product added successfully";
    }

    @Override
    public List<Products> viewProducts()
    {
        return productsRepository.findAll();
    }

    @Override
    public String updateProduct(Products p, long id)
    {
        Optional<Products> opt = productsRepository.findById(id);
        if (opt.isPresent())
            opt.get().setCode("P1003");
        productsRepository.save(opt.get());
        return "Product data updated successfully";
    }

    @Override
    public String  deleteProduct(long id)
    {
        Optional<Products> opt = productsRepository.findById(id);
        if (opt.isPresent())
        {
            productsRepository.deleteById(id);
            return "Product data deleted succesfully";
        }
        return "Product data not deleted";
    }

    @Override
    public Products findProductByID(long id) {
        Optional<Products> opt = productsRepository.findById(id);
        if(opt.isPresent())
            return opt.get();
        else
            return null;
    }
}

