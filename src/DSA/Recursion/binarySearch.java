package DSA.Recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 23 , 44, 55, 66, 77};
         int target = 77;
         int start = 0, end = arr.length - 1;
        System.out.println(binarySearchWithRecursion(arr, target, start, end));
    }
    private static int binarySearchWithRecursion(int[] arr, int target, int start, int end){

        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return binarySearchWithRecursion(arr, target, start, mid - 1);
        }
        else{
            return binarySearchWithRecursion(arr, target, mid + 1, end);
        }
    }
}
