package com.example.creational.abstractFactory.ant;

import com.example.creational.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant button");
    }
}
