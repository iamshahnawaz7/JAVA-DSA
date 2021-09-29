package GitHub;

public class ReplaceAllDigitsWithCharacters {
	class Solution {
	    public String replaceDigits(String s) {
	       int l=s.length();
	        String new="";
	        for (int i=1;i<l;i=i+2) {
	        	int n=Integer.parseInt(s.charAt(i)+"");
	        	char a=((char)(s.charAt(i-1)+n));
	        	s=s.substring(0,i)+a+s.substring(i+1);
	        }
	        return s;
	    }
	}
}
