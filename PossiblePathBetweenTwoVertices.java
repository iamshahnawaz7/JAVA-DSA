package Quesba;

public class PossiblePathBetweenTwoVertices {
	class Solution {
		  public:
		    void dfs(int src,int par,int dest,vector<int> &vis,vector<int> adj[]){
		        //vis[src] = 1;
		        vis[src] += 1;
		        if(src == dest){
		            //no need of this condn but speeds up!!
		            return;
		        }
		        for(auto it:adj[src]){
		            // if(vis[it] == 0 && it != par) //directed and no cycles and self loops
		            dfs(it,src,dest,vis,adj);
		        }
		    }
		    int countPaths(int V, vector<int> adj[], int source, int destination) {
		        // Code here
		        vector<int> vis(V+1,0);
		        dfs(source,-1,destination,vis,adj);
		        return vis[destination];
		    }
		};
}
