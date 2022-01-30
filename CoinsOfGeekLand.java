package Quesba;

public class CoinsOfGeekLand {
	class Solution
	{
	    public int Maximum_Sum(int mat[][],int N,int K){
	        // Your code goes here
	        int maxSum = 0;
	       for(int i = 0; i <= N-K; i++)
	           for(int j = 0; j <= N-K; j++)
	           {
	               int sum = 0;
	               for(int I = i; I < i+K; I++)
	                   for(int J = j; J < j+K; J++)
	                       sum+=mat[I][J];
	               maxSum = Math.max(sum,maxSum);
	           }
	       return maxSum;   
	    }
	}
}
