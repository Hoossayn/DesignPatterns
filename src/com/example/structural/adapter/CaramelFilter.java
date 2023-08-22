package com.example.structural.adapter;

import com.example.structural.adapter.avaFilters.Caramel;

//The adapter
//this uses composition(caramel filter is composed of the caramel class)
public class CaramelFilter implements Filter{
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
