package Recursion;

public class ShopInCandyStore {
	vector<int> candyStore(int candies[], int N, int K){
        vector<int> ans({0 , 0});
        sort(candies , candies+N);
        int v = (N / (K+1)) + ((N % (K+1)) != 0 ? 1 : 0);
        for(int i = 0 ; i < v ; i++){
            ans[0] += candies[i];
            ans[1] += candies[N-i-1];
        }
        return ans;
    }
}
