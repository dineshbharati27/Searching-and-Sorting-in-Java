public class RadixSort {
    public int[] radixSort(int[] arr){
        int max = findMax(arr);
        int exp = 1;

        while(exp<max){
            countingSort(arr,exp);
            exp = exp * 10;
        }

        return arr;
    }

    public int[] countingSort(int[] arr, int exp) {

        if(arr.length == 0){
            return arr;
        }
        // Find the maximum element in the array
        // Find the minimum element in the array

        // Create a count array to store the frequency of each element
        int[] count = new int[10]; // +1 to accommodate the maximum value
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i]/exp)%10] += 1;
        }

        // Calculate the cumulative sum of the count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
    
        // Create an output array to store the sorted elements
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i]/exp)%10] - 1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }
    
        for(int i = 0; i< arr.length; i++){
            arr[i] = output[i];
        }

        return arr;
    }

    private int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
