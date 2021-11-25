
public class MinimumSum {
	class Solution {
	    String solve(int[] arr, int n) {
	        // code here
	        if (arr == null || n == 0) {
	            return "";
	        }
	        StringBuilder s1 = new StringBuilder();
	        StringBuilder s2 = new StringBuilder();
	        Arrays.sort(arr);
	        // from example we can see that [6, 8, 4, 5, 2, 3]
	        // after sorting we get [2, 3, 4, 5, 6, 8]
	        // and the answer is 358 + 246
	        // so if we see the positions of 3,5,8 and 2,4,6
	        // we can come to an observation that 3,5,8 are at odd index and the other in even index
	        // so just group them into two strings and just add them together to get our result
	        for (int i=0; i<n; i++) {
	            if (i % 2 == 0) {
	                s1.append(arr[i]);
	            }
	            else {
	                s2.append(arr[i]);
	            }
	        }
	        return findMinimumSum(s1.toString(), s2.toString());
	    }
	    
	    String findMinimumSum(String s1, String s2) {
	        StringBuilder result = new StringBuilder();
	        int i = s1.length() - 1;
	        int j = s2.length() - 1;
	        int carry = 0;
	        while (i >= 0 && j >=0) {
	            int currentNumber = s1.charAt(i) - '0' + s2.charAt(j) - '0' + carry;
	            carry = currentNumber / 10;
	            if (currentNumber > 0)
	                result.append(currentNumber % 10);
	            i--;
	            j--;
	        }
	        while (i >= 0) {
	            int currentNumber = s1.charAt(i) - '0' + carry;
	            carry = currentNumber / 10;
	            if (currentNumber > 0)
	                result.append(currentNumber % 10);
	            i--;
	        }
	        while (j >= 0) {
	            int currentNumber = s2.charAt(j) - '0' + carry;
	            carry = currentNumber / 10;
	            if (currentNumber > 0)
	                result.append(currentNumber % 10);
	            j--;
	        }
	        if (carry > 0) {
	            result.append(carry);
	        }
	        return result.reverse().toString();
	    }
	}
}
