package Recursion;

public class NthItemThroughSum {
	class Solution{
		public:
		    int nthItem(int L1, int L2, int A[], int B[], int N)
		   {
		       // code here
		       set<int>s;
		       for(int i=0;i<L1;i++)
		       {
		           for(int j=0;j<L2;j++)
		           {
		               s.insert(A[i]+B[j]);
		               
		           }
		       }
		       auto it=s.begin();
		       if(N>s.size())
		       return -1;
		       advance(it,N-1);
		       
		       return *(it);
		   }
		};
}
