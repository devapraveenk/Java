package com.dev.OOPs.abstractDemo;

public abstract class Parent {
    // -> if one or more methods decleared as abstract then the class should also
    // decleared as abstract.
    int age;
    String name;

    public Parent(String name) {
        this.name = name;
    }// -> we can create constructor for the parent class too

    public Parent() {

    }

    abstract void career(String name);// -> abstract class does not have any body.

    abstract void partner(String name, int age);
}
