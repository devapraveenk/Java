package DSA.Array.LinearSearch;

public class SearchIn2Darray {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 13, 15, 14}
        };
        int target = 15;
        System.out.println(findElement(arr, target));
    }

    private static class Values{
        private final boolean res;
        private final int value;
        Values(boolean result, int val){
            this.res = result;
            this.value = val;
        }
        public String toString(){
            return "(" + res + "," + value + ")";
        }
    }

    private static Values findElement(int[][] arr, int target){
        for(int[] x: arr){
            for (int col = 0; col < x.length; col++) {
                if(target == x[col]){
                    return new Values(true, col);
                }
            }
        }
        return new Values(false, -1);
    }
}
