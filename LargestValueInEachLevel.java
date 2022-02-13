package Quesba;

public class LargestValueInEachLevel {
	class Solution
	{
	    public ArrayList<Integer> largestValues(Node root)
	   {
	       ArrayList<Integer> al=new ArrayList<>();
	       Queue<Node> q=new LinkedList<>();
	       q.add(root);
	       while(!q.isEmpty()){
	           int n=q.size();
	           int max=Integer.MIN_VALUE;
	           for(int i=0;i<n;i++){
	               Node cur=q.poll();
	               if(cur.left!=null)q.add(cur.left);
	               if(cur.right!=null)q.add(cur.right);
	               if(cur.data>max)max=cur.data;
	           }
	           al.add(max);
	       }
	       return al;
	   }
	}
}
