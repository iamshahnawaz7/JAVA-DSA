package Quesba;

public class MergeTwoBinaryMaxHeaps {
	class Solution{
	    private void swap(int []a ,int i, int j){
	        int temp  = a[i];
	        a[i] =a[j];
	        a[j] = temp;
	    }
	    
	    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
	        
	        if( m > n ) return mergeHeaps(b , a , m , n);
	        
	        int []heap = new int[n + m];
	        int idx = 0;
	        
	        fill(heap , a , n);
	        idx = n;
	        
	        for(int i=0; i < m ; i++ ){
	            heap[idx] = b[i];
	            Heapify(heap , idx);
	            idx++;
	        }
	        
	        
	        return heap;
	        
	        
	    }
	    
	    private void Heapify(int []heap ,int idx ){
	    
	        while(idx >= 0 && heap[(idx-1)/2] < heap[idx ]){
	            swap(heap , (idx-1)/2 , idx);
	            idx = (idx-1)/2;
	        }
	    }
	    private void fill(int []heap ,int[]a ,int n){
	        for(int i=0; i< n; i++){
	            heap[i] = a[i];
	        }
	    }
	}
}
