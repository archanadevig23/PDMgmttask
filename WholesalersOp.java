//package com.quinbay.wholesaler.service;
//
//import com.quinbay.wholesaler.client.webClientAPI;
//import com.quinbay.wholesaler.model.Products;
//import com.quinbay.wholesaler.model.Wholesalers;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.yaml.snakeyaml.util.ArrayUtils;
//
//
//import java.util.ArrayList;
//
//@Service
//public class WholesalersOp {
//
//    static ArrayList<Wholesalers> wholesaler_details = loadData.wholesalers;
//
//    public String allocateToWholesaler(int wholeSalerId, int productId, int itemCountToBuy) {
//        System.out.println(wholesaler_details.get(0).getName());
//
//        Products[] products= webClientAPI.getProducts();
//        System.out.println(products);
//        for (Wholesalers eachWholesaler : wholesaler_details) {
//            if (eachWholesaler.getId() == wholeSalerId) {
//                for (Products eachProduct : products) {
//                    if (eachProduct.getStock() >= itemCountToBuy && itemCountToBuy > 0) {
//                        if (eachProduct.getId() == productId) {
//                            if (eachWholesaler.w_products.size() == 0) {
//                                Products newProduct = new Products(eachProduct.getId(), eachProduct.getName(), itemCountToBuy, eachProduct.getPrice(), eachProduct.getGst());
//                                eachWholesaler.setW_products(newProduct);
//                                eachProduct.setStock(eachProduct.getStock() - itemCountToBuy);
////                                webClientAPI.updateProduct(eachProduct);
//                                System.out.println("Product added to wholesaler");
//                            } else {
//                                int flag = 0;
//                                for (Products checkProduct : eachWholesaler.w_products) {
//                                    if (checkProduct.getId() == productId) {
//                                        checkProduct.setStock(checkProduct.getStock() + itemCountToBuy);
//                                        eachProduct.setStock(eachProduct.getStock() - itemCountToBuy);
//                                        webClientAPI.updateProduct(eachProduct);
//
//                                        System.out.println("Product added to wholesaler");
//
//                                        flag = 1;
//                                    }
//                                    if (flag == 0) {
//                                        Products newProduct = new Products(eachProduct.getId(), eachProduct.getName(),itemCountToBuy, eachProduct.getPrice(),eachProduct.getGst() );
//                                        eachWholesaler.setW_products(newProduct);
//                                        eachProduct.setStock(eachProduct.getStock() - itemCountToBuy);
//                                        webClientAPI.updateProduct(eachProduct);
//
//                                        System.out.println("Product added to wholesaler");
//                                        break;
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//         webClientAPI.updateProduct(products);
//        return "Wholesaler allocated";
//    }
//}
//
//
////    public static String allocateToWholeSaler(@PathVariable int w_id, @PathVariable int p_id, @PathVariable int stock) {
////        boolean wb = false;
////        boolean pr = false;
////
////        ArrayList<Wholesalers> wholesalers = webClientAPI.getWholesalerDetails();
////        Products[] products = webClientAPI.getProducts();
////
////        for (Wholesalers wholesaler : wholesalers) {        // iterate through all the wholesalers to find which wholesaler requests a purchase
////            if (wholesaler.getId() == w_id) {
////                wb = true;
////                int count = 0;
////                int index = wholesalers.indexOf(wholesaler);    // gets the index of requesting wholesaler
////                for (Products product : products)
////                {     // iterate through all the products to find which product is requested by the wholesaler
////                    if (product.getId() == p_id)
////                    {
////                        pr = true;
////                        if (product.getStock() >= stock)
////                        {
////                            int p_index = count;
//////                            int p_index = products.indexOf(product); //   gets the index of requesting wholesaler
////                            Products p = new Products(product.getId(), product.getName(), 0, product.getPrice(), product.getGst(), w_id);   // we are creating a new object of product class with stock as 0
////                            wholesalers.get(index).w_products.add(p);   // adding that product to the wholesaler products list
////
////                            System.out.println("Good monring");
////
////                            products[p_index].setStock(products[p_index].getStock() - stock);
////
//////                            products.get(p_index).stock = products.get(p_index).stock - stock; // updating the product stock in products
////
////                            // iterate through all the products in w_products and update the product stock if it already exists, else create a new object and update it
////                            int w_index = -1;
////
////                            boolean w_bool[] = new boolean[wholesalers.get(index).w_products.size()];
////                            for (Products w_product : wholesalers.get(index).w_products)
////                            {
////                                w_bool[wholesalers.get(index).w_products.indexOf(w_product)] = false;
////                                if (w_product.getW_id() == w_id)
////                                {
////                                    w_bool[wholesalers.get(index).w_products.indexOf(w_product)] = true;
////                                    w_index = wholesalers.get(index).w_products.indexOf(w_product);
////                                }
////                            }
////
////                            wholesalers.get(index).w_products.get(w_index).setStock(wholesalers.get(index).w_products.get(w_index).getStock() + stock);
//////                            wholesalers.get(index).w_products.get(w_index).stock = wholesalers.get(index).w_products.get(w_index).stock + stock;
////                            System.out.println("Purchase successful");
////                            return "Purchase successful";
////
////                        }
////                        count++;
////
////                    }
////                }
////
////                sumUpWProducts(index);
////
////            }
////        }
////        return "Could not allocate products to wholesaler";
////    }
////
////    static void sumUpWProducts(int w_index) {
////
////        ArrayList<Wholesalers> wholesalers = loadData.wholesalers;
////        ArrayList<Integer> iop = new ArrayList<>();
////
////        for (int i = 0; i < wholesalers.get(w_index).w_products.size(); i++) {
////            Products w_product = wholesalers.get(w_index).w_products.get(i);
////            for (int j = i + 1; j < wholesalers.get(w_index).w_products.size(); j++) {
////                Products w_product1 = wholesalers.get(w_index).w_products.get(j);
////                if ((w_product.getId() == w_product1.getId()) && (wholesalers.get(w_index).w_products.indexOf(w_product) != wholesalers.get(w_index).w_products.indexOf(w_product1))) {
////                    w_product.setStock(w_product.getStock() + w_product1.getStock());
////                    iop.add(wholesalers.get(w_index).w_products.indexOf(w_product1));
////                }
////            }
////        }
////
////        for (Integer i : iop) {
////            System.out.println(i);
////            wholesalers.get(w_index).w_products.remove(wholesalers.get(w_index).w_products.get(i));
////        }
////
////    }
//
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