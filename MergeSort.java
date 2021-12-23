package Quesba;

public class MergeSort {
	class Solution
	{
	    public:
	   void merge(int arr[], int l, int mid, int r)
	    {
	         int lsz=mid-l+1;
	         int rsz=r-mid;
	         int L[lsz+1];
	         int R[rsz+1];
	         for(int i=0;i<lsz;i++)
	         L[i]=arr[i+l];
	         for(int i=0;i<rsz;i++)
	         R[i]=arr[mid+1+i];
	         L[lsz]=R[rsz]=INT_MAX;
	         int l_i=0;
	         int r_i=0;
	         
	         for(int i=l;i<=r;i++)
	         {
	             if(L[l_i]<=R[r_i])
	             arr[i]=L[l_i++];
	             else
	             arr[i]=R[r_i++];
	             
	         }
	    }
	    public:
	    void mergeSort(int arr[], int l, int r)
	    {
	        if(l==r)return;
	        int mid=(l+r)/2;
	        mergeSort(arr,l,mid);
	        mergeSort(arr,mid+1,r);
	        merge(arr,l,mid,r);
	    }
	};
}
