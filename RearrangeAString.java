package Quesba;

public class RearrangeAString {
	class Solution
	{
	    public String arrangeString(String s)
	        {
	         int n=s.length();
	         String str="";
	         char arr[]= new char[n];
	         int count=0,sum=0,j=0,i=0;
	         
	         for(i=0;i<n;i++){
	            char ch=s.charAt(i);
	             if(ch>='A' && ch<='Z'){
	                 arr[j]=ch;
	                 j++;
	             }
	             else{
	                 count=(int)ch;
	                 count=count-48;
	                 sum+=count;
	             }
	          }
	          Arrays.sort(arr);
	          return new String(arr).trim()+sum;
	        }
	}
}
