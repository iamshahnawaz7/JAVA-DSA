package Recursion;

public class FindLengthOfLoop {
	class Solution{
	    static int findcycleStart(Node root){
	        Node fast = root, slow = root;
	        boolean loop = false;
	        while(fast != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next;
	            if(slow == fast) {
	                loop = true;
	                break;
	            }
	        }
	        if(!loop) return 0;
	        int count = 1;
	        slow = slow.next;
	        while(fast != slow){
	            slow = slow.next;
	            count++;
	        }
	        return count;
	    }
	    static int countNodesinLoop(Node head){
	        if(head == null) return 0;
	        return findcycleStart(head);
	    }
	}
}
