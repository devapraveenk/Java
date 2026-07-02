package com.dev.OOPs.singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton obj = new Singleton(); // this is not possible bcs the constructor
        // in the private
        // this is known as the singleton class

        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // all the variables share the only one object.

    }

}
