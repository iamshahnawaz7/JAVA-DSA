package Quesba;

public class NDigitNumberWithNumberInIncreasingOrder {
	class Solution{
	    static ArrayList<Integer> increasingNumbers(int N){
	        
	        ArrayList<Integer> al=new ArrayList<>();
	        
	        if(N==1)al.add(0);
	        
	        makingnumber(0,al,0,N);
	        
	        return al;
	    }
	    public static void makingnumber(int num,ArrayList<Integer> al,int curr,int len){
	        
	        if(curr==len){al.add(num);return;}
	        
	        int i=num%10;
	        
	        num *=10;
	        curr++;
	        for(++i;i<=9;i++){
	            int temp=num;
	            temp +=i; 
	            makingnumber(temp,al,curr,len);
	        }
	        
	    }
	}
}
