package GitHub;

public class LowestCommonAncestorInABinaryTrree {
	class Solution
	{
		Node lca(Node root, int n1,int n2)
		{
			
		    
			if(root==null)
				return null;
			
			
			if(root.data==n1 || root.data==n2)
				return root;
			
			Node l = lca(root.left,n1,n2);
			Node r = lca(root.right,n1,n2);
			
			if(l != null && r != null)
				return root;
				
			return(l!=null)?l:r;
		}
		}
}
