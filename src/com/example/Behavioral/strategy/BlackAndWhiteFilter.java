package com.example.Behavioral.strategy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("applying B&W filter");
    }
}
