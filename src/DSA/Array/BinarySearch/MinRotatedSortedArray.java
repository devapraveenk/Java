package DSA.Array.BinarySearch;

public class MinRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println((findMin(arr)));
    }
        public static int findMin(int[] nums) {
            return findPivot(nums);
        }
        private static int findPivot(int[] arr){
            int start = 0, end = arr.length - 1;

            while(start <= end){
                int mid = start + (end - start) / 2;
                // CASES
                if(mid > start && arr[mid] < arr[mid - 1]){
                    return mid;
                }
                else if(mid < end && arr[mid + 1] < arr[mid]){
                    return mid + 1;
                }
                else if(arr[mid] < arr[start]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            return -1;
        }

}
