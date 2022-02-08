package Quesba;

public class FindPrimeNumbersInARange {
	class Solution {
		   ArrayList<Integer> primeRange(int M, int N) {
		       ArrayList<Integer> list=new ArrayList<>();
		      int i;int div;
		      for(i=M;i<=N;i++)
		      {
		          boolean isTrue=false;
		          for(div=2;div*div<=i;div++)
		          {
		              if(i%div==0)
		              {
		                  isTrue=true;
		                  break;
		              }
		          }
		         if(isTrue==false && i!=1){
		             list.add(i);
		         }
		      }
		      return list;
		   }
		}
}
