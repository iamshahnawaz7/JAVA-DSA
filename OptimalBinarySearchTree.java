package Quesba;

public class OptimalBinarySearchTree {
	class Solution
	{
	   static int optimalSearchTree(int key[], int freq[], int n)
	   {
	       int store[][][]=new int [n][n][n+1];
	       for(int i=0;i<n;i++){
	         for(int j=0;j<n;j++){
	             for(int k=0;k<=n;k++)
	               store[i][j][k]=-1;
	         }
	     }
	  return dp(0,n-1,1,key,freq,store);
	   }
	   
	   public static  int dp(int i,int j,int level,int key[],int freq[],int store[][][]){
	    if(i==j){
	        store[i][j][level]=freq[i]*level;
	        return(store[i][j][level]);
	    }
	    if(i>j)
	      return(0);
	    
	    if(store[i][j][level]!=-1)
	     return(store[i][j][level]);
	    
	    int min=Integer.MAX_VALUE;
	    for(int r=i;r<=j;r++){
	        int v1=dp(i,r-1,level+1,key,freq,store);
	        int v2=dp(r+1,j,level+1,key,freq,store);
	        int v3=freq[r]*level;
	        int total=v1+v2+v3;
	        min=Math.min(total,min);
	    }
	    store[i][j][level]=min;
	    return(min);
	}
	}

}
