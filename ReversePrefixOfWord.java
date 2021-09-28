package GitHub;

public class ReversePrefixOfWord {
	class Solution {
	    public String reversePrefix(String word, char ch) {
	       char[] m= new char[0];
	         char[] n= new char[0];
	        int i=0;
	        boolean z=false;
	        for(i=0;i<word.length();i++){
	            if(word.charAt(i)==ch){
	                z=true;
	             m=word.substring(0,i+1).toCharArray();
	                break;
	            }  
	        }
	        if(z==false){
	            return word;
	        }
	        int k=i;
	        int j=0;
	        while(j<k){
	            char temp= m[j];
	            m[j]=m[k];
	            m[k]=temp;
	            j++;
	            k--;
	        }
	    String str = String.valueOf(m)+word.substring(i+1,word.length());
	        return str;
	    }
	}
}
