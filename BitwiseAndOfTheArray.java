package Recursion;

public class BitwiseAndOfTheArray {
	class Solution 
	{ 
	    int count(int N, int A[], int X) 
	    {   
	        int ans = N;
	        int mask = 0;
	        
	        for(int i=30;i>=0;i--){
	            int bitVal = ((1 << i) & X);
	            if(bitVal > 0){
	                mask ^= (1<<i);
	            }
	            else{
	                int count = 0;
	                int greaterMask = (mask ^ (1 << i));
	                for(int elem : A){
	                    int val = (greaterMask & elem);
	                    if(val != greaterMask){
	                        count++;
	                    }
	                }
	                ans = Math.min(ans, count);
	            }
	        }
	        return ans;
	    }
	} 
}
