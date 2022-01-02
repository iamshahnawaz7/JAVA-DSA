package Quesba;

public class KthSmallestFactor {
	class Solution {
	    static int kThSmallestFactor(int N , int K) {
	        int count=0;
	        for(int i=1;i<=N;i++){
	        if(N%i==0){
	            count++;
	        }
	        if(count==K){
	            return i;
	        }
	        }
	        return -1;
	    }
	};
}
