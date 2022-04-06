package Recursion;

public class MaximumSelections {
	class solver
	{
	    static int max_non_overlapping(int ranges[][], int n){

	        Arrays.sort(ranges, (a,b)-> a[1]-b[1] );
	        
	        int count = 1;
	        int val = ranges[0][1];
	        
	        for(int i=0; i<n-1; i++)
	        {
	            if(val <= ranges[i+1][0])
	            {
	                count++;
	                val = ranges[i+1][1];
	            }
	        }
	        return count;
	    }
	    }
}
