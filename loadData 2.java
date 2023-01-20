//package com.quinbay.wholesaler.service;
//
//import com.quinbay.wholesaler.model.Products;
//import com.quinbay.wholesaler.model.Wholesalers;
//import org.springframework.stereotype.Service;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//@Service
//public class loadData {
//
//    static public ArrayList<Wholesalers> wholesalers = new ArrayList<>();
//
//    public static String obtainData() {
//
//        try {
//            Scanner sc1 = new Scanner(new File("/Users/archanadevi/IdeaProjects/Day1MainTask/src/wholesalers.csv"));
//            sc1.useDelimiter("\n");
//            while (sc1.hasNext()) {
//                String[] ws_data = sc1.next().split(",", 5);
//                wholesalers.add(new Wholesalers(Integer.parseInt(ws_data[0]), ws_data[1]));
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
