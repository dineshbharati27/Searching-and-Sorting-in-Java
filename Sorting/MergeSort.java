class MergeSort{
    public int[] mergeSort(int[] arr){
        if(arr.length == 1) return arr;

        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for(int i = 0; i < mid; i++){
            left[i] = arr[i];
        }
        for(int i = mid; i < arr.length; i++){
            right[i - mid] = arr[i];
        }

        int[] leftSort = mergeSort(left);
        int[] rightSort = mergeSort(right);

        return merge(leftSort,rightSort);
    }

    public static int[] merge(int[] arr1 , int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
                k++;
            }else{
                result[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length){
            result[k] = arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }
        
        return result;
    }
}