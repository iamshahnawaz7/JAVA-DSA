package GitHub;

import java.util.HashMap;

public class LargestSubArrayWithSumZero {

	class SubArray
	{
	    int maxLen(int arr[], int n)
	    {
	        int prevSum=arr[0];
	        HashMap<Integer,Integer> hm = new HashMap<>();
	        hm.put(arr[0],0);
	        int max = 0;
	        for(int i=1;i<arr.length;i++){
	            int currSum = prevSum + arr[i];
	            prevSum = currSum;
	            if(currSum==0){
	                int curr = i+1;
	                max = Math.max(curr,max);
	            }
	            else if(hm.get(currSum)!=null) {
	                int curr = (i - hm.get(currSum));
	                max = Math.max(curr,max);
	            }
	            else {
	                hm.put(currSum,i);
	            }
	        }
	        return max;
	    }
	}}
