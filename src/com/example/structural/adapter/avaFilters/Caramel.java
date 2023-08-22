package com.example.structural.adapter.avaFilters;

import com.example.structural.adapter.Image;
//The Adaptee
public class Caramel {
    public void init(){}

    public void render(Image image){
        System.out.println("Applying caramel filter");
    }
}
