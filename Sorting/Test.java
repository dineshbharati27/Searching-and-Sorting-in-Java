public class Test {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,2,9,1};

        //Bubble sort ->
        BubbleSort bubble = new BubbleSort();
        int[] ans = bubble.bubbleSort(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        //Selection sort ->
        SelectionSort selection = new SelectionSort();
        int[] ans = selection.selectionSort(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        //Insertion sort ->
        InsertionSort insertion = new InsertionSort();
        int[] ans = insertion.insertionSort(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        //Merge sort ->
        MergeSort merge = new MergeSort();
        int[] ans = merge.mergeSort(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");    
        }

        //Quick sort ->
        QuickSort quick = new QuickSort();
        int[] ans = quick.quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }

        //Counting sort ->
        CountingSort counting = new CountingSort();
        int[] ans = counting.countingSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }

        //Radix sort ->
        RadixSort radix = new RadixSort();
        int[] ans = radix.radixSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }

        //Bucket sort ->
        float[] num = {0.34f,0.342f,0.54f,0.23f,0.45f,0.76f};
        BucketSort bucket = new BucketSort();
        float[] ans = bucket.bucketSort(num);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }


        //Heap sort ->
        HeapSort heap = new HeapSort();
        int[] ans = heap.heapSort(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
