package GitHub;

public class FidingMiddleElementInALinkedList {
	class Solution
	{
	    int getMiddle(Node head)
	    {
	         Node f=head, s=head;
	         while(s.next!=null){
	             f=f.next;
	             s=s.next;
	          if(s.next!=null){
	              s=s.next;
	          }
	         }
	         return f.data;
	    }
	}
}
