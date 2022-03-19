package Recursion;

public class RankThePermutations {
	class Solution
	{
	    static long factorial(int n) {
	    long fact = 1;
	    for (int i = 2; i <= n; i++) {
	        fact = fact * i;
	    }
	    return fact;
	}
	    public long findRank(String S)
	    {
	        int n = S.length(), count ;;
	        long ans = 0;
	        for(int i=0; i<n; i++)
	        {
	            count = 0;
	            for(int j=i+1; j<n; j++)
	            {
	                if((int)S.charAt(i)>(int)S.charAt(j))
	                {
	                    count++;
	                }
	            }
	            ans += factorial(n-i-1)*count;
	        }
	        return ans+1;
	    }
	}
}
