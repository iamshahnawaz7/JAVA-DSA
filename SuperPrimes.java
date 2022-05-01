package Recursion;

public class SuperPrimes {
	class Solution{
		public:	
			
			int superPrimes(int n)
			{
			    // Your code goes here
			    int prime[n + 1] = {0};
			    prime[0]=prime[1] = 1;
			    for(int i = 2 ; i * i <= n; i++){
			        if(prime[i] == 0)
			        for(int j = i * i ; j <= n ; j += i)
			        prime[j] = 1;
			    }
			    int cnt = 0;
			    for(int i = 2 ; i <= n ; i++){
			        if(prime[i] == 0 && prime[i - 2] == 0)
			        cnt++;
			    }
			    return cnt;
			}
		};
}
