class TreeNode{
	int val;
	TreeNode left = this.left;
	TreeNode right = this.right;
	TreeNode(){}
	TreeNode(int val){
		this.val=val;
		}
	}

class LevelOrderTraversal{
public List<List<Integer>> level order(TreeNode root){
	List<List<Integer>> list = new ArrayList<>();
	if(root==null) return list;
	Queue<TreeNode> queue = new LinkedList<>();
	queue.add(root);
	traversal(queue,list);
	return list;
}

public static void traversal(Queue<TreeNode> queue,List<List<Integer>> list){
        if(queue.isEmpty())return ;
        
        int len=queue.size();
        List<Integer>ll = new LinkedList<>();
        
        for(int i=0;i<len;i++){
            TreeNode temp = queue.poll();
            if(temp.left!=null)queue.add(temp.left);
            if(temp.right!=null)queue.add(temp.right);
            ll.add(temp.val);
        }
        
        list.add(ll);
        traversal (queue,list);
    		}
}