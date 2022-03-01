package Quesba;

public class ConcatenateTwoNumbers {
	long countPairs(int N, int X, int numbers[]) 
	   { 
	       HashMap<String,Integer> hm=new HashMap<>();
	       for(int z:numbers)
	       {
	           String s=Integer.toString(z);
	           hm.putIfAbsent(s,0);
	           hm.put(s,hm.get(s)+1);
	       }
	       int count=0;
	       String x=Integer.toString(X);
	       for(String k:hm.keySet())
	       {
	           if(k.length()>=x.length()) continue;
	           int index=x.indexOf(k);
	           String req=x.substring(k.length());
	           if(index==0 && hm.containsKey(req))
	           {
	               int val=hm.get(req);
	               if(req.equals(k))
	               count+=(val*(val-1));
	               else
	               count+=val*hm.get(k);
	           }
	       }
	       
	       return count;
	   }
}
