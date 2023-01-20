package com.quinbay.retailer.service;

import com.quinbay.retailer.model.Retailers;
import com.quinbay.retailer.repository.RetailersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RetailersServiceImpl implements RetailersService{
    @Autowired
    RetailersRepository retailersRepository;

    @Override
    public String addRetailer(Retailers r)
    {
        retailersRepository.save(r);
        return "Retailer added successfully";
    }

    @Override
    public List<Retailers> viewRetailers()
    {
        return retailersRepository.findAll();
    }

    @Override
    public String updateRetailer(Retailers r, long id)
    {
        Optional<Retailers> opt = retailersRepository.findById(id);
        if (opt.isPresent())
            opt.get().setCode("R1003");
        retailersRepository.save(opt.get());
        return "Retailer data updated successfully";
    }

    @Override
    public String  deleteRetailer(long id)
    {
        Optional<Retailers> opt = retailersRepository.findById(id);
        if (opt.isPresent())
        {
            retailersRepository.deleteById(id);
            return "Retailer data deleted successfully";
        }
        return "Retailer data not deleted";
    }

    @Override
    public Retailers findRetailerById(long id)
    {
        Optional<Retailers> opt = retailersRepository.findById(id);
        if (opt.isPresent())
        {
            return retailersRepository.findById(id).get();
        }
        return null;
    }
}
