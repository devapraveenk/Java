package com.dev.OOPs.properties.inheritance;

public class ShapeWithPrice extends ShapeWithWeight {

    double price;

    public ShapeWithPrice() {
        this.price = -1;
    }// -> this will call the above one ie ShapeWithWeight and it calls the above one
     // ie Shape

    ShapeWithPrice(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public ShapeWithPrice(Double h, Double w, Double l, double weight, double price) {
        super(h, w, l, weight); // -> this will call the Above one and there it will be an another one
        this.price = price;
    }

    ShapeWithPrice(ShapeWithWeight other) {
        super(other);// -> the upCasting one
    }

    ShapeWithPrice(Shape other, Double weight) {
        super(other, weight); // -> this called the above class constructor (like method with parameters)
    }

}
