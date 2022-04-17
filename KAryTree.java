package Recursion;

public class KAryTree {
	class Solution {
		  public:
		    long long karyTree(int k, int m) {
		    long long res = 1, k1 = k, mod = 1e9+7;
		    while(m) {
		        if(m&1) {
		            res *= k1;
		            res %= mod;
		            m--;
		        } else {
		            k1 = k1*k1;
		            k1 %= mod;
		            m /= 2;
		        }
		    }
		    return res;
		}
		};

}
