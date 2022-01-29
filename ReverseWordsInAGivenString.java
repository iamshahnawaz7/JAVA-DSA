package Quesba;

public class ReverseWordsInAGivenString {
	class Solution 
	{
	    String reverseWords(String S)
	    {
	        int n=S.length();
	        int a=n;
	        char ch=' ';
	        String str="";
	        for(int i=n-1;i>=0;i--){
	            ch=S.charAt(i);
	            if(ch=='.'){
	                str+=S.substring(i+1,a)+".";
	                a=i;
	            }
	        }
	        if(ch!='.')
	        {
	        str+=S.substring(0,a);
	        }
	        return str;
	    }
	}
}
