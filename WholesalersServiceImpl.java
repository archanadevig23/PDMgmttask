package com.quinbay.wholesaler.service;

import com.quinbay.wholesaler.model.Wholesalers;
import com.quinbay.wholesaler.repository.WholesalersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WholesalersServiceImpl implements WholesalersService{

    @Autowired
    WholesalersRepository wholesalersRepository;

    @Override
    public String addWholesaler(Wholesalers w)
    {
        wholesalersRepository.save(w);
        return "Wholesaler added successfully";
    }

    @Override
    public List<Wholesalers> viewWholesalers()
    {
        return wholesalersRepository.findAll();
    }

    @Override
    public String updateWholesaler(Wholesalers w, long id)
    {
        Optional<Wholesalers> opt = wholesalersRepository.findById(id);
        if (opt.isPresent())
            opt.get().setCode("W1003");
        wholesalersRepository.save(opt.get());
        return "Product data updated successfully";
    }

    @Override
    public String deleteWholesaler(long id)
    {
        Optional<Wholesalers> opt = wholesalersRepository.findById(id);
        if (opt.isPresent())
        {
            wholesalersRepository.deleteById(id);
            return "Product data deleted succesfully";
        }
        return "Product data not deleted";
    }

    @Override
    public Wholesalers findWholesalerByID(long id) {
        Optional<Wholesalers> opt = wholesalersRepository.findById(id);
        if(opt.isPresent())
            return opt.get();
        else
            return null;
    }
}
