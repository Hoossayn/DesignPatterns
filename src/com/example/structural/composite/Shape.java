package com.example.structural.composite;

public class Shape implements Component{
    @Override
    public void render(){
        System.out.println("Render shape");
    }

    @Override
    public void delete() {
        System.out.println("Delete");
    }

    @Override
    public void move() {
        System.out.println("Move");
    }
}
