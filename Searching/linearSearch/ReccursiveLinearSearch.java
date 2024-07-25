
public class ReccursiveLinearSearch {
    
    public int reccursiveLinearSearch(int[] arr, int target, int start){
        if(start >= arr.length) return -1;
        if(arr[start] == target) return start;
        return reccursiveLinearSearch(arr, target, start+1);
    }
}
