package com.example.creational.abstractFactory.ant;

import com.example.creational.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant Text box");
    }
}
