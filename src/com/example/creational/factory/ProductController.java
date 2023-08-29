package com.example.creational.factory;

import com.example.creational.factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductController extends SharpController {
    public void listProduct(){
        //Get products from a database
        Map<String, Object> context = new HashMap<>();
        render("product.html", context);
    }
}
