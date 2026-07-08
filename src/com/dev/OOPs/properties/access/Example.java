package com.dev.OOPs.properties.access;

public class Example {
    int a;
    String name;
    int[] array;
    private int privateValue;

    Example() {

    }

    Example(int a, String name) {
        this.a = a;
        this.name = name;
        this.array = new int[a];
    }

    // -> to access the private members
    public int getPrivateValue() {
        return privateValue;
    }

    public void setPrivateValue(int privateValue) {
        this.privateValue = privateValue;
    }
}
