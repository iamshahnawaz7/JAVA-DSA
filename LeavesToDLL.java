package Quesba;

public class LeavesToDLL {
	Node * modifyTree(Node *root, Node* &head)
	{
	    //case case condition
	    if(root == NULL)
	        return NULL;
	        
	    //leaf node condition
	    if(root->left == NULL && root->right == NULL)
	    {
	        root->right = head;
	        
	        if(head!=NULL)
	            head->left = root;
	        
	        head = root;
	        return NULL;
	    }
	    
	    root->right = modifyTree(root->right, head);
	    root->left = modifyTree(root->left, head);
	    
	    return root;
	}

	// return the head of the DLL and remove those node from the tree as well.
	Node * convertToDLL(Node *root){
	    // add code here.
	    Node *head = NULL;
	    Node * temp = modifyTree(root, head);
	    
	    return head;
	}

}
