package com.example.structural.adapter;

import com.example.structural.adapter.avaFilters.Caramel;

//this is using inheritance (not really ideal)
public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        apply(image);
    }
}
