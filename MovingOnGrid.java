package Recursion;

public class MovingOnGrid {
	class Solution
	{
	   public String movOnGrid(int r, int c)
	   {
	       // code here
	       int temp = r;
	       r=c;
	       c=temp;
	   r = (r - 1) & 3;
	   c = (c - 1) % 7;
	   return (r == c ? "ARYA" : "JON");
	   }
	}
}
