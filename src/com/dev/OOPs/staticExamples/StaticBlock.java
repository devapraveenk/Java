package com.dev.OOPs.staticExamples;

public class StaticBlock {

    static int a = 10;
    static int b;

    // STATIC BLOCK
//   this static block run only once when the class was loaded i.e when the first object created
    static{
        System.out.println("This is Static BLOCK");
        b = a * 5;
    }
    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);// here the print statement on the static block does not print
    }
}
