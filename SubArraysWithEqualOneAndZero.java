package Quesba;

public class SubArraysWithEqualOneAndZero {
	class Solution{
		  public:
		    //Function to count subarrays with 1s and 0s.
		   long long int countSubarrWithEqualZeroAndOne(int arr[], int n)
		    {
		        //Your code here
		        for(int i=0;i<n;i++)
		        {
		            if(arr[i]==0)
		            {
		                arr[i]=-1;
		            }
		        }
		        
		        unordered_map <int,int> m;
		        int pre_sum=0;
		        int res=0;
		        
		        for(int i=0;i<n;i++)
		        {
		            pre_sum+=arr[i];
		            if(pre_sum==0)
		            {
		                res++;
		            }
		        
		            if(m.find(pre_sum)!=m.end())
		            {
		                res+=m[pre_sum];
		            }
		            m[pre_sum]++;
		        }
		        return res;
		    }
		};

		// { Driver Code Starts.

		int main()
		{
			int t;
			cin>>t;
			while(t--)
			{
			int n,i;
			cin>>n;
			int arr[n];
			for(i=0;i<n;i++)
			cin>>arr[i];
			Solution obj;
			cout<< obj.countSubarrWithEqualZeroAndOne(arr, n)<<"\n";
			}
			return 0;
		}
		  // } Driver Code Ends
}
