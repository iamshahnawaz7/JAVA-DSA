package Quesba;

public class ImplementingDijkstrasAlgorithm {
	class Solution
	{
	   //Function to find the shortest distance of all the vertices
	   //from the source vertex S.
	   
	   static int INF = 1000000007;
	   
	   static class Pair implements Comparable<Pair>{
	       int v1, weight;
	       Pair(int v1, int weight){
	           this.v1 = v1;
	           this.weight = weight;
	       }
	       @Override
	       public int compareTo(Pair o) {
	           return this.weight-o.weight;
	       }
	   }
	   
	   static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> list, int s)
	   {
	       
	       PriorityQueue<Pair> queue = new PriorityQueue<>();
	       boolean isVisited[] = new boolean[v];
	       int distance[] = new int[v];
	       int ans[] = new int[v];
	       queue.add(new Pair(s, 0));
	       Arrays.fill(distance, INF);

	       while(!queue.isEmpty()){

	           Pair cur = queue.remove();
	           if(isVisited[cur.v1]) continue;

	           isVisited[cur.v1] = true;
	           ans[cur.v1] = cur.weight;

	           for(ArrayList<Integer> i : list.get(cur.v1)){
	               int end = i.get(0);
	               int w = i.get(1);
	               if(!isVisited[end]){
	                   queue.add(new Pair(end, w+cur.weight));
	               }
	           }
	       }
	       
	       return ans;
	       
	   }
	}

}
