package Quesba;

public class InsertionSortForSinglyLinkedList {
	class Solution
	{
	   static Node head;
	   static Node sorted;
	   public static Node insertionSort(Node headref)
	   {
	       sorted = null;
	       Node current = headref;
	       while (current != null)
	       {
	           Node next = current.next;
	           sortedInsert(current);
	           current = next;
	       }
	       head = sorted;
	       return head;
	   }
	   
	   public static void sortedInsert(Node newnode)
	   {
	       if (sorted == null || sorted.data >= newnode.data)
	       {
	           newnode.next = sorted;
	           sorted = newnode;
	       }
	       else
	       {
	           Node current = sorted;
	           while (current.next != null && current.next.data < newnode.data)
	           {
	               current = current.next;
	           }
	           newnode.next = current.next;
	           current.next = newnode;
	       }
	   }
	}
}
