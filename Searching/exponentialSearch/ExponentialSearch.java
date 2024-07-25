
public class ExponentialSearch {
    
    public int exponentialSearch(int[] arr,int target){
        if(arr[0] == target) return 0;

        int i = 1;
        while(i<arr.length-1 && arr[i] <= target){
            i *= 2;
        }

        int start = i/2;
        int end = Math.min(i,arr.length-1);
        while(start<=end){
            int mid = (end + start)/2;
            if(arr[mid] == target) return mid;
            else if (target<arr[mid]) end = mid - 1;
            else start = mid+1;
        }
        return -1;
    }
}
