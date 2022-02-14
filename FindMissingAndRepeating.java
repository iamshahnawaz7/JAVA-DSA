package Quesba;

public class FindMissingAndRepeating {
	class Solve {
	    int[] findTwoElement(int arr[], int n) {
	        int nums[]=new int[n];
	        int res[]=new int[2];
	        for(int i=0;i<n;i++){
	              nums[arr[i]-1]++;
	            }
	        for(int i=0;i<n;i++){
	            if(nums[i]==0){
	                res[1]=i+1;
	            }
	            else if(nums[i]>1){
	                res[0]=i+1;
	            }
	          }
	          return res;
	        }
	    }
}
