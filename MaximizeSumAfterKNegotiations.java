package Quesba;

public class MaximizeSumAfterKNegotiations {
	class Solution {

	    public static long maximizeSum(long a[], int n, int k)
	    {
	         Arrays.sort(a);
	         long sum=0l;
	           for(int i=0;i<n;i++){
	             if(k>0 && a[i]<0){
	                 a[i]=-a[i];
	                 k--;
	             } 
	             sum+=a[i];
	           }
	          Arrays.sort(a);
	          if(k%2!=0) {
	            sum =sum - 2*a[0];
	        }
	        return sum; 
	    }
	}
}
