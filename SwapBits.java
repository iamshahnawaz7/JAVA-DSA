package Recursion;

public class SwapBits {
	class Solution{
		   int swapBits(int x, int p1, int p2, int n)
		    {
		        int mask1= 0, mask2= 0;
		        for(int i=p1;i<p1+n;i++){
		            mask1|= (1<<i) & (x);
		            x = (x & ~(1 << (i)));
		        }
		        
		        for(int i=p2;i<p2+n;i++){
		            mask2|= (1<<i) & (x);
		            x = (x & ~(1 << (i)));
		        }
		        
		        mask1 = mask1<<(p2-p1);
		        mask2 = mask2>>(p2-p1);
		        
		        x|=mask1;
		        x|=mask2;
		        return x;
		    }
		}
}
