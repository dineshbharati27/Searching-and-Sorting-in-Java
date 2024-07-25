
public class ReccursiveBinarySearch {
    
    public int reccursiveBinarySearch(int[] arr, int start, int end, int target){
        if(start>end) return -1;
        int mid = start + (end - start)/2;
        if(target == arr[mid]) return mid;
        else if(target < arr[mid]) return reccursiveBinarySearch(arr, start, mid - 1, target);
        else return reccursiveBinarySearch(arr, mid + 1, end, target);
    }
}
