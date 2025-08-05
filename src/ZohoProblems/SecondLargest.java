package ZohoProblems;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 4};
        System.out.println(findSecondLargest(arr));

    }
    private static int findSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        if(arr.length == 0 || arr.length == 1) return -1;
        for(int x: arr){
            if(x > max)
            {
                secondMax = max;
                max = x;
            } else if (x != max && secondMax < x ) {
                secondMax = x;
            }
        }
        if(secondMax == Integer.MIN_VALUE) return max;
        return secondMax;
    }
}
