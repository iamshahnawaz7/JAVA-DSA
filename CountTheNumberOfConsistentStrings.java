package GitHub;

public class CountTheNumberOfConsistentStrings {
	class Solution {
	    public int countConsistentStrings(String allowed, String[] words)     {
	        int arr[]=new int[26];
	        int count=0;
	        for(int i=0;i<allowed.length();i++){
	            int n=(int) allowed.charAt(i)-'a';
	            arr[n]++;         
	        }
	        for(int i=0;i<words.length;i++){
	            String s= words[i];
	            boolean abc=true;
	            for(int j=0;j<s.length();j++){
	                int a=(int)s.charAt(j)-'a';
	                if(arr[a]==0){
	                    abc=false;
	                    break;
	                }
	            }
	            if(abc){
	                count++;
	            }
	        }
	        return count;
	    }
	}
}
