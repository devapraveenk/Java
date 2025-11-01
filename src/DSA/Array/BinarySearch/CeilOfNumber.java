package DSA.Array.BinarySearch;

//Smallest number Greater than or Equal to target number
// to find the ceil of a number in the given array (if not found then it should return the next first greater that number)
public class CeilOfNumber {
    public static void main(String[] args) {
        int[] nums = {3, 5, 6, 6, 7, 8, 8};
        int target = 5;
        System.out.println(ceilOfNumber(nums, target));

    }
    private static int ceilOfNumber(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        // What if the target number greater than the array element so it means it should return not found
        //Edge Case:
        if(target > arr[end]) return -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return arr[mid];
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return arr[start];
    }
}
