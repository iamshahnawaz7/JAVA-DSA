
public class Anagram {
	class Solution
	{    
	    //Function is to check whether two strings are anagram of each other or not.
	    public static boolean isAnagram(String a,String b)
	    {
	    boolean isAnagram=true;
	    int al[]=new int[256];
	    int bl[]=new int[256];
	    for(char c:a.toCharArray()){
	        int index=(int)c;
	        al[index]++;
	    }
	    
	    for(char c: b.toCharArray()){
	        int index=(int)c;
	        bl[index]++;
	    }
	    
	    for(int i=0;i<256;i++){
	        if(al[i]!=bl[i]){
	        isAnagram=false;
	        break;
	        }
	     }
	     if(isAnagram){
	         return true;
	     }
	     return false;
	    }
	    }
}
