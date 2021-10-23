package GitHub;

public class IsBinaryTreeHeap {
	class Solution {
	    boolean isHeap(Node root) {
	        Queue<Node> q= new ArrayDeque<>();
	        q.add(root);
	        boolean hasNotLeft= false, hasNotRight= false;
	        while(!q.isEmpty()){
	            Node p= q.poll();
	            if( (p.left!= null && p.right != null) && (hasNotLeft || hasNotRight)){
	                return false;
	            }
	            boolean hasLeft= false;
	            if(p.left!= null){
	                hasLeft= true;
	                if(p.left.data<= p.data)
	                    q.add(p.left);
	                else
	                    return false;
	            } else {
	                hasNotLeft= true;
	            }
	            if(p.right!= null){
	                if(!hasLeft){
	                    return false;
	                }
	                if(p.right.data<= p.data)
	                    q.add(p.right);
	                else
	                    return false;
	            } else {
	                hasNotRight= true;
	            }
	        }
	        return true;
	    }
	}
}
