package Quesba;

public class ValidSubstring {
	class Solution {
		  public:
		    int findMaxLen(string s) {
		        
		        int n = s.size();
		        vector<int> dp(n, 0);
		        if(s[0] == '(' && s[1] == ')')
		            dp[1] = 2;
		        
		        for(int i = 2; i < n; i++)
		            if(s[i] == ')')
		                if(s[i - dp[i-1] - 1] == '(')
		                    dp[i] = dp[i-1] + 2 + dp[i - dp[i-1] - 2];
		 
		        return *max_element(dp.begin(), dp.end());
		                
		    }
		};

}
