package Recursion;

public class ReverseAStringUsingString {
	class Solution {
	    
		   public String reverse(String S){
		        Stack<Character> st = new Stack<>();
		        String res = "";
		        for(int i=0; i<S.length(); i++)
		            st.push(S.charAt(i));
		        while(!st.isEmpty())
		            res += st.pop();
		        return res;
		}

		}
}
