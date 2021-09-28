package GitHub;

public class SplitAStringInBalancedString {
	class Solution {
	    public int balancedStringSplit(String s) {
	     int cnt=0,temp=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='R')
	                temp++;
	            else if(s.charAt(i)=='L')
	                temp--;
	            if(temp==0)
	                cnt++;
	        }
	        return cnt;
	    }
	}
}
