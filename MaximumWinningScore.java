package Quesba;

public class MaximumWinningScore {
	class Solution
	{
	    public static Long findMaxScore(Node root)
	    {
	        if(root==null) return 0l;

	        Long maxProd = Math.max(findMaxScore(root.left),findMaxScore(root.right));
	        return maxProd==0 ? root.data : maxProd*root.data;
	    }
	}
}
