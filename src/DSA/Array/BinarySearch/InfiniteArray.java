package DSA.Array.BinarySearch;


//find an element in infinite array basically it says do not use OR You can find the length of the array
// So we have to find the start and end Index by Chucking
// Think in the reverse order in Binary  Search we divide the Array ie N / 2
// Do the same but in reverse Now Multiply by 2 ie N * 2
// You have to check with end element with target whether it's lesser than target element then Increase using by 2
// Ok how we can increment that ?
// Let's see: the index of the array will be keep on increasing in the size of binary search
// ie -> previous_size + (sizeOfArray) * 2 -> so this will be your new end index
// ok how can we find the length of array using index ? that is (end - start + 1)

// Start code
public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6, 7, 8};
        int target = 2;
        System.out.println(solutionInfiniteArray(nums, target));
    }
    // return index of the array
    private static int solutionInfiniteArray(int[] arr, int target){
        int start = 0;
        int end = 1; // initially the size of array is 2 (as in the end of binary search it will be 2)

        while(target > arr[end]){
            int temp = end + 1; // storing the next start (as it would be next value of start)
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return simpleBinarySearch(arr, target, start, end);
    }
    private static int simpleBinarySearch(int[] arr, int target, int start, int end){



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
}
