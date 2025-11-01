package DSA.Array.BinarySearch;

// Biggest Number Less than or Equal to Target Number
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 7, 8, 8};
        int target = 9;
        System.out.println(floorOfNumber(nums, target));

    }
    private static int floorOfNumber(int[] arr, int target){
        int start = 0, end = arr.length - 1;
//        what if the target number less than the array element
//        Edge Case:
        if(target < arr[start]) return -1;

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
        return arr[end];
    }
}
