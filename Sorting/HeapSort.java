public class HeapSort {
    
    public int[] heapSort(int[] arr){
        int length = arr.length;

        //build the heap
        for(int i = (length/2)-1;i>=0;i--){
            heapify(arr,length,i);
        }

        // Extract element one by one from the heap
        for(int i = length-1;i>=0;i--){
            // Swap the root (maximum element) with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Restore heap property for the remaining heap
            heapify(arr,i,0);
        }

        return arr;
    }



    private void heapify(int[] arr,int length ,int rootIndex){
        int largest = rootIndex;
        int left = 2*rootIndex+1;
        int right = 2*rootIndex+2;

        //Compare the root with the left child
        if(left < length && arr[left] > arr[largest]){
            largest = left;
        }

        // Compare the root with the right child
        if(right < length && arr[right] > arr[largest]){
            largest = right;
        }

        // If the largest element is not the root, swap them and heapify the affected subtree
        if(largest != rootIndex){
            int temp = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr,length,largest);
        }
    }
}
