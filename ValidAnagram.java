package GitHub;

public class ValidAnagram {
	class Solution {
	    public boolean isAnagram(String s, String t) {
	        int al[]=new int [256];
	        for(char c:s.toCharArray()){
	            int index=(int)c;
	            al[index]++;
	        }
	        
	        for(int i=0;i<t.length();i++){
	            char ch=t.charAt(i);
	            int index=(int)ch;
	            al[index]--;
	        }
	        
	        for(int i=0;i<256;i++){
	            if(al[i]!=0){
	                return false;
	            }
	        }
	        return true;
	    }
	  }
}
