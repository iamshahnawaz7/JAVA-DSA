package Recursion;

public class HeightUsingParentArray {
	class Solution{
		   static int findHeight(int N, int arr[]){
		       // code here
		       
		       int res=0;
		       int parent=0;
		       for(int j=1;j<=2;j++){
		       int count=1;
		       for(int i=j;i<arr.length;i++){
		           if(parent==arr[i]){
		               count++;
		               parent=i;
		           }
		       }
		       res=Math.max(res,count);
		       
		   }
		   return res;
		   }
		}
}
