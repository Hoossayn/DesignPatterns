package com.example.structural.proxy;

public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load(){
        System.out.println("loading Ebook " + fileName);
    }

    @Override
    public void show(){
        System.out.println("showing the ebook " + fileName);
    }

    @Override
    public String getFileName(){
        return fileName;
    }
}
