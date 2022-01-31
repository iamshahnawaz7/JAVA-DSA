package Quesba;

public class CousinsOfAGivenNode {
	class Solution
	{
	    void solve(queue<Node*> &q, vector<int> &res)
	    {
	        while(!q.empty())
	        {
	            Node* temp = q.front(); q.pop();
	            res.push_back(temp->data);
	        }
	        return;
	    }
	    public:
	    vector<int> printCousins(Node* root, Node* node_to_find)
	    {
	        //code here
	        vector<int> res;
	        queue<Node*> q;
	        q.push(root);
	        bool flag = false;
	        while(!q.empty())
	        {
	            if(flag)
	            {
	                solve(q, res);
	                return res;
	            }
	            int size = q.size();
	            for(int i=1; i<=size; i++)
	            {
	                Node* temp = q.front(); q.pop();
	                if(temp->left && temp->left == node_to_find)
	                {
	                    flag = true;
	                    continue;
	                }
	                else if(temp->right && temp->right == node_to_find)
	                {
	                    flag = true;
	                    continue;
	                }
	                else
	                {
	                    if(temp->left)
	                        q.push(temp->left);
	                    if(temp->right)
	                        q.push(temp->right);
	                }
	            }
	        }
	        if(res.size() == 0)
	            return {-1};
	        return res;
	    }
	    
	};
}
