
public class LinearSearch {
    
    //Time complexity = O(n)
    //Space complexity = O(1)
    public int linearSearch(int[] arr,int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
