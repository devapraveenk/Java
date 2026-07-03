package com.dev.OOPs.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Shapes upCasting = new Circle();
        upCasting.whoAmI(); // op: I am Circle
        // -> why its working like this ?
        // -> Yes, that is correct ref variables can access there own class only, it
        // cant access their child classes, still it working its bcs,
        // -> During complile time it will only look the ref type fn but in runtime, it
        // look into the Object type So it finds the method has overridden then it will
        // execute the Object Type fn

        // -> during runtime the obj type is overridding the ref type method ie,
        // (Shapes.whoAmI -> Circle.whoAmI)

        // FINALLY here the type has changed during the RUN TIME,
        // so it's known as RUNTIME POLYMORPHISM or Dynamic method dispatch and also
        // known as late binding.

        // -> then if we used final method that can not be overridden and it directly
        // resolved and not waiting to resolved. this is called as early binding.

        // -> Does Static methods could be overriden?
        // NO, not possible, even though you did it(it wont accept it), but it always
        // run the parent class method.
        // ex
        Circle.greeting();// op -> from the shapes class
        // -> WHYYY???... we all know that static variables cant share to objects(one
        // and only piece). in simple "overridden depends on objects but static does not
        // depend on objects so static method can be overridden"

        // ABOUT INHERITANCE:
        // -> static methods can be inherited but can not be overridden.
        // -> its also applicable for inheritance. (public final class Shape)
        // NOTES:
        // -> When declearing a class as final then the methods also be in the final
    }
}
