
public class KthElementOfAMatrix {
	class Solution
	{
		
	    public static int kthSmallest(int[][]mat,int n,int k)
	    {
	        int [] flat = new int[n*n];
	        int c=0;
	        for(int i=0;i<n;i++){
	            for(int j = 0;j<n;j++){
	                flat[c] = mat[i][j];
	                c++;
	            }
	        }
	        Arrays.sort(flat);
	        return flat[k-1];
	    }
	}
}
