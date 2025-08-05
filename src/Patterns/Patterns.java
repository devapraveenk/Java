package Patterns;

public class Patterns {
    public static void main(String[] args) {
            int n = 5;
            PatternE(n);
    }
    private static void PatternA(int n){
        int val = 1;
        for(int row = 0; row < n; row++){
            val = row % 2 == 1 ? 1 : 0;
            for(int col = 0; col < row + 1; col++){
                System.out.print(val + " ");
                val = val == 0 ? 1: 0;
            }
            System.out.println();

        }
    }
    private static void PatternB(int n){
        for(int row = 0; row<n; row++){
            for(int col = 0; col < n - row; col++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    private static void PatternC(int n){
        for(int row = 0; row < (n * 2) - 1; row++){
//            if(row < n) {
//                for (int col = 0; col < row + 1; col++) {
//                    System.out.print("* ");
//                }
//            }
//            else {
//                for (int col = 0; col < (n * 2) - row - 1; col++) {
//                    System.out.print("* ");
//                }
//            }
            int iter = row >= n ? (n * 2) - row - 1: row + 1;
            for(int col = 0; col < iter; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void PatternD(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n - row - 1; col++){
                System.out.print(" ");
            }
            for(int col = 0; col < row + 1; col++){
                System.out.print("* ");
            }
            for(int col = 0; col < n - row - 1; col++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void PatternE(int n){
        for(int row = 0; row < (n * 2) - 1; row++){
            int iterStar = row >= n ? (2 * n) - row - 1: row + 1;
            int iterSpace = row >= n ? (row - n) + 1: n - row - 1;
            for(int col = 0; col < iterSpace; col++){
                System.out.print(" ");
            }
            for(int col = 0; col < iterStar; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
