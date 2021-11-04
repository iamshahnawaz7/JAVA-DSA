
public class FourElements {
	class Compute
	{
	    static boolean find4Numbers(int A[], int n, int X)
	    {
	        Arrays.sort(A);
	        int i=0;
	        while(i<n-3){
	            int j=i+1;
	            while(j<n-2){
	                int low = j+1,high = n-1;
	                while(low<high){
	                    int tot = A[i]+A[j]+A[low]+A[high];
	                    if(tot==X) return true;
	                    else if(tot<X) low++;
	                    else high--;
	                }
	                j++;
	            }
	            i++;
	        }
	        return false;
	    }
	}
}
