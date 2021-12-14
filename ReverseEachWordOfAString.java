package Quesba;

public class ReverseEachWordOfAString {
	class Solution
	{
	    String reverseWords(String S)
	    {
	        int s=0;
	        S=S+".";
	        int n=S.length()+1;
	        StringBuilder str= new StringBuilder();
	        for(int i=0;i<n-1;i++){
	            char ch=S.charAt(i);
	            if(ch=='.'){
	                str.append(rev(S.substring(s,i+1)));
	                s=i+1;
	            }
	        }
	        str.deleteCharAt(0);
	        return str.toString();
	    }
	    
	    public String rev(String s){
	        int n=s.length();
	        StringBuilder str= new StringBuilder(s);
	        int i=0;
	        int j=n-1;
	        while(i<j){
	            char ch=str.charAt(i);
	            char c=str.charAt(j);
	            str.setCharAt(j,ch);
	            str.setCharAt(i,c);
	            i++;
	            j--;
	        }
	        return str.toString();
	    }
	}
}
