
public class RecursiveTernarySearch {
    
    public int recursiveTernarySearch(int[] arr, int start ,int end , int target){
        if(start>end) return -1;
        int mid1 = start + (end -start)/3;
        int mid2 = end - (end -start)/3;
        if(target == arr[mid1]) return mid1;
        else if(target == arr[mid2]) return mid2;
        else if(target < arr[mid1]) return recursiveTernarySearch(arr,start,mid1-1,target);
        else if(target > arr[mid2]) return recursiveTernarySearch(arr,mid2+1,end,target);
        else return recursiveTernarySearch(arr,mid1+1,mid2-1,target);
    }
}
