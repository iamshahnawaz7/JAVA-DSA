
public class MaximumOfMinimumForEveryWindowSize {
	class Solution 
	{
	   //Function to find maximum of minimums of every window size.
	  static int[] maxOfMin(int[] arr, int n) 
	   {
	       int[] pse = new int[n];
	  int[] nse = new int[n];
	  Stack<Integer> incStack = new Stack<Integer>();
	  int i=0;
	  while(i<n) {
	   if(incStack.isEmpty() || arr[i]>=arr[incStack.peek()]) {
	    incStack.push(i);
	    i++;
	   }else {
	    int idx = incStack.pop();
	    pse[idx] = incStack.isEmpty()?-1:incStack.peek();
	    nse[idx] = i;
	   }
	  }
	  
	  while(!incStack.isEmpty()) {
	   int idx = incStack.pop();
	   pse[idx] = incStack.isEmpty()?-1:incStack.peek();
	   nse[idx] = n;
	  }
	  
	  int[] window = new int[n];
	  for(int j=0;j<n;j++) {
	   window[nse[j]-pse[j]-2] = Math.max(arr[j], window[nse[j]-pse[j]-2]);//-2 because to work with 0 base index
	  }
	  for(int j=n-2;j>=0;j--) {
	    window[j] = Math.max(window[j], window[j+1]);
	  }
	  
	  return window;
	   }
	}
}
