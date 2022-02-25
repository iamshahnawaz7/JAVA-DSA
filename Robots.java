package Quesba;

public class Robots {
	class Solution{
	    public static String moveRobots(String s1, String s2){
	        //code here
	        ArrayList<Character> A=new ArrayList<Character>();
	        ArrayList<Integer> pos=new ArrayList<Integer>();
	         ArrayList<Character> B=new ArrayList<Character>();
	        ArrayList<Integer> pos1=new ArrayList<Integer>();
	       
	     
	    int y=0;
	        int len=s1.length();
	        for(int i=0;i<len;i++)
	        {
	            char ch=s1.charAt(i);
	            if(ch=='A' || ch=='B')
	            {
	            A.add(ch);
	            pos.add(i);}
	            char ch1=s2.charAt(i);
	            if(ch1=='A' || ch1=='B')
	            {
	            B.add(ch1);
	            pos1.add(i);}
	            
	            
	        }
	      
	        int size=A.size();
	        for(int i=0;i<size;i++)
	        {
	            if(A.get(i)=='A')
	            {
	                if(B.get(i)!=A.get(i))
	                return "No";
	                if(pos.get(i)<pos1.get(i))
	                return "No";
	                
	            }
	            if(A.get(i)=='B')
	            {
	                if(B.get(i)!=A.get(i))
	                return "No";
	                if(pos.get(i)>pos1.get(i))
	                return "No";
	                
	            }
	            
	        }
	        return "Yes";
	    }
	}
}
