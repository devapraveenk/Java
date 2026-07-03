package com.dev.OOPs.properties.polymorphism;

public class ObjectPrint {
    int x;

    ObjectPrint(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Object Value " + x;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(01);
        System.out.println(obj);// -> with out toString fn this will call the basic toString fn
        // -> How ? Because all the classes are the subClasses of the Object Class
        // so we can override the toString method
    }
}
