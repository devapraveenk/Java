package com.dev.OOPs.properties.inheritance;

public class ShapeWithWeight extends Shape {
    double weight;

    ShapeWithWeight(double weight) {
        this.weight = weight;
    }

    ShapeWithWeight(double h, double w, double l, double weight) {
        // this helps us to initialise values with the parent class constructor,
        // super() helps to do it.
        super(h, w, l);// -> if i remove this then it will call the default constructor of the parent
                       // class
        this.weight = weight;
    }

    ShapeWithWeight(Shape oldShape, double weight) {
        super(oldShape);
        this.weight = weight;
        // super(oldShape); // -> not possible, bcs the parent class constructor already
        // runs so i cant do it again
    }

    ShapeWithWeight(ShapeWithWeight other) {
        super(other); // -> here the shape type accepting the child type object (ShapeWithWeight)
        // -> why ? bcs, the same reason of the upCasting rule check:Main.java
        // in simple the ShapewithWeight have access to the variables in the Shape type
        // so its possible.
        this.weight = other.weight;
    }
}
