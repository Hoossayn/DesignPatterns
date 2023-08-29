package com.example.structural.flyweight;

public class Point {
    private int x;
    private int y;
    private PointIcon icon;


    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.icon = pointIcon;
    }

    public void draw(){
        System.out.printf("%s at (%d, %d)", icon.getType(), x, y);
    }
}
