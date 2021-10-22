package GitHub;

public class MiddleOfALinkedList {
	class Solution {
	    public ListNode middleNode(ListNode head) 
	    {
	        if(head==null || head.next==null){
	            return head;
	        }
	        
	        if(head.next.next==null){
	            return head.next;
	        }
	        
	        ListNode temp=head;
	        int count=1;
	        int c=0;
	        while(temp.next!=null){
	            count++;
	            temp=temp.next;
	        }
	        
	        if(count%2==0){
	            count=(count/2)+1;
	        }
	        else{
	            count= (count+1)/2;
	        }
	        
	        temp=head;
	        
	        while(temp.next!=null){
	              c++;
	            if(c==count){
	                head=temp;
	                break;
	            }
	            temp=temp.next;
	        }
	        return head;
	    }
	}
}
