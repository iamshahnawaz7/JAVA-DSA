package Recursion;

public class ProductOfPrimes {
	class Solution{
		   static long primeProduct(long L, long R){
		       // code here
		       long prd = 1;
		       long M = 1000000007;
		       for(long i = L ; i<=R;i++){
		           if(checkPrime(i)==true){
		               prd = (prd*i)%M; 
		           }
		       }
		       return prd;
		   }
		   public static boolean checkPrime(long N){
		       
		       for(int i =2; i<=Math.sqrt(N);i++){
		           if((N%i)==0){
		               return false;
		           }
		       }
		       return true;
		   }
		}
}
