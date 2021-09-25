package GitHub;

public class MaximumSubArray {

	class Solution {
	    public int maxSubArray(int[] nums) {
	         int MaxSum=nums[0];
	         int CurSum=nums[0];
	            for(int i=1;i<nums.length;i++){
	                CurSum=CurSum+nums[i];
	                if(nums[i]>CurSum){
	                     CurSum=nums[i];
	                 }
	                if(CurSum>MaxSum){
	                    MaxSum=CurSum;
	                }
	            }
	        return MaxSum;
	        }
	    }
}
