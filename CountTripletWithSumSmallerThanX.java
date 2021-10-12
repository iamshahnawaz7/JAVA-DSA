package GitHub;

public class CountTripletWithSumSmallerThanX {
	class Solution
	{
	    long countTriplets(long arr[], int n,int sum)
	    {
	long count = 0;
	        Arrays.sort(arr);
	        int start = 0,end=arr.length-1,p = 1;
	        while(start<arr.length-2){
	            p = start+1;
	            end = arr.length-1;
	            while(p<end){
	                if(arr[start]+arr[end]+arr[p] < sum){
	                    count += (end-p);
	                    p = p + 1;
	                }
	                else end--;
	            }
	            start++;
	        }
	        return count;
	    }
	}s
}
