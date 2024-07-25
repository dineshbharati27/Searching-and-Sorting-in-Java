
public class LastOccurenceLinearSearch {
    
    public int lastOccurenceLinearSearch(int[] arr, int target){

        //Time complexity = O(n)
        //Space complexity = O(1)
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
