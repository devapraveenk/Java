package com.dev.OOPs.singleton;

// this is basically only one object can be created 
public class Singleton {
    public static void main(String[] args) {

    }

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // this singleton class purpose is to be create only one object
        // so for that
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}