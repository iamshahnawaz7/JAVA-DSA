package Quesba;

public class ReverseFirstKElementsOfAQueue {
	class GfG {
	    // Function to reverse first k elements of a queue.
	    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
	        Stack<Integer> s=new Stack<>();
	        int n=q.size();
	        int i=0,j=0;
	        Queue<Integer> qq = new LinkedList<>();
	        int count=1;
	        while(i<n){
	            if(count<=k){
	            s.push(q.remove());
	            count++;
	            }
	            i++;
	        }
	        int m=s.size();
	        while(j<m){
	            qq.add(s.pop());
	            j++;
	        }
	        n=q.size();
	        i=0;
	        while(i<n){
	          qq.add(q.remove());
	          i++;
	        }
	        return qq;
	    }
	}
}
