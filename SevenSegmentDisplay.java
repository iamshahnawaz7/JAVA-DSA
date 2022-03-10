package Recursion;

public class SevenSegmentDisplay {
	class Solution {
	    static String sevenSegments(String S, int N) {
	        int symbol[]={6,2,5,5,4,5,6,3,7,5};
	        int sum=0;
	        String ans="";
	        for(int i=0;i<N;i++)
	        {
	            int z=S.charAt(i)-'0';
	            sum+=symbol[z];
	        }
	        int a[]=new int[N];
	        for(int i=0;i<N;i++)
	        {
	            a[i]=2;
	            sum-=2;
	        }
	        int i=0;
	        while(sum>=4 && i<N)
	        {
	            sum+=2;
	            a[i]=6;
	            sum-=6;
	            i++;
	        }
	        a[N-1]+=sum;
	        for(i=0;i<N;i++)
	        {
	            if(a[i]==6)
	            ans+='0';
	            else if(a[i]==2)
	            ans+='1';
	            else if(a[i]==3)
	            ans+='7';
	            else if(a[i]==4)
	            ans+='4';
	            else
	            ans+='2';
	            
	        }
	        return ans;
	        
	        
	    }
	};
}
