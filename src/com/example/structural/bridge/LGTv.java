package com.example.structural.bridge;

public class LGTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("LG: turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("LG: turn off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("LG: set channel");
    }
}
