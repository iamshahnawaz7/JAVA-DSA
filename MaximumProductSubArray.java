package Quesba;

public class MaximumProductSubArray {
	class Solution {
	    // Function to find maximum product subarray
	    long maxProduct(int[] arr, int n) {
	        // code here
	        long min=arr[0];
	        long max=arr[0],res=arr[0];
	        
	        for(int i=1;i<n;i++){
	            if(arr[i]<0){
	                long temp=min;
	                min=max;
	                max=temp;
	            }
	            
	            max=Math.max(arr[i],max*arr[i]);
	            min=Math.min(arr[i],min*arr[i]);
	            
	            res=Math.max(res,max);
	        }
	        
	        return res;
	    }
	}
}
