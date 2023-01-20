//package com.quinbay.retailer.service;
//
//import com.quinbay.retailer.model.Products;
//import com.quinbay.retailer.model.Retailers;
//import org.springframework.stereotype.Service;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//@Service
//public class loadData {
//
//    static public ArrayList<Retailers> retailers = new ArrayList<>();
//
//    public static String obtainData() {
//
//        try {
//            Scanner sc1 = new Scanner(new File("/Users/archanadevi/IdeaProjects/Day1MainTask/src/retailers.csv"));
//            sc1.useDelimiter("\n");
//            while (sc1.hasNext()) {
//                String[] ret_data = sc1.next().split(",", 5);
//                retailers.add(new Retailers(Integer.parseInt(ret_data[0]), ret_data[1], null));
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
