
public class TrappingRainWater {
	class Solution{
	    
	    // arr: input array
	    // n: size of array
	    // Function to find the trapped water between the blocks.
	    static long trappingWater(int height[], int n) { 
	        // Your code here
	        if (height == null || height.length == 0) {
	            return 0;
	        }
	        int left = 0;
	        int right = n - 1;
	        long result = 0;
	        long leftMax = 0;
	        long rightMax = 0;
	        while (left < right) {
	            if (height[left] <= height[right]) {
	                if (height[left] >= leftMax) {
	                    leftMax = height[left];
	                }
	                else {
	                    result += leftMax - height[left];
	                }
	                left++;
	            }
	            else {
	                if (height[right] >= rightMax) {
	                    rightMax = height[right];
	                }
	                else {
	                    result += rightMax - height[right];
	                }
	                right--;
	            }
	        }
	        return result;
	    } 
	}

}
