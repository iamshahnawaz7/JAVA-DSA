package Quesba;

public class RemoveLeadingZeroesFromAnIpAddress {
	class Solution
	{
	    public String newIPAdd(String S)
	    {
	        int n=S.length();
	        String str="";
	        boolean f=false;
	        int i=0;
	        while(i<n){
	            char ch=S.charAt(i);
	            if(ch>='1' && ch<='9')
	           {
	               f=true;
	               str+=ch;
	           }
	           else if(ch=='.' && f==false)
	           {
	               str+="0.";
	           }
	           else if(ch=='.')
	           {
	               str+=ch;
	               f=false;
	           }
	           else if(ch=='0' && f==true)
	           {
	               str+=ch;
	           }   
	           i++;
	        }
	       if(str.charAt(str.length()-1)=='.'){
	           str+='0';
	       }
	        return str;
	    }
	}
}
