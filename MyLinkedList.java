package LinkedList;

public class MyLinkedList {
Node head;
static class Node{
	int data;
	Node next;
	 public Node(int data){
		 this.data=data;
		 next=null;
	 }
  }

Boolean isEmpty(){
    return head == null;
}
 
public void add(int val) {
 Node toAdd=new Node(val);
 if(isEmpty()) {
	 head=toAdd;
 }	
 Node temp=head;
 while(temp.next!=null) {
	 temp=temp.next;
 }
 temp.next=toAdd;
}

public void insert(int value,int search) {
	Node temp=head;
	Node v;
	Node toInsert=new Node(value);
	while(temp.next!=null && temp.data!=search) {
		temp=temp.next;
	}
	v=temp.next;
	temp.next=toInsert;
	toInsert.next=v;
}

public void delete(int val) {
	//Node n=new Node(val);
	Node v;
	Node temp=head;
	while(temp.next!=null && temp.data!=val) {
		temp=temp.next;	
	}
   	v=temp.next.next;
   	temp.next=v;
   	
}


public void deleteAt(int pos) {
	Node temp=head;
    int count=0;
    if(temp.next==null){
        return;
    }
    while(temp.next!=null ){
        if(count==pos){
             Node a=temp.next.next;
             temp.next=a;
        }
        temp=temp.next;
        count++;
    }
}


public void print(){
    Node temp = head;
    while(temp.next!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println(temp.data);
}



 }
