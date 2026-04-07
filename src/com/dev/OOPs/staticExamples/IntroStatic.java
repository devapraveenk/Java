package com.dev.OOPs.staticExamples;

public class IntroStatic {
    public static void main(String[] args) {
        School s1 = new School(13, "abu", 90);
        School s2 = new School(14, "aashiq", 89);

//        System.out.println(s2.studentCount);
//        System.out.println(s1.studentCount);
//        Two objects created so its independent of every objects
//        without static it shows 1 as the answer as it depends on the object scope
        System.out.println(School.studentCount);
        System.out.println(School.studentCount);
        // Static member should be accesed by the class name

//        Nested  Class
        IntroStatic obj = new IntroStatic();
        OuterClass var = obj.new OuterClass();
    }
    static void test(){
//        number();
    }
//    !!!!!! Can not access here as its the static function
//    bcs the static function does not belong to any objects so you cant access the non-static functions
//     To access the non static funtions WE need INSTANCE

    void newFun(){
        number();
    }
    void number(){

    }
    // the above one is possible as its the non static function can called by another non static function
//    bcs the scope belongs to the objects

    class OuterClass{
         class InnerClass{
            static String name;//
             // here u cant use static as its the non static class u cant use static class variables
//             Bcs outer class depends on some object then how can the inner class variable be dependent ? this is the reason
            public InnerClass(String name){
                InnerClass.name = name;
            }
        }
    }



//    # Nested Class:->

}
class School{
    int age;
    String name;
    float marks;
//    int count; // this is acting as the count for every object
    // when comes to static the variable fully independent to the all the objects
//   lets try
    static int studentCount;

    public School(int age, String name, float marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
        School.studentCount += 1;
//        this.studentCount += 1 // this is not allowed bcs basically this keyword replace the instance of the class
    }
    static void test(){
//        as it is the non static variable so you cant access it
//        this.name; // this is also not possible as the staitc method independent of all the instances
//        System.out.println(this.name);// we cant access it as static method.
//        this keyword basically replaysing the object but when coming to static the this key word doesnot refer anything so we cant use it
//        name = "Raja";
    }


}

// Main IMPORTANT POINT:
// Objects are resolved during Runtime so non static methods & class are the objectlevel methods
// Contradictory the Static level methods & classes resolved during Compile time so those are Class level methods

