package Quesba;

public class FindDuplicateRowsInABinaryMatrix {
	class Solution
	{
	    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
	    {
	      ArrayList<Integer> arr=new ArrayList<>();
	      for(int i=0;i<m;i++){
	          if(arr.contains(i)) continue;
	          for(int j=i+1;j<m;j++){
	         if(check(matrix[i],matrix[j]))
	            {
	              arr.add(j);
	            }
	          }
	      }
	      Collections.sort(arr);
	      return arr;
	    }
	    
	    public static boolean check(int arr[] , int ar[]){
	        int m=arr.length;
	        for(int i=0;i<m;i++){
	            if(arr[i]!=ar[i]){
	                return false;
	            }
	        }
	        return true;
	    }
	}
}
