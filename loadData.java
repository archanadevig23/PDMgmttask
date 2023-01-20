//package com.quinbay.product.service;
//
//import com.quinbay.product.model.Products;
//import org.springframework.stereotype.Service;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//@Service
//public class loadData {
//
//    static public ArrayList<Products> products = new ArrayList<>();
//
//    public static String obtainData() {
//
//        try {
//            Scanner sc1 = new Scanner(new File("/Users/archanadevi/IdeaProjects/Day1MainTask/src/products.csv"));
//            sc1.useDelimiter("\n");
//            while (sc1.hasNext()) {
//                String[] prod_data = sc1.next().split(",", 5);
//                products.add(new Products(Integer.parseInt(prod_data[0]), prod_data[1], Integer.parseInt(prod_data[2]), Float.parseFloat(prod_data[3]), Integer.parseInt(prod_data[4])));
//            }
//            sc1.close();
//            return "file read successfully";
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return "Unable to load data";
//    }
//
//
//
//}
