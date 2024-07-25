public class CountingSort {
    
    //Time complexity = O(n+k)
    //Space complexity = O(n+k)
    public int[] countingSort(int[] arr) {

        if(arr.length == 0){
            return arr;
        }
        // Find the maximum element in the array
        // Find the minimum element in the array
        int max = findMax(arr);
        int min = findMin(arr);

        int range = max - min + 1;
    
        // Create a count array to store the frequency of each element
        int[] count = new int[range]; // +1 to accommodate the maximum value
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min] += 1;
        }

        // Calculate the cumulative sum of the count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
    
        // Create an output array to store the sorted elements
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
    
        for(int i = 0; i< arr.length; i++){
            arr[i] = output[i];
        }

        return arr;
    }
    
    // Helper method to find the maximum element in the array
    private int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}

