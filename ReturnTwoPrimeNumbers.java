package Quesba;

public class ReturnTwoPrimeNumbers {
	class Solution{
		public:
		    
		bool isPrime(int n)
		{
		    // Corner cases
		    if (n <= 1)
		        return false;
		    if (n <= 3)
		        return true;
		  
		    // This is checked so that we can skip
		    // middle five numbers in below loop
		    if (n % 2 == 0 || n % 3 == 0)
		        return false;
		  
		    for (int i = 5; i * i <= n; i = i + 6)
		        if (n % i == 0 || n % (i + 2) == 0)
		            return false;
		  
		    return true;
		}
		    vector<int> primeDivision(int N){
		        // code here
		        vector<int> vc;
		        int i=2;
		        while(i<=N){
		            if(isPrime(i)){
		                if(isPrime(N-i)){
		                    vc.push_back(i);
		                    vc.push_back(N-i);
		                    return vc;
		                }
		                else{
		                    i++;
		                }
		            }
		            else{
		                i++;
		            }
		        }
		        return vc;
		    }
		};
}
