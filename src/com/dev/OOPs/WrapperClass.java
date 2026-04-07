package com.deva.OOPs;

public class WrapperClass {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
//      Here We are passing the reference variable that means The Objects has being passed but the swap doesnot happened
//      the values does not change bcs the Integer class is FINAL class, so the modification will not be allowed so the swapping not happened

        final New variable = new New("ABU");
        variable.name = "Vetri"; // Its possible in the non primitive data type but you can reassign it

//        like the following
//        variable = new New("Aashiq"); // not allowed

    }
      static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

}
class New{
    final int a = 10;
    String name;

    public New(String name) {
        this.name = name;
    }
}
