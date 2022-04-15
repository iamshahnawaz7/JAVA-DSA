package Recursion;

public class MaximumSumRectangle {
	class Solution {
	    int maximumSumRectangle(int m, int n, int arr[][]) {
	        int[][] dp = new int[m][n];

	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (j == 0) {
	                    dp[i][j] = arr[i][j];
	                } else {
	                    dp[i][j] = dp[i][j - 1] + arr[i][j];
	                }
	            }
	        }

	        int output = Integer.MIN_VALUE;

	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                output = Math.max(output, kadane(dp, i, j, m));
	            }
	        }

	        return output == 0 ? -1 : output;
	    }

	    int kadane(int[][] dp, int i, int j, int m) {
	        int[] arr = new int[m];

	        if (i == 0) {
	            for (int k = 0; k < m; k++) {
	                arr[k] = dp[k][j];
	            }
	        } else {
	            for (int k = 0; k < m; k++) {
	                arr[k] = dp[k][j] - dp[k][i - 1];
	            }
	        }

	        int curr = 0, ans = 0;

	        for (int k = 0; k < arr.length; k++) {
	            curr = curr + arr[k];

	            if (curr > ans)
	                ans = curr;
	            if (curr < 0)
	                curr = 0;
	        }
	        return ans;
	    }
	};
}
