package com.example.creational.factory.sharp;

import com.example.creational.factory.Controller;
import com.example.creational.factory.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
