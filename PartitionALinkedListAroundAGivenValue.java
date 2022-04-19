package Recursion;

public class PartitionALinkedListAroundAGivenValue {
	class Solution {
	    public static Node partition(Node node, int x) {
	         Node greater=new Node(-1);
	         Node smaller=new Node(-1);
	         Node equal=new Node(-1);
	         Node temp=smaller;
	         Node temp1=equal;
	         Node curr=node;
	         Node temp2=greater;
	        if(x==0){
	            return node;
	           }
	        while(curr!=null){
	            if(curr.data<x){
	                temp.next=curr;
	                temp=temp.next;
	                //temp.next=null;
	            }
	           else if(curr.data==x){
	                temp1.next=curr;
	                temp1=temp1.next;
	                //temp1.next=null;
	            }
	           else{
	                temp2.next=curr;
	                temp2=temp2.next;
	               // temp2.next=null;
	           }
	           curr=curr.next;
	        }
	        temp2.next=null;
	        if(equal.next!=null){
	        temp.next=equal.next;
	        }
	        else{
	            temp.next=greater.next;
	        }
	        temp1.next=greater.next;
	        return smaller.next;
	    }
	}
}
