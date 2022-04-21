package Recursion;

public class RecursivelyRemoveAllAdjacentDuplicates {
	class Solution{
	    String remove(String s) {
	       StringBuilder ans=new StringBuilder();
	       int i=0;
	       int n=s.length();
	       boolean flag=false;
	       while(i<n){
	           if(i<n-1 && s.charAt(i)==s.charAt(i+1)){
	               while(i<n-1 && s.charAt(i)==s.charAt(i+1)){
	                   i++;
	                   flag=true;
	               }
	           }
	           else
	           {
	              ans.append(s.charAt(i));
	           }
	           i++;
	       }
	       if(ans.length()!=0 && flag==true){
	           return remove(ans.toString());
	       }
	       return ans.toString();
	   }
	}
}
