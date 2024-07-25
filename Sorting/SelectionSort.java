public class SelectionSort {
    
    //Time Complexity = O(n2)
    //Space Complexity = O(1)
    public int[] selectionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
