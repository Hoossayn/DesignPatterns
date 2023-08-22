package com.example.Behavioral.chainOfResponsibility;

public class Encryptor extends Handler{
    public Encryptor(Handler next) {
        super(next);
    }
    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Encrypt request");
        return false;
    }
}
