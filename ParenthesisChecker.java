
public class ParenthesisChecker {
	class Solution
	{
	    static boolean ispar(String x)
	    {
	        Deque<Character> stack = new ArrayDeque<Character>();
	        
	        for (int i=0; i<x.length(); i++) {
	            char ch = x.charAt(i);
	            if (ch == '(' || ch == '[' || ch == '{')
	                stack.addLast(ch);
	            else if (ch == ')' && !stack.isEmpty() && stack.peekLast() == '(')
	                stack.removeLast();
	            else if (ch == ']' && !stack.isEmpty() && stack.peekLast() == '[')
	                stack.removeLast();
	            else if (ch == '}' && !stack.isEmpty() && stack.peekLast() == '{')
	                stack.removeLast();
	            else
	                return false;
	        }
	        if(stack.isEmpty())
	            return true;
	        else return false;
	    }
	}

}
