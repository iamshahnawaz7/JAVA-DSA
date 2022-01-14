package Quesba;

public class AddAllGreaterValuesToEveryNodeWithGST {
	class Solution{
		   public Node modify(Node root)
		   {
		       int arr[] = new int[1];
		       modifyUtil(root, arr);
		       return root;
		   }
		   public void modifyUtil(Node root, int[] arr) {
		       if (root == null)
		           return;
		       modifyUtil(root.right, arr);
		       root.data += arr[0];
		       arr[0] = root.data;
		       modifyUtil(root.left, arr);
		   }
		}
}
