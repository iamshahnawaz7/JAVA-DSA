package Quesba;

public class QuickSortOnLinkedList {
	pair<node*, node*> quicksort(node* head, node* tail) {
	    if(head == NULL) return {NULL, NULL};
	    if(head == tail) return {head, tail};

	    node* dummy1 = new node(-1);
	    node* dummy2 = new node(-1);
	    node *head1 = dummy1, *head2 = dummy2;
	    node* temp = head;

	    while(temp != tail) {
	        if(temp -> data <= tail -> data) {
	            dummy1 -> next = temp;
	            dummy1 = dummy1 -> next;
	        } else {
	            dummy2 -> next = temp;
	            dummy2 = dummy2 -> next;
	        }
	        temp = temp -> next;
	    }
	    dummy1 -> next = NULL;
	    dummy2 -> next = NULL;
	    
	    pair<node*, node*> p1 = quicksort(head1->next, dummy1);
	    pair<node*, node*> p2 = quicksort(head2->next, dummy2);
	    
	    if(head1 -> next == NULL) {
	        temp -> next = p2.first;
	        return {temp, p2.second};
	    }
	    if(head2 -> next == NULL) {
	        p1.second -> next = temp;
	        return {p1.first, temp};
	    }
	    
	    p1.second -> next = temp;
	    temp -> next = p2.first;
	    
	    return {p1.first, p2.second};
	}

	void quickSort(struct node **headRef) {
	    if(headRef == NULL) return;
	    node* head = *headRef;
	    node* tail = *headRef;
	    while(tail -> next != NULL)
	        tail = tail->next;
	    *headRef = quicksort(head, tail).first;
	}
}
