package Recursion;

public class NextElementWithGreaterFrequency {
	class solver
	{
	    static int[] print_next_greater_freq(int arr[], int n)
	    {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int x:arr){
	            map.put(x, map.getOrDefault(x,0)+1);
	        }
	        
	        int[] res = new int[n];
	        Stack<Integer> stack = new Stack<>();
	        
	        for(int i=n-1;i>=0;i--){
	            while(!stack.isEmpty() && map.get(stack.peek()) <= map.get(arr[i]) ){
	                stack.pop();
	            }
	            res[i] = stack.isEmpty() ? -1 : stack.peek();
	            stack.push(arr[i]);
	        }
	        
	        return res;
	    }
	}

}
