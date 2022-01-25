package Quesba;

public class CapacityToShipPackagesWithinDDays {
	class Solution {
		  public:
		    bool isPossible(int mid,int arr[],int N,int d)
		    {
		        int reqd=1;
		        int sum=0;
		        for(int i=0;i<N;i++)
		        {
		            if(sum+arr[i]<=mid)
		            {
		                sum+=arr[i];
		            }
		            else
		            {
		                if(arr[i]>mid)
		                return false;
		                sum=arr[i];
		                reqd++;
		            }
		        }
		        return reqd<=d;
		    }
		    int leastWeightCapacity(int arr[], int N, int D) {
		        int low=1;
		        int high=accumulate(arr,arr+N,0);
		        int res=0;
		        while(low<=high)
		        {
		            int mid=low+(high-low)/2;
		            if(isPossible(mid,arr,N,D))
		            {
		                res=mid;
		                high=mid-1;
		            }
		            else
		            low=mid+1;
		        }
		        return res;
		    }
		};
}
