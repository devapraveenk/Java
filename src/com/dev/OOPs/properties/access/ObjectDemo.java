package com.dev.OOPs.properties.access;

public class ObjectDemo {
    int age;
    int marks;

    public ObjectDemo(int age, int marks) {
        this.age = age;
        this.marks = marks;
    }

    // -> this perfroms shallow copy (two ref variables sharing same object)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    // -> Which checks the value of bw two variables
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        // return super.equals(obj);

        // here i am overridding
        return this.age == ((ObjectDemo) obj).age; // -> here i should do typecast and i cant change the
                                                   // equals(parameter) bcs as its overriiden method it should match the
                                                   // original method parameter or signature so i am doing typecasting
                                                   // here
        // best pratice
        // if (this == obj) return true;

        // if (!(obj instanceof ObjectDemo)) return false;
        // -> this checks the object belongs to the class or not

        // ObjectDemo other = (ObjectDemo) obj;

        // return this.age == other.age;
    }

    // -> this is a method that the Garbage Collector (GC) may call before an object
    // is removed from memory.
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    // -> Give a numerical value based on inbuilt hashcode fn
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    // -> the basic to String representation we can modifity it
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public static void main(String[] args) {

        ObjectDemo obj1 = new ObjectDemo(10, 20);
        ObjectDemo obj2 = new ObjectDemo(10, 30);

        System.out.println(obj1 == obj2); // -> does not shares same memory address so it return false

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.getClass()); // -> used to get data about the classes obj.getClass().[fns]
        // -> stored in Heap area
    }

}
