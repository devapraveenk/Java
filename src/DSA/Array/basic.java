package DSA.Array;

public class basic {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //syn: datatype variable_name = new data_type[size];
        int[] col = {10, 12, 13};
        int[] row; //declaration: where the reference variable has been created in the stack (compile time)
        row = new int[10]; // initialization: where the object initialized in the heap memory (runtime)
        //this is called as Dynamic memory allocation
        System.out.println(col[0]);
    }
}
