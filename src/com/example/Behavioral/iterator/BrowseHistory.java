package com.example.Behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count;

    public void push(String url){
        urls[count++] = url;
        //urls.add(url);
    }

    public String[] getUrls() {
        return urls;
    }

    public String pop(){
        count--;
        return urls[count];

        /*var lastIndex = urls.size() - 1;
        var lastUrl  = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;*/
    }

    public Iterator<String> createIterator(){
        return new ArrayIterator(this);
    }


    public static class ArrayIterator implements Iterator {
        private final BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public Object current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
/*
    public static class ListIterator implements Iterator<String>{
        private final BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
*/


}
