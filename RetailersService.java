package com.quinbay.retailer.service;

import com.quinbay.retailer.model.Retailers;

import java.util.List;

public interface RetailersService {
    String addRetailer(Retailers r);
    List<Retailers> viewRetailers();
    String updateRetailer(Retailers r, long id);
    String deleteRetailer(long id);
    Retailers findRetailerById(long id);
}
