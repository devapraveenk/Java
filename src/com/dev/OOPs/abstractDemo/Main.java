package com.dev.OOPs.abstractDemo;

public class Main {

    public static void main(String[] args) {
        Daughter du = new Daughter(30);

        du.career("Daa");

        Parent du1 = new Daughter(20);// -> this is possible(Upcasting)

        // -> Can we create Object for the parent class ?
        // Parent objP = new Parent(); // -> creating like this is not possible.

        // -> we have to create like this(we have to override the methods)

        Parent onjP = new Parent("Java") {

            @Override
            void career(String name) {
                System.out.println("PARENT OBJ");
            }

            @Override
            void partner(String name, int age) {
                System.out.println("Jus ");
            }

        };
        // NOTES:
        // -> we cant create abstract constructors and abstract static methods and final
        // abstract methods or class, BCS it does not belongs to objects and those
        // cant be OVERRIDDEN and abstract always needs to be overridden.

        // -> we can create normel methods and static methods and final ones tooo, and
        // variables as well
        // -> here too the multiple inheritence is not available.
    }
}
