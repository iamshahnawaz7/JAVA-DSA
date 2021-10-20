package GitHub;

public class ReverseWordInAString {
	class Solution {
	    public String reverseWords(String s) {
	        String[] words = s.split(" ");
	        String ans = "";
	        
	        for (int i = words.length-1; i >= 0; i--) {
	            if (words[i].trim().length() == 0) {
	                continue;
	            }
	            else {
	                ans += words[i] + " ";
	            }
	        }
	        ans = ans.trim();
	        return ans;
	    }
	}
}
