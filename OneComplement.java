package Quesba;

public class OneComplement {
	class Solution{
	    static String onesComplement(String S,int N){
	        StringBuilder str=new StringBuilder(S);
	        int a=str.length();
	        for(int i=0;i<a;i++){
	            char ch=S.charAt(i);
	            if(ch=='1'){
	                str.deleteCharAt(i);
	                str.insert(i,0);
	            }
	            else {
	                str.deleteCharAt(i);
	                str.insert(i,1); 
	            }
	        }
	         return str.toString();
	    }
	}
}
