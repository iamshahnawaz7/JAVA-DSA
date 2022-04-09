package Recursion;

public class SumOfNodesWithinKDistanceFromTheTargets {
	class Solution{
		public:
		   Node* locate(Node* root, int target){
		       if(root==NULL) return NULL;
		       if(root -> data == target)
		           return root;
		       Node* lNode = locate(root -> left, target);
		       Node* rNode = locate(root -> right, target);
		       
		       if(lNode) return lNode;
		       if(rNode) return rNode;
		       
		       return NULL;
		   }
		   void markParent(Node* root, unordered_map<Node*, Node*>&umap){
		       if(root==NULL) return;
		       queue<Node*>q;
		       umap.insert({root, NULL});
		       q.push(root);
		       while(!q.empty()){
		           Node* tmp = q.front();
		           q.pop();
		           
		           if(tmp){
		               if(tmp -> left){
		                   umap.insert({tmp -> left, tmp});
		                   q.push(tmp -> left);
		               }
		               if(tmp -> right){
		                   umap.insert({tmp -> right, tmp});
		                   q.push(tmp -> right);
		               }
		           }
		       }
		   }
		   int sum_at_distK(Node* root, int target, int k)
		   {
		       if(root==NULL)
		           return 0;
		       
		       Node* tar = locate(root, target);
		       unordered_map<Node*, Node*>umap;
		       markParent(root, umap);
		       
		       int dist=0, sum=0;
		       queue<Node*>q;
		       q.push(tar);
		       unordered_set<Node*>check;
		       check.insert(tar);
		       
		       while(!q.empty()){
		           if(dist++>k)
		               break;
		           int size = q.size();
		           for(int i=0;i<size;i++){
		               Node* tmp = q.front();
		               q.pop();
		               sum+=tmp -> data;
		               
		               if(tmp -> left && check.count(tmp -> left)==0){
		                   q.push(tmp -> left);
		                   check.insert(tmp -> left);
		               }                
		               
		               if(tmp -> right && check.count(tmp -> right)==0){
		                   q.push(tmp -> right);
		                   check.insert(tmp -> right);
		               }
		               
		               if(umap[tmp] && check.count(umap[tmp])==0){
		                   q.push(umap[tmp]);
		                   check.insert(umap[tmp]);
		               }
		               
		           }
		       }
		       
		       return sum;
		   }
		};
		 
}
