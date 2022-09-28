package GitHub;

public class ReverseLinkList {
	class Solution {
		public ListNode reverseList(ListNode head) {
		ListNode current = head;
		ListNode previous= null;
		ListNode temp= null;
		while(current!= null)
		{
		temp =current.next;
		current.next=previous;
		previous=current;
		current=temp;
		}
		return previous;
		}
		}
}
