package Recursion;

public class MergeTwoSortedLinkedLists {
	class LinkedList
	{
	    Node sortedMerge(Node head1, Node head2) {
	     
	     Node l1=head1;
	     Node l2=head2;
	     if(l1.data>l2.data)
	     {
	         Node help=l1;
	         l1=l2;
	         l2=help;
	     }
	     Node res=l1;
	     while(l1!=null && l2!=null)
	     {
	         Node temp=null;
	         
	         while(l1!=null && l1.data<=l2.data)
	         {
	             temp=l1;
	             l1=l1.next;
	         }
	         
	         temp.next=l2;
	         
	        Node help=l1;
	         l1=l2;
	         l2=help;
	     }
	     
	     return res;
	     
	   } 
	}

}
