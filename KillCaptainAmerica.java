package Recursion;

public class KillCaptainAmerica {
	class UnionFind
	{
	    int N;
	    int parent[];
	    
	    UnionFind(int N)
	    {
	        this.N = N;
	        parent = new int[N+1];
	        for(int i=1; i<=N; i++)
	        {
	            parent[i] = i;
	        }
	    }
	    
	    private int findParent(int x)
	    {
	        if(parent[x]==x) return x;
	        return parent[x] = findParent(parent[x]);
	    }
	    
	    public void union (int x, int y)
	    {
	        int px = findParent(x);
	        int py = findParent(y);
	        
	        parent[y] = px;
	    }
	    
	    public int getMain()
	    {
	        int count[] = new int[N+1];
	        for(int i=1; i<=N; i++)
	        {
	            findParent(i);
	            count[parent[i]]++;
	        }
	        
	        int total_count = 0;
	        
	        for(int i=1; i<=N; i++)
	        {
	            if(count[i]==N) return i;
	        }
	        
	        return 0;
	    }
	    
	}


	class Solution
	{
	    
	    int captainAmerica(int N, int M, int V[][])
	    {
	        UnionFind uf = new UnionFind(N);
	        
	        for(int i=0; i<M; i++)
	        {
	            uf.union(V[i][1], V[i][0]);
	        }
	        
	        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	        
	        for(int i=0; i<=N; i++)
	        {
	            adj.add(new ArrayList<>());
	        }
	        
	        for(int i=0; i<M; i++)
	        {
	            adj.get(V[i][0]).add(V[i][1]);
	        }
	        
	        int mainNd = uf.getMain();
	        
	        if(mainNd == 0) return 0;
	        
	        Queue<Integer> q = new ArrayDeque<>();
	        boolean visited[] = new boolean[N+1];
	        
	        visited[mainNd] = true;
	        
	        q.add(mainNd);
	        
	        int count = 1;
	        
	        while(!q.isEmpty())
	        {
	            int nd = q.poll();
	            
	            for(int nei : adj.get(nd))
	            {
	                if(visited[nei]==false)
	                {
	                    count++;
	                    visited[nei]=true;
	                    q.add(nei);
	                }
	            }
	            
	        }
	        
	        
	        return count;
	        
	    }
	    
	}
}
