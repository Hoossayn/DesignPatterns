package com.example.creational.abstractFactory.material;

import com.example.creational.abstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("material button");
    }
}
