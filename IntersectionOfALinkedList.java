
public class IntersectionOfALinkedList {
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode temp = headA;
	        ListNode temp1=headB;
	        while(temp!=null){
	            temp1=headB;
	            while(temp1!=null){
	                if(temp==temp1){
	                    return temp;
	                }
	                temp1=temp1.next;
	            }
	            temp=temp.next;
	        }
	      return null;  
	    }
	}
}
