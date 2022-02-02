package Quesba;

public class FindPositionOfSetBit {
	class Solution {
	    static int findPosition(int n) {
	        if(n==0)return -1;
	//count total no. of shifts to get single set bit
	        int shifts=1;
	        while(n!=0){
	        	//if n is 1 
	            if(n==1)return shifts;
	            //if n is odd but not one
	            if((n&1)==1){
	                return -1;
	            }
	            //if n is even 
	            else{
	                n=n>>1;
	                shifts++;
	            }
	        }
	        return shifts;
	    }
	};
}
