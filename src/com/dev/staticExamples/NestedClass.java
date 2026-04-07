package com.dev.staticExamples;

public class NestedClass {
    static class A{
        String name;
        A (String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        A obj = new A("Praveen");
        A obj2 = new A("Arun");

        System.out.println(obj.name); // Print Praveen
        System.out.println(obj2.name); // print Arun

//       As it is the static class it does not dependent on the outer class(NestedClass)
//       It independent of the Outerclass instances but inside the A class its not static so it depend on the objects of the class
//       So we can access class without creating instance of the outer class
    }
}
