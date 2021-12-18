package Quesba;

public class MaximumDifferenceBetweenItsNodeAndAncestor {
	int maxDiff(Node* root)
	{
	        int res = INT_MIN;
	   queue<pair<Node*, int>> q;
	   
	   //Store max ancestor value at each node.
	   q.push({root, root->data});
	   
	   while(!q.empty()){
	      pair<Node*, int> p = q.front(); q.pop();
	      Node* r = p.first;
	      int maxAnc = p.second;
	      
	      if(r->left){
	          int diff = maxAnc - r->left->data;
	          if(diff> res)
	               res = diff;
	          q.push({r->left, max(maxAnc, r->left->data)}); 
	      }
	      
	      if(r->right){
	          int diff = maxAnc - r->right->data;
	          if(diff> res)
	               res = diff;
	          q.push({r->right, max(maxAnc, r->right->data)}); 
	      }
	   }
	   return res;
	}

}
