package Recursion;

public class PartitionANumberIntoTwoDivisibleParts {
	class Solution{
		   static String stringPartition(String S, int a, int b){
		       // code here
		       String result="";
		       int n=S.length();
		       
		       for(int i=1;i<n;i++)
		       {
		           int x = Integer.parseInt(S.substring(0,i));
		           int y = Integer.parseInt(S.substring(i,n));
		           if(x%a==0 && y%b==0)
		           {
		               result=S.substring(0,i);
		               result+=" ";
		               result+=S.substring(i,n);
		               break;
		           }
		       }
		       if(!result.equals(""))
		       return result;
		       return "-1";
		   }
		}
}
