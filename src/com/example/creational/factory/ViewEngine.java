package com.example.creational.factory;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
