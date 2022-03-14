package Recursion;

public class BiconnectedGraph {
	int biGraph(int arr[], int n, int e) {
        if(n<=2) return 1;
        vector<int> degree(n+1,0);
        for(int i=0; i<2*e; i+=2) {
            int u=arr[i], v=arr[i+1];
            degree[u]++;
            degree[v]++;
        }
        for(int i=0; i<n; ++i) {
            if(degree[i]<2) return 0;
        }
        return 1;
}
}
