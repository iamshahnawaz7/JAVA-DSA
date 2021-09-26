package GitHub;

public class SlidingWindowMaximum {

	class Solution {
	    public int[] maxSlidingWindow(int[] nums, int k) {
	        int arr[]=new int[nums.length-k+1];
	       for(int i=0;i<nums.length-k+1;i++){
	           int large=nums[i];
	           for(int j=i;j<k+i;j++){
	             if(nums[j]>=large){
	                 large=nums[j];
	               }
	            }
	           arr[i]=large;
	       }
	         return arr;
	    }
	}

}
