package DSA.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        multiDimentionalArrayList();
    }
    private static void basticArrayList(){
        ArrayList<Integer> arrlist = new ArrayList<>();
//        ArrayList arr = new ArrayList(); // also possible but not good practice
        Scanner in = new Scanner(System.in);

        for (int ele = 0; ele < 5; ele++) {
            arrlist.add(in.nextInt());
        }
        for(Integer a: arrlist){
            System.out.println(a);
        }
//        Operations
        System.out.println("GET --> " + arrlist.get(1));
        System.out.println("REMOVE --> " + arrlist.remove(3));
        System.out.println("CONTAINS --> " + arrlist.contains(4));
        System.out.println("SET --> " + arrlist.set(0, 1));
    }
    private static void multiDimentionalArrayList(){
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrlist = new ArrayList<>();
        ArrayList<Integer> elements = new ArrayList<>();
//        elements.add(0);
//        arrlist.add(0, elements);//1 -->> index, elements ArrayList Type reference Object
//        elements.add(1);
//        arrlist.add(1, elements);

        for (int i = 0; i < 3; i++) {
            arrlist.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrlist.get(i).add(in.nextInt());
            }
        }
        System.out.println(arrlist);
    }
}
