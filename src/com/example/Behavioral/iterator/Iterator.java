package com.example.Behavioral.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
