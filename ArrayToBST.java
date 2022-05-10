package Recursion;

public class ArrayToBST {
	class Solution
	{
	   public int[] sortedArrayToBST(int[] nums){
	     int n = nums.length;
	     int[] ans = new int[n];
	     int s = 0;
	     int e = nums.length - 1;
	    construct_BST(nums, s, e, ans);
	      idx = 0;
	     return ans;
	   }
	private static int idx = 0;
	private static void construct_BST(int[] nums, int s, int e, int[] ans){
	if(s > e) return;
	int mid = (s+e)/2;
	ans[idx++] = nums[mid];
	construct_BST(nums, s, mid-1, ans);
	construct_BST(nums, mid+1, e, ans);
	}

	}
}
