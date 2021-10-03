package GitHub;

public class DetectCycleInAnUndirectedGraph {
	Boolean isCyclicUtil(int v,
            Boolean visited[], int parent, ArrayList<ArrayList<Integer>> adj)
{
   // Mark the current node as visited
   visited[v] = true;
   Integer i;

   // Recur for all the vertices
   // adjacent to this vertex
   Iterator<Integer> it =
           adj.get(v).iterator();
   while (it.hasNext())
   {
       i = it.next();

       // If an adjacent is not
       // visited, then recur for that
       // adjacent
       if (!visited[i])
       {
           if (isCyclicUtil(i, visited, v,adj))
               return true;
       }

       // If an adjacent is visited
       // and not parent of current
       // vertex, then there is a cycle.
       else if (i != parent)
           return true;
   }
   return false;
}
// Function to detect cycle in an undirected graph.
public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
   // Code here
   Boolean visited[] = new Boolean[V];
   for (int i = 0; i < V; i++)
       visited[i] = false;

   // Call the recursive helper
   // function to detect cycle in
   // different DFS trees
   for (int u = 0; u < V; u++)
   { 
    
       // Don't recur for u if already visited
       if (!visited[u])
           if (isCyclicUtil(u, visited, -1,adj))
               return true;
   }

   return false;
}
}
