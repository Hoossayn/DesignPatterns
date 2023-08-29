package com.example.creational.factory.sharp;

import com.example.creational.factory.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by sharp";
    }
}
