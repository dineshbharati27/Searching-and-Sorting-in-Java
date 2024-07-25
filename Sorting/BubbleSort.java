class BubbleSort{
    //Time complexity = O(n2)
    //Space complexity = O(1)
    public int[] bubbleSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            boolean isSwap = false;
            for(int j = 0 ; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap) break;
        }
        return arr;
    }
}