package com.example.creational.abstractFactory.material;

import com.example.creational.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material Text box");
    }
}
