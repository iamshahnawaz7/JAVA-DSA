package Quesba;

public class GadgetsOfDoraland {
	class Solution{
	    public:
	    vector<int> TopK(vector<int>& array, int k)
	    {
	        unordered_map<int, int>mp;
	        int i = 0;
	        priority_queue<pair<int, int>, vector<pair<int, int>>, 
	        greater<pair<int, int>>>pq;
	        // min elt of k + 1 is not useful, 
	        // so min heap to pop the same
	        vector<int>v;
	        
	        for(int i = 0; i < array.size(); i++){
	            mp[array[i]]++;
	        }
	        
	        for(auto it : mp){
	            pq.push({it.second, it.first});
	            if(i++ >= k) pq.pop();
	        }
	        while(!pq.empty()){
	            v.push_back(pq.top().second);
	            pq.pop();
	        }
	        reverse(v.begin(), v.end());
	        return v;
	    }
	};
}
