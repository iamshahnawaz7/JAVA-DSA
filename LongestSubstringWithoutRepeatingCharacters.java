package GitHub;

public class LongestSubstringWithoutRepeatingCharacters {
	class Solution {
	    public int lengthOfLongestSubstring(String s) {
	        int max=0;
	        
	        for(int i=0;i<s.length();i++){
	            boolean arr[]=new boolean[256];
	            int count=0;
	            
	            for(int j=i;j<s.length();j++){
	                int n=(int) s.charAt(j);
	                if(arr[n]==false){
	                    arr[n]=true;
	                    count++;
	                }
	                
	                else{
	                    break;
	                }
	                
	            }
	            max=Math.max(count,max);
	        }
	        return max;
	    }
	}
}
