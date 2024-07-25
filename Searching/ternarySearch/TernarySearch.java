
public class TernarySearch {
    
    public int ternarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid1 = start + (end -start)/3;
            int mid2 = end - (end -start)/3;
            if(target == arr[mid1]) return mid1;
            else if(target == arr[mid2]) return mid2;
            else if(target < arr[mid1]) end = mid1 -1;
            else if(target > arr[mid2]) start = mid2 + 1;
                else{
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        return -1;
    }
}
