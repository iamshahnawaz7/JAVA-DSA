package GitHub;

public class RemoveAllAdjacentDuplicatesInAString {
	class Solution {
	    public String removeDuplicates(String s) {
	       return abc(s);
	    }
	    public static String abc(String s){
	        int n=s.length();
	        String str="";
	        for(int i=0;i<n-1;i++){
	            if(s.charAt(i)==s.charAt(i+1)){
	                str+=s.substring(0,i);
	                str+=s.substring(i+2);
	                return abc(str);
	            }
	        }
	        return s;
	    }
	}
}
