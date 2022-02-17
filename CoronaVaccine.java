package Quesba;

public class CoronaVaccine {
	class Solution{
		private:
		    int res;
		    
		    void countVaccine(Node* root, unordered_map<Node*, int>& state) {
		        if(!root) return;
		        
		        countVaccine(root->left, state);
		        countVaccine(root->right, state);
		        if(state[root->left] == -1 or state[root->right] == -1) {
		            state[root] = 1;
		            res++;
		        }
		        else if(state[root->left] == 1 or state[root->right] == 1) state[root] = 0;
		        else state[root] = -1;
		    }
		    
		public:
		    int supplyVaccine(Node* root){
		        unordered_map<Node*, int> state;
		        res = 0;
		        countVaccine(root, state);
		        if(state[root] == -1) res++;
		        return res;
		    }
		};
}
