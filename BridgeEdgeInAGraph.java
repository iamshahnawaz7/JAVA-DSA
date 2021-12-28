package Quesba;

public class BridgeEdgeInAGraph {
	class Solution
	{
	    //Function to find if the given edge is a bridge in graph.
	    static int timer;
	    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d){
	        timer=0;
	        int disc[]= new int[V];
	        int low[]= new int[V];
	        boolean visited[]= new boolean[V];
	        int parent[]= new int[V];
	        Arrays.fill(disc,-1);Arrays.fill(low,-1);Arrays.fill(parent,-1);
	        Map<Integer,Integer> bridges = new HashMap<>();
	        
	        for(int i=0;i<V;i++){
	            if(!visited[i])
	            tarjans(i,adj,bridges,disc,low,visited,parent);   
	        }
	        
	        if((bridges.containsKey(d) && bridges.get(d)==c)||
	        (bridges.containsKey(c) && bridges.get(c)==d))
	            return 1;
	        return 0;
	    }
	    static void tarjans(int ver,ArrayList<ArrayList<Integer>>adj,Map<Integer,Integer>
	    map,int disc[],int low[],boolean visited[],int parent[]){
	           visited[ver]=true;
	           disc[ver]=low[ver]=++timer;
	           for(Integer in:adj.get(ver)){
	               if(!visited[in]){
	                   parent[in]=ver;
	                   tarjans(in,adj,map,disc,low,visited,parent);
	                   low[ver]=Math.min(low[ver],low[in]);
	                    if(disc[ver]<low[in]){
	                        //System.out.println(ver+" "+in);
	                        map.put(ver,in);
	                        map.put(in,ver);
	                    }
	                        
	                }else if(parent[ver]!=in){
	                    low[ver]=Math.min(low[ver],disc[in]);
	                }
	           }
	    }
	}
}
