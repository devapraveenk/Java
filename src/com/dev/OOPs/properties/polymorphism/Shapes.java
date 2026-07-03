package com.dev.OOPs.properties.polymorphism;

public class Shapes {

    void whoAmI() {
        System.out.println("I am Shapes");
    }

    // Early Binding
    // final void whoAmI() {
    // System.out.println("I am Shapes");
    // }
    static void greeting() {
        System.out.println("I am static boi from parent classs, you cant access be by inheriting");
    }
}
