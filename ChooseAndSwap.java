package Recursion;

public class ChooseAndSwap {
	class Solution{
	    String chooseandswap(String A){
	        // Code Here
	        if(A.length()==0)
	        return null;
	        int[] st = new int[26];
	        for(int i=0;i<A.length();i++)
	        {
	            st[A.charAt(i)-'a']++;
	        }
	        int i=0,j=0;
	        while(i<26 && st[i]==0)
	        i++;
	        char c1='\0',c2='\0';
	        //finding c1 and c2 to be replaced
	        while(i<26 && j<A.length())
	        {
	            if(st[i]!=0 && A.charAt(j)-'a'==i)
	            {
	                j++;
	                i++;
	                while(i<26 && st[i]==0)
	                i++;
	            }
	            else if(st[i]!=0 && A.charAt(j)-'a'<i)
	            {
	                j++;
	                continue;
	            }
	            else
	            {
	                c1=(char)(i+'a');
	                c2=A.charAt(j);
	                break;
	            }
	        }
	        //swapping c1 and c2
	        StringBuilder str = new StringBuilder(A);
	        if(c1!=c2)
	        {
	            for(int k=0;k<A.length();k++)
	            {
	                if(str.charAt(k)==c1)
	                str.setCharAt(k,c2);
	                else if(str.charAt(k)==c2)
	                str.setCharAt(k,c1);
	                else
	                continue;
	            }
	        }
	        return str.toString();
	    }
	}
}
