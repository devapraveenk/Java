package DSA.Recursion;

public class numberExample {
    public static void main(String[] args) { // set your debug point here and run it, there you can see the stack how the recursion runs!!!
        number(1);
    }
    private static void number(int n){
        System.out.println(n);
        number1(n + 1);
    }
    private static void number1(int n){
        System.out.println(n);
        number2(n + 1);
    }
    private static void number2(int n){
        System.out.println(n);
        number3(n + 1);
    }
    private static void number3(int n){
        System.out.println(n);
        number4(n + 1);
    }
    private static void number4(int n){
        System.out.println(n);
    }


}
