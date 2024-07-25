
public class LastOccurenceBinarySearch {
    
    public int lastOccurenceBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] == target)
                return mid;
            else if (target >= arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
