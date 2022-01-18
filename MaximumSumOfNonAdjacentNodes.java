package Quesba;

public class MaximumSumOfNonAdjacentNodes {
	class Solution{
		  public:
		    //Function to return the maximum sum of non-adjacent nodes.
		    
		    void get(Node* root, unordered_map<Node*, pair<int, int>> & m){
		        
		        if(root==NULL){
		            return ;
		        }
		        
		        if(root->left==NULL && root->right==NULL){
		            m[root]={root->data,0};
		            return;
		        }
		        get(root->left, m);
		        get(root->right, m);
		        m[root]= {root->data+m[root->left].second+m[root->right].second,max(m[root->left].first
		        , m[root->left].second)+
		        max(m[root->right].first , m[root->right].second)};
		        
		        
		        
		    }
		    int getMaxSum(Node *root) 
		    {
		    //     In unordered_map I  store  through this Node  what is maximum value I can get With 
		    //     Included the this Node  and  maximum sum if I  exclude the this Node.
		    //         example :
		    //           11 {11, (max(1,0)+max(2,0))=3}
		    //          /  \
		    //   {1,0} 1   2 {2,0}
		        unordered_map<Node* , pair<int, int>> m;
		        
		        get(root, m);
		        return max(m[root].first, m[root].second);
		        
		    
		    }
		};
}
