
public class BinarySearch {
    
    // Time complexity = O(logn)
    // Space complexity = O(1)
    public int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]) return mid;
            else if (target < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
