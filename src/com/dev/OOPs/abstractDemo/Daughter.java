package com.dev.OOPs.abstractDemo;

public class Daughter extends Parent {

    public Daughter(int age) {
        this.age = age;
    }// -> we can create constructor like this.

    @Override
    void career(String name) {
        System.out.println("Hellooooo" + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("Jus testing da");
    }

}
