package GitHub;

public class SegregateEvenAndOddNodesInALinkedList {
	class Solution{
	    static Node divide(int N, Node head){
	        // code here
	        Node eHead = new Node(-1);
	        Node oHead = new Node(-1);
	        Node temp = head,even = eHead,odd = oHead;
	        while(temp!=null){
	            Node n = new Node(temp.data);
	            if(temp.data%2==0) {
	                even.next = n;
	                even = even.next;
	            }
	            else {
	                odd.next = n;
	                odd = odd.next;
	            }
	            temp = temp.next;
	        }
	        even.next = oHead.next;
	        return eHead.next;
	    }
	}
}
