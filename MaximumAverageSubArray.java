package Recursion;

public class MaximumAverageSubArray {
	def findMaxAverage(self, arr, n, k):
        # code here
        # maximum sum subarray of length k
        l = 0 
        currsum = 0
        for i in range(k):
            currsum += arr[i]
        ans = currsum
        out = 0
        for j in range(k,n):
            currsum -= arr[l]
            l+=1
            currsum += arr[j]
            if currsum > ans:
                ans = currsum
                out = l
        return out
}
