package com.example.structural.adapter;

public class ImagePreview {
    private Image image;

    public ImagePreview(Image image) {
        this.image = image;
    }

    public void apply(Filter filter){
        filter.apply(image);
    }
}
