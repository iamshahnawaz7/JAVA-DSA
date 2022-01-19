package Quesba;

public class MaximumSumOfIncreasingOrderElementsFromNArrays {
	class Complete{
	    public static int maximumSum (int n, int m, int arr[][]) {
	        int largest=0;
	        int sum=0;
	        int k=501;
	        boolean z=false;
	        for(int i=n-1;i>=0;i--){
	            largest=0;
	            z=false;
	            for(int j=m-1;j>=0;j--){
	              if(arr[i][j]>largest && arr[i][j]<k){
	                  largest=arr[i][j];
	                  z=true;
	              }
	            }
	            if(!z){
	                return 0;
	            }
	          k=largest;
	          sum+=largest;
	        }
	        return sum;
	    }
	}
}
