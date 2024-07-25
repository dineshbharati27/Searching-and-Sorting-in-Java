import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public float[] bucketSort(float[] arr){
        int n = arr.length;
        if(n<=0) return arr;
        
        ArrayList<Float>[] bucket = new ArrayList[n];
        
        for(int i = 0; i < n; i++){
            bucket[i] = new ArrayList<Float>();
        }

        for(int i =0; i< n; i++){
            int bucketIndex = (int) (n * arr[i]);
            bucket[bucketIndex].add(arr[i]);
        }

        for(int i = 0; i < n; i++){
            Collections.sort(bucket[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float value : bucket[i]) {
                arr[index++] = value;
            }
        }
        return arr;
    }
}
