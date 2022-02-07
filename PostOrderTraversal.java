package Quesba;

public class PostOrderTraversal {
	class Tree {
	    ArrayList<Integer> list = new ArrayList<>();
	    ArrayList<Integer> temp = new ArrayList<>();
	    
	   void ans(Node node)
	   {
	       if(node == null)
	       {
	           return;
	       }
	       ans(node.left);
	       ans(node.right);
	       list.add(node.data);
	   }
	   
	   ArrayList<Integer> postOrder(Node node) {
	       
	       
	       if(node == null)
	       {
	           return list;
	       }
	       
	        ans(node);
	        
	        temp.clear();
	        temp.addAll(list);
	        list.clear();
	        
	        
	        return temp;
	       
	       
	   }
	}
}
