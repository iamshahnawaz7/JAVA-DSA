package GitHub;

public class DeleteNodeInALinkedList {
	class Solution {
	     public void deleteNode(ListNode node) {
	    //copy the next node value
	    node.val = node.next.val;
	    //delete the next node
	    node.next = node.next.next;
	  }
	}
}
