package DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void basicArray(){
        int[] arr = new int[10];
        //syn: datatype variable_name = new data_type[size];
        int[] col = {10, 12, 13};
        int[] row; //declaration: where the reference variable has been created in the stack (compile time)
        row = new int[10]; // initialization: where the object initialized in the heap memory (runtime)
        //this is called as Dynamic memory allocation
        System.out.println(col[0]);
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for(int x: arr){ // for each loop: x is the element of the array
            System.out.println(x);
        }

    }
    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    private static void reverse(int[] arr, int start, int end){
        while(start < end) {
            swap(arr, start, end);
            start += 1;
            end -= 1;
        }
    }
}
