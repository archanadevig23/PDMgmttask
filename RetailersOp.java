//package com.quinbay.retailer.service;
//
//import com.quinbay.retailer.model.Products;
//import com.quinbay.retailer.model.Retailers;
//import com.quinbay.retailer.model.Wholesalers;
//import org.springframework.stereotype.Service;
//import com.quinbay.retailer.client.webClientAPI;
//import java.util.ArrayList;
//
//@Service
//public class RetailersOp {
//
//    static ArrayList<Retailers> retailers = loadData.retailers;
//
//    static Wholesalers[] wholesalers = webClientAPI.getWholesalers();
//    static Products[] products= webClientAPI.getProducts();
//
//    static void allocateToRetailer(int r_id, int w_id, int p_id, int stock) {
//        boolean re = false;
//        boolean wb = false;
//        boolean pr = false;
//        for(Retailers retailer: retailers) {
//            if(retailer.getId() == r_id) {
//                re=true;
//                int r_index = retailers.indexOf(retailer);
//                int count=0;
//                for(Wholesalers wholesaler: wholesalers) {
//                    if(wholesaler.getId() == w_id) {
//                        wb=true;
//                        int w_index = wholesalers.indexOf(wholesaler);
//                        for(Products product: products) {
//                                if(product.getId() == p_id) {
//                                    pr=true;
//                                    if(product.getStock() >= stock) {
//                                        int p_index = count;
//                                        Products p = new Products(product.getId(), product.getName(), 0, product.getPrice(), product.getGst(), w_id, r_id);
//                                        retailers.get(r_index).r_products.add(p);
//                                        wholesalers.get(w_index).w_products.get(p_index).setStock(wholesalers.get(w_index).w_products.get(p_index).getStock() - stock);
//                                        int re_index = -1;
//                                        boolean r_bool[] = new boolean[retailers.get(r_index).r_products.size()];
//                                        for (Products r_product : retailers.get(r_index).r_products) {
//                                            r_bool[retailers.get(r_index).r_products.indexOf(r_product)] = false;
//                                            if (r_product.getR_id() == r_id) {
//                                                r_bool[retailers.get(r_index).r_products.indexOf(r_product)] = true;
//                                                re_index = retailers.get(r_index).r_products.indexOf(r_product);
//                                            }
//                                        }
//                                        retailers.get(r_index).r_products.get(re_index).setStock(retailers.get(r_index).r_products.get(re_index).getStock() + stock);
//                                    }
//                                }
//                            count++;
//
//                            }
//                        }
//                    }
//                    sumUpRProducts(r_index);
//                    }
//                }
//            }
//    static void sumUpRProducts(int r_index) {
//
//        ArrayList<Integer> iop = new ArrayList<>();
//
//        for(int i=0; i<retailers.get(r_index).r_products.size(); i++) {
//            Products r_product = retailers.get(r_index).r_products.get(i);
//            for(int j=i+1; j<retailers.get(r_index).r_products.size(); j++) {
//                Products r_product1 = retailers.get(r_index).r_products.get(j);
//                if((r_product.getId() == r_product1.getId()) && (retailers.get(r_index).r_products.indexOf(r_product)!=retailers.get(r_index).r_products.indexOf(r_product1)) ) {
//                    r_product.setStock(r_product.getStock() + r_product1.getStock());
//                    iop.add(retailers.get(r_index).r_products.indexOf(r_product1));
//                }
//            }
//        }
//
//        for(Integer i: iop) {
//            System.out.println(i);
//            retailers.get(r_index).r_products.remove(retailers.get(r_index).r_products.get(i));
//        }
//
//    }
//
////    public ArrayList<Products> getProductDetails() {
////        ArrayList<Products> products = loadData.products;
////        System.out.println("P Size - " + loadData.products.size());
////        return products;
////    }
//
////    public String addProductDetails(Products p) {
////        loadData.products.add(p);
////        return "Product added successfully";
////    }
//
////    public String updateProductDetails(Products p_to_change) {
////        ArrayList<Products> products = loadData.products;
////        for(Products p:products) {
////            if(p.getId()==p_to_change.getId())
////            {
////                p.setName(p_to_change.getName());
////                p.setPrice(p_to_change.getPrice());
////                p.setStock(p_to_change.getStock());
////                p.setGst(p_to_change.getGst());
////                return "Details updated successfully";
////            }
////        }
////        return "Unable to update details";
////    }
//
////    public String deleteProductDetails(int id) {
////        for(Products p: loadData.products) {
////            if(p.getId()==id)
////            {
////                loadData.products.remove(loadData.products.indexOf(p));
////                return "Details deleted successfully";
////            }
////        }
////        return "Unable to delete details";
////    }
//
//}
