package Recursion;

public class SearchInsertPositionOfKInASortedArray {
	class Solution
	{
	    static int searchInsertK(int Arr[], int N, int k)
	    {
	        int j=0,f=0;
	      for(int i=0; i<N; i++){
	           if(Arr[i]==k){
	               j=i;
	               f=1;
	               break;
	           }
	           else if(Arr[i]>k){
	               j=i;
	               f=1;
	               break;
	           }
	       }
	       if(j==0 && f==0)
	           return N;
	       return j;
	    }
	}
}
