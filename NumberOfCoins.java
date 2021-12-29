package Quesba;

public class NumberOfCoins {
	class Solution{

		public:
		int minCoins(int coins[], int M, int V) 
		{ 
		    // Your code goes here
		    int i,j,dp[V+1]={0};
		    for(i=1;i<=V;i++)
		    {
		        dp[i]=INT_MAX-1;
		        for(j=0;j<M;j++)
		        {
		            if(i-coins[j]>=0)
		            dp[i]=min(dp[i],dp[i-coins[j]]+1);
		        }
		    }
		    if(dp[V]==INT_MAX-1)
		    return -1;
		    return dp[V];
		} 

		};
}
