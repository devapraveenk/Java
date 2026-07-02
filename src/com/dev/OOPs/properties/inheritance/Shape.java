package com.dev.OOPs.properties.inheritance;

public class Shape {
    double h;
    double w, l;

    Shape(Double h, Double w, Double l) {
        // super(); // -> here i am accesing the parent class of the shape but there is
        // nothing exist
        // -> still why its not giving me error ?
        // -> jus inspect the super keyword calling object
        // -> yes, its calling Object class, Object class is the super class of the all
        // the classes
        // -> but why shapeWithWeight doesnt not calling the object, No its calling but
        // the super will point only the next Above class only

        this.h = h;
        this.w = w;
        this.l = l;
    }

    Shape(Double side) {
        // for square
        this.h = side;
        this.w = side;
        this.l = side;
    }

    Shape(Shape oldShape) {
        this.h = oldShape.h;
        this.w = oldShape.w;
        this.l = oldShape.l;
    }

    Shape() {
        this.h = 1;
        this.w = 2;
        this.l = 3;
    }
}
