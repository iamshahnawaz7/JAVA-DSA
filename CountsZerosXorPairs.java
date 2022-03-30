package Recursion;

public class CountsZerosXorPairs {
	long long int calculate(int a[], int n){ 
	    unordered_map<int,int>mp; 
	    for(int i=0;i<n;i++)       mp[a[i]]++; 
	    long long int cnt=0; 
	    for(auto &i:mp){  
	       int x=i.second; 
	       if(x>1) cnt+=x*1LL*(x-1)/2; 
	  }  
	  return cnt; 
	}   
}
