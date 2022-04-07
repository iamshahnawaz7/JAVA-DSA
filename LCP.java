package Recursion;

public class LCP {
	class Solution{
		public:
		    string LCP(string arr[], int n)
		    {
		       int minsize = INT_MAX;
		       
		       for(int i=0;i<n;i++)
		       {
		           int s = arr[i].size();
		           minsize = min(minsize,s);
		       }
		       int ans=0;
		       
		           for(int j=0;j<minsize;j++)
		           {
		               bool f=false;
		               for(int i=0;i<n-1;i++)
		               {
		                   if(arr[i][j]!=arr[i+1][j]) 
		                   {
		                       f= true;
		                       break;
		                   }
		                     
		               }
		               if(f) break;
		                    ans++;
		               
		           }
		       
		        return ans==0 ? "-1": arr[0].substr(0,ans);
		        
		    }
		};
}
