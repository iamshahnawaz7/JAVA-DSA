package Quesba;

public class CanMakeTriangle {
	class Solution 
	{ 
	    int[] canMakeTriangle(int nums[], int N) 
	    { 
	        int arr[]=new int[N-2];
	        for(int i=0;i<N-2;i++){
	            if(nums[i]+nums[i+1]>nums[i+2] && nums[i]+nums[i+2]>nums[i+1] && nums[i+1]+nums[i+2]>nums[i]){
	                arr[i]=1;
	            }
	            else{
	                arr[i]=0;
	            }
	        }
	        return arr;
	    }
	}
}
