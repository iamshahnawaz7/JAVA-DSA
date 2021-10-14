package GitHub;

public class SwapAllEvenOddBits {
	class Solution
	{
	    //Function to swap odd and even bits.
	    public static int swapBits(int n) 
	    {
	        
	        int ev_bit = n & 0xAAAAAAAA;
	     
	        int od_bit = n & 0x55555555;
	     
	       
	        ev_bit >>= 1;
	         
	      
	        od_bit <<= 1;
	         
	      
	        return (ev_bit | od_bit);
	    }
	    
	}
}
