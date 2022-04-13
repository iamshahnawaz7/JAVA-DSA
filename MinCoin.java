package Recursion;

public class MinCoin {
	class Solution
	{
	   public int MinCoin(int[] nums, int amount)
	   {
	       // Code here
	        int INFI =Integer.MAX_VALUE;
	        if (amount < 1) return 0;
	        int[] dp = new int[amount + 1];
	        Arrays.fill(dp, INFI);
	        dp[0] = 0;
	        for (int j : nums) {
	        for (int i = j; i <= amount; i++) {
	        if (dp[i - j] != INFI) dp[i] = Math.min(dp[i], dp[i - j] + 1);
	   }
	 }
	 return dp[amount] == INFI ? -1 : dp[amount];
	   }
	}
}
