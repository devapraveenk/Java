package com.dev.OOPs.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Shape square = new Shape(4.9);
        System.out.println(square.h + " " + square.l + " " + square.w);

        ShapeWithWeight cube = new ShapeWithWeight(3);
        System.out.println(cube.h + " " + cube.l + " " + cube.w + " " + cube.weight);

        ShapeWithWeight rBox = new ShapeWithWeight(9.9, 7.9, 0.9, 2);
        System.out.println(rBox.h + " " + rBox.l + " " + rBox.w + " " + rBox.weight);

        ShapeWithWeight newBox = new ShapeWithWeight(square, 0.9);
        System.out.println(newBox.h + " " + newBox.l + " " + newBox.w + " " + newBox.weight);

        Shape upCasting = new ShapeWithWeight(0);// this is upcasting
        // this known as upcasting, the child class object stored in the parent class
        // reference (child inside the parent)

        // System.out.println(upCasting.weight); // not possible eventhough it has been
        // creating
        // with shapeWithWeight Object
        // which can be downcasted (only upcasted variables can be downcasted)
        ShapeWithWeight downCast = (ShapeWithWeight) upCasting;// this is downcasting

        // ShapeWithWeight obj = new Shape(); // this is not possible as its stored
        // (parent can not be inside the child)
        Shape newVal = new Shape();
        // ShapeWithWeight invalid = (ShapeWithWeight) Shape;// not possible

        // -> why the above one is not working ?
        // -> there are many varibales in the child and parent class
        // -> and i am creating a ref variable, so i can access the ref vaiable members
        // (ie)weight
        // -> but i am creating object for parent class and calling parent class
        // constructor
        // -> so where is the weight object belongs to the ref variable of the child
        // class
        // -> i cant create like that constructor with parent class i cant assign value
        // for the weight variable
        // -> so its not possible
    }
}
