package ZohoProblems;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        PatternNum(n);
    }
    private static void PatternNum(int n){
        /*
        1
        2 6
        3 7 10
        4 8 11 13
        5 9 12 14 15
        */

        for(int row = 0; row < n; row++){
            int value = row;
            for(int col = 0; col < row + 1; col++) {
                System.out.print(value + 1 + " ");
                value += n - col - 1;
            }
            System.out.println();
        }
    }
}
