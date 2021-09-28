package GitHub;

public class TruncateSentence {
	class Solution {
	    public String truncateSentence(String s, int k) {
	        int countWords = 0;
	        
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == ' ') {
	                countWords++;
	            }
	            
	            if (countWords == k) {
	                return s.substring(0, i);
	            }
	        }
}
