package DSA.Array.BinarySearch;

public class BinarySearchExample {
    public static void main(String[] args) {
//        int[] arr = {-9, -7, 0, 1, 4, 6 ,7, 8, 8, 10, 11};
        int[] arr = {11, 10, 8, 8, 7, 6, 4, 1, 0, -7,-9};
        int target = 8;
//        System.out.println(simpleBinarySearch(arr, target));
        System.out.println(orderAgnosticBS(arr, target));
    }
    private static int simpleBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        while (start <= end){
//            int mid = (start + end) / 2; // here for the large indexes the int value would be overflow
            // best way to find mid is
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    private static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
//            int mid = (start + end) / 2; // here for the large indexes the int value would be overflow
            // best way to find mid is
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

// Time Complexity = O(logN)
