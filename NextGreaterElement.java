package GitHub;

public class NextGreaterElement {
	class Solution {
	    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        int n=nums1.length;
	        int m=nums2.length;
	        boolean z=false;
	        int k=0;
	        int arr[]=new int[nums1.length];
	        for(int i=0;i<n;i++){
	            z=false;
	            for(int j=0;j<m;j++){
	                if(nums1[i]==nums2[j]){
	                    for(k=j+1;k<m;k++){
	                        if(nums2[k]>nums1[i]){
	                            arr[i]=nums2[k];
	                            z=true;
	                            break;
	                        }  
	                    }
	                    if(z==false){
	                            arr[i]=-1;
	                        }
	                }
	            }   
	    }
	        return arr;
	}
	}
}
