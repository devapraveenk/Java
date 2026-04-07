package com.deva.OOPs;

public class classKK {
    public static void main(String[] args) {
//        Student stu1;
//        System.out.println(stu1.rno);
        Student naruto = new Student();
        naruto.greetingStudent();
        naruto.changeName("Naruto Uzumaki");
        // here I have changed the name without this keyword in the changeName() but the name didnt change yet
//        but when using diff variable name it changing JAVA is SMART
        naruto.greetingStudent();

//      Object 2
        Student itachi = new Student(19, "Itachi", 99.9f);
        itachi.greetingStudent();
        itachi.changeName("Itachi Uchiha");
        itachi.greetingStudent();

//      Object 3
        Student sasukae = new Student(itachi);
        // now this sasukae gets the values of itachi

        sasukae.changeName("Sasukae Uchiha");
        sasukae.greetingStudent();

//        Object 4
        Student sakura = new Student(9, "Sakura");
        sakura.greetingStudent();


    }
}


class Student {
    int rno;
    String name;
    float marks;

    void greetingStudent(){
        System.out.println("Welcome to the Class " + this.name);
    }
    void changeName(String name){
        this.name = name;
    }
//    Different Types of constructor definition

    Student (){
//        this.name = "Naruto";
//        this.rno = 7;
//        this.marks = 0.4f;
        // A Constructor is calling another constructor using 'this' keyword
        this(0, "Default Student", 0);
    }
    // this called Constructor Overloading
    Student (int rno, String name, float marks){
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }
    Student (Student newStudent){
      this.name = newStudent.name;
      this.rno = newStudent.rno;
      this.marks = newStudent.marks;
    }
    Student (int rno, String name){
        this.rno = rno;
        this.name = name;
        this.marks = 50;
    }

}