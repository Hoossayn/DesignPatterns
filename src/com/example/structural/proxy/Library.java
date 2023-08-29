package com.example.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Ebook> ebookMap = new HashMap<>();

    public void add(Ebook ebook){
        ebookMap.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName){
        ebookMap.get(fileName).show();
    }

}
