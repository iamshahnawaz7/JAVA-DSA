package Quesba;

public class AddOneToANumber {
	class Solution
	{
	    public static Node addOne(Node head) 
	    { 
	        
	        if(head==null){
	            return null;
	        }
	        
	        if(head.next==null){
	            head.data=head.data+1;
	            return head; 
	        }
	        
	        Node ptr=head;
	        Node ans=reverseList(ptr);
	        Node revHead=ans;
	        
	        int total=0;
	        Node prev=null;
	        
	        // checking if the last digit is less than 9
	        if(revHead.data<9){
	            revHead.data+=1;
	            return reverseList(ans);
	        }
	        
	        int carry=1;

	        while(revHead!=null){
	                total = revHead.data + carry;
	                carry = total/10;
	                total %= 10;
	           
	            revHead.data=total;
	            prev=revHead;
	            revHead = revHead.next;
	            }
	            
	            // for ex 9->9->9->null
	            if(carry != 0){
	            Node newNode = new Node(1);
	            prev.next = newNode;
	        }
	        
	            return(reverseList(ans));
	        }
	        
	        // reversing the list
	        public static Node reverseList(Node head){
	            
	        if(head==null || head.next==null){
	            return head;
	        }
	        Node curr=head;
	        Node prev=null;
	        
	        while(curr!=null){
	            Node temp=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=temp;
	        }
	        return prev;
	    }
	    
	}
}
