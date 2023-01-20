package com.quinbay.wholesaler.service;

import com.quinbay.wholesaler.model.Wholesalers;

import java.util.List;

public interface WholesalersService {
    String addWholesaler(Wholesalers w);
    String updateWholesaler(Wholesalers w, long id);
    List<Wholesalers> viewWholesalers();
    Wholesalers findWholesalerByID(long id);
    String deleteWholesaler(long id);
}
